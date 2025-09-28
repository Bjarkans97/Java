package ClasesAbstractas;

public class claseAbstracta {
    public static void main(String[] args) {
        System.out.println("**** Clases abstractas ****");

        //FiguraGeometricaEN figura = new FiguraGeometricaEN();  No se puede instanciar

        FiguraGeometricaEN figura = new RectanguloEN();

        figura.dibujar();

    }
}


//Clase Abstracta
abstract class FiguraGeometricaEN{//No se puede instanciar
    public abstract void dibujar();

}


class RectanguloEN extends FiguraGeometricaEN{
    @Override
    public void dibujar() {
        System.out.println("Se dibuja un rectangulo");
    }
}