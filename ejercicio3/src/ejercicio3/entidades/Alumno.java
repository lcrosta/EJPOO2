package ejercicio3.entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Alumno {
    
    private String nombre;
    private ArrayList<Integer> notas = new ArrayList();
    private Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public Alumno() {
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }
    
    public void notasAlumnos () {
        System.out.println("Ingrese las 3 notas");
        for (int i = 0; i < 3; i++) {
            notas.add(scan.nextInt());
        }
    }
    
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", notas=" + notas + '}';
    }

    public void promedioFinal () {
        
        double prom = 0;
        
        for (Integer nota : notas) {
            prom = prom + nota;
        }
        
        prom = (prom/3);
        
        System.out.println("El promedio del alumno es: " + prom);
    }
    
    
    
    
}
