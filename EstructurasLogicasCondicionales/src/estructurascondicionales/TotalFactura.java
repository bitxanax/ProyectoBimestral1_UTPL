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
public class TotalFactura {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        double subtotal = 0, total = 0, descuento = 0;
        int limite1 = 200, limite2 = 500;

        System.out.println("Ingrese el valor de su compra:\n====> ");
        subtotal = read.nextDouble();
        if (total > limite1) {
            total = subtotal;
            System.out.printf("Su descuento es de: %s\nEl total a pagar es: %s\n", descuento, total);
        } else {
            if ((subtotal >= limite1) && (subtotal < limite2)) {
                descuento = 0.10;
            } else if (subtotal >= limite2) {
                descuento = 0.15;
            }
            total = subtotal - (subtotal * descuento);
            System.out.printf("El subtotal es: %s\nSu descuento es de: %s\nEl total a pagar es: %s\n", subtotal, descuento, total);
        }
    }
}
