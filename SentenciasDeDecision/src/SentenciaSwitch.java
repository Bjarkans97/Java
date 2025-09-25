import java.util.Scanner;

public class SentenciaSwitch {
    public static void main(String[] args) {
        System.out.println("*** Sentencia Switch ***");

        var cons = new Scanner(System.in);

        System.out.print("Ingrese el número de dia: ");
        var dia = Integer.parseInt(cons.nextLine());

        //Manera Convencional
        switch (dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Día de la semana erroneo. Valor :"+dia);
                break;
        }

        //Manera simplificada (no es necesario el uso de break)
        switch (dia){
            case 1 -> { //En caso de que uno tenga mas de 2 lineas de codigo se puede escribir de esta forma
                System.out.println("Lunes");
            }
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miércoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Día de la semana erroneo. Valor :"+dia);
        }

        System.out.println("\nEstación del año");
        System.out.print("Ingrese el numero de mes del año a consultar: ");
        var mes = Integer.parseInt(cons.nextLine());

        //En la version tradicional hay que evaluar cada valor por separado
        //Por otro lado, en la version simplificada se puede separar por coma los valores a evaluar
        switch (mes){
            case 1, 2, 12 -> System.out.println("Verano");
            case 3, 4, 5 -> System.out.println("Otoño");
            case 6, 7, 8 -> System.out.println("Invierno");
            case 9, 10, 11 -> System.out.println("Primavera");
            default -> System.out.println("Mes ingresado erroneo. Valor :"+mes);
        }

    }
}
