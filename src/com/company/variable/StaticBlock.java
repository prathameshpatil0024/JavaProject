package com.company.variable;

public class StaticBlock {
    int a=15;
    static int b=30;
    static int c;
    static{
        c=60;
        System.out.println("static block");
    }

    public  void method1(){
        System.out.println("Non static method1");
    }

    public static void method2(){
        int e=10;                          //local variable
        System.out.println(" static method2");
        System.out.println(e);

    }

    public static void main(String[] args) {
        int d = 45;                      // local variable
        Variable2 a = new Variable2();
        System.out.println(a.a);
        System.out.println(Variable.b);
        System.out.println(c);
        System.out.println(d);
        a.method1();
        method2();
        System.out.println(d);
    }


}


