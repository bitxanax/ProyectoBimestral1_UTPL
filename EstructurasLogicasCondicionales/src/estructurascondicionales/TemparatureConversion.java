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
public class TemparatureConversion {
    static Scanner read = new Scanner(System.in);
    //Este programa convierte grados Centígrados a Fahrenheit y Kelvin
    public static void main(String args[]){
        double 
           //grados Centigrados
              C = 0,
           //grados Fahrenheit
              F = 0,
           //grados Kelvin
              K = 0;
        System.out.println("////////Convierte grados Centígrados a Fahrenheit y Kelvin");
        System.out.print("Ingrese la temperatura en grados Centígrados:\n======>");
        C = read.nextDouble();
        if (C > 0) {
            F = (C * 9/5) + 32;
            K = (C + 273.15);
            System.out.printf("Grados Fahreneheit: %s\nGrados Kelvin: %s\n", K, F);
        }
        
        
    }
    
}
