public class ComparacionDeCadenas {
    public static void main(String[] args) {
       //Comparacion de cadenas (pool de cadenas (Solo se almacena en un espacio de la memoria al ser el mismo contenido))
       var cadena1 = "Java";
       var cadena2 = "Java";

       var cadena3 = new String("Java"); //Este se almacena en un nuevo espacio de la memoria

       //Comparacion de cadenas (==) comparan la referencia (Al ser el mismo espacio de la memoria el resultado será 'true')
        System.out.print("cadena1 es igual en referencia a la cadena2: ");
        System.out.println(cadena1==cadena2);

        //Compara referencia de cadena1 y cadena3 (Al ser el diferente espacio de la memoria el resultado será 'false')
        System.out.print("cadena1 es igual en referencia a la cadena3: ");
        System.out.println(cadena1==cadena3);

        //Compara los contenidos de la cadena
        System.out.print("cadena1 es igual en referencia a la cadena3: ");
        System.out.println(cadena1.equals(cadena3));
    }
}
