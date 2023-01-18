package com.rishav;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        /*
        For loop SYNTAX
       for(initialization; condition; increment/decrement){
            // code to be executed
        }
       */

//    for (int i=1; i<=5; i++){
//        System.out.println("Hey");
//    }

        // By Scanner
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

//        for (int i = 0; i <= n; i++) {
//            System.out.print(i + "|");
//        }
//
//    }

        // WHILE LOOP

    /*
    Syntax:
        while(condition){
        // code to be executed
        }
    */
//        int i = 1;
//        while (i <= n) {
//            System.out.println(i);
//            i++;
//        }

        // DO WHILE

        /*
            do{
                // code to be executed
            }while(condition);
       */
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i<=n);

    }
}
