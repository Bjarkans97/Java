public class Cadenas {
    public static void main(String[] args) {
        System.out.println("*** Manejo de cadenas ***");

        var cadena1 = "Hola";
        System.out.println("Cadena1 = "+cadena1);

        var cadena2 = new String("Hola2"); //Se usa para cualquier otro tipo de objeto, no necesario con 'Strings'}
        System.out.println("Cadena2 = "+cadena2);

        var cadena3 = cadena1+" "+cadena2;
        System.out.println("Cadena3 = "+cadena3);

        //Cadena de multiples lineas
        var cadena4= """
                Esta cadena
                es un
                Text Block
                """;

        System.out.println("Cadena4 = "+cadena4);
    }
}
