package Excepciones;

public class Prueba {
    public static void main(String[] args) {
        try {
            var resultado = Aritmetica.division(5,0);
            System.out.println("resultado = " + resultado);
        } catch (Exception e) {
            System.out.println("Error inesperado: "+e);
        }
    }
}
