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
public class CiclosRepetitivos {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        //Variables del ciclo While
        int i = 1, limite = 0, suma = 0 ;
        
        
        
        //While
        System.out.println("Imprimir números enteros con While: ");   
        System.out.print("Ingrese el límite:  ");   
        limite = read.nextInt();
        while(i <= limite){
            System.out.println(i);
            suma = suma + i;
            i++;
        }
        System.out.printf("La suma de todos los números es: %s", suma);
      
        
        
        
            
    }
    
}
