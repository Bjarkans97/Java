import java.util.Scanner;

public class TiposDeDatos {
    public static void main(String[] args) {
        //Leer distintos tipos de datos
        //En esta vista solo obtengo cadenas, no del tipo int u otro

        var consola = new Scanner(System.in);

        //Captura de datos enteros
        System.out.println("Ingresa tu edad: ");
        var edad = consola.nextInt();
        System.out.println("Edad: "+edad);

        //Captura de datos double
        System.out.println("Ingresa tu altura: ");
        var altura = consola.nextDouble();
        System.out.println("altura: "+altura);

        //Captura de datos String
        System.out.println("Ingresa tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("nombre: "+nombre);
    }
}
