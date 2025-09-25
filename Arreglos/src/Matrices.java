public class Matrices {
    public static void main(String[] args) {
        //Una matriz en java es un arreglo de 2 dimensiones de n columnas x m reglones

        //Definimos una matriz
        int[][] matriz = new int[2][3];

        //Modificamos los elementos
        matriz[0][0] = 10;
        matriz[0][1] = 20;
        matriz[0][2] = 30;
        matriz[1][0] = 40;
        matriz[1][1] = 50;
        matriz[1][2] = 60;

        //Recorrer una matriz en java
        for (int i = 0; i < matriz.length; i++) {          // filas
            for (int j = 0; j < matriz[i].length; j++) {   // columnas
                System.out.println("matriz[" + i + "][" + j + "] = " + matriz[i][j]);
            }
        }

        System.out.println("\n****** Sintaxis simplificada ******");
        //Sintaxis simplificada de la definicion de un arreglo
        int [][] numero = new int[][]{
                {2, 43, 54},
                {213, 432, 23}
        };
        for (int i = 0; i < numero.length; i++) {          // filas
            for (int j = 0; j < numero[i].length; j++) {   // columnas
                System.out.println("numero[" + i + "][" + j + "] = " + numero[i][j]);
            }
        }
    }
}
