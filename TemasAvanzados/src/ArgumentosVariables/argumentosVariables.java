package ArgumentosVariables;

public class argumentosVariables {
    public static void main(String[] args) {
        System.out.println("*** Argumentos variables *** ");
        imprimirNumeros(1,2,3,4,5); //varargs

        variosParametros("Benjamin", 10, 20, 30);

    }

    //para poner mas valores, se deben de poner al inicio y los argumentos variables al final
    private static void variosParametros(String benjamin, int... num) {
        System.out.println("Nombre = " + benjamin);
        imprimirNumeros(num);
    }

    //Se utiliza la sintaxis "int..." se crea un arreglo de manera interna
    //Solo para argumentos de tipo entero
    private static void imprimirNumeros(int... numeros) {
        for (var i = 0; i < numeros.length; i++){
            System.out.print(numeros[i]+ " ");
        }
    }
}
