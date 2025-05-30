package interfaces;

import modelo.Persona;

public class ICompararPorDNI implements ComparadorPersona {
    public int comparar(Persona a, Persona b) {
        return Integer.compare(a.getDni(), b.getDni());
    }
}
