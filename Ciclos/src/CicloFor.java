public class CicloFor {
    public static void main(String[] args) {
        System.out.println("*** Ciclo For ***");

        //Sintaxis for (inicialización; condición; actualización) { // código a ejecutar }

        for (int cont = 1; cont<=10;cont++){
            System.out.println("Hola, este es el ciclo N"+cont);
        }

        //Números pares
        for (int cont = 1; cont<=100;cont++){
            if (cont%2 == 0){
                System.out.println(cont);
            }
        }
    }
}
