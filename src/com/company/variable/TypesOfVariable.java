package com.company.variable;

public class TypesOfVariable {
    int a=10;               //instance variable
    static int b=12;        //static variable

    public static void main(String[] args) {
        int c = 14;                     //local variable
        TypesOfVariable p = new TypesOfVariable();    // create object  for instance variable
        System.out.println(p.a);
        // static variable call with class and without class
        System.out.println(b);         //without class for static variable
        System.out.println(c);       //local variable direct call
        System.out.println(TypesOfVariable.b); //with class for static variable
    }


}
