public class DoWhile {
    public static void main(String[] args) {
        System.out.println("*** Ciclo Do While ***");

        //El cliclo Do while primero ejecuta el bloque de codigo y luego verifica la condicion
        //Esto garantiza que siempre se ejecute por lo menos una vez el codigo al interior del ciclo

        var cont = 1;

        do {
            System.out.println("Número: "+cont);
            cont = ++cont;
        }while (cont<=5);
    }
}
