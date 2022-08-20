package com.company.variable;

public class Variable2 {
   public   int a=15;
    public static int b=325;
    static int c;

    public  void method1(){
        method3() ;
        System.out.println("Non static method1");
    }

    public static void method2() {
        System.out.println(" static method2");

    }
    public static void method3(){
        System.out.println("non static method cannot call in static method");
    }

    public static void main(String[] args) {
        int d = 45;
        Variable2 a = new Variable2();
        System.out.println(a.a);
        System.out.println(Variable2.b);
        System.out.println(c);
        System.out.println(d);
      method2();
       a.method1();
}
}


