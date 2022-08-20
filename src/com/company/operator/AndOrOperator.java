package com.company.operator;

public class AndOrOperator {
    /**
     * This is a if else loop
     * a,b,c,d                               //multi line comment
     * This is very useful function
     */

    public static void main(String[] args) {
        int a=0,b=2,c=4,d=4;

        if(a>=b&&c<=d){
            System.out.println("both the condition are true");
       } else {
        System.out.println("condition is fail");
        }
          if(a>=b||c>=d) {
              System.out.println("both the condition are true");
          }else{
              System.out.println("condition is fail");
          }
    }
}





