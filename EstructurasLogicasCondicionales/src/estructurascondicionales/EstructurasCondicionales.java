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
public class EstructurasCondicionales {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int num = 0, divisores = 0;

        System.out.print("Ingrese un número:\n====> ");
        num = sc.nextInt();
        for (int i = 1; i <= (num + 1); i++) {
            if (num % i == 0) {
                divisores++;
            }
        }

        if (divisores == 2) {
            System.out.printf("El número %s es primo\n", num);
        } else {
            System.out.printf("El número %s no es primo\n", num);
        }
    }

}
