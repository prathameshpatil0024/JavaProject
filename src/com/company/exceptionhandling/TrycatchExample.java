package com.company.exceptionhandling;

public class TrycatchExample {

    public static void main(String[] args) {
        int a=5,b=0,c;
       try{
           System.out.println("code start");
           c=a/b;
           System.out.println(c);
       }catch(ArithmeticException d){
           d.printStackTrace() ;
       }
       System.out.println("code end");

    }
}
