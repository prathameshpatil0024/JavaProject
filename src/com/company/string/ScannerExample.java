package com.company.string;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        System.out.println("enter the name");
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine() ;
        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i) );
        }

    }
}
