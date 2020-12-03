/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poligon;
import java.util.Scanner;
/**
 *
 * @author Sebastian
 */
public class Poligono {
  static double 
        A, 
        B, 
        C, 
        D, 
        lc, 
        at,
        ar,
        ats, 
        areaTotal;
          
              
   
    public static void main(String[] args) {
        CalculateArea();
    }
    
    public static void CalculateArea(){
   
        Scanner read = new Scanner(System.in);
      
                
        
        //Entrada y salida de Datos
        
        System.out.println("Ingrese el largo del rectangulo:\n");
        at = read.nextDouble();
        System.out.println("Ingrese la altura del rectangulo:\n");
        ar = read.nextDouble();
        System.out.println("Ingrese la altura del paralelogramo:\n");
        lc = read.nextDouble();
        //Proceso
        A = Math.pow(lc,2);
        B = (lc*at)/ 2;
        ats = B*3;
        D = lc*ar;
        areaTotal = A+B+ats+D;
        //Salida
        
        System.out.println("El área total del paralelogramo es:\n " +areaTotal);
    }
    
    
    
    
}
