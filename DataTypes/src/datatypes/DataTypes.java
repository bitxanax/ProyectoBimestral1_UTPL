/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatypes;

/**
 *
 * @author Sebastian
 */
public class DataTypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Data Types, Operators and expressions in JAVA
        System.out.println("Tipos de datos ,operadores y expresiones en java");
        
        System.out.println("---Enteros---");
        int num1 = 1, num2 = 2;
        int num3 = num1 + num2;
        System.out.println("Suma de enteros: 1 + 2 =\n"+ num3); 
        
        System.out.println("\n---Decimales---");
        double dbl1 = 1.1 , dbl2 = 2.2;
        double dbl3 = dbl1 + dbl2;
        System.out.println("Suma de decimales: 1.1 + 2.2 =\n"+ dbl3); 
        
        System.out.println("\n---Caracteres---");
        char char1 = 'a', char2 = 'b';
        System.out.println("Concatenación de carácteres: a y b =\n"+ char1 + char2);  
        
        System.out.println("\n---Cadenas de texto---");
        String str1 = "Hola", str2 = "Mundo", str3 = str1.concat(str2);
        System.out.println("Concatenación de cadenas de texto: Hola y Mundo =\n"+ str3);  
      
        
        System.out.println("\n---Boleanos---");
        boolean bol1 = true, bol2 = false, bol3 = bol1 && bol2;
        System.out.println("Operaciones con boleanos: true y(&&) false =\n"+ bol3);  
        
        System.out.println("\n---Clase---");
        //Instanciando una clase y dandole valor a sus atributos
         persona persona1 = new persona();
         persona1.nombre = "Joel Sebastian Romero Cañar";
         persona1.direccion = "Av.Isidro Ayora";
         persona1.telefono = 27721596;
         persona1.id = 110698696;
         persona1.edad = 17;
     
        System.out.println("Atributos de la clase:\n");  
        System.out.println("Soy ".concat(persona1.nombre)+"\nMi direccion es: ".concat(persona1.direccion)+"\n"
                + "Mi telefono es: ".concat(Integer.toString(persona1.telefono))
                + "\nMi cédula es: ".concat(Integer.toString(persona1.id))
                + "\nMi edad es:".concat(Integer.toString(persona1.edad))
        );
       
    }
    
}

class persona{
   String nombre, direccion;
   int id,edad,telefono;
 
}