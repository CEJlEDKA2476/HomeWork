package com.company.organization;

public class Main {
    public static void main(String[] args) {
        Development development = new Development(2, "Alex, Ulia");
        Director director = new Director("Konstantin", 42);
        Finance finance = new Finance(1, "Jey");
        Marketing marketing = new Marketing(2, "Joe, Moe");
        Personal personal = new Personal(1, "Olga");
        Planning planning = new Planning(2, "Sam, Jake, Po");
        Production production = new Production(2, "Nadezhda, Tomas");
        Supply supply = new Supply(1, "Kate");

        Organization organization = new Organization(development, director, finance, marketing, personal, planning,
                production, supply);
    }
}
