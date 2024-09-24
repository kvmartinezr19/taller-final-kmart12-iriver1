package programas;

import java.util.Random;
import java.util.Scanner;

public class Ejercicios {

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
    public static void programSwitch(Scanner scanner){
        System.out.print("**************************************************************\n");
        System.out.print("**                     PROGRAMA SWITCH                      **\n");
        System.out.print("**************************************************************\n");
        System.out.print("**   Ejercicio saber el estado de su calificación           **\n");
        System.out.print("** Por favor ingresa tu calificaciòn:                       **\n");
        int calificacion = scanner.nextInt();
        switch (calificacion) {
            case 1:
            case 2:
                System.out.println("Su calificación es: F");
                break;
            case 3:
            case 4:
                System.out.println("Su calificación es: D");
                break;
            case 5:
            case 6:
                System.out.println("Su calificación es: C");
                break;
            case 7:
            case 8:
                System.out.println("Su calificación es: B");
                break;
            case 9:
            case 10:
                System.out.println("Su calificación es: A");
                break;
            default:
                System.out.println("Su calificación no es válida, por favor verifique");
                break;
        }
        scanner.nextLine();
        System.out.print("**************************************************************\n");

    }
    public static void programaDoWile(Scanner scanner){
        System.out.print("**************************************************************\n");
        System.out.print("**                  PROGRAMA DO WHILE                       **\n");
        System.out.print("**************************************************************\n");
        System.out.print("**              Ejercicio Adivina el número                 **\n");
        System.out.print("** Bienvenid@, vamos a jugar a adivinar el numero...        **\n");
        System.out.print("** ¡Hemos pensado en un numero de 1 a 100!                  **\n");
        Random random = new Random();
        int secreto= random.nextInt(100)+1;
        int numeroi =0;
        boolean numero= false;
        System.out.print("** Intenta adivinarlo.....                                  **\n");
        do{
            System.out.print("** Introduce un número por favor                            **\n");
            numeroi= scanner.nextInt();
            if(numeroi < secreto){
                System.out.print("** Muy bajo, Intenta de nuevo.                              **\n");
            } else if (numeroi > secreto) {
                System.out.print("** Muy alto, Intenta de nuevo.                              **\n");
            } else {
                System.out.print("**¡Felicidades! adivinaste el numero es: " + secreto +        "\n");
                scanner.nextLine();
                numero= true;
            }
        } while (!numero);
        System.out.print("**************************************************************\n");
    }
    public static void programaFor(Scanner scanner){
        System.out.print("**************************************************************\n");
        System.out.print("**                      PROGRAMA FOR                        **\n");
        System.out.print("**************************************************************\n");
        System.out.print("**              Ejercicio sumatoria de numeros              **\n");
        System.out.print("** Ingresa un numero para realizar la sumatoria:            **\n");
        int numero= scanner.nextInt();
        int suma = 0;
        for (int i= 1; i<=numero; i++){
            suma += i;
        }
        System.out.print("** La suma del 1 al " + numero + " es: " +  suma  +           "\n");
        System.out.print("**************************************************************\n");
        scanner.nextLine();
    }
}
