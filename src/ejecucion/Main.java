package ejecucion;

import explicaciones.Detalle;
import menus.MenuPrincipal;
import menus.SubMenu;
<<<<<<< HEAD
import programas.Programas;
=======
import programas.Ejercicios;
>>>>>>> f3007ca13e536accdd49a1cc4ab5ee852818d9c7
import utilidades.Validaciones;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
<<<<<<< HEAD
        int opcion = -1;
=======
        Scanner scanner2= new Scanner(System.in);
        Scanner scanner4= new Scanner(System.in);
        Scanner scanner6= new Scanner(System.in);
        Scanner scanner8= new Scanner(System.in);
        Scanner scanner10= new Scanner(System.in);

        int opc = -1;
>>>>>>> f3007ca13e536accdd49a1cc4ab5ee852818d9c7

        do {
            MenuPrincipal.menuPrincipal();
            Validaciones.opcionValida(scanner);
<<<<<<< HEAD
            opcion = scanner.nextInt();
=======
            opc = scanner.nextInt();
>>>>>>> f3007ca13e536accdd49a1cc4ab5ee852818d9c7

            switch (opcion) {
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                case 1:
                    int datosPrimitivos = -1;
                    do {
                        SubMenu.menuDatosPrimitivos();

                        Validaciones.opcionValida(scanner);

                        datosPrimitivos = scanner.nextInt();
                        scanner.nextLine();

                        switch (datosPrimitivos) {
                            case 1:
                                Detalle.explicacionByte();
                                break;
                            case 2:
                                Detalle.explicacionShort();
                                break;
                            case 3:
                                Detalle.explicacionInt();
                                break;
                            case 4:
                                Detalle.explicacionLong();
                                break;
                            case 5:
                                Detalle.explicacionFloat();
                                break;
                            case 6:
                                Detalle.explicacionDouble();
                                break;
                            case 7:
                                Detalle.explicacionChar();
                                break;
                            case 8:
                                Detalle.explicacionBoolean();
                                break;
                            case 0:
                                System.out.println("Retornando al Menú Principal");
                                break;
                            default:
                                System.out.println("Opción no válida. Ingresa una opción entre el 0 y 8");
                        }
                        Validaciones.accionContinuar(scanner);
                    } while (datosPrimitivos != 0);
                    break;
                case 2:
<<<<<<< HEAD
                    System.out.print("**************************************************************\n");
                    System.out.print("**                          STRING                          **\n");
                    System.out.print("**************************************************************\n");
                    System.out.print("**  En Java, los string son un objeto el cual nos permite   **\n");
                    System.out.print("**  almacenar muchos caracteres.                            **\n");
                    System.out.print("**                                                          **\n");
                    System.out.print("**  Por ejemplo:                                            **\n");
                    System.out.print("**     String mensaje = `Hola Mundo`;                       **\n");
                    System.out.print("**     String nombre= `Tito`;                               **\n");
                    System.out.print("**************************************************************\n");
                    System.out.println("Presiona Enter para continuar...");
                    scanner.nextLine();
=======
                    Detalle.string();
                    scanner2.nextLine();
                    break;
                case 3:
                    System.out.print("**************************************************************\n");
                    System.out.print("**                        CONSTANTES                        **\n");
                    System.out.print("**************************************************************\n");
                    System.out.print("**  En Java, una constante es un valor que no cambia        **\n");
                    System.out.print("**  durante la ejecución del programa.                      **\n");
                    System.out.print("**  Las constantes se utilizan para representar valores     **\n");
                    System.out.print("**  fijos y de lectura única, lo que ayuda a que el         **\n");
                    System.out.print("**  código sea más legible y menos propenso a errores       **\n");
                    System.out.print("**  Las constantes en Java se declaran usando la palabra    **\n");
                    System.out.print("**  clave ~final~.                                          **\n");
                    System.out.print("**                                                          **\n");
                    System.out.print("**  Ejemplos:                                               **\n");
                    System.out.print("**       public static final int TIEMPO_ESPERA = 30;        **\n");
                    System.out.print("**       public static final boolean DEPURACION = true;     **\n");
                    System.out.print("**************************************************************\n");
                    System.out.println("Presiona Enter para continuar...");
>>>>>>> f3007ca13e536accdd49a1cc4ab5ee852818d9c7
                    scanner.nextLine();
                    break;
                case 3:
                    Detalle.constantes(scanner);
                    break;
                case 4:
<<<<<<< HEAD
                    int tipoOperadores = -1;
                    do {
                        System.out.print("**************************************************************\n");
                        System.out.print("**                 MENÚ TIPOS DE OPERADORES                 **\n");
                        System.out.print("**************************************************************\n");
                        System.out.print("**           1.   Aritméticos                               **\n");
                        System.out.print("**           2.   Relacionales                              **\n");
                        System.out.print("**           3.   Logicos                                   **\n");
                        System.out.print("**           4.   Asignación                                **\n");
                        System.out.print("**           5.   Incremento / Decremento                   **\n");
                        System.out.print("**           0.   Retornar al Menu Principal                **\n");
                        System.out.print("**************************************************************\n");
                        System.out.print("Digita una opción: ");

                        Validaciones.opcionValida(scanner);

                        tipoOperadores = scanner.nextInt();
                        scanner.nextLine();
                        switch (tipoOperadores) {
=======
                    int optOp = -1;
                    while (true) {
                       SubMenu.tipoDato();
                       Validaciones.opcionValida(scanner4);
                       optOp = scanner4.nextInt();

                        switch (optOp) {
>>>>>>> f3007ca13e536accdd49a1cc4ab5ee852818d9c7
                            case 1:
                                Detalle.aritmeticos();
                                break;
                            case 2:
                                Detalle.relacionales();
                                break;
                            case 3:
                                 Detalle.logicos();
                                break;
                            case 4:
                                Detalle.asignacion();
                                break;
                            case 5:
                                Detalle.incrementoDecremento();
                                break;
                            case 0:
                                System.out.println("Retornando al Menú Principal");
                                break;
                            default:
                                System.out.println("Opción no válida. Ingresa una opción entre el 0 y 5");
                        }
                        scanner4.nextLine();
                        System.out.print("Presiona Enter para continuar...");
<<<<<<< HEAD
                        scanner.nextLine();

                    }while (tipoOperadores != 0);
=======
                        scanner4.nextLine();
                        break;
                    }
>>>>>>> f3007ca13e536accdd49a1cc4ab5ee852818d9c7
                    break;
                case 5:
                    int condicionalIf = -1;
                    do {
                        SubMenu.menuIfElseIfElse();

                        Validaciones.opcionValida(scanner);

                        condicionalIf = scanner.nextInt();
                        scanner.nextLine();
                        switch (condicionalIf) {
                            case 1:
                                Detalle.explicacionIf();
                                break;
                            case 2:
                                Detalle.explicacionElse();
                                break;
                            case 3:
                                Detalle.explicacionElseIf();
                                break;
                            case 4:
                                Programas.programaIf(scanner);
                                break;
                            case 0:
                                System.out.println("Retornando al Menú Principal");
                                break;
                            default:
                                System.out.println("Opción no válida. Ingresa una opción entre el 0 y 4");
                        }
                        Validaciones.accionContinuar(scanner);
                    }while (condicionalIf != 0);
                    break;
                case 6:
<<<<<<< HEAD
                    int condicionalSwitch = -1;
                    do {
                        System.out.print("**************************************************************\n");
                        System.out.print("**              CONDICIONALES SWITCH                        **\n");
                        System.out.print("**************************************************************\n");
                        System.out.print("**           1.   Condicional Switch                        **\n");
                        System.out.print("**           2.   Programa de Switch                        **\n");
                        System.out.print("**           0.   Retornar al Menu Principal                **\n");
                        System.out.print("**************************************************************\n");
                        System.out.print("Digita una opción: ");

                        Validaciones.opcionValida(scanner);

                        condicionalSwitch = scanner.nextInt();
                        scanner.nextLine();
                        switch (condicionalSwitch) {
=======
                    int opSw = -1;
                    while (true) {
                        SubMenu.swich();
                        opSw = scanner6.nextInt();
                        Validaciones.opcionValida(scanner6);
                        switch (opSw) {
>>>>>>> f3007ca13e536accdd49a1cc4ab5ee852818d9c7
                            case 1:
                                Detalle.swich();
                                break;
                            case 2:
                               Ejercicios.programSwich(scanner6);
                                break;
                            case 0:
                                System.out.println("Retornando al Menú Principal");
                                break;
                            default:
                                System.out.println("Opción no válida. Ingresa una opción entre el 0 y 2");
                        }
                        scanner.nextLine();
                        System.out.print("Presiona Enter para continuar...");
                        scanner.nextLine();

                    }while (condicionalSwitch != 0);
                    break;
                case 7:
                    int condicionalTernaria = -1;
                    do {
                        SubMenu.menuTernaria();

                        Validaciones.opcionValida(scanner);

                        condicionalTernaria = scanner.nextInt();
                        scanner.nextLine();
                        switch (condicionalTernaria) {
                            case 1:
                                Detalle.explicacionTernaria();
                                break;
                            case 2:
                                Programas.programaTernaria(scanner);
                                break;
                            case 0:
                                System.out.println("Retornando al Menú Principal");
                                break;
                            default:
                                System.out.println("Opción no válida. Ingresa una opción entre el 0 y 2");
                        }
                        Validaciones.accionContinuar(scanner);
                    }while (condicionalTernaria != 0);
                    break;
                case 8:
<<<<<<< HEAD
                    int bucleDoWhile = -1;
                    do {
                        System.out.print("**************************************************************\n");
                        System.out.print("**                        DO WHILE                          **\n");
                        System.out.print("**************************************************************\n");
                        System.out.print("**           1.   Condicional Do While                      **\n");
                        System.out.print("**           2.   Programa de Do While                      **\n");
                        System.out.print("**           0.   Retornar al Menu Principal                **\n");
                        System.out.print("**************************************************************\n");
                        System.out.print("Digita una opción: ");

                        Validaciones.opcionValida(scanner);

                        bucleDoWhile = scanner.nextInt();
                        scanner.nextLine();
                        switch (bucleDoWhile) {
=======
                    int opDoW = -1;
                    while (true) {
                       SubMenu.doWhile();
                       opDoW = scanner8.nextInt();
                       Validaciones.opcionValida(scanner8);
                        switch (opDoW) {
>>>>>>> f3007ca13e536accdd49a1cc4ab5ee852818d9c7
                            case 1:
                                Detalle.doWile();
                                break;
                            case 2:
<<<<<<< HEAD
                                System.out.print("**************************************************************\n");
                                System.out.print("**                  PROGRAMA DO WHILE                       **\n");
                                System.out.print("**************************************************************\n");
                                System.out.print("**              Ejercicio Adivina el número                 **\n");
                                System.out.print("** Bienvenid@, vamos a jugar a adivinar el numero...        **\n");
                                System.out.print("** ¡Hemos pensado en un numero de 1 a 100!                  **\n");
                                Random random = new Random();
                                int secreto = random.nextInt(100) + 1;
                                int numeroi = 0;
                                boolean numero = false;
                                System.out.print("** Intenta adivinarlo.....                                  **\n");
                                do {
                                    System.out.print("** Introduce un número por favor                            **\n");
                                    numeroi = scanner.nextInt();
                                    if (numeroi < secreto) {
                                        System.out.print("** Muy bajo, Intenta de nuevo.                              **\n");
                                    } else if (numeroi > secreto) {
                                        System.out.print("** Muy alto, Intenta de nuevo.                              **\n");
                                    } else {
                                        System.out.print("**¡Felicidades! adivinaste el numero es: " + secreto + "\n");
                                        scanner.nextLine();
                                        numero = true;
                                    }
                                } while (!numero);
                                System.out.print("**************************************************************\n");
                                scanner.nextLine();
=======
                                Ejercicios.programaDoWile(scanner8);
                                Validaciones.opcionValida(scanner8);
>>>>>>> f3007ca13e536accdd49a1cc4ab5ee852818d9c7
                                break;
                            case 0:
                                System.out.println("Retornando al Menú Principal");
                                break;
                            default:
                                System.out.println("Opción no válida. Ingresa una opción entre el 0 y 2");
                        }
                        System.out.print("Presiona Enter para continuar...");
<<<<<<< HEAD
                        scanner.nextLine();

                    }while (bucleDoWhile != 0);
=======
                        scanner8.nextLine();
                        break;
                    }
>>>>>>> f3007ca13e536accdd49a1cc4ab5ee852818d9c7
                    break;
                case 9:
                    int bucleWhile = -1;
                    do {
                        SubMenu.menuWhile();

                        Validaciones.opcionValida(scanner);

                        bucleWhile = scanner.nextInt();
                        scanner.nextLine();
                        switch (bucleWhile) {
                            case 1:
                                Detalle.explicacionWhile();
                                break;
                            case 2:
                                Programas.programaWhile(scanner);
                                break;
                            case 0:
                                System.out.println("Retornando al Menú Principal");
                                break;
                            default:
                                System.out.println("Opción no válida. Ingresa una opción entre el 0 y 2");
                        }
                        Validaciones.accionContinuar(scanner);

                    }while (bucleWhile != 0);
                    break;
                case 10:
<<<<<<< HEAD
                    int bucleFor = -1;
                    do {
                        System.out.print("**************************************************************\n");
                        System.out.print("**                           FOR                            **\n");
                        System.out.print("**************************************************************\n");
                        System.out.print("**           1.   Condicional FOR                           **\n");
                        System.out.print("**           2.   Programa de FOR                           **\n");
                        System.out.print("**           0.   Retornar al Menu Principal                **\n");
                        System.out.print("**************************************************************\n");
                        System.out.print("Digita una opción: ");

                        Validaciones.opcionValida(scanner);

                        bucleFor = scanner.nextInt();
                        scanner.nextLine();
                        switch (bucleFor) {
                            case 1:
                                System.out.print("**************************************************************\n");
                                System.out.print("**                   CONDICIONAL FOR                        **\n");
                                System.out.print("**************************************************************\n");
                                System.out.print("** La sentencia for en java es una estructura de control    **\n");
                                System.out.print("** de ciclo que se utiliza para ejecutar un bloque de       **\n");
                                System.out.print("** codigo una cantidad determinada de veces.                **\n");
                                System.out.print("**                                                          **\n");
                                System.out.print("**  Ejemplo:                                                **\n");
                                System.out.print("**   for (inicialización; condición; actualización){        **\n");
                                System.out.print("**     //Bloque de codigo a ejecutar                        **\n");
                                System.out.print("**    }                                                     **\n");
                                System.out.print("**************************************************************\n");
                                break;
                            case 2:
                                System.out.print("**************************************************************\n");
                                System.out.print("**                      PROGRAMA FOR                        **\n");
                                System.out.print("**************************************************************\n");
                                System.out.print("**              Ejercicio sumatoria de numeros              **\n");
                                System.out.print("** Ingresa un numero para realizar la sumatoria:            **\n");
                                int numero = scanner.nextInt();
                                int suma = 0;
                                for (int i = 1; i <= numero; i++) {
                                    suma += i;
                                }
                                System.out.print("** La suma del 1 al " + numero + " es: " + suma + "\n");
                                System.out.print("**************************************************************\n");
                                scanner.nextLine();
                                break;
                            case 0:
                                System.out.println("Retornando al Menú Principal");
                                break;
                            default:
                                System.out.println("Opción no válida. Ingresa una opción entre el 0 y 2");
                        }
                        System.out.print("Presiona Enter para continuar...");
                        scanner.nextLine();

                    }while (bucleFor != 0);
=======
                    int opFor = -1;
                    while (true) {
                    SubMenu.condicionalFor();
                    opFor = scanner.nextInt();
                    Validaciones.opcionValida(scanner10);
                    switch (opFor) {
                        case 1:
                            Detalle.definicionFor();
                            break;
                        case 2:
                           Ejercicios.programaFor(scanner10);
                            break;
                        case 0:
                            System.out.println("Retornando al Menú Principal");
                            break;
                        default:
                            System.out.println("Opción no válida. Ingresa una opción entre el 0 y 2");
                    }
                    System.out.print("Presiona Enter para continuar...");
                    scanner10.nextLine();
>>>>>>> f3007ca13e536accdd49a1cc4ab5ee852818d9c7
                    break;
                default:
                    System.out.println("Opción no válida. Ingresa una opción entre el 0 y 10");
            }
        } while (opcion != 0);
        scanner.close();
    }

}