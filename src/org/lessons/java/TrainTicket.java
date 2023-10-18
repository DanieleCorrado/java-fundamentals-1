package org.lessons.java;

import java.util.Scanner;

public class TrainTicket {
    /*
    * Il programma dovrà chiedere all’utente il numero di chilometri che vuole percorrere e l’età del passeggero.
    * Sulla base di queste informazioni dovrà calcolare il prezzo totale del viaggio, secondo queste regole:
    * il prezzo del biglietto è definito in base ai km (0.21 € al km)
    * va applicato uno sconto del 20% per i minorenni
    *  va applicato uno sconto del 40% per gli over 65.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double pricePerKm = 0.21;

        System.out.print("How many km do you have to travel? ");
        double km = scanner.nextDouble();
        System.out.print("How old are you? ");
        int age = scanner.nextInt();

        double price = pricePerKm * km;

        if(age < 18) {
            double discount = (price * 20) / 100;
            price = price - discount;
        } else if (age > 65) {
            double discount = (price * 40) / 100;
            price = price - discount;
        }

        System.out.println("The ticket price is " + price);


        // Chiusura scanner
        scanner.close();
    }
}
