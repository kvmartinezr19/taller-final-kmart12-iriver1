package programas;

import java.util.Scanner;

public class Programas {

    public static void programaIf(Scanner scanner){
        System.out.print("**************************************************************\n");
        System.out.print("**               PROGRAMA IF, ELSE IF Y ELSE                **\n");
        System.out.print("**************************************************************\n");
        System.out.print("**            Ejercicio de clasificación de Edad            **\n");
        System.out.print("** Ingresa tu edad:                                         **\n");
        int edad = scanner.nextInt();
        if (edad <= 11) {
            System.out.println("Eres un niño");
        } else if (edad >= 12 && edad <= 18) {
            System.out.println("Eres un adolescente");
        } else if (edad >= 19 && edad <= 59) {
            System.out.println("Eres un adulto");
        } else {
            System.out.println("Eres un anciano");
        }
        scanner.nextLine();
        System.out.print("**************************************************************\n");

    }

    public static void programaTernaria(Scanner scanner){
        System.out.print("**************************************************************\n");
        System.out.print("**                     PROGRAMA TERNARIA                    **\n");
        System.out.print("**************************************************************\n");
        System.out.print("**   Ejercicio para calcular si un número es par o impar    **\n");
        System.out.print("** Ingresa un número:                                       **\n");
        int numero = scanner.nextInt();
        String resultado = (numero % 2 == 0) ? "Par" : "Impar";
        System.out.println("El número " + numero + " es: " + resultado);
        scanner.nextLine();
        System.out.print("**************************************************************\n");

    }

    public static void programaWhile(Scanner scanner){
        System.out.print("**************************************************************\n");
        System.out.print("**                      PROGRAMA WHILE                      **\n");
        System.out.print("**************************************************************\n");
        System.out.print("**              Ejercicio sumatoria de números              **\n");
        System.out.print("** Ingresa un número para realizar la sumatoria:            **\n");
        int i = 0;
        int numero = scanner.nextInt();
        int suma = 0;

        while (i <= numero) {
            suma = suma + i;
            i++;
        }
        System.out.println("La sumatoria total del número " + numero + " es: " + suma);
        scanner.nextLine();
        System.out.print("**************************************************************\n");

    }

}
