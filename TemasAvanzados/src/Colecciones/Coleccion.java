package Colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Coleccion {
    public static void main(String[] args) {

        //List miLista = new ArrayList();
        List<String> miLista = new ArrayList<>();//Genericos
        miLista.add("Benjamin");
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");

        //for (Object dia : miLista){
        //    System.out.println("dia = " + dia);
        //}

        for (String dia : miLista){
            System.out.println("dia = " + dia);
        }

        //Funciones Lambda (Funcion anonima de un codigo muy compacto)
        miLista.forEach(elemento -> {
            System.out.println("Elemento: "+elemento);
        });

        //Metodo de referencia
        miLista.forEach(System.out::println);

        List<String> nombres = Arrays.asList("Benjamin", "Pedro", "Rodrigo");

        nombres.forEach(System.out::println);
    }
}
