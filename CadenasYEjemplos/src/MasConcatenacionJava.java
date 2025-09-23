public class MasConcatenacionJava {
    public static void main(String[] args) {
        var cadena1 = "Hola";
        var cadena2 = "Mundo";

        //Concatenación mas común
        var cadena3 = cadena1 + " " + cadena2;
        System.out.println("Concatenación mas común = "+cadena3);

        //Metodo Concat
        var cadenaConcat = cadena1.concat(" ").concat("Mundo");
        System.out.println("Metodo Concat = "+cadenaConcat);

        //StringBuilder
        var constructorDeCadenas = new StringBuilder();
        constructorDeCadenas.append(cadena1);
        constructorDeCadenas.append(" ");
        constructorDeCadenas.append(cadena2);

        var resultado = constructorDeCadenas.toString();
        System.out.println("StringBuilder = "+resultado);

        //StringBuffer
        var stringBuffer = new StringBuffer();
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        var result = stringBuffer.toString();
        System.out.println("stringBuffer = "+result);

        //Join
        var resultado2 = String.join(" ", cadena1, cadena2);
        System.out.println("Join = "+resultado2);
    }
}
