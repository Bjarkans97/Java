import java.util.Scanner;

public class ManejoConsola {
    public static void main(String[] args) {
        //Introduccion de datos via consola
        var consola = new Scanner(System.in);
        System.out.println("Escribe tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("Nombre: "+nombre);
    }
}
