package modelo;

import interfaces.IPersona;

public class Nodo {

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
}
