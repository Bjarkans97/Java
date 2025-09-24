import java.util.Scanner;

public class SistemaEmpleado {
    public static void main(String[] args) {
        System.out.println("*** Sistema de empleados ***");

        var consola = new Scanner(System.in);

        //Captura de datos
        System.out.print("Ingrese el nombre del empleado: ");
        var nomEmpleado = consola.nextLine();

        System.out.print("Ingrese edad del empleado: ");
        int edadEmpleado = Integer.parseInt(consola.nextLine());

        System.out.print("Ingrese el sueldo del empleado: ");
        double sueldoEmpleado = Double.parseDouble(consola.nextLine());

        System.out.print("¿Es jefe de departamento?(true/false): ");
        boolean jefeEmpleado = Boolean.parseBoolean(consola.nextLine());


        System.out.println("\nDatos del empleado: ");
        System.out.println("\tNombre del empleado: "+nomEmpleado);
        System.out.println("\tEdad del empleado: "+edadEmpleado);
        //System.out.println("\tSalario del empleado: "+sueldoEmpleado);
        System.out.printf("\tSalario del empleado: $%.2f%n",sueldoEmpleado); //el printf aplica el formato que se le esta dando en el "2f", y se debe de seguir con una ","
        System.out.println("\tEs jefe de departamento: "+jefeEmpleado);

    }
}

