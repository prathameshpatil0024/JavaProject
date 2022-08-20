package com.company.operator;

public class UnaryOperator {
    public static void main(String[] args) {
              int a = 25;
                int b = a++;   //postfix incremental operator
               int c = a;

               int d=44;
               int e=d --;  //postfix decremental operator
                int f=e;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}


