package Ejercicios;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = 0, suma = 0;
        int media = 0, Nvalores = 0;
        int j = 0;

        System.out.println("Ingresa distintos valores: ");
        while (suma < 10000) {
            j = read.nextInt();
            if (j == 0) {
                System.out.println("Ingresa un valor mayor a 0.");
            } else if (j > 10000) {
                System.out.println("Ingresa un valor menor a 10000.");
            }

            suma = j + suma;
            Nvalores += 1;
        }

        media = suma / Nvalores;
        System.out.printf("Ingresaste %s números.\n", Nvalores);
        System.out.println("La media es: " + media);
        System.out.println("La suma de los valores ingresados es: " + suma);
    }
}
