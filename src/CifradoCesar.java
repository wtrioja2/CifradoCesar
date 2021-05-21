
import java.io.IOException;
import java.util.Scanner;
/**
 * 
 * @author Eduardo Jimeno Pablo
 * @version 3 con refactorización y comentarios para JavaDoc
 */
public class CifradoCesar {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String texto;
        int posiciones;
        char opcion;
        //Introducir un texto
        do {
            System.out.print("Introduce un texto: ");
            texto = sc.nextLine();
        } while (texto.isEmpty());
        //Introducir el valor del desplazamiento
        do {
            System.out.print("Introduce el cÃ³digo: ");
            posiciones = sc.nextInt();
        } while (posiciones < 1);
        //Introducir la operaciÃ³n a realizar: cifrar o descifrar
        do {
            sc.nextLine();
            System.out.print("(C) cifrar o (D) descifrar?: ");
            opcion = (char) System.in.read();
        } while (Character.toUpperCase(opcion) != 'C' && Character.toUpperCase(opcion) != 'D');
        if (Character.toUpperCase(opcion) == 'C') {
            System.out.println("Texto cifrado: " + Cifrado.cifradoCesar(texto, posiciones));
        } else {
            System.out.println("Texto descifrado: " + Descifrado.descifradoCesar(texto, posiciones));
        }
    }

} //Fin cifrado Cesar
