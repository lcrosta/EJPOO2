package ejercicio3;

import ejercicio3.entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        String resp;
        ArrayList<Alumno> alumnos = new ArrayList();
        
        Alumno a = new Alumno();  
        
        do {

            System.out.println("Ingrese nombre");
            a.setNombre(scan.next());
            a.notasAlumnos();
            alumnos.add(a);

            
            System.out.println("¿Desea ingresar otro alumno? s/n");
            resp = scan.next();
            
            if (!resp.equals("s") && !resp.equals("n")) {
                System.out.println("Por favor ingrese una opción válida");
                do {
                    System.out.println("¿Desea agregar otro alumno? s/n");
                    resp = scan.next();
                } while (!resp.equals("s") && !resp.equals("n"));
            }
            
        } while ("s".equals(resp));

        System.out.println("Ingrese el nombre de un alumno para calcular su promedio");
        String resp2 = scan.next();
        
        for (Alumno aux : alumnos) {
            if (aux.getNombre().contains(resp2)) {
                aux.promedioFinal();
            }
        }
        
    }

}
