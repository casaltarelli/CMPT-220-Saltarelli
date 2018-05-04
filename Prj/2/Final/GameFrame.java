/* 
   Created: April 4, 2018 
   Author: Christian Saltarelli
*/

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JLabel;

public class GameFrame extends javax.swing.JFrame {
    // ----- 2048: The Remake -----
    // ----- Global Variables -----
    int HEIGHT = 600;
    int WIDTH = 600;
   
    ArrayList<JLabel> gameLabels = new ArrayList<JLabel>();
    
    private int numOfChecks = 0;
    private int score = 0;
    boolean alive = true;
    boolean doneChecking = true;
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameFrame().setVisible(true);
            }
        });    
    }
    
    // ----- Methods -----
    public GameFrame() {
        initComponents();
        
        // -- Constraints & Styling
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        
        jPanel_LSpace.setPreferredSize(new Dimension(50,200));
        jPanel_RSpace.setPreferredSize(new Dimension(50,200));
        jPanel_PlayerInfo.setPreferredSize(new Dimension(WIDTH, 100));
        
        // -- Load Labels
        gameLabels.add(jLabel_0);
        gameLabels.add(jLabel_1);
        gameLabels.add(jLabel_2);
        gameLabels.add(jLabel_3);
        gameLabels.add(jLabel_4);
        gameLabels.add(jLabel_5);
        gameLabels.add(jLabel_6);
        gameLabels.add(jLabel_7);
        gameLabels.add(jLabel_8);
        gameLabels.add(jLabel_9);
        gameLabels.add(jLabel_10);
        gameLabels.add(jLabel_11);
        gameLabels.add(jLabel_12);
        gameLabels.add(jLabel_13);
        gameLabels.add(jLabel_14);
        gameLabels.add(jLabel_15);
        
        // -- Reset all Labels
        jLabel_0.setText("");
        jLabel_1.setText("");
        jLabel_2.setText("");
        jLabel_3.setText("");
        jLabel_4.setText("");
        jLabel_5.setText("");
        jLabel_6.setText("");
        jLabel_7.setText("");
        jLabel_8.setText("");
        jLabel_9.setText("");
        jLabel_10.setText("");
        jLabel_11.setText("");
        jLabel_12.setText("");
        jLabel_13.setText("");
        jLabel_14.setText("");
        jLabel_15.setText("");
        
        // -- Reset Score
        score = 0;
        jLabel_Score.setText("Score: " + String.valueOf(score));
        
        // -- Load Rand Block
        loadRandBlock();
    }
    
    // ----- Accessor Methods (Score & Checks)
    public int getScore() {
        return score; 
    }
    
    public void addScore(int bValue) {
        // - Add to Users current Score
        score += bValue;
        jLabel_Score.setText("Score: " + String.valueOf(score));
        jLabel_Score.repaint();
    }
    
    public int getChecks() {
        return numOfChecks;
    }
    
    public void addCheck() {
        numOfChecks++;
    }
    
    public void resetChecks() {
        numOfChecks = 0;
    }
    
    // ----- Load & Update Methods
    public void loadRandBlock() {
        // - Get Rand Value
        int choice = (int)(Math.random() * 2);
        int value = 0;
        
        if (choice == 0) {
            value = 2;
        } else {
            value = 4;
        }
        
        // - Get Random Block
        boolean populated = true;
        int rand = (int)(Math.random() * 15);
        
        while (populated == true) {
            if (gameLabels.get(rand).getText() == "") {
                populated = false;
            } else {
                rand = (int)(Math.random() * 15);
            }
        }
        
        // - Update Board
        updateBoard(rand, value);
        
        // - Check if GameOver
        checkGameOver();
    }
    
    public void updateBoard(int pos, int value) {
        // - Update Label
        if (value == 0) {
            gameLabels.get(pos).setText("");
            gameLabels.get(pos).repaint();

        } else {
            gameLabels.get(pos).setText(String.valueOf(value));
            gameLabels.get(pos).repaint();
        }
    }
    
    // ----- Check Methods
    public void checkLR(int direction) {
        // 1 = Right & -1 = Left
        boolean checking = true;
        int count = 0;
        
        // - Chech if Alive
        if (alive) {
            // - Change Count according to Direction
            if (direction == 1) {
                count = 0;
            } else if (direction == -1) {
                count = 15;
            }

            if (direction == 1) {
                // - Sort Through Rows (Right)                     
                while (checking) {
                    // - If Right-End Block skip
                    if (count == 3 || count == 7 || count == 11) {
                        count++;

                    } else {            
                        // - Get Blocks to compare
                        String first = gameLabels.get(count).getText();
                        String second = gameLabels.get(count + direction).getText();

                        if (first != "" && second != "" && Integer.parseInt(first) == Integer.parseInt(second)) {
                            // - Combine Blocks
                            updateBoard(count, 0);
                            updateBoard(count + direction, 
                                    Integer.parseInt(first) + Integer.parseInt(second));
                            
                            // - Update Score
                            addScore(Integer.parseInt(first) + Integer.parseInt(second));

                        } else if (first != "" && second == "") {
                            // - Shift 'first' Block
                            updateBoard(count, 0);
                            updateBoard(count + direction, Integer.parseInt(first));
                        }

                        // - Increase Count
                        if (count < 14) {
                            count++;
                        } else {
                            checking = false;
                        }
                    }
                } 
            } else if (direction == -1) {
                // - Sort Through Rows (Left)
                while(checking) {
                    // - If Left-End Block Skip
                    if (count == 12 || count == 8 || count == 4) {
                        count--;
                    } else {
                        // - Get Blocks to compare
                        String first = gameLabels.get(count).getText();
                        String second = gameLabels.get(count + direction).getText();

                        if (first != "" && second != "" && Integer.parseInt(first) == Integer.parseInt(second)) {
                            // - Combine Blocks
                            updateBoard(count, 0);
                            updateBoard(count + direction, 
                                Integer.parseInt(first) + Integer.parseInt(second));
                            
                            // - Update Score
                            addScore(Integer.parseInt(first) + Integer.parseInt(second));

                        } else if (first != "" && second == "") {
                            // - Shift 'first' Block
                            updateBoard(count, 0);
                            updateBoard(count + direction, Integer.parseInt(first));
                        }

                        // - Decrease Count
                        if (count > 1) {
                            count--;
                        } else {
                            checking = false;
                            
                        }
                    }
                }
            }
            
            // - Check Direction 4 Times
            if (getChecks() != 4) {
                addCheck();
                checkLR(direction);
            } else if (getChecks() == 4) {
                // - Generate Next Random Block & Reset Checks
                resetChecks();
                loadRandBlock();
                
            }
        }    
    }
    
    public void checkUD(int direction) {
        // 1 = Down & -1 = Up
        boolean checking = true;
        int count = 0;
        int jump = 4;
        
        // - Check if Alive
        if (alive) { 
            // - Change Count according to direction
            if (direction == 1) {
                count = 0;
            } else if (direction == -1) {
                count = 15; 
            }

            if (direction == 1) {
                // - Sort Through Columns (Down)
                while (checking) {
                    // - Get Blocks to compare
                    String first = gameLabels.get(count).getText();
                    String second = gameLabels.get(count + (direction * jump)).getText();
                       
                    if (first != "" && second != "" && Integer.parseInt(first) == Integer.parseInt(second)) {
                        // - Combine Blocks
                        updateBoard(count, 0);
                        updateBoard(count + (direction * jump), 
                            Integer.valueOf(first) + Integer.parseInt(second));
                        
                        // - Update Score
                        addScore(Integer.parseInt(first) + Integer.parseInt(second));

                    } else if (first != "" && second == "") {
                        // - Shift 'first' Block
                        updateBoard(count, 0);
                        updateBoard(count + (direction * jump), Integer.parseInt(first));
                    }
                       
                    // - Increase Count
                    if (count < 11) {
                        count++;
                    } else {
                        checking = false;
                    } 
                }  
            } else if (direction == -1) {
                // - Sort Through Columns (Up)
                while (checking) {
                    // - Get Blocks to compare
                    String first = gameLabels.get(count).getText();
                    String second = gameLabels.get(count + (direction * jump)).getText();

                    if (first != "" && second != "" && Integer.parseInt(first) == Integer.parseInt(second)) {
                        // - Combine Blocks
                        updateBoard(count, 0);
                        updateBoard(count + (direction * jump), 
                            Integer.parseInt(first) + Integer.parseInt(second));
                        
                        // - Update Score
                        addScore(Integer.parseInt(first) + Integer.parseInt(second));
                        
                    } else if (first != "" && second == "") {
                        // - Shift 'first' Block
                        updateBoard(count, 0);
                        updateBoard(count + (direction * jump), Integer.parseInt(first));
                    } 
                    
                    // - Decrease Count
                    if (count > 4) {
                        count--;
                    } else {
                        checking = false; 
                    }
                }
            }
            
            // - Check Direction 4 Times
            if (getChecks() != 4) {
                addCheck();
                checkUD(direction);
            } else if (getChecks() == 4) {
                // - Generate Next Random Block & Reset Checks
                resetChecks();
                loadRandBlock();
                checkWin();
            }
        }
    }
    
    public void checkGameOver() {
        int blocksPopulated = 0;

        // - Check if all Blocks are Filled
        for (int i = 0; i < gameLabels.size(); i++) {
            if (gameLabels.get(i).getText() != "") {
                blocksPopulated++;
            }
        }
        
        if (blocksPopulated == 16) {
            alive = false;
            jLabel_GTitle.setText("GameOver!"); 
            jLabel_GTitle.setForeground(Color.RED);
            jLabel_GTitle.repaint();
        }
        
        // - Done Checking
        doneChecking = true;
    }
    
    public void checkWin() {
        for (int i = 0; i < gameLabels.size(); i++) {
            int value = Integer.parseInt(gameLabels.get(i).getText());
            
            if (value == 2048) {
                jLabel_GTitle.setText("You Won!"); 
                jLabel_GTitle.setForeground(Color.GREEN);
                jLabel_GTitle.repaint();
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Container = new javax.swing.JPanel();
        jPanel_Board = new javax.swing.JPanel();
        jPanel_0 = new javax.swing.JPanel();
        jLabel_0 = new javax.swing.JLabel();
        jPanel_1 = new javax.swing.JPanel();
        jLabel_1 = new javax.swing.JLabel();
        jPanel_2 = new javax.swing.JPanel();
        jLabel_2 = new javax.swing.JLabel();
        jPanel_3 = new javax.swing.JPanel();
        jLabel_3 = new javax.swing.JLabel();
        jPanel_4 = new javax.swing.JPanel();
        jLabel_4 = new javax.swing.JLabel();
        jPanel_5 = new javax.swing.JPanel();
        jLabel_5 = new javax.swing.JLabel();
        jPanel_6 = new javax.swing.JPanel();
        jLabel_6 = new javax.swing.JLabel();
        jPanel_7 = new javax.swing.JPanel();
        jLabel_7 = new javax.swing.JLabel();
        jPanel_8 = new javax.swing.JPanel();
        jLabel_8 = new javax.swing.JLabel();
        jPanel_9 = new javax.swing.JPanel();
        jLabel_9 = new javax.swing.JLabel();
        jPanel_10 = new javax.swing.JPanel();
        jLabel_10 = new javax.swing.JLabel();
        jPanel_11 = new javax.swing.JPanel();
        jLabel_11 = new javax.swing.JLabel();
        jPanel_12 = new javax.swing.JPanel();
        jLabel_12 = new javax.swing.JLabel();
        jPanel_13 = new javax.swing.JPanel();
        jLabel_13 = new javax.swing.JLabel();
        jPanel_14 = new javax.swing.JPanel();
        jLabel_14 = new javax.swing.JLabel();
        jPanel_15 = new javax.swing.JPanel();
        jLabel_15 = new javax.swing.JLabel();
        jPanel_Buttons = new javax.swing.JPanel();
        jButton_Up = new javax.swing.JButton();
        jButton_Down = new javax.swing.JButton();
        jButton_Left = new javax.swing.JButton();
        jButton_Right = new javax.swing.JButton();
        jPanel_LSpace = new javax.swing.JPanel();
        jPanel_RSpace = new javax.swing.JPanel();
        jPanel_PlayerInfo = new javax.swing.JPanel();
        jLabel_GTitle = new javax.swing.JLabel();
        jLabel_Score = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("2048: The Remake");

        jPanel_Container.setBackground(new java.awt.Color(204, 204, 204));
        jPanel_Container.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(4, 75, 175), new java.awt.Color(4, 75, 175), new java.awt.Color(4, 75, 175), new java.awt.Color(4, 75, 175)));
        jPanel_Container.setLayout(new java.awt.BorderLayout());

        jPanel_Board.setBackground(new java.awt.Color(153, 153, 153));
        jPanel_Board.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 152, 152)));
        jPanel_Board.setLayout(new java.awt.GridLayout(4, 4, 2, 2));

        jPanel_0.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));
        jPanel_0.setLayout(new java.awt.BorderLayout());

        jLabel_0.setFont(new java.awt.Font("PT Sans Caption", 0, 55)); // NOI18N
        jLabel_0.setForeground(new java.awt.Color(4, 75, 175));
        jLabel_0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_0.setText("0");
        jLabel_0.setToolTipText("");
        jPanel_0.add(jLabel_0, java.awt.BorderLayout.CENTER);

        jPanel_Board.add(jPanel_0);

        jPanel_1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));
        jPanel_1.setLayout(new java.awt.BorderLayout());

        jLabel_1.setFont(new java.awt.Font("PT Sans Caption", 0, 55)); // NOI18N
        jLabel_1.setForeground(new java.awt.Color(4, 75, 175));
        jLabel_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_1.setText("1");
        jPanel_1.add(jLabel_1, java.awt.BorderLayout.CENTER);

        jPanel_Board.add(jPanel_1);

        jPanel_2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));
        jPanel_2.setLayout(new java.awt.BorderLayout());

        jLabel_2.setFont(new java.awt.Font("PT Sans Caption", 0, 55)); // NOI18N
        jLabel_2.setForeground(new java.awt.Color(4, 75, 175));
        jLabel_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_2.setText("2");
        jPanel_2.add(jLabel_2, java.awt.BorderLayout.CENTER);

        jPanel_Board.add(jPanel_2);

        jPanel_3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));
        jPanel_3.setLayout(new java.awt.BorderLayout());

        jLabel_3.setFont(new java.awt.Font("PT Sans Caption", 0, 55)); // NOI18N
        jLabel_3.setForeground(new java.awt.Color(4, 75, 175));
        jLabel_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_3.setText("3");
        jPanel_3.add(jLabel_3, java.awt.BorderLayout.CENTER);

        jPanel_Board.add(jPanel_3);

        jPanel_4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));
        jPanel_4.setLayout(new java.awt.BorderLayout());

        jLabel_4.setFont(new java.awt.Font("PT Sans Caption", 0, 55)); // NOI18N
        jLabel_4.setForeground(new java.awt.Color(4, 75, 175));
        jLabel_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_4.setText("4");
        jPanel_4.add(jLabel_4, java.awt.BorderLayout.CENTER);

        jPanel_Board.add(jPanel_4);

        jPanel_5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));
        jPanel_5.setLayout(new java.awt.BorderLayout());

        jLabel_5.setFont(new java.awt.Font("PT Sans Caption", 0, 55)); // NOI18N
        jLabel_5.setForeground(new java.awt.Color(4, 75, 175));
        jLabel_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_5.setText("5");
        jPanel_5.add(jLabel_5, java.awt.BorderLayout.CENTER);

        jPanel_Board.add(jPanel_5);

        jPanel_6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));
        jPanel_6.setLayout(new java.awt.BorderLayout());

        jLabel_6.setFont(new java.awt.Font("PT Sans Caption", 0, 55)); // NOI18N
        jLabel_6.setForeground(new java.awt.Color(4, 75, 175));
        jLabel_6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_6.setText("6");
        jPanel_6.add(jLabel_6, java.awt.BorderLayout.CENTER);

        jPanel_Board.add(jPanel_6);

        jPanel_7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));
        jPanel_7.setLayout(new java.awt.BorderLayout());

        jLabel_7.setFont(new java.awt.Font("PT Sans Caption", 0, 55)); // NOI18N
        jLabel_7.setForeground(new java.awt.Color(4, 75, 175));
        jLabel_7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_7.setText("7");
        jPanel_7.add(jLabel_7, java.awt.BorderLayout.CENTER);

        jPanel_Board.add(jPanel_7);

        jPanel_8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));
        jPanel_8.setLayout(new java.awt.BorderLayout());

        jLabel_8.setFont(new java.awt.Font("PT Sans Caption", 0, 55)); // NOI18N
        jLabel_8.setForeground(new java.awt.Color(4, 75, 175));
        jLabel_8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_8.setText("8");
        jPanel_8.add(jLabel_8, java.awt.BorderLayout.CENTER);

        jPanel_Board.add(jPanel_8);

        jPanel_9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));
        jPanel_9.setLayout(new java.awt.BorderLayout());

        jLabel_9.setFont(new java.awt.Font("PT Sans Caption", 0, 55)); // NOI18N
        jLabel_9.setForeground(new java.awt.Color(4, 75, 175));
        jLabel_9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_9.setText("9");
        jPanel_9.add(jLabel_9, java.awt.BorderLayout.CENTER);

        jPanel_Board.add(jPanel_9);

        jPanel_10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));
        jPanel_10.setLayout(new java.awt.BorderLayout());

        jLabel_10.setFont(new java.awt.Font("PT Sans Caption", 0, 55)); // NOI18N
        jLabel_10.setForeground(new java.awt.Color(4, 75, 175));
        jLabel_10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_10.setText("10");
        jPanel_10.add(jLabel_10, java.awt.BorderLayout.CENTER);

        jPanel_Board.add(jPanel_10);

        jPanel_11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));
        jPanel_11.setLayout(new java.awt.BorderLayout());

        jLabel_11.setFont(new java.awt.Font("PT Sans Caption", 0, 55)); // NOI18N
        jLabel_11.setForeground(new java.awt.Color(4, 75, 175));
        jLabel_11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_11.setText("11");
        jPanel_11.add(jLabel_11, java.awt.BorderLayout.CENTER);

        jPanel_Board.add(jPanel_11);

        jPanel_12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));
        jPanel_12.setLayout(new java.awt.BorderLayout());

        jLabel_12.setFont(new java.awt.Font("PT Sans Caption", 0, 55)); // NOI18N
        jLabel_12.setForeground(new java.awt.Color(4, 75, 175));
        jLabel_12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_12.setText("12");
        jPanel_12.add(jLabel_12, java.awt.BorderLayout.CENTER);

        jPanel_Board.add(jPanel_12);

        jPanel_13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));
        jPanel_13.setLayout(new java.awt.BorderLayout());

        jLabel_13.setFont(new java.awt.Font("PT Sans Caption", 0, 55)); // NOI18N
        jLabel_13.setForeground(new java.awt.Color(4, 75, 175));
        jLabel_13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_13.setText("13");
        jPanel_13.add(jLabel_13, java.awt.BorderLayout.CENTER);

        jPanel_Board.add(jPanel_13);

        jPanel_14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));
        jPanel_14.setLayout(new java.awt.BorderLayout());

        jLabel_14.setFont(new java.awt.Font("PT Sans Caption", 0, 55)); // NOI18N
        jLabel_14.setForeground(new java.awt.Color(4, 75, 175));
        jLabel_14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_14.setText("14");
        jPanel_14.add(jLabel_14, java.awt.BorderLayout.CENTER);

        jPanel_Board.add(jPanel_14);

        jPanel_15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));
        jPanel_15.setLayout(new java.awt.BorderLayout());

        jLabel_15.setFont(new java.awt.Font("PT Sans Caption", 0, 55)); // NOI18N
        jLabel_15.setForeground(new java.awt.Color(4, 75, 175));
        jLabel_15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_15.setText("15");
        jPanel_15.add(jLabel_15, java.awt.BorderLayout.CENTER);

        jPanel_Board.add(jPanel_15);

        jPanel_Container.add(jPanel_Board, java.awt.BorderLayout.CENTER);

        jPanel_Buttons.setBackground(new java.awt.Color(48, 131, 251));
        jPanel_Buttons.setBorder(javax.swing.BorderFactory.createEmptyBorder(25, 32, 25, 32));
        jPanel_Buttons.setLayout(new java.awt.GridLayout(1, 0));

        jButton_Up.setBackground(new java.awt.Color(255, 255, 255));
        jButton_Up.setFont(new java.awt.Font("PT Sans Caption", 1, 13)); // NOI18N
        jButton_Up.setForeground(new java.awt.Color(153, 153, 153));
        jButton_Up.setText("Up");
        jButton_Up.setAlignmentY(0.0F);
        jButton_Up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UpActionPerformed(evt);
            }
        });
        jPanel_Buttons.add(jButton_Up);

        jButton_Down.setBackground(new java.awt.Color(255, 255, 255));
        jButton_Down.setFont(new java.awt.Font("PT Sans Caption", 1, 13)); // NOI18N
        jButton_Down.setForeground(new java.awt.Color(153, 153, 153));
        jButton_Down.setText("Down");
        jButton_Down.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DownActionPerformed(evt);
            }
        });
        jPanel_Buttons.add(jButton_Down);

        jButton_Left.setBackground(new java.awt.Color(255, 255, 255));
        jButton_Left.setFont(new java.awt.Font("PT Sans Caption", 1, 13)); // NOI18N
        jButton_Left.setForeground(new java.awt.Color(153, 153, 153));
        jButton_Left.setText("Left");
        jButton_Left.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LeftActionPerformed(evt);
            }
        });
        jPanel_Buttons.add(jButton_Left);

        jButton_Right.setBackground(new java.awt.Color(255, 255, 255));
        jButton_Right.setFont(new java.awt.Font("PT Sans Caption", 1, 13)); // NOI18N
        jButton_Right.setForeground(new java.awt.Color(153, 153, 153));
        jButton_Right.setText("Right");
        jButton_Right.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RightActionPerformed(evt);
            }
        });
        jPanel_Buttons.add(jButton_Right);

        jPanel_Container.add(jPanel_Buttons, java.awt.BorderLayout.PAGE_END);

        jPanel_LSpace.setBackground(new java.awt.Color(48, 131, 251));
        jPanel_Container.add(jPanel_LSpace, java.awt.BorderLayout.LINE_START);

        jPanel_RSpace.setBackground(new java.awt.Color(48, 131, 251));
        jPanel_Container.add(jPanel_RSpace, java.awt.BorderLayout.LINE_END);

        jPanel_PlayerInfo.setBackground(new java.awt.Color(48, 131, 251));
        jPanel_PlayerInfo.setLayout(new java.awt.BorderLayout());

        jLabel_GTitle.setFont(new java.awt.Font("PT Sans Caption", 1, 36)); // NOI18N
        jLabel_GTitle.setForeground(new java.awt.Color(238, 238, 238));
        jLabel_GTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_GTitle.setText("2048");
        jLabel_GTitle.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel_PlayerInfo.add(jLabel_GTitle, java.awt.BorderLayout.PAGE_START);

        jLabel_Score.setFont(new java.awt.Font("PT Sans Caption", 0, 18)); // NOI18N
        jLabel_Score.setForeground(new java.awt.Color(238, 238, 238));
        jLabel_Score.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Score.setText("Score: 0");
        jLabel_Score.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel_PlayerInfo.add(jLabel_Score, java.awt.BorderLayout.PAGE_END);

        jPanel_Container.add(jPanel_PlayerInfo, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(jPanel_Container, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // ----- Action Methods
    private void jButton_UpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UpActionPerformed
        if (doneChecking) {
            doneChecking = false;
            checkUD(-1);
        }
        
    }//GEN-LAST:event_jButton_UpActionPerformed

    private void jButton_DownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DownActionPerformed
        if (doneChecking) {
            doneChecking = false;
            checkUD(1);
        }    
    }//GEN-LAST:event_jButton_DownActionPerformed

    private void jButton_LeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LeftActionPerformed
        if (doneChecking) {
            doneChecking = false;
            checkLR(-1);
        }
    }//GEN-LAST:event_jButton_LeftActionPerformed

    private void jButton_RightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RightActionPerformed
        if (doneChecking) {
            doneChecking = false;
            checkLR(1);
        }
    }//GEN-LAST:event_jButton_RightActionPerformed

    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Down;
    private javax.swing.JButton jButton_Left;
    private javax.swing.JButton jButton_Right;
    private javax.swing.JButton jButton_Up;
    private javax.swing.JLabel jLabel_0;
    private javax.swing.JLabel jLabel_1;
    private javax.swing.JLabel jLabel_10;
    private javax.swing.JLabel jLabel_11;
    private javax.swing.JLabel jLabel_12;
    private javax.swing.JLabel jLabel_13;
    private javax.swing.JLabel jLabel_14;
    private javax.swing.JLabel jLabel_15;
    private javax.swing.JLabel jLabel_2;
    private javax.swing.JLabel jLabel_3;
    private javax.swing.JLabel jLabel_4;
    private javax.swing.JLabel jLabel_5;
    private javax.swing.JLabel jLabel_6;
    private javax.swing.JLabel jLabel_7;
    private javax.swing.JLabel jLabel_8;
    private javax.swing.JLabel jLabel_9;
    private javax.swing.JLabel jLabel_GTitle;
    private javax.swing.JLabel jLabel_Score;
    private javax.swing.JPanel jPanel_0;
    private javax.swing.JPanel jPanel_1;
    private javax.swing.JPanel jPanel_10;
    private javax.swing.JPanel jPanel_11;
    private javax.swing.JPanel jPanel_12;
    private javax.swing.JPanel jPanel_13;
    private javax.swing.JPanel jPanel_14;
    private javax.swing.JPanel jPanel_15;
    private javax.swing.JPanel jPanel_2;
    private javax.swing.JPanel jPanel_3;
    private javax.swing.JPanel jPanel_4;
    private javax.swing.JPanel jPanel_5;
    private javax.swing.JPanel jPanel_6;
    private javax.swing.JPanel jPanel_7;
    private javax.swing.JPanel jPanel_8;
    private javax.swing.JPanel jPanel_9;
    private javax.swing.JPanel jPanel_Board;
    private javax.swing.JPanel jPanel_Buttons;
    private javax.swing.JPanel jPanel_Container;
    private javax.swing.JPanel jPanel_LSpace;
    private javax.swing.JPanel jPanel_PlayerInfo;
    private javax.swing.JPanel jPanel_RSpace;
    // End of variables declaration//GEN-END:variables

}
