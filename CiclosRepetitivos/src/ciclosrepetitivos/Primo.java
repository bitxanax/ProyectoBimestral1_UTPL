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
public class Primo {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        int num = 0, divisores = 0, i = 1, limite = 0;
        List<Integer> Numeros = new ArrayList<Integer>();
        boolean AddingNumbers = true;

        System.out.println("Ingrese la cantidad de números que desea verificar:");
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
        
    
        i = 1;
        for (int k = 0; k < Numeros.size(); k++) {
            while (i <= Numeros.get(k)) {
                if (Numeros.get(k) % i == 0) {
                    divisores++;
                }
                i = i + 1;
            }
            if (divisores == 2) {
                System.out.printf("El número %s es primo\n", Numeros.get(k));
            } else {
                System.out.printf("El número %s no es primo\n", Numeros.get(k));
            }
            i = 1;
            divisores = 0;
            
        }

    }

}
