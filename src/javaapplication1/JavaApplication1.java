/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author sanja
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner skenerka = new Scanner(System.in);

        int prvi, drugi, rezultat;
        // System.out.println("Enter first num: ");
        System.out.println("Prvi Broj: ");
        prvi = skenerka.nextInt();

        // System.out.println("Enter second num: ");
        System.out.println("Drugi broj: ");
        drugi = skenerka.nextInt();

        rezultat = prvi + drugi;
        System.err.println(rezultat);

        if (rezultat > 0) {
            System.out.println("Rezultat je pozitivan.");
        } else if (rezultat < 0) {
            System.out.println("Rezultat je negativan.");
        } else if (rezultat == 0) {
            System.out.println("Rezultat je nula.");
        }

    }

}
