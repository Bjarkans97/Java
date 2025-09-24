public class OperadoresAsignacion {
    public static void main(String[] args) {
        System.out.println("**** Operadores Asignacion ****");

        //Asignación
        var miNumero = 10; //Para los var se debe de inicializar el valor
        int miNumero2; //Cuando el tipo de la variable esta definido, no es necesario inicializar el valor
        miNumero2 = 15;

        //Asignador compuesto
        // += Suma
        // -= Resta
        // *= Multiplicacion
        // /= Division
        // %= Resto

        miNumero += 5; // miNumero = miNumero + 5;
        System.out.println("Asignador compuesto: "+miNumero);

        //Asignacion de variables multiples

        int a = 10, b = 5, c = 1; //Todas las variables deben de ser del mismo tipo y deben de ser inicializadas
    }
}
