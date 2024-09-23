package ejecucion;

import explicaciones.Detalle;
import menus.MenuPrincipal;
import menus.SubMenu;
import programas.Programas;
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
                    scanner.nextLine();
                    break;
                case 3:
                    Detalle.constantes(scanner);
                    break;
                case 4:
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
                            case 1:
                                System.out.print("******************************************************************************* \n");
                                System.out.print("**                                ARITMÉTICOS                                ** \n");
                                System.out.print("******************************************************************************* \n");
                                System.out.print("** Operador **     Ejemplo         **               Detalle                  ** \n");
                                System.out.print("******************************************************************************* \n");
                                System.out.print("**    +     ** Int suma = 31+4;    ** Suma dos operadores.Result:35          ** \n");
                                System.out.print("******************************************************************************* \n");
                                System.out.print("**    -     ** Int resta = 31-4;   ** Resta el segundo operador.Resul:27     ** \n");
                                System.out.print("******************************************************************************* \n");
                                System.out.print("**    *     ** Int multip = 31*4;  ** Multiplica dos operadores.Resul:124    ** \n");
                                System.out.print("******************************************************************************* \n");
                                System.out.print("**    /     ** Int dividir = 31/4; ** Divide un operador con otro.Result:7.7 ** \n");
                                System.out.print("******************************************************************************* \n");
                                System.out.print("**          **                     ** Devuelve el resto de la divisiòn del   ** \n");
                                System.out.print("**    %     ** Int modulo = 31%4;  ** del primer operador con el segundo.    ** \n");
                                System.out.print("**          **                     ** Result:27.                             ** \n");
                                System.out.print("******************************************************************************* \n");
                                break;
                            case 2:
                                System.out.print("******************************************************************************* \n");
                                System.out.print("**                                RELACIONALES                               ** \n");
                                System.out.print("******************************************************************************* \n");
                                System.out.print("** Operador **     Ejemplo                **               Detalle           ** \n");
                                System.out.print("******************************************************************************* \n");
                                System.out.print("**          **                            ** Comprueba si los valores de los ** \n");
                                System.out.print("**    ==    ** boolean esIgual=(5==3);    ** dos operadores son iguales.     ** \n");
                                System.out.print("**          **                            ** Result:false.                   ** \n");
                                System.out.print("******************************************************************************* \n");
                                System.out.print("**          **                            ** Comprueba si los valores de los ** \n");
                                System.out.print("**    !=    ** boolean noEsIgual=(5!=3);  ** dos operadores no son iguales.  ** \n");
                                System.out.print("**          **                            ** Result:true.                    ** \n");
                                System.out.print("******************************************************************************* \n");
                                System.out.print("**          **                            ** Comprueba si el valor del       ** \n");
                                System.out.print("**    >     ** boolean mayor=(5>3);       ** primer operador el mayor que el ** \n");
                                System.out.print("**          **                            ** segundo.Result:true.            ** \n");
                                System.out.print("******************************************************************************* \n");
                                System.out.print("**          **                            ** Comprueba si el valor del       ** \n");
                                System.out.print("**    <     ** boolean menor=(5<3);       ** primer operador el menor que el ** \n");
                                System.out.print("**          **                            ** segundo.Result:false.           ** \n");
                                System.out.print("******************************************************************************* \n");
                                System.out.print("**          **                            ** Comprueba si el valor del       ** \n");
                                System.out.print("**    >=    ** boolean mayorOIgual=(5>=3);** primer operador el mayor o      ** \n");
                                System.out.print("**          **                            ** igual al segundo.Result:true.   ** \n");
                                System.out.print("******************************************************************************* \n");
                                System.out.print("**          **                            ** Comprueba si el valor del       ** \n");
                                System.out.print("**    <=    ** boolean menorOIgual=(5>=3);** primer operador el menor o      ** \n");
                                System.out.print("**          **                            ** igual al segundo.Result:false.  ** \n");
                                System.out.print("******************************************************************************* \n");
                                break;
                            case 3:
                                System.out.print("******************************************************************************* \n");
                                System.out.print("**                                  LOGICOS                                  ** \n");
                                System.out.print("******************************************************************************* \n");
                                System.out.print("** Operador **     Ejemplo                **               Detalle           ** \n");
                                System.out.print("******************************************************************************* \n");
                                System.out.print("**          **                            ** Devuelve true si ambos          ** \n");
                                System.out.print("**    &&    ** boolean resul=(5>3 && 3<4);** operadores son true.            ** \n");
                                System.out.print("**          **                            ** Result:true.                    ** \n");
                                System.out.print("******************************************************************************* \n");
                                System.out.print("**          **                            ** Devuelve true si almenos una    ** \n");
                                System.out.print("**    ||    ** boolean resul=(5>3 || 3<4);** de ellas es true.               ** \n");
                                System.out.print("**          **                            ** Result:true.                    ** \n");
                                System.out.print("******************************************************************************* \n");
                                System.out.print("**          **                            ** Invierte el valor de un         ** \n");
                                System.out.print("**    !     ** boolean resul= !(5>3);     ** operador booleano.              ** \n");
                                System.out.print("**          **                            ** Result:.false.                  ** \n");
                                System.out.print("******************************************************************************* \n");
                                break;
                            case 4:
                                System.out.print("******************************************************************************* \n");
                                System.out.print("**                                 ASIGNACIÓN                                ** \n");
                                System.out.print("******************************************************************************* \n");
                                System.out.print("** Operador **     Ejemplo      **               Detalle                     ** \n");
                                System.out.print("******************************************************************************* \n");
                                System.out.print("**          **                  ** Asigna el valor del operador derecho al   ** \n");
                                System.out.print("**    =     ** Int a = 5;       ** operador izquierdo.                       ** \n");
                                System.out.print("**          **                  **                                           ** \n");
                                System.out.print("******************************************************************************* \n");
                                System.out.print("**          **                  ** Suma el Operador derecho al Operador      ** \n");
                                System.out.print("**    +=    ** Int a=5; a+=3;   ** izquierdo y asigna el resultado al        ** \n");
                                System.out.print("**          **                  ** operador izquierdo.Result:8.              ** \n");
                                System.out.print("******************************************************************************* \n");
                                System.out.print("**          **                  ** Resta el Operador derecho al Operador     ** \n");
                                System.out.print("**   -=     ** Int a=5; a-=3;   ** izquierdo y asigna el resultado al        ** \n");
                                System.out.print("**          **                  ** operador izquierdo.Result:2.              ** \n");
                                System.out.print("******************************************************************************* \n");
                                System.out.print("**          **                  ** Multiplica el Operador derecho al         ** \n");
                                System.out.print("**   *=     ** Int a=5; a*=3;   ** Operador izquierdo y asigna el resultado  ** \n");
                                System.out.print("**          **                  ** al operador izquierdo.Result:15.          ** \n");
                                System.out.print("******************************************************************************* \n");
                                System.out.print("**          **                  ** Divide el Operador derecho al Operador    ** \n");
                                System.out.print("**    /=    ** Int a=6; a/=3;   ** izquierdo y asigna el resultado al        ** \n");
                                System.out.print("**          **                  ** operador izquierdo.Result:2.              ** \n");
                                System.out.print("******************************************************************************* \n");
                                System.out.print("**          **                  ** Calcula el modulo del Operador derecho    ** \n");
                                System.out.print("**    %=    ** Int a=5; a%=3;   ** al Operador izquierdo y asigna el         ** \n");
                                System.out.print("**          **                  ** resultado al operador izquierdo.Result:2. ** \n");
                                System.out.print("******************************************************************************* \n");
                                break;
                            case 5:
                                System.out.print("******************************************************************************* \n");
                                System.out.print("**                           INCREMENTO/DECREMENTO                           ** \n");
                                System.out.print("******************************************************************************* \n");
                                System.out.print("** Operador **     Ejemplo        **               Detalle                   ** \n");
                                System.out.print("******************************************************************************* \n");
                                System.out.print("**          **                    ** Incrementa el valor del operador en 1.  ** \n");
                                System.out.print("**    ++    ** Int a =5; a++;     ** Result:6.                               ** \n");
                                System.out.print("******************************************************************************* \n");
                                System.out.print("**          **                    ** Decrementa el valor del operador en 1   ** \n");
                                System.out.print("**    --    ** Int a =5; a--;     ** Result:4.                               ** \n");
                                System.out.print("******************************************************************************* \n");
                                break;
                            case 0:
                                System.out.println("Retornando al Menú Principal");
                                break;
                            default:
                                System.out.println("Opción no válida. Ingresa una opción entre el 0 y 5");
                        }
                        System.out.print("Presiona Enter para continuar...");
                        scanner.nextLine();

                    }while (tipoOperadores != 0);
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
                            case 1:
                                System.out.print("**************************************************************\n");
                                System.out.print("**                   CONDICIONAL SHITCH                     **\n");
                                System.out.print("**************************************************************\n");
                                System.out.print("**  El condicional swich case es una estructura que evalua  **\n");
                                System.out.print("**  mas de un caso y es caracterizada por:                  **\n");
                                System.out.print("**   - Seleccion de una opcion entre varias.                **\n");
                                System.out.print("**   - Switch recibe un ´caso´ y lo evalua hasta encontrar  **\n");
                                System.out.print("**     el caso que corresponda.                             **\n");
                                System.out.print("**   - Se puede utilizar la opciòn Deafault para cuando     **\n");
                                System.out.print("**     no se encuentra el casodado.                         **\n");
                                System.out.print("**                                                          **\n");
                                System.out.print("**   Este condicional es utilizado a la hora de definir por **\n");
                                System.out.print("**   ejemplo un menu de usuario en aplicaciones que se      **\n");
                                System.out.print("**   ejecutan por consola.                                  **\n");
                                System.out.print("**                                                          **\n");
                                System.out.print("**   Ejemplo:                                               **\n");
                                System.out.print("**   switch (expresiòn){                                    **\n");
                                System.out.print("**   case valor1:                                           **\n");
                                System.out.print("**   //código a ejecutar si expresion == valor1             **\n");
                                System.out.print("**   break;                                                 **\n");
                                System.out.print("**   case valor2:                                           **\n");
                                System.out.print("**   //código a ejecutar si expresion == valor2             **\n");
                                System.out.print("**   break;                                                 **\n");
                                System.out.print("**   case valor3:                                           **\n");
                                System.out.print("**   //código a ejecutar si expresion == valor3             **\n");
                                System.out.print("**   break;                                                 **\n");
                                System.out.print("**   //puede tener mas condiciones segun sea necesario      **\n");
                                System.out.print("**   default:                                               **\n");
                                System.out.print("**   // codigo a ejecutar si ninguno de los casos coincide. **\n");
                                System.out.print("**                                                          **\n");
                                System.out.print("**************************************************************\n");
                                break;
                            case 2:
                                System.out.print("**************************************************************\n");
                                System.out.print("**                     PROGRAMA SWITCH                      **\n");
                                System.out.print("**************************************************************\n");
                                System.out.print("**   Ejercicio saber el estado de su calificaciòn           **\n");
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
                                break;
                            case 0:
                                System.out.println("Retornando al Menú Principal");
                                break;
                            default:
                                System.out.println("Opción no válida. Ingresa una opción entre el 0 y 2");
                        }
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
                            case 1:
                                System.out.print("**************************************************************\n");
                                System.out.print("**                CONDICIONAL DO WHILE                      **\n");
                                System.out.print("**************************************************************\n");
                                System.out.print("**  La sentencia Do While en Java es una estructura de      **\n");
                                System.out.print("**  control de ciclo que ejecuta un bloque de código una o  **\n");
                                System.out.print("**  mas veces mientras se cumple una condición especifica.  **\n");
                                System.out.print("**                                                          **\n");
                                System.out.print("**  Este ciclo se utiliza cuando se desea garantizar que    **\n");
                                System.out.print("**  el código se ejecute al menos una vez independiente     **\n");
                                System.out.print("**  de si se cumple la condición.                           **\n");
                                System.out.print("**                                                          **\n");
                                System.out.print("**  Ejemplo:                                                **\n");
                                System.out.print("**   do{                                                    **\n");
                                System.out.print("**    //Bloque de codigo que se ejecuta al menos una vez.   **\n");
                                System.out.print("**   }While (Condicion);                                    **\n");
                                System.out.print("**                                                          **\n");
                                System.out.print("**************************************************************\n");
                                break;
                            case 2:
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
                                break;
                            case 0:
                                System.out.println("Retornando al Menú Principal");
                                break;
                            default:
                                System.out.println("Opción no válida. Ingresa una opción entre el 0 y 2");
                        }
                        System.out.print("Presiona Enter para continuar...");
                        scanner.nextLine();

                    }while (bucleDoWhile != 0);
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
                    break;
                default:
                    System.out.println("Opción no válida. Ingresa una opción entre el 0 y 10");
            }
        } while (opcion != 0);
        scanner.close();
    }

}