package interfaces;

import modelo.Persona;

public class ICompararPorNombre implements ComparadorPersona {
    public int comparar(Persona a, Persona b) {
        return a.getNombre().compareToIgnoreCase(b.getNombre());
    }
}
