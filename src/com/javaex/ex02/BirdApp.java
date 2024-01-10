package com.javaex.ex02;

public class BirdApp {

    public static void main(String[] args) {
        Bird bird01 = new Duck();
        bird01.setName("꽥꽥이");
        ((Duck)bird01).fly();
        ((Duck)bird01).sing();
        ((Duck)bird01).showName();

        Bird bird02 = new Sparrow();
        bird02.setName("짹짹이");
        ((Sparrow)bird02).fly();
        ((Sparrow)bird02).sing();
        ((Sparrow)bird02).showName();
    }

}
