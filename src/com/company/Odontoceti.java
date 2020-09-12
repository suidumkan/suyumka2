package com.company;

public class Odontoceti extends Mysticeti {
    private String type;
    private String Communication;
    private Fact fact2;
    private Color color;

    public Odontoceti(String forexample, double length, Fact fact, Color color,
                      String name, int weight, double dia, Fact fact1, Color color1,
                      String type, String communication, Fact fact2, Color color2) {
        super(forexample, length, fact, color, name, weight, dia, fact1, color1);
        this.type = type;
        Communication = communication;
        this.fact2 = fact2;
        this.color = color2;
    }

    public String getType() {
        return type;
    }

    public String getCommunication() {
        return Communication;
    }

    public Fact getFact2() {
        return fact2;
    }

    @Override
    public Color getColor() {
        return color;
    }


    public void makeVoice(int numb, String voice) {
        for (int i = 0; i < numb; i++) {
            System.out.println(voice);
        }
    }

    @Override
    public String printInfo() {
        return super.printInfo() +
                "\nК зубатым относятся - дельфины и морские свиньи " + getType() +
                "\nКиты общаются между собой - Отсуствие  голосовых связок не мешает китам разговаривать" +
                "\n и издавать особые звуки с помощью эхолокационного аппарата  " + getCommunication() +
                "\nСамый интересный факт  - продолжительность жизни некоторых видов китов превышает 100 лет. " +
                "\nБелуха - зубатый кит. Весом до 2 тонн, Постоянно встечается в дельфинариях и оакеанариумах. " + getFact2() +
                "\n Цвет - " + getColor();
    }
}
