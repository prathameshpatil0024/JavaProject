package com.company.polymorphism;

public class Test {
    int data=25;
    public void changevalues(int data){
        data=data-100;                   //call by value
        System.out.println(data);
    }

    public static void main(String[] args) {
        Test t=new Test();
        System.out.println("before the change" + t.data);
        t.changevalues(100) ;
        System.out.println("after the change"+t.data);
    }
}
