package com.company;

import java.util.Random;

public class Archaeoceti {
    private String forexample;
    private double length = generateDefaultLength();
    private Fact fact;
    private Color color;

    public Archaeoceti(String forexample, double length, Fact fact, Color color) {
        this.forexample = forexample;
        this.length = length;
        this.fact = fact;
        this.color = color;
    }

    public String getForexample() {
        return forexample;
    }

    public double getLength() {
        return length;
    }

    public Fact getFact() {
        return fact;
    }

    public Color getColor() {
        return color;
    }

    public void makeVoice(int number, String voice) {
        for (int i = 0; i < number ; i++) {
            System.out.println(voice);
        }
    }
    private double generateDefaultLength(){
        Random random = new Random();
        return random.nextDouble();
    }

    public String printInfo() {
        return "Описание - Кит морское животное типа хордовые " +
                "\nДлина - " + generateDefaultLength() +
                "\nФакт 1 - Все представители отряда и китообразных произошли от" +
                " сухопутных парнокопытных животных " + getFact() +
                "\nЦвет кита " + getColor();


    }
}
