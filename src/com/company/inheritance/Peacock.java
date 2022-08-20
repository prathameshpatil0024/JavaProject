package com.company.inheritance;

public class Peacock extends Birds {
    public void dancing(){
        System.out.println("dancing");
    }

    public static void main(String[] args) {
        Peacock p=new Peacock();
        p.flying() ;
        p.dancing();



        }
    }

