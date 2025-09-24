public class OperadoresAritmeticos {
    public static void main(String[] args) {
        System.out.println("**** Operadores aritmeticos ****");

        double a = 5, b= 3, resultado = 0;

        //Suma
        resultado = a+b;
        System.out.println("Suma: "+resultado);

        //Resta
        resultado = a-b;
        System.out.println("Resta: "+resultado);

        //Multiplicacion
        resultado = a*b;
        System.out.println("Multiplicacion: "+resultado);

        //Division
        resultado = a/b;
        System.out.println("Division: "+resultado);

        //Residuo
        resultado = a%b;
        System.out.println("Residuo Divisor: "+resultado);
    }
}
