package factorial;
import java.util.Scanner;
public class Factorial {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num;
        int fact = 1;
       
        System.out.println("―――――――――――――――――――――");
        System.out.println("┃=====>Factorial de un número<=====┃");
        System.out.print("┃Ingrese un número: ");
        num = read.nextInt();
        System.out.printf("┃El factorial del número %s es:", num);
        System.out.printf("\n┃", num);
        
        //Calcula el factorial
        for (int i = num - num + 1; i <= num  ; i++) {
            fact = fact * i;
        }
        
        
        //Imprime todo los números pertenecientes al resultado(factorial)
        for (int j = num - num + 1; j < num  ; j++) {
            System.out.print(j + " * ");
        }
        System.out.print(num + " = " + fact );
        System.out.println("\n――――――――――――――――――――");
    }
    
}
