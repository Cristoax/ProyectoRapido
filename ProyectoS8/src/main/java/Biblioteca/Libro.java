package Biblioteca;

public class Libro {

    private String titulo;
    private int id;
    private int anioPublicacion;
    private String autor;

    public Libro(){}

    public Libro(String titulo, int anioPublicacion, String autor) {
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
        this.id = id;
    }
}
