package com.company;

public class TenThree {
    // ----- Question 10.3 -----
    /* I know the class is supposed to be called "MyInteger" I called it
    "TenThree" just so that I could keep track of what problem I am doing */
    // ----- Global Variables -----
    int value = 0;

    public static void main(String[] args) {
        // -- Client Program
        TenThree myInteger = new TenThree();

        myInteger.myInteger(5);

        // - Check if Even, Odd, or Prime
        boolean isEven = myInteger.isEven();
        boolean isOdd = myInteger.isOdd();
        boolean isPrime = myInteger.isPrime();
        System.out.println("Even: " + isEven + ", Odd: " + isOdd + ", Prime: " + isPrime);
        System.out.println("");

        // - Check if a number is Even, Odd, or Prime
        boolean isEvenII = isEven(9);
        boolean isOddII = isOdd(9);
        boolean isPrimeII = isPrime(9);
        System.out.println("Even: " + isEvenII + ", Odd: " + isOddII + ", Prime: " + isPrimeII);
        System.out.println("");

        // - Check if Even, Odd, or Prime based off of instance
        TenThree instance = new TenThree();
        instance.myInteger(4);

        boolean isEvenIII = isEven(instance);
        boolean isOddIII = isOdd(instance);
        boolean isPrimeIII = isPrime(instance);
        System.out.println("Even: " + isEvenIII + ", Odd: " + isOddIII + ", Prime: " + isPrimeIII);
        System.out.println("");

        // - Check equals methods
        // With Int
        int num = 7;
        boolean isEqual = instance.equals(num);
        System.out.println("Is 7 = value? " + isEqual);
        System.out.println("");

        // With Two Instances
        boolean isEqualII = myInteger.equals(instance);
        System.out.println("is " + instance.value + " = value? " + isEqualII);
        System.out.println("");

        // - Check Parse Methods
        char[] chList = {'a', 'r', 'j', 'c'};
        int cParse = parseInt(chList);
        System.out.println("Char List [ 'a', 'r', 'j', 'c'] to Int: " + cParse);
        System.out.println("");

        String test = "Hello";
        int sParse = parseInt(test);
        System.out.println("String 'Hello' to Int: " + test);


    }

    // ----- Methods -----
    public void myInteger(int num) {
        value = num;
    }

    public int getValue() {
        return value;
    }

    // ----- isEven Methods
    public boolean isEven() {
        boolean even = false;

        // - Check
        if ((value % 2) == 0) {
            even = true;
        }

        // - Return
        return even;
    }

    public static boolean isEven(int num) {
        boolean even = false;

        // - Check
        if ((num % 2) == 0) {
            even = true;
        }

        // - Return
        return even;
    }

    public static boolean isEven(TenThree myInteger) {
        boolean even = false;
        int num = myInteger.value;

        // - Check
        if ((num % 2) == 0) {
            even = true;
        }

        // - Return
        return even;
    }

    // ----- isOdd Methods
    public boolean isOdd() {
        boolean odd = false;

        // - Check
        if ((value % 2) != 0) {
            odd = true;
        }

        // - Return
        return odd;
    }

    public static boolean isOdd(int num) {
        boolean odd = false;

        // - Check
        if ((num % 2) != 0) {
            odd = true;
        }

        // - Return
        return odd;
    }

    public static boolean isOdd(TenThree myInteger) {
        boolean odd = false;
        int num = myInteger.value;

        // - Check
        if ((num % 2) != 0) {
            odd = true;
        }

        // - Return
        return odd;
    }

    // ----- isPrime Methods
    public boolean isPrime() {
        boolean prime = false;
        int count = 0;

        // - Check
        for (int i = 1; i < 100; i++) {
            if ((value % i) == 0) {
                count++;
            }
        }

        // - Count = 2 if only 1 and 'value' can divide without any remainder
        if (count == 2) {
            prime = true;
        }

        // - Return
        return prime;
    }

    public static boolean isPrime(int num) {
        boolean prime = false;
        int count = 0;

        // - Check
        for (int i = 1; i < 100; i++) {
            if ((num % i) == 0) {
                count++;
            }
        }

        // - Count = 2 if only 1 and 'value' can divide without any remainder
        if (count == 2) {
            prime = true;
        }

        // - Return
        return prime;
    }

    public static boolean isPrime(TenThree myInteger) {
        boolean prime = false;
        int num = myInteger.value;
        int count = 0;

        // - Check
        for (int i = 1; i < 100; i++) {
            if ((num % i) == 0) {
                count++;
            }
        }

        // - Count = 2 if only 1 and 'value' can divide without any remainder
        if (count == 2) {
            prime = true;
        }

        // - Return
        return prime;
    }

    // ----- Equals Methods
    public boolean equals(int num) {
        boolean equals = false;

        // - Check
        if (num == value) {
            equals = true;
        }

        // - Return
        return equals;
    }

    public boolean equals(TenThree myInteger) {
        boolean equals = false;

        // - Check
        if (myInteger.value == value) {
            equals = true;
        }

        // - Return
        return equals;
    }

    // ----- Parse Methods
    public static int parseInt(char[] n) {
        // - Parse
        int num = 0;

        for (int i = 0; i < n.length; i++) {
            int temp = (int)n[i];
            num = num + temp;
        }

        // - Return
        return num;
    }

    public static int parseInt(String n) {
        // - Parse
        int num = 0;

        for (int i = 0; i < n.length(); i++) {
            int temp = (int)(n.charAt(i));
            num = num + temp;
        }

        // - Return
        return num;
    }
}