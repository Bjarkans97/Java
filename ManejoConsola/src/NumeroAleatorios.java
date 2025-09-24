import java.util.Random;

public class NumeroAleatorios {
    public static void main(String[] args) {
        var aleatorio = new Random();

        //Generar un numero entre 0 y 9
        var numAleatorio = aleatorio.nextInt(10);
        System.out.println("El numero es: "+numAleatorio);
    }
}
