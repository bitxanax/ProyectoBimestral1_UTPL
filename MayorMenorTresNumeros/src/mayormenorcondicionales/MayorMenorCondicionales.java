package mayormenorcondicionales;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class MayorMenorCondicionales {

    static Scanner read = new Scanner(System.in);
    static int op;

    public static void main(String[] args) {
        GetOption();
    }

    public static void GetOption() {
        System.out.println("Seleccione una opción:\n1.Condiciones simples\n2.Condiciones compuestas\n3.Condiciones anidadas"
                + "\n4.Positivo o Negativo\n------>  ");
        op = read.nextInt();

        switch (op) {
            case 1:
                CondicionesSimples();
                break;
            case 2:
                CondicionesCompuestas();
                break;
            case 3:
                CondicionesAnidadas();
                break;
            case 4:
                PositivoONegativo();
                break;
            default:
                System.err.println("Error: Selección inválida...\n");
        }
    }

    public static void CondicionesSimples() {
        int a = 0, b = 0, c = 0, SemiMayor = 0, mayor = 0;
        int[] Numbers = Get3Numbers();
        a = Numbers[0];
        b = Numbers[1];
        c = Numbers[2];

        //Verifica si el primer número es mayor
        if (a > b) {
            SemiMayor = a;
        }

        if (a > c) {
            mayor = a;
        }

        if (SemiMayor == mayor) {
            System.out.printf("El número %s es el mayor de los tres números.\n", a);
            System.exit(0);
        }

        //Verifica si el segundo número es mayor
        if (b > a) {
            SemiMayor = b;
        }

        if (b > c) {
            mayor = b;
        }

        if (SemiMayor == mayor) {
            System.out.printf("El número %s es el mayor de los tres números.\n", b);
            System.exit(0);
        }

        //Verifica si el tercer número es mayor
        if (c > a) {
            SemiMayor = c;
        }

        if (c > b) {
            mayor = c;
        }

        if (SemiMayor == mayor) {
            System.out.printf("El número %s es el mayor de los tres números.\n", c);
            System.exit(0);
        }

    }

    public static void CondicionesCompuestas() {
        int a = 0, b = 0, c = 0, mayor = 0;
        int[] Numbers = Get3Numbers();
        a = Numbers[0];
        b = Numbers[1];
        c = Numbers[2];

        if (a > b && a > c) {
            mayor = a;

        } else {
            mayor = mayor;
        }

        if (b > a && b > c) {
            mayor = b;

        } else {
            mayor = mayor;
        }

        if (c > a && c > b) {
            mayor = c;

        } else {
            mayor = mayor;
        }

        System.out.printf("El número %s es el mayor de los tres números.\n", mayor);

    }

    public static void CondicionesAnidadas() {
        int a = 0, b = 0, c = 0, mayor = 0;
        int[] Numbers = Get3Numbers();
        a = Numbers[0];
        b = Numbers[1];
        c = Numbers[2];

        if (a > b && a > c) {
            mayor = a;

        } else if (b > a && b > c) {
            mayor = b;

        } else if (c > a && c > b) {
            mayor = c;

        }
        System.out.printf("El número %s es el mayor de los tres números.\n", mayor);
    }

    public static void PositivoONegativo() {
        int a;
        System.out.println("Ingrese un número:");
        a = read.nextInt();
        if (a < 0) {
            System.out.println("El número " + a + " es negativo.");
        } else {
            System.out.println("El número " + a + " es positivo.");

        }
    }

    public static int[] Get3Numbers() {
        int a, b, c;
        System.out.println("Ingrese el valor del primer número:");
        a = read.nextInt();
        System.out.println("Ingrese el valor del segundo número:");
        b = read.nextInt();
        System.out.println("Ingrese el valor del tercer número:");
        c = read.nextInt();

        int[] Numbers = {a, b, c};
        return Numbers;
    }

}
