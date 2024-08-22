import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opc = -0;

        do {
            System.out.print("****************************************************\n");
            System.out.print("**         MENU CAPITULO DE PROGRAMACION          **\n");
            System.out.print("**       KATHERINE MARTINEZ - LORENA RIVERA       **\n");
            System.out.print("**               KMART12 - IRIVER1                **\n");
            System.out.print("****************************************************\n");
            System.out.print("****************************************************\n");
            System.out.print("**        1.   Datos Primitivos                   **\n");
            System.out.print("**        2.   String                             **\n");
            System.out.print("**        3.   Constantes                         **\n");
            System.out.print("**        4.   Tipo de Operadores                 **\n");
            System.out.print("**        5.   Condicional IF, ELSE, IF ELSE      **\n");
            System.out.print("**        6.   Condicional Swicht                 **\n");
            System.out.print("**        7.   Condicional Ternaria               **\n");
            System.out.print("**        8.   Bucle DO WHILE                     **\n");
            System.out.print("**        9.   Bucle WHILE                        **\n");
            System.out.print("**        10.  Bucle FOR                          **\n");
            System.out.print("**        0.   Salir                              **\n");
            System.out.print("****************************************************\n");
            System.out.print("****************************************************\n");
            System.out.print("Digita la opción de tu preferencia: ");
            opc = scanner.nextInt();
            scanner.nextLine();

            switch (opc) {
                case 1:
                    int dprim = -1;
                    do {
                        System.out.print("****************************************************\n");
                        System.out.print("**                DATOS PRIMITIVOS                **\n");
                        System.out.print("****************************************************\n");
                        System.out.print("**        1.   ¿Qué es un byte?                   **\n");
                        System.out.print("**        2.   ¿Qué es un short?                  **\n");
                        System.out.print("**        3.   ¿Qué es un int?                    **\n");
                        System.out.print("**        4.   ¿Qué es un long?                   **\n");
                        System.out.print("**        5.   ¿Qué es un float?                  **\n");
                        System.out.print("**        6.   ¿Qué es un double?                 **\n");
                        System.out.print("**        7.   ¿Qué es un char?                   **\n");
                        System.out.print("**        8.   ¿Qué es un boolean?                **\n");
                        System.out.print("**        0.   Salir                              **\n");
                        System.out.print("****************************************************\n");
                        System.out.print("Digita una opción: ");
                        dprim = scanner.nextInt();
                        scanner.nextLine();
                        switch (dprim) {
                            case 1:
                                System.out.print("****************************************************\n");
                                System.out.print("**                ¿QUE ES UN BYTE?                **\n");
                                System.out.print("****************************************************\n");
                                System.out.print("**  Es utilizado para datos pequeños y            **\n");
                                System.out.print("**  optimización de memoria en arrays grandes.     **\n");
                                System.out.print("**  Rango: -128 a 127                             **\n");
                                System.out.print("**  Ejemplo:                                      **\n");
                                System.out.print("**             'byte edad = 25;'                  **\n");
                                System.out.print("****************************************************\n");
                                System.out.println("Presione Enter para continuar...");
                                scanner.nextLine();
                                break;
                            case 2:
                                System.out.print("****************************************************\n");
                                System.out.print("**                ¿QUE ES UN SHORT?               **\n");
                                System.out.print("****************************************************\n");
                                System.out.print("**  Es útil para datos numéricos mas grandes que  **\n");
                                System.out.print("**  'byte' pero aún pequeños.                     **\n");
                                System.out.print("**  Rango: -32,768 a 32,767                       **\n");
                                System.out.print("**  Ejemplo:                                      **\n");
                                System.out.print("**             'shirt año = 2023;'                  **\n");
                                System.out.print("****************************************************\n");
                                System.out.println("Presione Enter para continuar...");
                                scanner.nextLine();
                                break;
                            case 3:
                                System.out.print("****************************************************\n");
                                System.out.print("**                 ¿QUE ES UN INT?                **\n");
                                System.out.print("****************************************************\n");
                                System.out.print("**  Este tipo de dato se utiliza para almacenar   **\n");
                                System.out.print("**  números enteros, es decir, números sin parte  **\n");
                                System.out.print("**  decimal.                                      **\n");
                                System.out.print("**  Rango: -2^31 y 2^31 - 1                       **\n");
                                System.out.print("**  Ejemplo:                                      **\n");
                                System.out.print("**             'int auxiliar = 30;'               **\n");
                                System.out.print("****************************************************\n");
                                System.out.println("Presione Enter para continuar...");
                                scanner.nextLine();
                                break;
                            case 4:
                                System.out.print("****************************************************\n");
                                System.out.print("**                ¿QUE ES UN LONG?                **\n");
                                System.out.print("****************************************************\n");
                                System.out.print("**  Las variables de tipo entero grandes o long   **\n");
                                System.out.print("**  son aquellas que almacenan un número          **\n");
                                System.out.print("**  (ya sea positivo o negativo) no decimal.      **\n");
                                System.out.print("**  Rango: -2^63 y 2^63 - 1                       **\n");
                                System.out.print("**  Ejemplo:                                      **\n");
                                System.out.print("**        'long numeroCuentas = 10000000000L;'    **\n");
                                System.out.print("****************************************************\n");
                                System.out.println("Presione Enter para continuar...");
                                scanner.nextLine();
                                break;
                            case 5:
                                System.out.print("****************************************************\n");
                                System.out.print("**                ¿QUE ES UN FLOAT?               **\n");
                                System.out.print("****************************************************\n");
                                System.out.print("**  Números en coma flotante de precision simple  **\n");
                                System.out.print("**  Rango: 3,4E-38 a 3,4E+38                       **\n");
                                System.out.print("**  Ejemplo:                                      **\n");
                                System.out.print("**            'float precio = 19.99f;'            **\n");
                                System.out.print("****************************************************\n");
                                System.out.println("Presione Enter para continuar...");
                                scanner.nextLine();
                                break;
                            case 6:
                                System.out.print("****************************************************\n");
                                System.out.print("**               ¿QUE ES UN DOUBLE?               **\n");
                                System.out.print("****************************************************\n");
                                System.out.print("**  Números en coma flotante de doble precision   **\n");
                                System.out.print("**  Rango: ±4,9E-324 a ±1,79769313486231570E+308  **\n");
                                System.out.print("**  Ejemplo:                                      **\n");
                                System.out.print("**            'double pi = 3.141592653589793;'    **\n");
                                System.out.print("****************************************************\n");
                                System.out.println("Presione Enter para continuar...");
                                scanner.nextLine();
                                break;
                            case 7:
                                System.out.print("****************************************************\n");
                                System.out.print("**               ¿QUE ES UN CHAR?                 **\n");
                                System.out.print("****************************************************\n");
                                System.out.print("**  Almacena un solo carácter unicode             **\n");
                                System.out.print("**  Rango: 0 a 65,535 (Caracteres Unicode)        **\n");
                                System.out.print("**  Ejemplo:                                      **\n");
                                System.out.print("**            'char inicial = 'A';'               **\n");
                                System.out.print("****************************************************\n");
                                System.out.println("Presione Enter para continuar...");
                                scanner.nextLine();
                                break;
                            case 8:
                                System.out.print("****************************************************\n");
                                System.out.print("**               ¿QUE ES UN BOOLEAN?              **\n");
                                System.out.print("****************************************************\n");
                                System.out.print("**  Almacena valores de verdad                    **\n");
                                System.out.print("**  Rango: true o false                           **\n");
                                System.out.print("**  Ejemplo:                                      **\n");
                                System.out.print("**           'boolean esMayorDeEdad = true;'      **\n");
                                System.out.print("****************************************************\n");
                                System.out.println("Presione Enter para continuar...");
                                scanner.nextLine();
                                break;
                        }
                    } while (dprim != 0);
                    break;
                case 2:
                    System.out.println("opc2 ");
                    break;
                case 3:
                    System.out.println("opc3 ");
                    break;
                case 4:
                    System.out.println("opc4 ");
                    break;
                case 5:
                    System.out.println("opc5 ");
                    break;
                case 6:
                    System.out.println("opc6 ");
                    break;
                case 7:
                    System.out.println("opc7 ");
                    break;
                case 8:
                    System.out.println("opc8 ");
                    break;
                case 9:
                    System.out.println("opc9 ");
                    break;
                case 10:
                    System.out.println("opc10 ");
                    break;
                default:
                    System.out.println("Opción no valida");
            }
        }while (opc != 10);
        scanner.close();


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


    }


}
