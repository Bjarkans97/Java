public class SubCadenas {
    public static void main(String[] args) {
        //Subcadenas
        //Es la obtencion de una parte de una cadena original

        var cadena1 = "Hola Mundo";
        System.out.println("Cadena1 = "+cadena1);

        //Subcadena
        var subCadenaInicio = cadena1.substring(0,4);
        var subCadenaFin1 = cadena1.substring(5);
        var subCadenaFin2 = cadena1.substring(5,10);
        System.out.println("Subcadena = "+subCadenaInicio);
        System.out.println("Subcadena = "+subCadenaFin1);
        System.out.println("Subcadena = "+subCadenaFin2);

        //Buscar en subcadenas
        //IndexOf = Devuelve el indice de la primera aparicion de la subcadena

        //Subcadena de "Hola"
        var indice1 = cadena1.indexOf("Hola");
        System.out.println("Indice1 = "+indice1);

        //lastIndexOf = Devuelve el indice de la ultima aparicion de la subcadena
        var indice2 = cadena1.lastIndexOf("Mundo");
        System.out.println("indice2 = "+indice2);

        //Reemplazar subcadenas
        var cadena = "Hola Mundo";
        System.out.println("Cadena Original = "+cadena);

        //Reemplaza "Mundo" por "a todos"
        var nuevaCadena = cadena.replace("Mundo", "a todos");
        System.out.println("La cadena modificada = "+nuevaCadena);

        //Reemplaza "Hola" por "Saludos"
        var nuevaCadena2 = cadena.replace("Hola", "Saludos");
        System.out.println("La cadena modificada = "+nuevaCadena2);
    }
}
