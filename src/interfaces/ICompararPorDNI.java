package interfaces;
import modelo.ComparadorPersona;

public class ICompararPorDNI extends ComparadorPersona {
    public int comparar(IPersona a, IPersona b) {
        return Integer.compare(a.getDni(), b.getDni());
    }
}
