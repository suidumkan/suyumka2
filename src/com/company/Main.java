package com.company;

public class Main {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        Mysticeti mysticeti = new Mysticeti("Киты ", 140, new Fact("Тип", "Отряд"), Color.BLUE,
                "Mysticeti", 140000, 60, new Fact("Усатые киты","Общение"), Color.GRAY);
        mysticeti.makeVoice(ANSI_YELLOW + "NOC", 5);
        System.out.println("--------------------------");
        System.out.println(ANSI_CYAN + mysticeti.printInfo());

        System.out.println("_________________________________________________________");

        Odontoceti odontoceti = new Odontoceti("Киты ", 140, new Fact("Тип", "Отряд"), Color.BLUE,
                "Mysticeti", 140000, 60, new Fact("Усатые киты","Общение"), Color.GRAY,
                "Type", "Language", new Fact ("Live", "Белуха"), Color.WHITE);
        System.out.println(ANSI_RESET + odontoceti.printInfo() );

        odontoceti.makeVoice( 3, ANSI_GREEN + " NOC, NOC, NOC ");


    }
}
/*
b)  Создать иерархию из 3х классов (1й -> 2й -> 3й уровень иерархии), последний 3й класс сделать не наследуемым
c)  Все поля классов должны быть приватными, одно из полей должно быть сложного типа созданного вами же (4й класс),
одно из полей сделать сложного типа (enum)
d)  В классах не должно быть setter-ов, только getter-ы и конструкторы
e)  Добавить перегруженные методы (2-3 шт.) в класс 2-го уровня иерархии, один из них сделать неперезаписываемым
f)  В классе 3-го уровня перезаписать один из методов родителя
g)  В главном классе (Main) Создать объект класса 2-го уровня (objectA) и 2 объекта класса 3-го уровня (objectB, objectC),
 также распечатать все свойства объектов и вызвать перегруженные методы через каждый из экземпляров ваших объектов.

На сообразительность
h)  Написать метод в классе 3-го уровня который бы копировал некоторые свойства из себеподобного объекта
i)  Затем скопировать несколько свойств из objectB в objectC и распечатать информацию по objectC */
