package com.company.loop;

public class ContinueStatement {
    public static void main(String[] args) {
        for (int i = 0; i <= 3; i++) {
            if (i == 2) {
                continue;   //continue statement useif condition matched then iteration will be skipped
            }
            System.out.println(i);
        }
    }
}