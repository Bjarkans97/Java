import java.util.Scanner;

public class MenuInteractivo {
    public static void main(String[] args) {
        var cons = new Scanner(System.in);
        var salir = false;

        while (!salir){
            System.out.print("""
                    *** Sistema de administracion de cuentas ***
                    
                    Menú:
                    1. Crear cuenta
                    2. Eliminar cuenta
                    3. Salir
                    
                    Escoje una opción: 
                    """);

            var opcion = cons.nextInt();

            //Evalua opciones
            switch (opcion){
                case 1 -> System.out.println("Creando cuenta ...");
                case 2 -> System.out.println("Eliminando cuenta ...");
                case 3 -> {
                    System.out.println("Saliendo del sistema de cuentas ...");
                    salir = true;
                }
                default -> System.out.println("Opción invalida");
            }
        }
    }
}
