package com.company;

public class Main {
    public static int firstEven(int ...a) {
        int c = 0;
        for (int i : a) {
            if (i % 2 == 0) {
                c = i;
                break;
            }
        } return c;
    }


        public static void main (String[]args){
        System.out.print(firstEven(1, 14, 25,38, 14, 28));
        }
    }

