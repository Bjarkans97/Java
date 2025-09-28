package aritmetica.pruebaAritmetica;

import aritmetica.AritmeticaEn;

public class pruebaAritmetica { //Llamado desde un paquete distinto al que se definieron las funciones y clase
    public static void main(String[] args) {
        var aritme = new AritmeticaEn();
        aritme.setOperando1(5);
        aritme.setOperando2(2);

        aritme.sumar();
        aritme.Restar();
        aritme.Multiplicar();
        aritme.Dividir();
        aritme.Resto();


        var aritmet = new AritmeticaEn(6 ,3); //Llamado de constructor con parametros definidos

        aritmet.sumar();
        aritmet.Restar();
        aritmet.Multiplicar();
        aritmet.Dividir();
        aritmet.Resto();
    }
}
