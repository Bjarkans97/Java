public class Funcion {

    static void saludarDesdeJava(String mens){
        System.out.println("Estoy saludando desde una funcion: "+mens);
    }

    public static  int sumar (int i, int j){
        var res = i + j;
        return res;
    }

    public static boolean esPar(int i){
        var res = i % 2;
        return res == 0 ? true : false;
    }
    public static void main(String[] args) {
        //saludarDesdeJava("Benjamin");

        //var resultado = sumar(5, 43);
        //System.out.println("El resultado de la suma es: "+resultado);

        var res = esPar(5);
        System.out.println("El valor es par?: "+res);
    }
}
