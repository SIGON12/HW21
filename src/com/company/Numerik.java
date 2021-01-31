package com.company;

public class Numerik <T extends Number, V extends Number> {
    private T obj1;
    private V obj2;
    private T arrayObj1[];
    private V arrayObj2[];

    public Numerik(T obj1, V obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void Numarr(T[] arrayObj1, V[] arrayObj2){
        System.out.println("Массив");
        this.arrayObj1 = arrayObj1;
        this.arrayObj2 = arrayObj2;
    }

    public double summ(){
        return this.obj1.doubleValue() + this.obj2.doubleValue();
    }

    public void equalsArraysElements(){
        if(this.arrayObj1.length != this.arrayObj2.length){
            System.out.println("Не одинаковая длинна! Сравнение невозможно");
        }
        else{
            for(int i = 0; i < this.arrayObj1.length; i++){
                if(this.arrayObj1[i].doubleValue() == this.arrayObj2[i].doubleValue()){
                    System.out.println("Элементы с индексом " + (i + 1) + " равны");
                }
                else{
                    System.out.println("Элементы с индексом " + (i + 1) + " не равны");
                }
            }
        }
    }

}
