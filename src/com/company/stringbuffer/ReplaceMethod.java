package com.company.stringbuffer;

public class ReplaceMethod {
    public static void main(String[] args) {
        String s="java is  programing language";
        StringBuffer sb=new StringBuffer(s);

        System.out.println(sb.replace(4, 9 , "prathamesh") );

    }


}
