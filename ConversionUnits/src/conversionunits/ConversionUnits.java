/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversionunits;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author Sebastian
 * 
 */
public class ConversionUnits {
    /**
     Este programa convierte un valor en metros a 4 distintas unidades de conversion(Centímetros, Kilómetros, Pies, Pulgadas).
     This code converts a value in meters to 4 different units of convertion(Centimeters, Kilometers, Feets, Inches).
     **/
    
    //DecimalFormat es una subclase concreta de NumberFormat que formatea números decimales.
    //DecimalFormat is a concrete subclass of NumberFormat that formats decimal numbers.
    static DecimalFormat formato = new DecimalFormat("#.00");
    
    
    static double 
        //metros - meters
            m, 
        //centimetros - centimeters
            cm = 0,
        //kilometros - kilometers
            km,
        //Pies - feets
            fts,
        //Pulgadas - Inches
            inches;
    
    //Main void
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el valor en metros:\n ");
        m = read.nextDouble();
        System.out.println("Centímetros: "+ formato.format(Convert(m)[1]));
        System.out.println("Kilómetros: "+ formato.format(Convert(m)[2]));
        System.out.println("Pies: "+ formato.format(Convert(m)[3]));
        System.out.println("Pulgadas: "+ formato.format(Convert(m)[4]));
     
    }
    
    
    
    /**Esta función convierte los metros a las otras unidades de medida.
     * This void converts meters to others converion units.
     * @param m
     * @return */
    public static double [] Convert(double m){
        cm = m * 100;
        km = m / 1000;
        fts = m * 3.208;
        inches = m * 39.370;  
        
        double units [] = new double[5];
        units[0] = m;
        units[1] = cm;
        units[2] = km;
        units[3] = fts;
        units[4] = inches;
        return units;
    }
    
     
    
    //Esta función convierte el array de doubles(unit) a un array de strings
    
    /** public static String[] ConvertToString(double a []){
        String M = String.valueOf(m),
               CM = String.valueOf(cm),
               KM = String.valueOf(km),
               FTS = String.valueOf(fts),
               INCHES = String.valueOf(inches);
                
              String units[] = new String[5];
                     units[0] = M;
                     units[1] = CM;
                     units[2] = KM;
                     units[3] = FTS;
                     units[4] = INCHES;
        return units;
     }
     **/
}
