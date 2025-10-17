import Biblioteca.Autor;
import Biblioteca.Libro;
import Biblioteca.Categoria;

import jakarta.persistence.*;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("uam");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Autor autor1 = new Autor("Gabriel García Márquez", 0, "Colombiano", 1927);
        Autor autor2 = new Autor("J. R. R. Tolkien", 0, "Británico", 1892);

        Categoria catRealismo = new Categoria("Realismo Mágico");
        Categoria catFantasia = new Categoria("Fantasía Épica");

        Libro libro1 = new Libro("Cien años de soledad", 1967, autor1);
        libro1.setCategorias(List.of(catRealismo));

        Libro libro2 = new Libro("El Hobbit", 1937, autor2);
        libro2.setCategorias(List.of(catFantasia));

        Libro libro3 = new Libro("El señor de los anillos", 1954, autor2);
        libro3.setCategorias(List.of(catFantasia));

        em.persist(catRealismo);
        em.persist(catFantasia);
        em.persist(autor1);
        em.persist(autor2);
        em.persist(libro1);
        em.persist(libro2);
        em.persist(libro3);

        em.getTransaction().commit();

        System.out.println("📚--- LISTA DE LIBROS EN LA BIBLIOTECA ---📚");
        List<Libro> estante = em.createQuery("SELECT l FROM Libro l", Libro.class).getResultList();

        for (Libro libro : estante) {
            String nombresCategorias = libro.getCategorias().stream()
                    .map(Categoria::getNombre)
                    .reduce("", (a, b) -> a + b + " ");
            System.out.println("Título: " + libro.getTitulo() +
                    " | Autor: " + libro.getAutor().getNombre() +
                    " | Categorías: " + nombresCategorias.trim());
        }

        em.close();
        emf.close();
    }
}

//