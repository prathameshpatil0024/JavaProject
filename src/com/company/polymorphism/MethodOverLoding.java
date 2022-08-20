package com.company.polymorphism;

public class MethodOverLoding {
    public void multiplication( int a,int b){

        System.out.println(a*b);
    }
     public void  multiplication(int a,int b,int c){

        System.out.println(a*b*c);
     }

    public static void main(String[] args) {
        MethodOverLoding t=new MethodOverLoding();
        t.multiplication(5,10);
        t.multiplication(2,4,6);

    }
}
