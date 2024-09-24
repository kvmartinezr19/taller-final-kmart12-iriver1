package explicaciones;
import java.util.Scanner;

public class Detalle {

    public static void explicacionByte(){
        System.out.print("**************************************************************\n");
        System.out.print("**                     ¿QUÉ ES UN BYTE?                     **\n");
        System.out.print("**************************************************************\n");
        System.out.print("**  Es utilizado para datos pequeños y optimización de      **\n");
        System.out.print("**  memoria en arrays grandes.                              **\n");
        System.out.print("**  Rango: -128 a 127                                       **\n");
        System.out.print("**  Ejemplo:                                                **\n");
        System.out.print("**             'byte edad = 25;'                            **\n");
        System.out.print("**************************************************************\n");
    }
    public static void explicacionShort(){
        System.out.print("**************************************************************\n");
        System.out.print("**                     ¿QUÉ ES UN SHORT?                    **\n");
        System.out.print("**************************************************************\n");
        System.out.print("**  Es útil para datos numéricos mas grandes que 'byte'     **\n");
        System.out.print("**  pero aún pequeños.                                      **\n");
        System.out.print("**  Rango: -32,768 a 32,767                                 **\n");
        System.out.print("**  Ejemplo:                                                **\n");
        System.out.print("**             'short año = 2023;'                          **\n");
        System.out.print("**************************************************************\n");
    }
    public static void explicacionInt(){
        System.out.print("**************************************************************\n");
        System.out.print("**                      ¿QUÉ ES UN INT?                     **\n");
        System.out.print("**************************************************************\n");
        System.out.print("**  Este tipo de dato se utiliza para almacenar números     **\n");
        System.out.print("**  enteros, es decir, números sin parte decimal.           **\n");
        System.out.print("**  Rango: -2^31 y 2^31 - 1                                 **\n");
        System.out.print("**  Ejemplo:                                                **\n");
        System.out.print("**             'int auxiliar = 30;'                         **\n");
        System.out.print("**************************************************************\n");
    }
    public static void explicacionLong(){
        System.out.print("**************************************************************\n");
        System.out.print("**                     ¿QUÉ ES UN LONG?                     **\n");
        System.out.print("**************************************************************\n");
        System.out.print("**  Las variables de tipo entero grandes o long son         **\n");
        System.out.print("**  aquellas que almacenan un número (ya sea positivo o     **\n");
        System.out.print("**  negativo) no decimal.                                   **\n");
        System.out.print("**  Rango: -2^63 y 2^63 - 1                                 **\n");
        System.out.print("**  Ejemplo:                                                **\n");
        System.out.print("**            'long numeroCuentas = 10000000000L;'          **\n");
        System.out.print("**************************************************************\n");
    }
    public static void explicacionFloat(){
        System.out.print("**************************************************************\n");
        System.out.print("**                     ¿QUÉ ES UN FLOAT?                    **\n");
        System.out.print("**************************************************************\n");
        System.out.print("**  Números en coma flotante de precision simple            **\n");
        System.out.print("**  Rango: 3,4E-38 a 3,4E+38                                **\n");
        System.out.print("**  Ejemplo:                                                **\n");
        System.out.print("**             'float precio = 19.99f;'                     **\n");
        System.out.print("**************************************************************\n");
    }
    public static void explicacionDouble(){
        System.out.print("**************************************************************\n");
        System.out.print("**                    ¿QUÉ ES UN DOUBLE?                    **\n");
        System.out.print("**************************************************************\n");
        System.out.print("**  Números en coma flotante de doble precision             **\n");
        System.out.print("**  Rango: ±4,9E-324 a ±1,79769313486231570E+308            **\n");
        System.out.print("**  Ejemplo:                                                **\n");
        System.out.print("**             'double pi = 3.141592653589793;'             **\n");
        System.out.print("**************************************************************\n");
    }
    public static void explicacionChar(){
        System.out.print("**************************************************************\n");
        System.out.print("**                     ¿QUÉ ES UN CHAR?                     **\n");
        System.out.print("**************************************************************\n");
        System.out.print("**  Almacena un solo carácter unicode                       **\n");
        System.out.print("**  Rango: 0 a 65,535 (Caracteres Unicode)                  **\n");
        System.out.print("**  Ejemplo:                                                **\n");
        System.out.print("**             'char inicial = 'A';'                        **\n");
        System.out.print("**************************************************************\n");
    }
    public static void explicacionBoolean(){
        System.out.print("**************************************************************\n");
        System.out.print("**                   ¿QUÉ ES UN BOOLEAN?                    **\n");
        System.out.print("**************************************************************\n");
        System.out.print("**  Almacena valores de verdad                              **\n");
        System.out.print("**  Rango: true o false                                     **\n");
        System.out.print("**  Ejemplo:                                                **\n");
        System.out.print("**             'boolean esMayorDeEdad = true;'            " +
                "  **\n");
        System.out.print("**************************************************************\n");
    }

    public static void constantes(Scanner scanner){
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
        scanner.nextLine();
    }

    public static void explicacionIf(){
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
    }

    public static void explicacionElse(){
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
    }

    public static void explicacionElseIf(){
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
    }

    public static void explicacionTernaria(){
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
    }

    public static void explicacionWhile(){
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
    }
    public static void string(){
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

    }

    public static void aritmeticos(){
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
    }

    public static void relacionales(){
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
      }

      public static void logicos(){
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
      }
      public static void asignacion(){
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
      }
      public static void incrementoDecremento(){
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
      }
      public static void condicionalSwitch(){
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
      }
      public static void doWile(){
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
      }
      public static void definicionFor(){
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
      }
}
