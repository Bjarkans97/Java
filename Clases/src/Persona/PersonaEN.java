package Persona;

public class PersonaEN {
    private static int contadorPersona = 0;
    public String nombre;
    public String apellidoP;
    public int idPersona;

    public void  mostrarPersona(){
        System.out.println("nombre = " + nombre);
        System.out.println("apellidoP = " + apellidoP);
        idPersona = ++PersonaEN.contadorPersona;
    }

    public static int getContadorPersona() {
        return contadorPersona;
    }

    public static void setContadorPersona(int contadorPersona) {
        PersonaEN.contadorPersona = contadorPersona;
    }

    public static void main(String[] args) {

    }
}