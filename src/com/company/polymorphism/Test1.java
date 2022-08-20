package com.company.polymorphism;

public class Test1 {
    int data =200;

    public void changevalue(Test1 t) {        //call by referance
        data = data+700;
        System.out.println(data);
    }

    public static void main(String[] args) {
        Test1 t=new Test1();
        System.out.println("before the change" +t.data);
        t.changevalue(t );
        System.out.println("after the change" + t.data);
    }
}
