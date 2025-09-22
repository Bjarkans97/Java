public class EjercicioVariable {
    public static void main(String[] args) {
        //Detalle del libro
        String tituloLibro = "El señor de los anillos - La comunidad del anillo";
        int anioPublicacion = 1954;
        boolean libroDisponible = true;
        double precio = 500.50;

        //Impresión de los datos
        System.out.println("El libro: "+tituloLibro+", del año "+anioPublicacion+". Tiene un valor de $"+precio);
        System.out.println(libroDisponible);
    }
}
