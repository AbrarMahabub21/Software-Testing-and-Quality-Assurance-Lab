package org.example;

public class CombinationCalculator {
    public static void main(String[] args) {
        double n = 2.5;
        double k = 3.0;

        try {
            int result = calculateCombination(n, k);
            System.out.println("Combination (" + n + ", " + k + ") = " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int calculateCombination(double n, double k) {
        if (n < 0 || n > 15 || k < 0 || k > 15) {
            throw new IllegalArgumentException("Input values must be in the range 0..15 inclusive.");
        }

        // Convert double values to integers
        int nInt = (int) n;
        int kInt = (int) k;

        if (nInt < kInt) {
            throw new IllegalArgumentException("n must be greater than or equal to k.");
        }

        // Calculate combination
        int combination = 1;
        for (int i = 1; i <= kInt; i++) {
            combination *= nInt - i + 1;
            combination /= i;
        }

        return combination;
    }


}
