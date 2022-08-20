package com.company.loop;

public class ForEachloop {
    public static void main(String[] args) {
            int[] a = new int[5];
            a[0] = 5;
            a[1] = 10;
            a[2] = 15;
            a[3] = 20;
            a[4] = 25;

            System.out.println(a[1]);
        System.out.println(a.length );

            for (int array : a) {            // for each loop
                System.out.println(array);
            }
        }
    }


