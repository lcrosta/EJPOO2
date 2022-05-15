package ejercicio4.entidades;

public class Pelicula {
    
    private String nom;
    private String dir;
    private Double durh;

    public Pelicula(String nom, String dir, int durh) {
        this.nom = nom;
        this.dir = dir;
        this.durh = durh;
    }

    public Pelicula() {
    }

    public String getNom() {
        return nom;
    }

    public String getDir() {
        return dir;
    }

    public Double getDurh() {
        return durh;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public void setDurh(Double durh) {
        this.durh = durh;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "Nombre=" + nom + ", Director=" + dir + ", Duración=" + durh + " horas" + '}';
    }
    
    
    
    
}
