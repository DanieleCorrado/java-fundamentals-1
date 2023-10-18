package org.lessons.java;

public class FizzBuzz {

    /*
    * Scrivi un programma che stampi i numeri da 1 a 100, ma per i multipli di 3 stampi “Fizz”
    * al posto del numero e per i multipli di 5 stampi Buzz.
    * Per i numeri che sono sia multipli di 3 che di 5 stampi FizzBuzz.*/
    public static void main(String[] args) {

        for (int i = 1; i <=100; i++) {

            if(((i % 3) == 0) && ((i % 5) == 0)) {
                System.out.println("FizzBuzz");
            } else if((i % 3) == 0) {
                System.out.println("Fizz");
            } else if ((i % 5) == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
