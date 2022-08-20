package com.company.wrapperclass;

public class UnboxingExapmle {

    public static void main(String[] args) {
        int a= new Integer(1998);
        String b= new String("kolhapur");
        char c= new Character('p') ;

        int x=a;
        String s=b;
        char z=c;

        System.out.println(x);
        System.out.println(s);
        System.out.println(z);
    }
}

