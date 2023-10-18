package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {

    /*
    * Aggiungete un package org.lessons.java.security
    * - Aggiungete una classe PasswordGenerator che contiene un metodo main
    * Il programma deve fare quanto segue:
    * salvare in opportune variabili il nome, cognome, colore preferito e data di nascita di un utente suddivisa in giorno,
    * mese e anno in numero
    * generare (e stampare a video) una password concatenando nome, cognome, colore preferito e somma di giorno, mese e anno di nascita, separate dal carattere -
    * Esempio: ho un utente che si chiama Pinco Pallo, nato il 12/05/1994, il cui colore preferito è il magenta
    * La sua password sarà Pinco-Pallo-magenta-2011*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        System.out.print("Enter your surname: ");
        String userSurname = scanner.nextLine();
        System.out.print("Enter your favorite color: ");
        String favoriteColor = scanner.nextLine();
        System.out.print("Enter your day of birth (gg/mm/YY): ");
        String birthDate = scanner.nextLine();

        String[] spliceString = birthDate.split("/");

        int sumdate = Integer.parseInt(spliceString[0]) + Integer.parseInt(spliceString[1]) + Integer.parseInt(spliceString[2]);

        String password = userName + "-" + userSurname + "-" + favoriteColor + "-" + sumdate;

        System.out.println("Your password is: " + password);

        scanner.close();
    }
}
