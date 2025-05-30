package interfaces;

import modelo.Persona;

public class ICompararPorNombre implements IComparadorPersona {
    public int comparar(Persona a, Persona b) {
        return a.getNombre().compareToIgnoreCase(b.getNombre());
    }

	@Override
	public int comparar(IPersona a, IPersona b) {
		// TODO Auto-generated method stub
		return 0;
	}}
