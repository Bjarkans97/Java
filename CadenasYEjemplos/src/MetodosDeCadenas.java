public class MetodosDeCadenas {
    public static void main(String[] args) {
        //Metodos de cadenas
        var cadena ="Hola Mundo";

        //Obtener el largo de la cadena
        var longitud = cadena.length();
        System.out.println("La longitud de la cadena es: "+longitud);

        //Reemplazar caracteres
        var cadenaModificada = cadena.replace('o', 'i');
        System.out.println("La cadena modificada es: "+cadenaModificada);

        //Convertir a mayusculas y minusculas
        var cadenaMayus = cadena.toUpperCase();
        var cadenaMinus = cadena.toLowerCase();
        System.out.println("la cadena en mayusculas es: "+cadenaMayus);
        System.out.println("La cadena en minusculas es: "+cadenaMinus);

        //Eliminar espacios al inicio y al final
        var cadena2 = "   hola        juan  ";
        System.out.println("La cadena con espacios es: "+cadena2);
        System.out.println("La cadena sin espacios es: "+cadena2.trim());
    }
}
