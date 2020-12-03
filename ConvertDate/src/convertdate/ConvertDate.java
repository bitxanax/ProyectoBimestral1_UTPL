package convertdate;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class ConvertDate {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        int YearNacimiento = 0, DayNacimiento = 0, MesNacimiento = 0;
        String FechaNacimiento = "";
        System.out.print("Ingrese su año de nacimiento:\n====>");
        YearNacimiento = read.nextInt();
        
        System.out.print("Ingrese su mes de nacimiento:\n====>");
        MesNacimiento = read.nextInt();
        
        System.out.print("Ingrese su día de nacimiento:\n====>");
        DayNacimiento = read.nextInt();
        
        if(MesNacimiento >= 12 && DayNacimiento >= 12){
            //Fecha Ingresada
        FechaNacimiento = String.valueOf(YearNacimiento).concat("/"+String.valueOf(MesNacimiento).concat("/"+String.valueOf(DayNacimiento)));
        
      
        //Convierte la dfecha ingresada a una clase LocalDate.
        LocalDate FechaFormat = LocalDate.of(YearNacimiento,MesNacimiento, DayNacimiento);
        //Se obtiene la fecha actual como clase LocalDate.
        LocalDate now = LocalDate.now();
        //Se calcula el periodo entre las dos fechas usando el método between de la clase Period.
        Period period = Period.between(FechaFormat, now);
        
        //Resultados del periodo entre la fecha actual y la fecha ingresada usando la función between de la clase time.Period
        String year, month, day;
        year = String.valueOf(period.getYears());
        month = String.valueOf(period.getMonths());
        day = String.valueOf(period.getDays());
        
        
        
        if (FechaNacimiento != String.valueOf(now)) {
             System.out.printf("Usted tiene %s años, %s meses y %s días\n", year, month, day);
        }else{
            System.err.println("Ingresaste una fecha inválida.");
        }
       
        }else{
            System.err.println("Ingresaste una fecha inválida");
        }
        
        
        
       
    }

}
