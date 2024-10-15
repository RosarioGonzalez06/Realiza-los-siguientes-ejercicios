//Realiza un programa que pida 3 números por teclado y nos diga cuál es el máximo. Si el usuario introduce un dato erróneo (algo que no sea un número entero) el programa debe indicarlo y debe pedir de nuevo el número.

import java.util.Scanner;
import comparaciones1.comparacion2;

public class App {

public static Scanner scanner = new Scanner(System.in);

public static int leerNumero(String mensaje) {
    System.out.print(mensaje);
    return Integer.parseInt(scanner.nextLine());
}

public static void main(String [] args) throws Exception {
    try {
        int a = leerNumero("Introduzca número: ");
        int b = leerNumero("Introduzca  número: ");
        int c = leerNumero("Introduzca  número: ");
        System.out.println("El número más grande de entre los 3 es: "+ comparacion2.masgrande(a,b,c));
    } catch (Exception e){
        System.out.println("Ocurrió un error, hazlo de nuevo");
    }
}
}