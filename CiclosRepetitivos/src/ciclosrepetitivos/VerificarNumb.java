/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclosrepetitivos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class VerificarNumb {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int i = 1, num = 0, limite = 0, sumaPares = 0, sumaImpares = 0, sumaPositivos = 0, sumaNegativos = 0;
        boolean AddingNumbers = true;
        List<Integer> Numeros = new ArrayList<Integer>();
        System.out.println("Ingrese limite de números a verificar:");
        limite = read.nextInt();
        System.out.printf("Ingrese %s números para verificar(Presione enter al acabar de escribir el número):\n", limite);
        while (AddingNumbers == true) {
            num = read.nextInt();
            Numeros.add(num);
            if (i >= limite) {
                AddingNumbers = false;
            }
            i++;

        }
        int k = 1;
        for (int j = 0; j < Numeros.size(); j++) {
            while (k <= Numeros.get(j)) {
                if (Numeros.get(j) % 2 == 0) {
                    sumaPares = sumaPares + Numeros.get(j);
                } else {
                    sumaImpares = sumaImpares + Numeros.get(j);
                }

                if (num > 0) {
                    sumaPositivos = sumaPositivos + Numeros.get(j);
                } else {
                    sumaNegativos = sumaNegativos + Numeros.get(j);
                }
                k++;

            }

        }
        System.out.println("La suma de pares es: " + sumaPares);
        System.out.println("La suma de impares es: " + sumaImpares);
        System.out.println("La suma de positivos es: " + sumaPositivos);
        System.out.println("La suma de negativos es: " + sumaNegativos);
    }

}


