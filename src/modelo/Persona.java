package modelo;

import interfaces.IPersona;

public class Persona implements IPersona {

    /// Atributos privados (encapsulados)
    private int dni;
    private String nombre;

    /// Constructor con parámetros
    public Persona(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    /// Constructor por defecto
    public Persona() {
        super();
    }

    /// Métodos de acceso (getters y setters) implementando la interfaz

    @Override
    public int getDni() {
        return dni;
    }

    @Override
    public void setDni(int dni) {
        if (dni > 0) {
            this.dni = dni;
        } else {
            System.out.println("El DNI debe ser un número positivo.");
        }
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("El nombre no puede estar vacío.");
        }
    }

    /// Representación en texto del objeto
    @Override
    public String toString() {
        return "Persona [DNI=" + dni + ", nombre=" + nombre + "]";
    }
}
