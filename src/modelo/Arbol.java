package modelo;

import interfaces.INodo;

public class Arbol implements IArbol {
	private INodo raiz;

	public Arbol() {
		this.raiz = raiz;
	}
	
	public void insertar (int dato) {
		raiz= insertarRec(raiz,dato);
	}
	
	private INodo insertarRec(INodo nodo, int dato) {
		if(nodo==null) {
			return new Nodo(dato);
		}
		if (dato<nodo.getDato()) {
			nodo.setIzquierdo(insertarRec(nodo.getIzquierdo(),dato));
		}else if (dato>nodo.getDato()) {
			nodo.setDerecho(insertarRec(nodo.getDerecho(),dato));
		}
		return nodo;
		}
	public INodo buscar(int dato) {
		return buscarRec(raiz,dato);
	}
	private INodo buscarRec(INodo nodo,int dato) {
		if(nodo==null||nodo.getDato()==dato) {
			return nodo;
		}
		if (dato<nodo.getDato()) {
			return buscarRec(nodo.getIzquierdo(),dato);
		}else {
			return buscarRec(nodo.getDerecho(),dato);
		}
	}
	public void inorder() {
		inorderRec(raiz);
	}
	
	private void inorderRec(INodo nodo) {
		if (nodo!=null) {
			inorderRec(nodo.getIzquierdo());
			System.out.print(nodo.getDato()+" ");
			inorderRec(nodo.getDerecho());
		}
	}
	
	public void preorder() {
		preorderRec(raiz);
	}
	
	private void preorderRec(INodo nodo) {
		if(nodo!=null) {
			System.out.print(nodo.getDato()+" ");
			preorderRec(nodo.Izquierdo());
			preorderRec(nodo.getDerecho());
		}
	}
	
	public void postorder() {
		postorderRec(raiz);
	}
	
	private void postorderRec(INodo nodo) {
		if (nodo!=null) {
			postorderRec(nodo.getIzquierdo());
			postorderRec(nodo.getDerecho());
			System.out.print(nodo.getDato()+" ");
		}
	}
	}

