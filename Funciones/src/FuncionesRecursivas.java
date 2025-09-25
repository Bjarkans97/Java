public class FuncionesRecursivas {

    //Imprimir los valores del 1 al 5 con una funcion recursiva
    //Lo que hace esto es poner en pausa la impresion del valor si es mayor a 1 ya que va a consultarse a si misma con el valor num - 1
    public static void func (int num){
        //Caso base
        if (num ==  1){
            System.out.print(num + " ");
        }else {
            func(num - 1);
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
        func(9);
    }
}
