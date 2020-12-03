/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurascondicionales;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */

public class CalculadoraSwitchCase {

    static Scanner read = new Scanner(System.in);
    static double num1, num2, total;
    static int op;
    static String option;


    public static void main(String[] args) {

        System.out.println("========Calculadora=======🔢");
        System.out.println("Seleccione una opción:\n1.Suma\n2.Resta\n3.Multiplicación\n"
                    + "4.División\n5.Potencia\n6.Raíz\n------>  ");
        op = read.nextInt();
        System.out.print("Ingrese el primer número: \n");
        num1 = read.nextDouble();
        System.out.print("Ingrese el segundo número: \n");
        num2 = read.nextDouble();
        
        /**Son los valores que se van a imprimir: num1, num2, total
         Almaceno el valor de cada String en este Array por cuestión de
         estética y para que las líneas de código no sean tan largas 
         Por ejemplo: FormatPrint(num1) , representa el valor num1 en String.
         **/
        
        String[] values = {FormatPrint(num1), FormatPrint(num2), FormatPrint(total)};
        
        
        switch (op) {
            case 1:
                total = num1 + num2;
                values[2] = FormatPrint(total);
                System.out.printf("/La suma es: %s + %S = %s", values[0], values[1],values[2] );
                break;
            case 2:
                total = num1 - num2;
                values[2] = FormatPrint(total);
                System.out.printf("/La resta es: %s - %S = %s", values[0], values[1],values[2]);
                break;
            case 3:
                total = num1 * num2;
                values[2] = FormatPrint(total);
                System.out.printf("/La multiplicación es: %s * %S = %s", values[0], values[1],values[2]);
                break;
            case 4:
                total = num1 / num2;
                values[2] = FormatPrint(total);
                System.out.printf("/La división es: %s / %S = %s",values[0], values[1],values[2]);
                break;
            case 5:
                total = (double)Math.pow(num1,num2);
                values[2] = FormatPrint(total);
                System.out.printf("/La potencia de %s ^ %S = %s", values[0], values[1],values[2]);
                break;
            case 6:
                total =  (double)Math.pow(num1,1.0/num2);
                values[2] = FormatPrint(total);
                System.out.printf("/La raiz es: %s √ %S = %s", values[0], values[1],values[2]);
                break;
            default:
                System.err.println("Opción inválida");
                break;
        }

    }

    
   
    
    
    //En caso de que el numero sea un entero, se eliminan los decimales
    //Ejemplo: 1.0 ===> 1
      static String FormatPrint(double d) {
        String text ; 
        NumberFormat nf = new DecimalFormat("##.###");
        text = nf.format(d);
        return text;
     }
     
   
      
      
}

