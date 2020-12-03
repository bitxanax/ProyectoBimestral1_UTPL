/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaterreno;

import java.util.Scanner;
/**
 *
 * @author Sebastian
 */
public class AreaTerreno {
  static double base,
         //Altura
           height, 
         //Altura del rectángulo o del triángulo
           partial_height ,
         //Area del rectángulo
           RectangleArea, 
         //Area del triángulo
           TriangleArea, 
         //Area total del terreno
           TotalArea;
              
   
    public static void main(String[] args) {
        CalculateArea();
    }
    
    public static void CalculateArea(){
        
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el valor de la base:");
        base = read.nextDouble();
        System.out.println("Ingrese el valor de la altura:");
        height = read.nextDouble();
        partial_height = height/2;
        RectangleArea = base * partial_height;
        TriangleArea = (base * partial_height)/2;
        TotalArea = RectangleArea + TriangleArea;
        System.out.print("El area total del terreno es:\n"+  TotalArea);
    }
    
    
    
    
}