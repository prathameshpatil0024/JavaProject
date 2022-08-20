package com.company.variable;

public class Variable {
    int a=15;            //instance variable
    static int b=30;      //static variable
    static int c;

    public static void main(String[] args) {
        int d=45;         //local variable
        Variable a=new Variable();
        System.out.println(a.a);
        System.out.println(Variable.b);
        System.out.println(c);
        System.out.println(d);
    }


}
