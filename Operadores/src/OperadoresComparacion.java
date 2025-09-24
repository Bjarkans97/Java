public class OperadoresComparacion {
    public static void main(String[] args) {
        System.out.println("**** Operadores Comparacion ****");

        int a = 3, b = 2;
        System.out.println("a = 3, b = 2");

        // Igualdad (==)
        var resultado = a == b;
        System.out.println("Igualdad (a == b): "+resultado);

        //Distinto (!=)
         resultado = a != b;
        System.out.println("Distinto (a != b): "+resultado);

        //Mayor que (>)
        resultado = a > b;
        System.out.println("Mayor que (a > b): "+resultado);

        //Mayor o igual (>=)
        resultado = a >= b;
        System.out.println("Mayor o igual (a >= b): "+resultado);

        //Menor que (<)
        resultado = a < b;
        System.out.println("Menor que (a < b): "+resultado);

        //Menor o igual (<=)
        resultado = a <= b;
        System.out.println("Menor o igual (a <= b): "+resultado);
    }
}
