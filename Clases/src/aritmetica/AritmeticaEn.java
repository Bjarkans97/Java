package aritmetica;

public class AritmeticaEn { 
    private int operando1;
    private int operando2;

    //Encapsulamiento de atributos (Atajo Alt+Insert)
    public int getOperando1() {
        return operando1;
    }

    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }

    public int getOperando2() {
        return operando2;
    }

    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }

    public AritmeticaEn(){//Constructor vacio

    }

    public AritmeticaEn(int operando1, int operando2){//Constructor con parametros definidos
        this.operando1 = operando1; //This hace referencia a las variables de la blase "aritmetica.AritmeticaEn"
        this.operando2 = operando2; //Buena practica utilizarlo para diferenciar mas sencillo el atributo
    }

    public void sumar(){
        int resultado = this.operando1 + this.operando2;
        System.out.println("La suma de los valores es: "+resultado);
    }

    public void Restar(){
        int resultado = this.operando1 - this.operando2;
        System.out.println("La Resta de los valores es: "+resultado);
    }

    public void Multiplicar(){
        int resultado = this.operando1 * this.operando2;
        System.out.println("La multiplicacion de los valores es: "+resultado);
    }

    public void Dividir(){
        int resultado = this.operando1 / this.operando2;
        System.out.println("La division de los valores es: "+resultado);
    }

    public void Resto(){
        int resultado = this.operando1 % this.operando2;
        System.out.println("El resto de la division de los valores es: "+resultado);
    }

    public static void main(String[] args) {

    }
}
