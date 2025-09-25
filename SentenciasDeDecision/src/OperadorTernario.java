public class OperadorTernario {
    public static void main(String[] args) {
        System.out.println("*** Operadores ternarios ***");

        //Sintaxis
        //Condicion ? exp1 : exp2

        //Determinar si un numero es par o no
        var numero = 4;
        var resultado = (numero  % 2 == 0) ? "Par" : "Impar";

        System.out.println("\n\tel número "+numero+" es "+resultado);

        //Carcular si es mayor de edad
        var edad = 17;
        var mensaje = (edad >= 18) ? "Eres mayor de edad" : "Eres menor de edad";
        System.out.println("\n\tTienes "+edad+" años, "+mensaje);

        //Valor positivo, negativo o cero (Operador ternario anidado)
        numero = 0;
        resultado = (numero > 0) ? "Positivo" : (numero < 0) ? "Negativo" : "Cero";
        System.out.println("\n\t El numero "+numero+" es "+resultado);
    }
}
