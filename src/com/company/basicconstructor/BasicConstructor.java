package com.company.basicconstructor;

public class BasicConstructor {

    int A;
    int B;
    String S;

    BasicConstructor (int X, int Y){
        this.A=A;
        this.B=B;
    }

    public  void method1()  {
        System.out.println( A + " "+ B);
        this.method2();
    }
    public void method2(){
        System.out.println(" method2");
    }

    public static void main(String[] args) {
        BasicConstructor  basicconctructor= new BasicConstructor(10,12);

    }
}

