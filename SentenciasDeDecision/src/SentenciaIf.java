public class SentenciaIf {
    public static void main(String[] args) {
        System.out.println("*** Sentencia If ***");

        var edad = 10;

        if (edad>=18){
            System.out.println("Es mayor de edad");
        } else if (edad >= 13 && edad <18) {
            System.out.println("Es adolecente");
        } else {
            System.out.println("Es menor de edad");
        }
    }
}
