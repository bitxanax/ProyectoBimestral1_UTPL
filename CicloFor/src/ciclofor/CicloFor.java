/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclofor;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class CicloFor {

    /**
     * Serie Fibonnaci 0,1,1,2,3,5,8,13,21,34 *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la longitud de las seríe:\n");
        CreateSerie(sc.nextInt());
    }

    public static void CreateSerie(int SerieLenght) {
        int i = 1;
        String lines = "---------------------------------------------------------------";
        /**
         * Serie Fibonnaci 0,1, 1,2, 3,5, 8,13, 21,34
         */
        int a = 0, b = 1;
        System.out.println(lines + "\n" + lines);

        if (SerieLenght % 2 == 0) {
            for (i = i; i <= SerieLenght/2; i++) {

                System.out.println(Create_Space(lines) + a + Create_Space(lines));
                System.out.println(Create_Space(lines) + b + Create_Space(lines));
                a = a + b;
                b = a + b;
            }
        } else {
            i = i - 2;
            System.out.println(Create_Space(lines) + a + Create_Space(lines));
            a = 1;
            for (i = i + SerieLenght / 2; i <= SerieLenght - 3; i++) {

                System.out.println(Create_Space(lines) + a + Create_Space(lines));
                System.out.println(Create_Space(lines) + b + Create_Space(lines));
                a = a + b;
                b = a + b;
            }
        }

        System.out.println(lines + "\n" + lines);
    }

    public static String Create_Space(String lines) {
        int len = lines.length() / 4 - 1;

        String space = " ";
        for (int i = 0; i <= len; i++) {

            space = space + "* ";

        }
        return space;
    }
}
