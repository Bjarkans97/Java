import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeerTodo {
    public static void main(String[] args) {
        var nombreArchivo = "mi_archivo.txt";

        try {
            //Leemos todo el archivo de una vez
            List<String> lineas = Files.readAllLines(Paths.get(nombreArchivo));

            for (String lin : lineas){
                System.out.println(lin);
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error: "+e);
        }
    }
}
