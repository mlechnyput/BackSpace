package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string : ");
        process(scan.nextLine());
    }

    public static void process(String str) {
        String strFinal = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '#') strFinal += str.charAt(i);
            else if (strFinal.length()>0) strFinal = strFinal.substring(0, strFinal.length() - 1);
        }
        System.out.print(strFinal);
    }
}
