package Sets;

import java.util.Set;
import java.util.TreeSet;

public class Sets { //Estructuras de datos
    public static void main(String[] args) {
        Set<String> conjunto = new TreeSet<>(); //No imprime elementos duplicados
        conjunto.add("Clara");
        conjunto.add("Clara");
        conjunto.add("Victoria");
        conjunto.add("Jennifer");
        conjunto.add("Sofia");

        System.out.println("\nElementos de set");
        conjunto.forEach(System.out::println);

        //Remover elementos
        conjunto.remove("Clara");
        System.out.println("\nNuevos elementos de set");
        conjunto.forEach(System.out::println);

    }
}
