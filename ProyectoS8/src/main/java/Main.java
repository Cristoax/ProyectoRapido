package Main;

import Biblioteca.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {



        Autor autor1 = new Autor("Gabriel García Márquez", 1, "Colombiano", 1927);
        Autor autor2 = new Autor("J. R. R. Tolkien", 2, "Británico", 1892);


        Categoria catRealismo = new Categoria("Realismo Mágico");
        Categoria catFantasia = new Categoria("Fantasía Épica");


        Libro libro1 = new Libro("Cien años de soledad", 1967, autor1);
        Libro libro2 = new Libro("El Hobbit", 1937, autor2);
        Libro libro3 = new Libro("El señor de los anillos", 1954, autor2);



        List<Categoria> categoriasLibro1 = new ArrayList<>();
        categoriasLibro1.add(catRealismo);
        libro1.setCategorias(categoriasLibro1);

        List<Categoria> categoriasLibro2 = new ArrayList<>();
        categoriasLibro2.add(catFantasia);
        libro2.setCategorias(categoriasLibro2);

        List<Categoria> categoriasLibro3 = new ArrayList<>();
        categoriasLibro3.add(catFantasia);
        libro3.setCategorias(categoriasLibro3);

        List<Libro> estante = new ArrayList<>();
        estante.add(libro1);
        estante.add(libro2);
        estante.add(libro3);

        System.out.println("📚--- LISTA DE LIBROS EN LA BIBLIOTECA ---📚");

        for (Libro libro : estante) {
            // Se crea un texto con los nombres de todas las categorías del libro
            String nombresCategorias = "";
            for (Categoria cat : libro.getCategorias()) {
                nombresCategorias += cat.getNombre() + " ";
            }

            System.out.println(
                    "Título: " + libro.getTitulo() +
                            " | Autor: " + libro.getAutor().getNombre() +
                            " | Categorías: " + nombresCategorias.trim() // .trim() para quitar el espacio extra al final
            );
        }
    }
}