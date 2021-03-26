package com.company;

public class Main {
    public static float min(float[] mas) {
    float m = mas [0];
    for (int j = 1; j < mas.length; j = j+1) {
        if (mas[j] < m) {
            m = mas[j];
        }
    }return m;
}
    public static void main(String[] args) {
        float [] mas = new float[]{5.9f, 2.4f, 5.8f,3.2f};
        System.out.print("Минимальное значение:  ");
        System.out.print(min(mas));


    }
}

