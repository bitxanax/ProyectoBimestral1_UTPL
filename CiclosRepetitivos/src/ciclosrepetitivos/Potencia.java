/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclosrepetitivos;
import java.util.Scanner;
/**
 *
 * @author Sebastian
 */
public class Potencia {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        //Variables del ciclo While
        int i = 1, num = 0, potencia = 0, base = 0, resultado = 1;
        
        
        //While
        System.out.println("Imprimir potencia de números con While: ");   
        System.out.print("Ingrese la base de la potencia:  ");   
        base = read.nextInt();
        System.out.print("Ingrese la potencia:  ");   
        potencia = read.nextInt();
        
        while(i <= potencia){
            resultado = resultado * base;
            if (i >=2) {
                System.out.printf(base + " * ");
            }  
            i++;
        }
        System.out.print(base + " = " + resultado);
        
        
        
            
    }
    
}
