public class Arerglos {
    public static void main(String[] args) {
        //Arreglos

        //1. Declaramos el arreglo
        int [] enteros;

        //2. Inicializamos el areglo
        enteros = new int[3]; //Esto crea un arreglo con un largo de 3 elementos de tipo entero

        //3. Modificamos los elementos
        enteros[0] = 12;
        enteros[1] = 43;
        enteros[2] = 54;

        //4. Lectura de elementos de un arreglo (iterando el arreglo)
        for (int cont = 0; cont < enteros.length; cont++){
            System.out.println("El valor de enteros["+cont+"] es: "+enteros[cont]);
        }

        System.out.println("\n****** Sintaxis simplificada ******");
        //Sintaxis simplificada de la definicion de un arreglo
        int [] numero = {14, 52, 12, 65, 34, 65, 234};
        for (int cont = 0; cont < numero.length; cont++){
            System.out.println("El valor de numero["+cont+"] es: "+numero[cont]);
        }
    }
}
