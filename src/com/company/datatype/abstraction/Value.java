package com.company.datatype.abstraction;

public class Value {
     int a ;


    Value() {
        a=10;
    }
      void method1(){
        System.out.println(a );
    }

    public static void main(String[] args) {
        Value  value=new Value();
        System.out.println(value.a);
    }



    }




