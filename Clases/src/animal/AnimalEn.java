package animal;

public class AnimalEn {
    protected void comer(){ //No es publico para todas las clases, pero si para las clases hijas o de este archivo
        System.out.println("Come muchas veces al dia");
    }

    public void dormir(){
        System.out.println("Duermo muchas veces");
    }
}


class PerroEn extends AnimalEn{ //Hereda los atributos de animal

    public void hacerSonido(){
        System.out.println("Puedo ladrar");
    }

    @Override //Se pone para indicar que esta sobreescribiendo el metodo padre, ahora desde la clase PerroEn, al momento de llamar dormir() realiza lo que esta en este metodo
    public void dormir(){
        System.out.println("Duermo 5 veces al dia");
        super.dormir();
    }
}

class pruebaAnimal{
    public static void main(String[] args) {
        System.out.println("*** Ejemplos de herencias ***");

        System.out.println("Clase padre, soy un animal");

        var animal = new AnimalEn();
        animal.comer();
        animal.dormir();

        var perro = new PerroEn(); //Accede a los metodos dentro de la clase padre
        perro.hacerSonido();
        perro.comer();
        perro.dormir();
    }
}