package com.company.arrey;

public class MultiDimensional1 {
    public static void main(String[] args) {
        int[][] y = new int[3][3] ;
       y[0][0]=1;
        y[0][1]=2;
        y[0][2]=3;
        y[1][0]=4;
        y[1][1]=5;
        y[1][2]=6;
        y[2][0]=7;
        y[2][1]=8;
        y[2][2]=9;

        for (int i = 0; i<y.length ; i++) {
            for (int j = 0; j<y.length ;j++) {
                System.out.print(y[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
