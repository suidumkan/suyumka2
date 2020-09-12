package com.company;

public class Mysticeti extends Archaeoceti {
    private String name;
    private int weight;
    private double dia;
    private Fact fact1;
    private Color color;


    public Mysticeti(String forexample, double length, Fact fact, Color color, String name,
                     int weight, double dia, Fact fact1, Color color1) {
        super(forexample, length, fact, color);
        this.name = name;
        this.weight = weight;
        this.dia = dia;
        this.fact1 = fact1;
        this.color = color1;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public double getDia() {
        return dia;
    }

    public Fact getFact1() {
        return fact1;
    }

    @Override
    public Color getColor() {
        return color;
    }

    public void makeVoice(String voice, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(voice);
        }
    }

    public void makeVoice(int num, String voice) {
        for (int i = 0; i < num; i++) {
            System.out.println(voice);
        }
    }

    public String printInfo() {
        return "Усатые киты - отличающиеся усамиб фильтрообразной структурой, " +
                "\nрасположенной на верхней челюсти, состоящей в основном из кератина  " + getName() +
                "\nВес - " + getWeight() +
                "\nДиаметр  - " + getDia() +
                "\nИнтересный Факт - Мелкие животные живут до тридцати лет, срок жизни крупных китов не превышает пятидесяти лет. " + getFact() +
                "\nЦвет кита - " + getColor();

    }
}

