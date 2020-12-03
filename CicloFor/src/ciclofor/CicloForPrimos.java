/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclofor;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class CicloForPrimos {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String lines = "☰☱☱☰☰☱☱☰☰☱☱☰☰☱☱☰☰☱☱☰☰☱☱☰☰☱☱☰☰☱☱☰☰☱☱☰☰☱☱☰☰☱☱☰☰☱☱☰☰☱☱☰";
        int limite;
        double num = 1, den = 1;
        double suma = 0.0;

        System.out.println("Ingrese el límite: ");
        limite = read.nextInt();
        System.out.println(lines);
        for (int i = 1; i <= limite; i++) {

            if (ComprobarPrimo(den)) {
                if (ComprobarPar(num)) {
                    System.out.printf("- %s/%s ", (int)num, (int)den);
                    suma = (double)suma - num / den;
                } else {
                    if (i <= 2) {
                        System.out.printf("%s/%s ", (int)num, (int)den);
                        suma = (double)suma + num / den;

                    } else {
                        System.out.printf("+ %s/%s ", (int)num, (int)den);
                        suma = (double)suma + num / den;
  
                    }

                }
                num++;
            } else {
                i -= 1;
            }
            den++;

        }
        System.out.println(" = "+ suma);
        System.out.println(lines);
    }

    public static boolean ComprobarPrimo(double num) {
        int divisores = 0;
        boolean Primo = false;
        int k = 0;
        for (k = 1; k <= num; k++) {
            if (num % k == 0) {
                divisores++;
            }
        }
        if (divisores == 2) {
            Primo = true;
        } else {
            Primo = false;
        }

        return Primo;
    }

    public static boolean ComprobarPar(double num) {
        boolean Par = false;

        if (num % 2 == 0) {
            Par = true;
        } else {
            Par = false;
        }
        return Par;
    }
}
