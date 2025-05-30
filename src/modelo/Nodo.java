package modelo;

import interfaces.INodo;
import interfaces.IPersona;

public class Nodo implements INodo {

    /// Atributo con el dato del nodo (una persona)
    private IPersona dato;
    private Nodo izquierdo;
    private Nodo derecho;

    /// Constructor
    public Nodo(IPersona dato) {
        this.dato = dato;
        this.izquierdo = null;
        this.derecho = null;
    }

    /// Métodos de acceso

    public Nodo(int dato2) {
		// TODO Auto-generated constructor stub
	}

	public IPersona getDato() {
        return dato;
    }

    public void setDato(IPersona dato) {
        this.dato = dato;
    }

    public Nodo getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public Nodo getDerecho() {
        return derecho;
    }

    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }

	@Override
	public void setIzquierdo(INodo izquierdo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDerecho(INodo derecho) {
		// TODO Auto-generated method stub
		
	}
}
