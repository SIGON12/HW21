package com.company;

public class Main {

    public static void main(String[] args) {
        Integer[] i = {5 ,6 ,7 ,8};
        Double[] d = {5.4, 6.0, 7.8, 8.0};
        Numerik<Integer, Double> num = new Numerik<Integer, Double>(7, 8.3);
        System.out.println(num.summ());
        Numerik.this.Numarr(new double[]{1.2, 1.0, 3.0,}, new double[]{1.2, 1.0, 3.1});
        Numerik<Integer, Double> num1 = new Numerik<Integer, Double>(5, 5.0);
        num1.equalsArraysElements();

    }
}
