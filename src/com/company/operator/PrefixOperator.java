package com.company.operator;

public class PrefixOperator {
    public static void main(String[] args) {
        int a = 14;
        int b = ++a;   //prefix incremental operator
        int c = a;

/*
             int a=65;
             int b=--a;    //prefix decremental operator
             int c=b;
            */
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

}
