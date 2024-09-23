package utilidades;

import java.util.Scanner;

public class Validaciones {
public static void opcionValida(Scanner scanner){
    while (!scanner.hasNextInt()){
        System.out.println("Por favor ingresa un numero valido");
        scanner.next();
        System.out.println("Ingresa la opción");
    }

    }

}
