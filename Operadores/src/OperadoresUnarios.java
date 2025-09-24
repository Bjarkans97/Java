public class OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println("**** Operadores Unarios ****");

        double a = 5, b= -3, resultado = 0;
        boolean c = true;

        //Operador positivo (No modifica el valor)
        resultado = +a;
        System.out.println("Positivo: "+resultado); //imprime '5'

        //Operador negativo (Invierte el valor de la variable)
        resultado = -b;
        System.out.println("Negativo: "+resultado); //imprime '3'

        //Operador incremento/decremento

        //Pre-Incremento
        a = 3;
        resultado = ++a; //primero incrementa el valor del resultado
        System.out.println("Resultado a++: "+resultado); //imprime '4'
        System.out.println("Valor de a: "+a); //imprime '4'

        //Post-Incremento
        a = 3;
        resultado = a++; //Primero usa el valor y luego lo incrementa
        System.out.println("Resultado a++: "+resultado); //imprime '3'
        System.out.println("Valor de a: "+a); //imprime '4'

        //Pre-Decremento
        b = 2;
        resultado = --b; //primero decrementa el valor del resultado
        System.out.println("Resultado b--: "+resultado); //imprime '1'
        System.out.println("Valor de b: "+b); //imprime '1'

        //Post-Incremento
        b = 2;
        resultado = b--; //Primero usa el valor y luego lo incrementa
        System.out.println("Resultado b--: "+resultado); //imprime '2'
        System.out.println("Valor de b: "+b); //imprime '1'
    }
}
