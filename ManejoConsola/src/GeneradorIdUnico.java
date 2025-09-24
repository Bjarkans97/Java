import java.util.Random;
import java.util.Scanner;

public class GeneradorIdUnico {
    public static void main(String[] args) {
        var rand = new Random();
        var cons = new Scanner(System.in);

        System.out.print("Ingrese nombre: ");
        var nomEmpleado = cons.nextLine();
        System.out.print("Ingrese apellido: ");
        var apellEmpleado = cons.nextLine();
        System.out.print("Ingrese año de nacimiento (YYYY): ");
        var anioEmpleado = cons.nextLine();

        var nombre = nomEmpleado.substring(0, 2).toUpperCase();
        var apellido = apellEmpleado.substring(0, 2).toUpperCase();
        int anio = Integer.parseInt(anioEmpleado.substring(2, 3));
        int num = rand.nextInt(1,10000);

        System.out.println(num);
        System.out.printf("%s%s%d%04d",nombre,apellido,anio,num);
    }
}
