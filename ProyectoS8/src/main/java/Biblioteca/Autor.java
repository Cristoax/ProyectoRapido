package Biblioteca;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "autor")

public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String nombre;
    private int id;
    private String nacionalidad;
    private int fechaNacimiento;

    @OneToMany(mappedBy = "autor")
    private List<Libro> libros;

    public Autor(){}
    
    public Autor(String nombre, int id, String nacionalidad, int fechaNacimiento) {
        this.nombre = nombre;
        this.id = id;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
}
