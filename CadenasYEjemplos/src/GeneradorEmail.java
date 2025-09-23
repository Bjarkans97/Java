public class GeneradorEmail {
    public static void main(String[] args) {
        System.out.println("*** Generador de Email ***");
        var nombre = "Benjamin Ramirez Silva";
        var empresa = "Global Mentoring";
        var dominio = ".com";

        //Manejo de datos
        var nomCorto = nombre.substring(0,1)
                +nombre.substring(nombre.indexOf(" "), nombre.lastIndexOf(" "))
                +nombre.substring(nombre.lastIndexOf(" "));
        var nomCortoNormalizado = nomCorto.replace(" ", ".").toLowerCase();
        var usuNormalizado = nombre.replace(" ", ".").toLowerCase();
        var empresaNormalizada = empresa.replace(" ", "").toLowerCase();
        var dominioNormalizado = empresaNormalizada+dominio;
        var email = usuNormalizado+"@"+dominioNormalizado;
        var emailCool = nomCortoNormalizado+"@"+dominioNormalizado;

        System.out.println("Nombre usuario: "+nombre);
        System.out.println("Nombre usuario normalizado: "+usuNormalizado);
        System.out.println("");
        System.out.println("Nombre empresa: "+empresa);
        System.out.println("Extension de dominio: "+dominio);
        System.out.println("Dominio de email normalizado: "+dominioNormalizado);
        System.out.println("");
        System.out.println("Email final generado: "+email);
        System.out.println("Email cool final generado: "+emailCool);
    }
}
