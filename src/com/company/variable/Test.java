package com.company.variable;

public class Test {
    int a;
    public static int b=30;
    static int c;
    static{
        int a=10;
        c=60;
        System.out.println("static block");    //static block use  initialize the value and execute before main method
    }

    void method1(){
        System.out.println("Non static method1");
    }

      private static void method2(){
        System.out.println(" static method2");

    }

    public static void main(String[] args) {
        Test a = new Test();
        System.out.println(a.a);
        System.out.println(Test.b);
        System.out.println(c);
        a.method1();
        method2();

    }


}

