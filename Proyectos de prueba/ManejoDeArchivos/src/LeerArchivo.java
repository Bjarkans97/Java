import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LeerArchivo {
    public static void main(String[] args) {
        //Lectura de archivo
        var nombreArchivo = "mi_archivo.txt";
        
        var archivo = new File(nombreArchivo);
        
        try {
            System.out.println("Contenido del archivo: ");
            
            var entrada = new BufferedReader(new FileReader(archivo));
            var linea = entrada.readLine();
            while (linea != null){
                System.out.println(linea);
                //Antes de terminar el ciclo nos movemos a la siguiente linea
                linea = entrada.readLine();
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error: "+e);
        }
    }
}
