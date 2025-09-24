public class FormateoDeCadenas {
    public static void main(String[] args) {
        System.out.println("**** Formateo de cadenas ****");

        var nombre = "Benjamin";
        var edad = 35;
        var salario = 21000.233;

        //Formateo de strings
        // '%s' = un valor string
        // '%d' = un valor entero
        // '%f' = un valor flotante (si se hace %.2f, hace referencia a 2 decimales posterior al punto)
        var mensaje = String.format("Nombre: %s, Edad: %d, Salario: $%.2f", nombre, edad, salario);
        System.out.println(mensaje);

        //Metodo printf (Sirve para poder imprimir realizando el formateo directo
        System.out.printf("Nombre: %s, Edad: %d, Salario: $%.2f%n", nombre, edad, salario);

        var numEmpleado = 12;
        //Formateo de textblock
        mensaje = """
                %nDetalle Persona:\s
                ------------------------
                \tNombre: %s
                \tNumero de empleado: %04d
                \tEdad: %d
                \tSalario: %.2f
                """.formatted(nombre,numEmpleado,edad,salario);

        System.out.println(mensaje);
    }
}
