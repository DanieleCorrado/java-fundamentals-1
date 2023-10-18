package org.lessons.java;


import java.util.Scanner;

public class Ferragnez {

    /*
    * State lavorando col servizio di sicurezza dei Ferragnez e il vostro compito è di assicurarvi che accedano alla festa
    solo gli invitati presenti sulla lista (in fondo al post).
    Nel programma bisogna:
    creare e inizializzare l’array contenente i nomi degli invitati (trovate un esempio in fondo alla traccia)
    chiedere all’utente come si chiama
    verificare che il nome sia presente nella lista lasciarlo entrare o rispedirlo cortesemente da dove è venuto
    Attenzione: per verificare se due stringhe sono uguali non usare == ma il metodo equals()
    Bonus se avete usato il ciclo for per cercare il nome nella lista nella consegna base, implementare lo stesso programma
    usando il ciclo while, e viceversa
    Lista invitati: Dua Lipa, Paris Hilton, Manuel Agnelli, J-Ax, Francesco Totti, Ilary Blasi, Bebe Vio, Luis, Pardis Zarei,
    Martina Maccherone, Rachel Zeilic*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Inizializzo l'array con gli invitati

        String[] invited = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
                            "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        // Inizializzo una variabile booleana che tiene traccia se ho trovato l'invitato

        boolean isInvited = false;

        System.out.print("Enter full name: ");
        String userName = scanner.nextLine();

        for (int i = 0; i < invited.length; i++) {
            if (invited[i].equals(userName)) {
                isInvited = true;
                break;
            }
        }

        if(isInvited) {
            System.out.println(userName + ", welcome to the party");
        } else {
            System.out.println(userName + ", I'm sorry, you're not among the guests");
        }

        scanner.close();

    }
}
