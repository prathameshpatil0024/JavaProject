package com.company.arrey;

public class MultiDimensional {
    public static void main(String[] args) {
        int[][] y = new int[][]{{11, 22}, {33, 44},{55,66}};

                System.out.println(y.length);
       /* System.out.println(y[1][1]);
        System.out.println(y[2][1]);*/

        for (int i = 0; i <= y.length-1 ; i++) {
            for (int j = 0; j <= y.length-1 ; j++) {
                System.out.print(y[i][j] + " ");
            }
            System.out.println(" ");
        }

    }


    }





