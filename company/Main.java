package com.company;

import javax.crypto.AEADBadTagException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws PierwiastekZUjemnejExpception {
        // write your code here


        Scanner l1 = new Scanner(System.in);
        System.out.println("Podaj liczbę do podzielenia: ");
        int liczba1 = l1.nextInt();
        Scanner l2 = new Scanner(System.in);
        System.out.println("Podaj dzielnik: ");
        int liczba2 = l2.nextInt();


        Kalkulator calc = new Kalkulator();
        calc.setLiczba1(liczba1);
        calc.setLiczba2(liczba2);

        try{
            calc.liczDzielenie();
        }catch(ArithmeticException d){
            DzieleniePrzezZeroException powod = new DzieleniePrzezZeroException();
            powod.dajPowod();
        }



        String komunikat = "Probowales ";
        String komunikat2 = "wyciagnac ";
        String komunikat3 = "pierwiastek z liczby ujemnej";
        StringBuilder zlaLiczba = new StringBuilder();
        zlaLiczba.append(komunikat);
        zlaLiczba.append(komunikat2);
        zlaLiczba.append(komunikat3);
        String messege = zlaLiczba.toString();


        if(liczba1 < 0){
           throw new PierwiastekZUjemnejExpception(messege);


        }
        else {
            calc.liczPierwiastek();
        }

    }
}

