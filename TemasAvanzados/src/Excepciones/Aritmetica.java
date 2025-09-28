package Excepciones;

public class Aritmetica {
    public static int division(int numerador, int denominador){
        if (denominador == 0){
            throw new RuntimeException("El denominador no puede tener valor 0");
        }
        return numerador/denominador;
    }
}
