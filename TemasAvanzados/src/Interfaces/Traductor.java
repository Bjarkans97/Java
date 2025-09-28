package Interfaces;

public interface Traductor {
    //public y abstract
    void traducir();

    //Metodos con implementacion por default
    default void iniciarTraductor(){
        System.out.println("Iniciando traductor...");
    }
}

class Ingles implements Traductor{

    @Override
    public void traducir() {
        System.out.println("Traduzco al ingles..");
    }
}

class Frances implements Traductor{
    @Override
    public void traducir() {
        System.out.println("Traduzco al frances..");
    }

    @Override
    public void iniciarTraductor() {
        System.out.println("Iniciar traductor al frances");
    }
}

class prueba{
    public static void main(String[] args) {
        Traductor traduce = new Ingles();
        traduce.iniciarTraductor();
        traduce.traducir();

        Traductor frances = new Frances();
        frances.iniciarTraductor();
        frances.traducir();
    }
}
