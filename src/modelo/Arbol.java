package modelo;

import interfaces.IArbol;
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
		if (dato < nodo.getDato().getDni()) {
			nodo.setIzquierdo(insertarRec(nodo.getIzquierdo(),dato));
		}else if (dato>nodo.getDato().getDni()) {
			nodo.setDerecho(insertarRec(nodo.getDerecho(),dato));
		}
		return nodo;
		}
	public INodo buscar(int dato) {
		return buscarRec(raiz,dato);
	}
	private INodo buscarRec(INodo nodo,int dato) {
		if(nodo==null||nodo.getDato().getDni()==dato) {
			return nodo;
		}
		if (dato<nodo.getDato().getDni()) {
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
			preorderRec(nodo.getIzquierdo());
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
	public void eliminar(int dato) {
        raiz = eliminarRec(raiz, dato);
    }

    private INodo eliminarRec(INodo nodo, int dato) {
        if (nodo == null) return null;

        if (dato < nodo.getDato().getDni()) {
            nodo.setIzquierdo(eliminarRec(nodo.getIzquierdo(), dato));
        } else if (dato > nodo.getDato().getDni()) {
            nodo.setDerecho(eliminarRec(nodo.getDerecho(), dato));
        } else {
            // encontramos el nodo
            if (nodo.getIzquierdo() == null && nodo.getDerecho() == null) {
                return null; 
            } else if (nodo.getIzquierdo() == null) {
                return nodo.getDerecho(); 
            } else if (nodo.getDerecho() == null) {
                return nodo.getIzquierdo(); 
            } else {
               
                INodo sucesor = encontrarMin(nodo.getDerecho());
                nodo.setDato(sucesor.getDato());
                nodo.setDerecho(eliminarRec(nodo.getDerecho(), sucesor.getDato().getDni()));
            }
        }
        return nodo;
    }

    private INodo encontrarMin(INodo nodo) {
        while (nodo.getIzquierdo() != null) {
            nodo = nodo.getIzquierdo();
        }
        return nodo;
    }
}

