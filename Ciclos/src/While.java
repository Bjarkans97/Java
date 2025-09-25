public class While {
    public static void main(String[] args) {
        System.out.println("*** Ciclo While ***");

        var contador = 1;
        while (contador <= 5){
            System.out.println("Número: "+contador);
            contador = ++contador;
        }
    }
}
