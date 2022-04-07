package ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Ejercicio1 {

    public static void main(String[] args) {
        
        ArrayList<String> razas = new ArrayList();
        
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        String resp;
        
        do {
            System.out.println("Por favor, ingrese la raza del perro");
            razas.add(scan.next());
            System.out.println("¿Desea agregar otra raza? s/n");
            resp = scan.next();
            
            
            if (!resp.equals("s") && !resp.equals("n")) {
                
                System.out.println("Por favor ingrese una opción válida");
                do {
                    System.out.println("¿Desea agregar otra raza? s/n");
                    resp = scan.next();
                } while (!resp.equals("s") && !resp.equals("n"));
            }
        } while (resp.equals("s"));
        
        System.out.println("Las razas ingresadas son:");
        for (String aux : razas) {
            System.out.println(aux);
        }
        
        
    }
    
}
