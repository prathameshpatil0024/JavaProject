package com.company.exceptionhandling;

public class ThrowsMethod {
    public static void CheckVotingCritria(int criteria)throws Exception  {


            if ( criteria< 18){
                throw new Exception("below 18 is not voting criteria");
            }else {
                System.out.println("above 18 is mandatory voting criteria");
            }
        }
        public static void method1(int a)throws Exception{
            CheckVotingCritria(a);
        }

        public static void main(String[] args) throws Exception{
            method1(19);

        }
    }


