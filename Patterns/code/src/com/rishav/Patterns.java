package com.rishav;

public class Patterns {

    public static void main(String[] args) {
        pattern28(5);
    }

    static void pattern30(int n){
        for (int row = 1; row < n; row++) {

        }
    }

    static void pattern28(int n){
        for (int row = 1; row <= 2*n-1; row++) {
            int totalColsRows = row > n ? 2 * n - row: row;
            int noOfSpaces = n - totalColsRows;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalColsRows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for (int row = 1; row <= 2*n-1; row++) {
        int totalColsRows = row > n ? 2 * n - row: row;
            for (int col = 1; col <= totalColsRows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=n-row+1 ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern1(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=n ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
