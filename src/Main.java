import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opc = -1;

        do {
            System.out.print("**************************************************************\n");
            System.out.print("**                       MENU PRINCIPAL                     **\n");
            System.out.print("**                 CAPITULO DE PROGRAMACION                 **\n");
            System.out.print("**            KATHERINE MARTINEZ - LORENA RIVERA            **\n");
            System.out.print("**                     KMART12 - IRIVER1                    **\n");
            System.out.print("**************************************************************\n");
            System.out.print("**************************************************************\n");
            System.out.print("**        1.   Datos Primitivos                             **\n");
            System.out.print("**        2.   String                                       **\n");
            System.out.print("**        3.   Constantes                                   **\n");
            System.out.print("**        4.   Tipo de Operadores                           **\n");
            System.out.print("**        5.   Condicional IF, ELSE, IF ELSE                **\n");
            System.out.print("**        6.   Condicional Swicht                           **\n");
            System.out.print("**        7.   Condicional Ternaria                         **\n");
            System.out.print("**        8.   Bucle DO WHILE                               **\n");
            System.out.print("**        9.   Bucle WHILE                                  **\n");
            System.out.print("**        10.  Bucle FOR                                    **\n");
            System.out.print("**        0.   Salir                                        **\n");
            System.out.print("**************************************************************\n");
            System.out.print("**************************************************************\n");
            System.out.print("Digita la opción de tu preferencia: ");
            opc = scanner.nextInt();
            scanner.nextLine();

            switch (opc) {
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                case 1:
                    int dprim = -1;
                    while (true) {
                        System.out.print("**************************************************************\n");
                        System.out.print("**                  MENU DATOS PRIMITIVOS                   **\n");
                        System.out.print("**************************************************************\n");
                        System.out.print("**           1.   ¿Qué es un byte?                          **\n");
                        System.out.print("**           2.   ¿Qué es un short?                         **\n");
                        System.out.print("**           3.   ¿Qué es un int?                           **\n");
                        System.out.print("**           4.   ¿Qué es un long?                          **\n");
                        System.out.print("**           5.   ¿Qué es un float?                         **\n");
                        System.out.print("**           6.   ¿Qué es un double?                        **\n");
                        System.out.print("**           7.   ¿Qué es un char?                          **\n");
                        System.out.print("**           8.   ¿Qué es un boolean?                       **\n");
                        System.out.print("**           0.   Retornar al Menu Principal                **\n");
                        System.out.print("**************************************************************\n");
                        System.out.print("Digita una opción: ");
                        dprim = scanner.nextInt();
                        scanner.nextLine();
                        switch (dprim) {
                            case 1:
                                System.out.print("**************************************************************\n");
                                System.out.print("**                     ¿QUE ES UN BYTE?                     **\n");
                                System.out.print("**************************************************************\n");
                                System.out.print("**  Es utilizado para datos pequeños y optimización de      **\n");
                                System.out.print("**  memoria en arrays grandes.                              **\n");
                                System.out.print("**  Rango: -128 a 127                                       **\n");
                                System.out.print("**  Ejemplo:                                                **\n");
                                System.out.print("**             'byte edad = 25;'                            **\n");
                                System.out.print("**************************************************************\n");
                                break;
                            case 2:
                                System.out.print("**************************************************************\n");
                                System.out.print("**                     ¿QUE ES UN SHORT?                    **\n");
                                System.out.print("**************************************************************\n");
                                System.out.print("**  Es útil para datos numéricos mas grandes que 'byte'     **\n");
                                System.out.print("**  pero aún pequeños.                                      **\n");
                                System.out.print("**  Rango: -32,768 a 32,767                                 **\n");
                                System.out.print("**  Ejemplo:                                                **\n");
                                System.out.print("**             'short año = 2023;'                          **\n");
                                System.out.print("**************************************************************\n");
                                break;
                            case 3:
                                System.out.print("**************************************************************\n");
                                System.out.print("**                      ¿QUE ES UN INT?                     **\n");
                                System.out.print("**************************************************************\n");
                                System.out.print("**  Este tipo de dato se utiliza para almacenar números     **\n");
                                System.out.print("**  enteros, es decir, números sin parte decimal.           **\n");
                                System.out.print("**  Rango: -2^31 y 2^31 - 1                                 **\n");
                                System.out.print("**  Ejemplo:                                                **\n");
                                System.out.print("**             'int auxiliar = 30;'                         **\n");
                                System.out.print("**************************************************************\n");
                                break;
                            case 4:
                                System.out.print("**************************************************************\n");
                                System.out.print("**                     ¿QUE ES UN LONG?                     **\n");
                                System.out.print("**************************************************************\n");
                                System.out.print("**  Las variables de tipo entero grandes o long son         **\n");
                                System.out.print("**  aquellas que almacenan un número (ya sea positivo o     **\n");
                                System.out.print("**  negativo) no decimal.                                   **\n");
                                System.out.print("**  Rango: -2^63 y 2^63 - 1                                 **\n");
                                System.out.print("**  Ejemplo:                                                **\n");
                                System.out.print("**            'long numeroCuentas = 10000000000L;'          **\n");
                                System.out.print("**************************************************************\n");
                                break;
                            case 5:
                                System.out.print("**************************************************************\n");
                                System.out.print("**                     ¿QUE ES UN FLOAT?                    **\n");
                                System.out.print("**************************************************************\n");
                                System.out.print("**  Números en coma flotante de precision simple            **\n");
                                System.out.print("**  Rango: 3,4E-38 a 3,4E+38                                **\n");
                                System.out.print("**  Ejemplo:                                                **\n");
                                System.out.print("**             'float precio = 19.99f;'                     **\n");
                                System.out.print("**************************************************************\n");
                                break;
                            case 6:
                                System.out.print("**************************************************************\n");
                                System.out.print("**                    ¿QUE ES UN DOUBLE?                    **\n");
                                System.out.print("**************************************************************\n");
                                System.out.print("**  Números en coma flotante de doble precision             **\n");
                                System.out.print("**  Rango: ±4,9E-324 a ±1,79769313486231570E+308            **\n");
                                System.out.print("**  Ejemplo:                                                **\n");
                                System.out.print("**             'double pi = 3.141592653589793;'             **\n");
                                System.out.print("**************************************************************\n");
                                break;
                            case 7:
                                System.out.print("**************************************************************\n");
                                System.out.print("**                     ¿QUE ES UN CHAR?                     **\n");
                                System.out.print("**************************************************************\n");
                                System.out.print("**  Almacena un solo carácter unicode                       **\n");
                                System.out.print("**  Rango: 0 a 65,535 (Caracteres Unicode)                  **\n");
                                System.out.print("**  Ejemplo:                                                **\n");
                                System.out.print("**             'char inicial = 'A';'                        **\n");
                                System.out.print("**************************************************************\n");
                                break;
                            case 8:
                                System.out.print("**************************************************************\n");
                                System.out.print("**                   ¿QUE ES UN BOOLEAN?                    **\n");
                                System.out.print("**************************************************************\n");
                                System.out.print("**  Almacena valores de verdad                              **\n");
                                System.out.print("**  Rango: true o false                                     **\n");
                                System.out.print("**  Ejemplo:                                                **\n");
                                System.out.print("**             'boolean esMayorDeEdad = true;'              **\n");
                                System.out.print("**************************************************************\n");
                                break;
                            case 0:
                                System.out.println("Retornando al Menú Principal");
                                break;
                            default:
                                System.out.println("Opción no válida. Ingresa una opción entre el 0 y 8");
                        }
                        System.out.print("Presiona Enter para continuar...");
                        scanner.nextLine();
                        break;
                    }
                    break;
                case 2:
                    System.out.print("**************************************************************\n");
                    System.out.print("**                        STRING                            **\n");
                    System.out.print("**************************************************************\n");
                    System.out.print("**  En Java, los string son un objeto el cual nos permite   **\n");
                    System.out.print("**  almacenar muchos caracteres                             **\n");
                    System.out.print("**                                                          **\n");
                    System.out.print("**  Por ejemplo:                                            **\n");
                    System.out.print("**     String mensaje = `Hola Mundo`;                       **\n");
                    System.out.print("**     String nombre= `Tito`;                               **\n");
                    System.out.print("**************************************************************\n");
                    System.out.println("Presiona Enter para continuar...");
                    scanner.nextLine();
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
                    scanner.nextLine();
                    break;
                case 4:
                    int optOp = -1;
                    while (true) {
                        System.out.print("**************************************************************\n");
                        System.out.print("**                    MENU TIPO DE OPERADORES               **\n");
                        System.out.print("**************************************************************\n");
                        System.out.print("**           1.   Aritmèticos                               **\n");
                        System.out.print("**           2.   Relacionales                              **\n");
                        System.out.print("**           3.   Logicos                                   **\n");
                        System.out.print("**           4.   Asignaciòn                                **\n");
                        System.out.print("**           5.   Incremento / Decremento                   **\n");
                        System.out.print("**           0.   Retornar al Menu Principal                **\n");
                        System.out.print("**************************************************************\n");
                        System.out.print("Digita una opción: ");
                        optOp = scanner.nextInt();
                        scanner.nextLine();
                        switch (optOp) {
                            case 1:
                                System.out.print("******************************************************************************* \n");
                                System.out.print("**                           ARITMETICOS                                     ** \n");
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
                                System.out.print("**                           RELACIONALES                                    ** \n");
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
                                System.out.print("**                           LOGICOS                                         ** \n");
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
                                System.out.print("**                           ASIGNACION                                      ** \n");
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
                                System.out.print("**                   INCREMENTO/DECREMENTO                                   ** \n");
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
                        break;
                    }
                    break;
                case 5:
                    int condif = -1;
                    while (true) {
                        System.out.print("**************************************************************\n");
                        System.out.print("**                    IF, ELSE IF Y ELSE                    **\n");
                        System.out.print("**************************************************************\n");
                        System.out.print("**           1.   Condicional IF                            **\n");
                        System.out.print("**           2.   Condicional ELSE                          **\n");
                        System.out.print("**           3.   Condicional ELSE IF                       **\n");
                        System.out.print("**           4.   Programa de IF, ELSE IF Y ELSE            **\n");
                        System.out.print("**           0.   Retornar al Menu Principal                **\n");
                        System.out.print("**************************************************************\n");
                        System.out.print("Digita una opción: ");
                        condif = scanner.nextInt();
                        scanner.nextLine();
                        switch (condif) {
                            case 1:
                                System.out.print("**************************************************************\n");
                                System.out.print("**                      CONDICIONAL IF                      **\n");
                                System.out.print("**************************************************************\n");
                                System.out.print("**  La estructura if evalúa una condición y ejecuta un      **\n");
                                System.out.print("**  bloque de código si la condición es verdadera.          **\n");
                                System.out.print("**                                                          **\n");
                                System.out.print("**  Sintaxis:                                               **\n");
                                System.out.print("**                                                          **\n");
                                System.out.print("**  if (condición) {                                        **\n");
                                System.out.print("**    //Código a ejecutar si la condición es verdadera      **\n");
                                System.out.print("**  }                                                       **\n");
                                System.out.print("**************************************************************\n");
                                break;
                            case 2:
                                System.out.print("**************************************************************\n");
                                System.out.print("**                     CONDICIONAL ELSE                     **\n");
                                System.out.print("**************************************************************\n");
                                System.out.print("**  El condicional else se utiliza en combinación con if    **\n");
                                System.out.print("**  para proporcionar un bloque de código que se ejecutará  **\n");
                                System.out.print("**  cuando la condición del if no se cumpla. Es una forma   **\n");
                                System.out.print("**  de manejar casos alternativos cuando la condición       **\n");
                                System.out.print("**  principal no es verdadera.                              **\n");
                                System.out.print("**                                                          **\n");
                                System.out.print("**  Sintaxis:                                               **\n");
                                System.out.print("**                                                          **\n");
                                System.out.print("**  if (condición) {                                        **\n");
                                System.out.print("**    //Código a ejecutar si la condición es verdadera      **\n");
                                System.out.print("**  } else {                                                **\n");
                                System.out.print("**    // Código a ejecutar si la condición es falsa         **\n");
                                System.out.print("**  }                                                       **\n");
                                System.out.print("**************************************************************\n");
                                break;
                            case 3:
                                System.out.print("**************************************************************\n");
                                System.out.print("**                   CONDICIONAL ELSE IF                    **\n");
                                System.out.print("**************************************************************\n");
                                System.out.print("**  El condicional else if se usa para comprobar múltiples  **\n");
                                System.out.print("**  condiciones en una secuencia de decisiones.             **\n");
                                System.out.print("**  Permite evaluar varias condiciones, proporcionando      **\n");
                                System.out.print("**  bloques de código específicos para cada una, y se       **\n");
                                System.out.print("**  utiliza después de un if y antes de un else.            **\n");
                                System.out.print("**                                                          **\n");
                                System.out.print("**  Sintaxis:                                               **\n");
                                System.out.print("**                                                          **\n");
                                System.out.print("**  if (condición1) {                                       **\n");
                                System.out.print("**    //Código a ejecutar si la condición1 es verdadera     **\n");
                                System.out.print("**  } else if (condicion2){                                 **\n");
                                System.out.print("**    //Código a ejecutar si la condición2 es verdadera     **\n");
                                System.out.print("**  } else if (condicion3){                                 **\n");
                                System.out.print("**    // Código a ejecutar si la condición3 es verdadera    **\n");
                                System.out.print("**  } else {                                                **\n");
                                System.out.print("**    //Código a ejecutar si ninguna de las condiciones     **\n");
                                System.out.print("**       anteriores es verdadera                            **\n");
                                System.out.print("**  }                                                       **\n");
                                System.out.print("**************************************************************\n");
                                break;
                            case 4:
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
                                    break;
                            case 0:
                                System.out.println("Retornando al Menú Principal");
                                break;
                            default:
                                System.out.println("Opción no válida. Ingresa una opción entre el 0 y 4");
                        }
                        System.out.print("Presiona Enter para continuar...");
                        scanner.nextLine();
                        break;
                    }
                    break;
                case 6:
                    int opSw = -1;
                    while (true) {
                        System.out.print("**************************************************************\n");
                        System.out.print("**              CONDICIONALES SWITCH                        **\n");
                        System.out.print("**************************************************************\n");
                        System.out.print("**           1.   Condicional Switch                        **\n");
                        System.out.print("**           2.   Programa de Switch                        **\n");
                        System.out.print("**           0.   Retornar al Menu Principal                **\n");
                        System.out.print("**************************************************************\n");
                        System.out.print("Digita una opción: ");
                        opSw = scanner.nextInt();
                        scanner.nextLine();
                        switch (opSw) {
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
                                System.out.print("**   Este condicional es utilia la hora de definir por      **\n");
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
                        break;
                    }
                    break;
                case 7:
                    int ternaria = -1;
                    while (true) {
                        System.out.print("**************************************************************\n");
                        System.out.print("**                         TERNARIA                         **\n");
                        System.out.print("**************************************************************\n");
                        System.out.print("**           1.   Condicional Ternaria                      **\n");
                        System.out.print("**           2.   Programa de Ternaria                      **\n");
                        System.out.print("**           0.   Retornar al Menu Principal                **\n");
                        System.out.print("**************************************************************\n");
                        System.out.print("Digita una opción: ");
                        ternaria = scanner.nextInt();
                        scanner.nextLine();
                        switch (ternaria) {
                            case 1:
                                System.out.print("**************************************************************\n");
                                System.out.print("**                   CONDICIONAL TERNARIA                   **\n");
                                System.out.print("**************************************************************\n");
                                System.out.print("**  El operador ternario es útil para simplificar la        **\n");
                                System.out.print("**  escritura de expresiones condicionales simples.         **\n");
                                System.out.print("**  Se compone de tres partes:                              **\n");
                                System.out.print("**  - La condición a evaluar (condición booleana)           **\n");
                                System.out.print("**  - El valor si la condición es verdadera                 **\n");
                                System.out.print("**  - El valor si la condición es falsa                     **\n");
                                System.out.print("**  El operador ternario en Java es una construcción que    **\n");
                                System.out.print("**  permite tomar decisiones basadas en una condición       **\n");
                                System.out.print("**  booleana de manera concisa en una sola línea de código  **\n");
                                System.out.print("**                                                          **\n");
                                System.out.print("**  Ejemplo:                                                **\n");
                                System.out.print("**   int edad = 20;                                         **\n");
                                System.out.print("**   String mensaje = (edad >= 18) ?                        **\n");
                                System.out.print("**   'Eres mayor de edad' : 'Eres menor de edad';           **\n");
                                System.out.print("**   System.out.println(mensaje);                           **\n");
                                System.out.print("**************************************************************\n");
                                break;
                            case 2:
                                System.out.print("**************************************************************\n");
                                System.out.print("**                     PROGRAMA TERNARIA                    **\n");
                                System.out.print("**************************************************************\n");
                                System.out.print("**   Ejercicio para calcular si un número es par o impar    **\n");
                                System.out.print("** Ingresa un numero:                                       **\n");
                                int numero = scanner.nextInt();
                                String resultado = (numero % 2 == 0 ) ? "Par":"Impar";
                                System.out.println("El numero " + numero + " es: " +resultado);
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
                        break;
                    }
                    break;
                case 8:
                    System.out.println("opc8 ");
                    break;
                case 9:
                    int cond_while = -1;
                    while (true) {
                        System.out.print("**************************************************************\n");
                        System.out.print("**                           WHILE                          **\n");
                        System.out.print("**************************************************************\n");
                        System.out.print("**           1.   Condicional While                         **\n");
                        System.out.print("**           2.   Programa de While                         **\n");
                        System.out.print("**           0.   Retornar al Menu Principal                **\n");
                        System.out.print("**************************************************************\n");
                        System.out.print("Digita una opción: ");
                        cond_while = scanner.nextInt();
                        scanner.nextLine();
                        switch (cond_while) {
                            case 1:
                                System.out.print("**************************************************************\n");
                                System.out.print("**                   CONDICIONAL WHILE                      **\n");
                                System.out.print("**************************************************************\n");
                                System.out.print("**  La sentencia while en Java es una estructura de control **\n");
                                System.out.print("**  de ciclo que se utiliza para ejecutar un bloque de      **\n");
                                System.out.print("**  código mientras se cumpla una determinada condición.    **\n");
                                System.out.print("**                                                          **\n");
                                System.out.print("**  La sintaxis básica de la sentencia while en Java es:    **\n");
                                System.out.print("**   while (condición) {                                    **\n");
                                System.out.print("**   // bloque de código a ejecutar mientras se cumpla      **\n");
                                System.out.print("**   la condición                                           **\n");
                                System.out.print("**   }                                                      **\n");
                                System.out.print("**************************************************************\n");
                                break;
                            case 2:
                                System.out.print("**************************************************************\n");
                                System.out.print("**                      PROGRAMA WHILE                      **\n");
                                System.out.print("**************************************************************\n");
                                System.out.print("**              Ejercicio sumatoria de numeros              **\n");
                                System.out.print("** Ingresa un numero para realizar la sumatoria:            **\n");
                                int i = 0;
                                int numero = scanner.nextInt();
                                int suma = 0;

                                while (i <= numero){
                                    suma = suma + i;
                                    i++;
                                }
                                System.out.println("La sumatoria total del número " + numero + " es: " +suma);
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
                        break;
                    }
                    break;
                case 10:
                    System.out.println("opc10 ");
                    break;
                default:
                    System.out.println("Opción no válida. Ingresa una opción entre el 0 y 10");
            }
            System.out.print("Presiona Enter para continuar...");
            scanner.nextLine();
        } while (opc != 0);
        scanner.close();
    }

}