import java.net.Inet4Address;
import java.util.Scanner;

public class ConversionDatos {
    public static void main(String[] args) {
        //Conversion de datos capturados

        var consola = new Scanner(System.in);

        //Captura de datos enteros
        System.out.println("Ingresa tu edad: ");
        var age = consola.nextLine();
        int edad = Integer.parseInt(age);
        System.out.println("Edad: "+edad);

        //Captura de datos double
        System.out.println("Ingresa tu altura: ");
        var heig = consola.nextLine();
        double altura = Double.parseDouble(heig);
        System.out.println("altura: "+altura);

        //Captura de datos float
        System.out.println("Ingresa tu sueldo: ");
        var salary = consola.nextLine();
        float sueldo = Float.parseFloat(salary);
        System.out.println("sueldo: "+sueldo);
    }
}
