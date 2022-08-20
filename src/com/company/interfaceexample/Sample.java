package com.company.interfaceexample;

public class Sample implements Test,Example {
    @Override
    public void demo(){                      //multiple inheritance
        System.out.println("demo class");
    }

    public static void main(String[] args) {
        Sample sample=new Sample();
        sample.demo();

    }

}
