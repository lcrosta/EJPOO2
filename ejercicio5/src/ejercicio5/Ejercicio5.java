package ejercicio5;

import java.util.Scanner;
import java.util.TreeSet;


public class Ejercicio5 {

    public static void main(String[] args) {
       
        TreeSet<String> paises = new TreeSet();
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        String resp;
        
        do {
            System.out.println("Ingrese un país");
            paises.add(scan.next());
            
            System.out.println("¿Desea agregar otro país? s/n ");
            
            resp = scan.next();
            
            if (!resp.equals("s") && !resp.equals("n")) {
                System.out.println("Por favor ingrese una opción válida");
                do {
                    System.out.println("¿Desea agregar otro alumno? s/n");
                    resp = scan.next();
                } while (!resp.equals("s") && !resp.equals("n"));
            }
            
        } while (resp.equals("s"));
        
        System.out.println("Países ingresados de manera alfabetica");
        for (String paise : paises) {
            System.out.println(paise);
        }
        
        
        
    }
    
}
