package com.company.constructor;

public class NewConstructor {
    int a;
    String b;

    NewConstructor() {

        System.out.println("defult constructor");
    }
  
    public static void main(String[] args) {
        NewConstructor newconstructor = new NewConstructor();
        System.out.println(newconstructor.a);
        System.out.println(newconstructor.b);

    }
}