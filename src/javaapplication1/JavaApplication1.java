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

        Scanner sanjaSkenerSuperZena = new Scanner(System.in);

        int first, second, result;
        System.out.println("Enter first num: ");
        first = sanjaSkenerSuperZena.nextInt();

        System.out.println("Enter second num: ");
        second = sanjaSkenerSuperZena.nextInt();

        result = first + second;
        System.err.println(result);

        if (result > 0) {
            System.out.println("Result is positive.");
        } else if (result < 0) {
            System.out.println("Result is negative.");
        } else if (result == 0) {
            System.out.println("Result is zero.");
        }

    }

}
