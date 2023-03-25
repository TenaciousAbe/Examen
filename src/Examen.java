import java.util.ArrayList;
import java.util.List;
public class Examen {
    public static void main(String[] args) {
        List listaAlumnos = new ArrayList();
        listaAlumnos.add("Juan");
        listaAlumnos.add("Leonardo");
        listaAlumnos.add("Patricia");
        listaAlumnos.add("Diego");
        listaAlumnos.add("Elizabeth");
        listaAlumnos.add("Maria");
        listaAlumnos.add("Rosa");
        listaAlumnos.add("Luis");
        listaAlumnos.add("Mariel");
        listaAlumnos.add("Enrique");
        //System.out.println(listaAlumnos);
        for (int i = 0; i < listaAlumnos.size(); i++) {
            System.out.println("Nombre Alumno: " + listaAlumnos.get(i));
        }
    }
}
