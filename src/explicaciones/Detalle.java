package explicaciones;
public class Detalle {
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
      public static void swich(){
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
