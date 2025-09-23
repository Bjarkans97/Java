public class IndiceEnCadenas {
    public static void main(String[] args) {
        System.out.println("*** Indices en cadenas ***");

        //Manejo de indices en una cadena
        var cadena = "Hola mundo";

        //Recupero primer caracter
        char primerCaracter = cadena.charAt(0); //el indice inicia con el valor 0
        System.out.println("El caracter seleccionado es = " +primerCaracter);

        //Recupero el ultimo caracter
        char ultimoCaracter = cadena.charAt(9); //el indice inicia con el valor 0
        System.out.println("El caracter seleccionado es = " +ultimoCaracter);

        //Recupero letra m
        char letraCaracter = cadena.charAt(5); //el indice inicia con el valor 0
        System.out.println("El caracter seleccionado es = " +letraCaracter);
    }
}
