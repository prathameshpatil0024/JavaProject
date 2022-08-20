package com.company.override;

public class Sum extends Value {
    Sum (int a, int b){
        super();
        System.out.println("defult constructor");
    }
    @Override
    public void addition() {
        System.out.println("value a and value b are natural number");
    }
    public void method1() {
        System.out.println(super.a );
    }

    public static void main(String[] args) {
        Sum sum=new Sum(10,5);


    }

}
