public class TiposDeDatos {
    public static void main(String[] args) {
        // Tipos de datos en java
        // Enteros (Valor por default es '0')
        byte tipoByte = 127; //No llega a 128 ya que se toma en cuenta el valor 0
        short tipoShort = 32000; //Tiene un limite de 5 digitos (Hasta 32767)
        int tipoInt = 2147483647; //Puede almacenar hasta 32 bits
        long tipoLong = 987654321012345678L; //Puede almacenar hasta 64 bits

        //Punto Flotante (Valor por default es '0.0')
        float tipoFloat = 3.14F; //'F' Para indicar que es de tipo flotante, hasta 32 bits
        double tipoDouble = 2.134; //Hasta 64 bits

        //Caracter (Valor por default es '\u0000')
        char tipoChar = 'S'; //Cualquier caracter del juego unicode

        //Booleano (Valor por default es 'false')
        boolean tipoBoolean = true; //Se le puede asignar true o false

        //Object (Valor por default es 'null')
        String tipoString = "Hola";

        //Var
        //Se puede asignar cualquier valor, pero debe de ser inicializado con su valor. desde la version 10 de jdk
        var tipoEntero = 12;
        var tipoCaracter = "Gola";
        var boleano = true;
    }
}
