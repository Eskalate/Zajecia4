package com.company;

import static java.lang.StrictMath.sqrt;

public class Kalkulator {

    private int liczba1;
    private int liczba2;


    public int getLiczba1(){
        return liczba1;
    }
    public void setLiczba1(int liczba1){
        this.liczba1 = liczba1;
    }

    public int getLiczba2(){ return liczba2; }
    public void setLiczba2(int liczba2){this.liczba2 = liczba2; }

    public void liczPierwiastek(){
        double pierwiastek = sqrt(liczba1);
        System.out.println("Pierwiastek z liczby1 to: " + pierwiastek);

    }
    public void liczDzielenie(){
    float wynik;
        wynik = liczba1/liczba2;
        System.out.println("Wynik tego dzielenia to: " + wynik);
    }


}
