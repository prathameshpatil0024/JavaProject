package com.company.stringbuffer;

public class AppendMethod {
    public static void main(String[] args) {
        String s=("java is  programing language");
        StringBuffer sb=new StringBuffer(s);
        System.out.println(sb.append(" also python") );
    }
}
