package com.company.arrey;

public class ArreyExam {
    public static void main(String[] args) {
        int[] x = new int[]{0, 2, 4, 8, 16, 32};
        String[] y = new String[]{"mechanical", "engineer"};
        System.out.println(x.length);
        System.out.println(y.length);
      /*  for(int i:x){
            System.out.println(i);    // for each loop for value initialize

        }*/
        for (int i = 0; i <= x.length - 1; i++) {
            System.out.println(x[i]);      //for loop for value initialize
        }
    }
}
