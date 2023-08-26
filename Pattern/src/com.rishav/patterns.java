package com.rishav;

public class patterns {
    public static void main(String[] args) {
        eleven(4);
    }

    public static void first(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public  static void second(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public  static void third(int n){
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public  static void four(int n){
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public  static void five(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public  static void six(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void seven(int n){
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n-i-1; k++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            for (int k = 0; k < n-i-1; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void eight(int n){
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2*n-(2*i+1); k++) {
                System.out.print("*");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void nine(int n){
        seven(n);
        eight(n);
    }

    public  static  void ten(int n){
        for (int i = 0; i <= 2*n-1; i++) {
            int star = i;
            if (i>n) star = 2*n-i;
            for (int j = 0; j < star; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void eleven(int n){
        int start = 1;
        for (int i = 0; i < n; i++) {
            if ( i%2 == 0 ) start =1;
            else start =0;
            for (int j = 0; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }

    public static  void twelve(int n){
        int space = 2*(n-1);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println(j);
            }

            for (int j = 0; j < space; j++) {
                
            }
            
            for (int j = 0; j > i; j--) {
                System.out.println(j);
            }

        }
        
    }

}
