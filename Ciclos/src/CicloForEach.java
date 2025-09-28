public class CicloForEach {
    public static void main(String[] args) {
        System.out.println("*** Ciclo For Each ***");

        int edades[] = {1, 2, 3, 4, 5};

        //Por defecto, no podemos capturar el indice en el ciclo For Each, solo captura los valores del arreglo
        //for (tipo nombreVariable : ColeccionOArray) {code block to be executed for each element}
        for (int edad : edades ){
            System.out.println("Edad: "+edad);
        }
    }
}
