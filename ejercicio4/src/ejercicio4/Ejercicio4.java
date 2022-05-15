package ejercicio4;

import ejercicio4.entidades.Pelicula;
import ejercicio4.utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        ArrayList<Pelicula> movies = new ArrayList();
        Pelicula a;

        String resp;

        do {
            a = new Pelicula();
            System.out.println("Ingrese el nombre de la película");
            a.setNom(scan.next());
            System.out.println("Ingrese el director de la película");
            a.setDir(scan.next());
            System.out.println("Ingrese la duración en horas");
            a.setDurh(scan.nextDouble());

            movies.add(a);

            System.out.println("¿Desea ingresar otra película? s/n");
            resp = scan.next();

            if (!resp.equals("s") && !resp.equals("n")) {
                System.out.println("Por favor ingrese una opción válida");
                do {
                    System.out.println("¿Desea agregar otra película? s/n");
                    resp = scan.next();
                } while (!resp.equals("s") && !resp.equals("n"));
            }

        } while ("s".equals(resp));

        System.out.println("Las películas ingresadas fueron: ");
        
        for (Pelicula aux : movies) {
            System.out.println(aux);
        }
        
        System.out.println("");
        System.out.println("Las películas con una duración MAYOR a 1 hora son: ");
        
        for (Pelicula aux : movies) {
            if (aux.getDurh() > 1) {
                System.out.println(aux);
            }
        }
        
        System.out.println("");
        System.out.println("Las películas ordenadas de acuerdo a mayor duración son: ");
        
        Collections.sort(movies, Comparadores.ordenarPorDuracionDes);
        for (Pelicula movy : movies) {
            System.out.println(movy);
        }
        
        System.out.println("");
        System.out.println("Las películas ordenadas de acuerdo a menor duración son: ");
        
        Collections.sort(movies, Comparadores.ordenarPorDuracionAsc);
        for (Pelicula movy : movies) {
            System.out.println(movy);
        }
        
        System.out.println("");
        System.out.println("Las películas ordenadas de acuerdo a su título alfabeticamente son: ");
        
        Collections.sort(movies, Comparadores.ordenarPorTitulo);
        for (Pelicula movy : movies) {
            System.out.println(movy);
        }
        
        System.out.println("");
        System.out.println("Las películas ordenadas de acuerdo a su director alfabeticamente son: ");
        
        Collections.sort(movies, Comparadores.ordenarPorDirector);
        for (Pelicula movy : movies) {
            System.out.println(movy);
        }
    }

}
