/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readdata;
import java.util.Scanner;
/**
 *
 * @author Sebastian
 */
public class ReadData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
        //Declaración de variables
        int INT;
        double DECIMAL;
        String STRING;
        
        System.out.println("Ingrese una cadena de texto:");
        STRING = read.next();
        //Leer Datos
        System.out.println("Ingrese un numero entero:"); 
        INT = read.nextInt();
        
        System.out.println("Ingrese un numero decimal:");
        DECIMAL = read.nextDouble();
        
       
        
        //Salida de Datos
        
        System.out.println("Mi entero es:\n" +INT);
        System.out.println("Mi decimal es:\n" +DECIMAL);
        System.out.println("Mi cadena es:\n" +STRING);
    }
    
}
