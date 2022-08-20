package com.company.loop;

public class NestedLoop {
    public static void main(String[] args) {
        // nested loop  re -initialize value every time(i.e start from value 0)
        // for loop executed 3 times while nested loop executed 9 times.

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
}

