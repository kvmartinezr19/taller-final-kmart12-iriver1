import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opc = scanner.nextInt();

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

        }while (opc <1 || opc >10);

        switch (opc) {
            case 0:
                System.out.println("opc0 ");
                break;
            case 1:
                System.out.println("opc1 ");
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

        System.out.print("Presiona enter para continuar...");
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


    }


}
