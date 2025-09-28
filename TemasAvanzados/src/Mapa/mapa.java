package Mapa;

import java.util.HashMap;
import java.util.Map;

public class mapa {
    public static void main(String[] args) {
        Map<String, String> mapa = new HashMap<>();
        mapa.put("Nombre", "Benjamin");
        mapa.put("Apellido", "Ramírez");
        mapa.put("Edad", "28");
        mapa.put("Edad", "28");//No permite duplicados

        System.out.println("*** Elementos del mapa ***");
        //System.out.println(mapa);
        mapa.entrySet().forEach(System.out::println);

        System.out.println("*** Nuevos elementos del mapa ***");

        mapa.put("Edad", "30");
        mapa.remove("Apellido");
        mapa.entrySet().forEach(System.out::println);

        System.out.println("\t *** Iterando por separado ***");
        mapa.forEach((llave, valor) -> {
            System.out.println("llave = " + llave + ", valor = "+valor);
        });
    }
}
