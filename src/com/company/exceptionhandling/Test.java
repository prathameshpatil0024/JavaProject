package com.company.exceptionhandling;

public class Test {
    public static void main(String[] args) {


        System.out.println(" prathamesh");
        try {
            int x = 0 / 0;
            String s = null;
            System.out.println(x);

        }catch(Exception e){
            e.printStackTrace() ;
        }

        System.out.println(" patil");
    }
}

        /*}catch( ArithmeticException e){
            e.printStackTrace();
        } catch(NullPointerException a){
            a.printStackTrace() ;*/
       /* }catch(Exception e){
            e.printStackTrace() ;
        }*/

