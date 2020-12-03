/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurascondicionales;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class ParOInpar {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese un número:");
        int num = read.nextInt();
        if (num % 2 == 0) {
            System.out.printf("El número %s es par\n", num);
        } else {
            System.out.printf("El número %s no es par\n", num);
        }
    }
}
