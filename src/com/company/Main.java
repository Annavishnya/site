package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
//       int [] a;
//       int n;
//       Scanner in = new Scanner (System.in);
//       System.out.print ("Enter numbers of array: ");
//       n = in.nextInt();
//       a = new int [n];
//       for (int i = 0; i<n; i++) {
//           System.out.print("Enter a ["+i+"] =");
//           a[i] = in.nextInt();
//
//       }


        int kolichestvoBukvM = 0;
        int kolichestvoBukvP = 0;
        final char m = 'м';
        final char p = 'п';


        final Scanner scanner = new Scanner(System.in);
        System.out.print("Введите" + " текст: ");
        String stroka = scanner.nextLine();


        for (int i = 0; i < stroka.length(); i++) {
            char bukva = stroka.charAt(i);
//            char bukva = stroka.toCharArray()[i];
            if (bukva == 'м') {
                kolichestvoBukvM++;


            }

    }

        for (char symbol : stroka.toCharArray()) {
//            if (symbol == 'м') {
//                kolichestvoBukvM++;
//            } else if (symbol == 'п') {
//                kolichestvoBukvP++;
//            }

            switch (symbol) {
                case p:
                    kolichestvoBukvP++;
                    break;
                case m:
                    kolichestvoBukvM++;
                    break;
            }
        }


        System.out.println(kolichestvoBukvM + " " + kolichestvoBukvP);


    }
}