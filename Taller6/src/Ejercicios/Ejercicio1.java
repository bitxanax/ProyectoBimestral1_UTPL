/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author Sebastian
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int limite = 100;
        int j = 0;
        
        System.out.println("Ciclo FOR\n");
        for (int i = 0; i <= limite; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("\nCiclo WHiLE\n");
        
        do { 
            if (j % 5 == 0) {
                System.out.println(j);
    

            }
             j++;
        } while (j <= limite);
    }

}
