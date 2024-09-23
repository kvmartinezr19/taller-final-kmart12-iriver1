package utilidades;

import java.util.Scanner;

public class Validaciones {
<<<<<<< HEAD

    public static void opcionValida(Scanner scanner)
    {
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor ingresa un numero valido.");
            scanner.next();
            System.out.println("Igrese su opcion: ");
        }
    }

    public static void accionContinuar(Scanner scanner){
        System.out.print("Presiona 'Enter' para continuar...");
        scanner.nextLine();
=======
public static void opcionValida(Scanner scanner){
    while (!scanner.hasNextInt()){
        System.out.println("Por favor ingresa un numero valido");
        scanner.next();
        System.out.println("Ingresa la opción");
    }

>>>>>>> f3007ca13e536accdd49a1cc4ab5ee852818d9c7
    }

}
