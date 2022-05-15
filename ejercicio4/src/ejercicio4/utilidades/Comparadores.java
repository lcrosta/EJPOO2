package ejercicio4.utilidades;

import ejercicio4.entidades.Pelicula;
import java.util.Comparator;

public class Comparadores {
    
    public static Comparator<Pelicula> ordenarPorDuracionDes = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            
            return t1.getDurh().compareTo(t.getDurh());
        }
    };
    
    public static Comparator<Pelicula> ordenarPorDuracionAsc = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            
            return t.getDurh().compareTo(t1.getDurh());
        }
    };
    
    
    public static Comparator<Pelicula> ordenarPorDirector = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
           
            return t.getDir().compareTo(t1.getDir());
        }
    };
    
    public static Comparator<Pelicula> ordenarPorTitulo = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
           
            return t.getNom().compareTo(t1.getNom());
        }
    };
    
             
}
