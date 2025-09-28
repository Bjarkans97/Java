package JavaBeans;

import java.io.Serializable;

public class JavaBeans {
    //Debe tener un constructor vacio (Si puede tener opcionalmente mas contructores)
    //Debe aplicar encapsulamiento
    //Debe implementar interface serializable. Permite enviar los objetos por la red o disco duro

    public static void main(String[] args) {
        PersonaEN persona = new PersonaEN();

        persona.setNombre("Benjamin");
        persona.setApellidoP("Ramírez");

        System.out.println("PersonaEN = " + persona);
        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Apellido: "+persona.getApellidoP());
    }
}

class PersonaEN implements Serializable {
    private String nombre;
    private String apellidoP;

    public PersonaEN() {
    }

    public String getApellidoP() {
        return this.apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "PersonaEN{" +
                "nombre='" + nombre + '\'' +
                ", apellidoP='" + apellidoP + '\'' +
                '}';
    }
}
