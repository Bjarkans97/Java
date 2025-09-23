public class CaracterEspecial {
    public static void main(String[] args) {
        //Caracteres especiales
        // \n - imprime con un salto de linea
        var cadena1 = "Hola\n Mundo";
        System.out.println(cadena1);

        // \t - Agrega una tabulacion
        var cadena2 = "\tHola\tMundo";
        System.out.println(cadena2);

        // \' - Es una comilla simple que no genere error al imprimir
        var cadena3 = "\'Hola Mundo\'";
        System.out.println(cadena3);

        // \" - Es una comilla doble que no genere error al imprimir
        var cadena4 = "\"Hola Mundo\"";
        System.out.println(cadena4);

        // \\ - Caracter de barra invertida
        var cadena5 = "Hola \\ Mundo";
        System.out.println(cadena5);
    }
}
