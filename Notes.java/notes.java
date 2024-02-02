//     //         char currChar = str.charAt(i);

// import java.util.*;

// public class notes {
//     // public static void character(String str, int index) {
//     //     for (int i = 0; i < index; i++) {
//     //         }
//     //         if (currChar - 'a') {
//     //             System.out.println(currChar);

//     //     }

//     // }

//     // public static void main(String[] args) {
//     //     Scanner sc = new Scanner(System.in);
//     //     StringBuilder str = new StringBuilder("");

//     //     int n = sc.nextInt();
//     //     for (int a = 0; a < n; a++) {
//     //         int grade = sc.nextInt();
//     //         // your code goes here
//     //         if (grade < 38) {
//     //             System.out.println(grade);
//     //         } else {
//     //             int q = grade / 5; // 4
//     //             int rem = grade % 5;
//     //             if (rem >= 3) {
//     //                 System.out.println((q + 1) * 5);
//     //             } else {
//     //                 System.out.println(grade);
//     //             }
//     //         }
//     //     }
//     //     sc.close();
//     // }
// }

import java.util.Scanner;

public class notes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int arr[] = new int[t];
        int Ans = 0;
        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();
            Ans += arr[i];
        }
        System.out.println(Ans);
        sc.close();
    }
}

// /*
// *
// * psvm = public static void main(String args[]);
// *
// *
// * Print in Output
// *
// * sout or syso = System.out.println("statment");
// * ln mean new line
// * this line print in row // System.out.print("Statment");
// *
// * comment = single line //
// * double line /*
// */

// /*
// *
// * 1st package is : import java.util.Scanner;
// * 2nd package is : import java.util.Scanner;
// *
// * Print in Input
// *
// * Scanner sc = new Scanner(System.in);
// * sc.close();
// *
// * int variable = sc.nextInt();
// *
// * float variable = sc.nextFloat();
// *
// * double variable = sc.nextDouble();
// *
// * char alphabet = sc.next().charAt(0);
// *
// *
// */

// /*
// * while(condition){
// * ------do something-----
// * }
// *
// * for (intialisation ; condition ; updation){
// * --------do something-----------
// *
// * }
// *
// *
// * do{
// * ---------do something ---------
// * }while(condition)
// */
// /*
// * // public static void main (String[] args) {
// * // public static= excess modifier // void = return type // String[] args =
// * input main function
// * // khali value return
// *
// */
// /*
// * Math.sqrt(n) = root ( n )
// * Binary to decimal Math.pow(2, pow) = 2^10
// * Decimal To Binary Math.pow(10, Pow) = 10^2
// */