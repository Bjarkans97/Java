public class OperadoresLogicos {
    public static void main(String[] args) {
        System.out.println("**** Operadores Logicos ****");

        boolean a = true, b = false;
        System.out.println("a = true, b = false");

        //AND (&&) si ambos valores son true, devuelve un true, en caso contrario devuelve un false
        var resultado = a && b ;
        System.out.println("AND (a && b): "+resultado);

        //OR (||) si alguno de los valores es true, devuelve un true, en caso contrario es false
        resultado = a || b ;
        System.out.println("OR (a || b): "+resultado);

        //NOT (!) invierte el valor de la variable
        resultado = !a ;
        System.out.println("OR (!a): "+resultado);
    }
}
