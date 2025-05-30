package test;

import modelo.Persona;

public class TestPersona {

    public static void main(String[] args) {
        
        // Crear persona con constructor parametrizado
        Persona p1 = new Persona(12345678, "Juan");
        System.out.println("Persona creada: " + p1);

        // Test getters
        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("DNI: " + p1.getDni());

        // Test setters con valores válidos
        p1.setNombre("Carlos");
        p1.setDni(87654321);
        System.out.println("Persona modificada: " + p1);

        // Test setters con valores inválidos
        p1.setDni(-100); // debería mostrar mensaje de error
        p1.setNombre(""); // debería mostrar mensaje de error

        // Verificación final
        System.out.println("Estado final: " + p1);
    }
}
