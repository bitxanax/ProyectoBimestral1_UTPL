package estructurascondicionales;

import java.util.Scanner;
/**
 *
 * @author Sebastian
 */
public class ConvertirHoras {

    static Scanner read = new Scanner(System.in);
    static int hora, minutos, horaInicial;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la hora:");
        hora = read.nextInt();
        System.out.println("Ingrese los minutos:");
        minutos = read.nextInt();
        if (hora < 25 && hora > 0) {
            horaInicial = hora;
            if (hora >= 13) {
                if (hora >= 13 && hora < 14) {
                    hora = 1;
                } else if (hora >= 14 && hora < 15) {
                    hora = 2;
                } else if (hora >= 15 && hora < 16) {
                    hora = 3;
                } else if (hora >= 16 && hora < 17) {
                    hora = 4;
                } else if (hora >= 17 && hora < 18) {
                    hora = 5;
                } else if (hora >= 18 && hora < 19) {
                    hora = 6;
                } else if (hora >= 19 && hora < 20) {
                    hora = 7;
                } else if (hora >= 20 && hora < 21) {
                    hora = 8;
                } else if (hora >= 21 && hora < 22) {
                    hora = 9;
                } else if (hora >= 22 && hora < 23) {
                    hora = 10;
                } else if (hora >= 23 && hora < 24) {
                    hora = 11;
                } else if (hora == 24) {
                    hora = 12;
                }
                Convert(hora, minutos, horaInicial);
            } else {
                Convert(hora, minutos, horaInicial);
            }
        } else {
            System.err.println("La hora ingresada debe tener el formato de 24 hs");
        }

    }

    public static void Convert(int hour, int minutes, int InitialHour) {
        if (InitialHour <= 24 && minutes >= 60) {
            hour = 0;
        }

        if (minutes > 60) {
            boolean a = false;
            while (a == false) {
                hour += 1;
                minutes = minutes - 60;
                if (minutes < 60) {
                    a = true;
                }
            }
        } else if (minutes == 60) {
            hour += 1;
            minutes = 0;
        }

        if (InitialHour < 24) {
            if (InitialHour < 13) {
                System.out.printf("La hora es %s am y %s minutos\n", hour, minutes);
            } else if (InitialHour > 13 && minutes <= 60) {
                System.out.printf("La hora es %s pm y %s minutos\n", hour, minutes);
            }
        } else if (InitialHour == 24 && minutes <= 60) {
            System.out.printf("La hora es %s am y %s minutos\n", hour, minutes);
        }
    }

}
