package com.company;

public class Main {

    public static void main(String[] args) {

        Automobiles a = new Automobiles ();
        a.type = "Sedan";
        a.yearMade = 2016;
        a.isNew = true;

        Phones P = new Phones ();
        P.type = "Samsumg";
        P.isRefurblished = true;

        Laptops L = new Laptops ();
        L.brand = "apple";
        L.userFriendly = true;

        State s = new State ();
        s.name = "Minnesota";
        s.population = 142334;
        s.isItSpring = false;

        Kids k = new Kids ();
        k.name = "Tim";
        k.age = 11;
        k.isMale = true;
    }
}
