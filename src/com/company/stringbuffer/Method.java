package com.company.stringbuffer;
// write a program reverse a string  without using reverse method or reverse implement body

public class Method {
    public static void main(String[] args) {
        String s="java is  programing language";

        for (int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i) );
        }
    }
}
