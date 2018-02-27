//package com.company;

public class EightSeven {
    public static void main(String[] args) {
        // ----- Question 8.7 -----
        // -- Build Array
        double[][] points = {
                {-1, 0, 3}, {-1, -1, -1}, {4, 1, 1},
                {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3},
                {-1.5, 4, 2}, {5.5, 4, -0.5}};

        // -- Get Smallest Point
        double[][] closestPoints = getClosestPoint(points);

        // -- Output
        System.out.println("The closest points are: ");
        for (int i = 0; i < closestPoints.length; i++) {
            for (int j = 0; j < closestPoints[0].length; j++) {
                System.out.print(closestPoints[i][j] + " ");
            }
            System.out.println("");
        }

    }

    public static double[][] getClosestPoint(double[][] points) {
        double[][] closestPoints = new double[2][3];
        double min = 0;

        // -- Find Closest Point
        for(int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                double distance = getDistance(points[i], points[j]);

                // -- Check If Same Point
                if (points[i][0] == points[j][0] && points[i][1] == points[j][1]) {
                    continue;
                } else {
                    if (min == 0) {
                        min = distance;
                        closestPoints[0] = points[i];
                        closestPoints[1] = points[j];
                    } else if (distance < min) {
                        min = distance;
                        closestPoints[0] = points[i];
                        closestPoints[1] = points[j];
                    }
                }
            }
        }

        // -- Return
        return closestPoints;
    }

    public static double getDistance(double[] a, double[] b) {
        // -- Subtract & Square Values
        double x = (a[0] - b[0]) * (a[0] - b[0]);
        double y = (a[1] - b[1]) * (a[1] - b[1]);
        double z = (a[2] - b[2]) * (a[2] - b[2]);

        // -- Calculate Distance
        double distance = Math.sqrt(x + y + z);

        // -- Return
        return distance;

    }
}
