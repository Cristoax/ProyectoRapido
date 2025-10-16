package Biblioteca;

public class Autor {

    private String nombre;
    private int id;
    private String nacionalidad;
    private int fechaNacimiento;

    public Autor(){}
    
    public Autor(String nombre, int id, String nacionalidad, int fechaNacimiento) {
        this.nombre = nombre;
        this.id = id;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
    }
}
