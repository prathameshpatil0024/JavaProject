package com.company.arrey;

public class OneDimensional {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = 5;
        a[1] = 10;
        a[2] = 15;
        a[3] = 20;
        a[4] = 25;

        System.out.println(a[1]);

        for (int i=0;i<a.length ;i++){   //for loop used for initialize the value
            System.out.println(a[i ]);
        }
        for (int array : a) {       //for each loop for initialize value
            System.out.println(array);
        }
    }
}
