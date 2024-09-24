package ejecucion;

import explicaciones.Detalle;
import menus.MenuPrincipal;
import menus.SubMenu;
import programas.Ejercicios;
import utilidades.Validaciones;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcion = -1;

        do {
            MenuPrincipal.menuPrincipal();
            Validaciones.opcionValida(scanner);

            opcion = scanner.nextInt();


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
                    Detalle.string();
                    scanner.nextLine();
                    break;
                case 3:
                    Detalle.constantes(scanner);
                    break;
                case 4:
                    int tipoOperadores = -1;
                    do {
                        SubMenu.tipoOperadores();

                        Validaciones.opcionValida(scanner);

                        tipoOperadores = scanner.nextInt();
                        scanner.nextLine();

                        switch (tipoOperadores) {
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
                        Validaciones.accionContinuar(scanner);
                    } while (tipoOperadores != 0);
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
                                Ejercicios.programaIf(scanner);
                                break;
                            case 0:
                                System.out.println("Retornando al Menú Principal");
                                break;
                            default:
                                System.out.println("Opción no válida. Ingresa una opción entre el 0 y 4");
                        }
                        Validaciones.accionContinuar(scanner);
                    } while (condicionalIf != 0);
                    break;
                case 6:
                    int condicionalSwitch = -1;
                    do {
                        SubMenu.condicionalSwich();

                        Validaciones.opcionValida(scanner);

                        condicionalSwitch = scanner.nextInt();
                        scanner.nextLine();

                        switch (condicionalSwitch) {
                            case 1:
                                Detalle.condicionalSwitch();
                                break;
                            case 2:
                                Ejercicios.programSwitch(scanner);
                                ;
                                break;
                            case 0:
                                System.out.println("Retornando al Menú Principal");
                                break;
                            default:
                                System.out.println("Opción no válida. Ingresa una opción entre el 0 y 2");
                        }
                        Validaciones.accionContinuar(scanner);
                    } while (condicionalSwitch != 0);
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
                                Ejercicios.programaTernaria(scanner);
                                break;
                            case 0:
                                System.out.println("Retornando al Menú Principal");
                                break;
                            default:
                                System.out.println("Opción no válida. Ingresa una opción entre el 0 y 2");
                        }
                        Validaciones.accionContinuar(scanner);
                    } while (condicionalTernaria != 0);
                    break;
                case 8:
                    int condicionalDoWhile = -1;
                    do {
                        SubMenu.doWhile();
                        Validaciones.opcionValida(scanner);

                        condicionalDoWhile = scanner.nextInt();
                        scanner.nextLine();

                        switch (condicionalDoWhile) {

                            case 1:
                                Detalle.doWile();
                                break;
                            case 2:
                                Ejercicios.programaDoWile(scanner);
                                break;
                            case 0:
                                System.out.println("Retornando al Menú Principal");
                                break;
                            default:
                                System.out.println("Opción no válida. Ingresa una opción entre el 0 y 2");
                        }
                        Validaciones.accionContinuar(scanner);
                    } while (condicionalDoWhile != 0);
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
                                Ejercicios.programaWhile(scanner);
                                break;
                            case 0:
                                System.out.println("Retornando al Menú Principal");
                                break;
                            default:
                                System.out.println("Opción no válida. Ingresa una opción entre el 0 y 2");
                        }
                        Validaciones.accionContinuar(scanner);

                    } while (bucleWhile != 0);
                    break;
                case 10:
                    int bucleFor = -1;
                    do {
                        SubMenu.condicionalFor();

                        Validaciones.opcionValida(scanner);

                        bucleFor = scanner.nextInt();
                        scanner.nextLine();
                        switch (bucleFor) {
                            case 1:
                                Detalle.definicionFor();
                                break;
                            case 2:
                                Ejercicios.programaFor(scanner);
                                break;
                            case 0:
                                System.out.println("Retornando al Menú Principal");
                                break;
                            default:
                                System.out.println("Opción no válida. Ingresa una opción entre el 0 y 2");
                        }
                        Validaciones.accionContinuar(scanner);
                    } while (bucleFor != 0);
                    break;
                default:
                    System.out.println("Opción no válida. Ingresa una opción entre el 0 y 10");
                    Validaciones.accionContinuar(scanner);
                    scanner.nextLine();
            }
        }
        while (opcion != 0);
        scanner.close();
    }

}