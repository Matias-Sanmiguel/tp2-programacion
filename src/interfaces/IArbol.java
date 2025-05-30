package interfaces;

public interface IArbol {
    void insertar(int dato);
    INodo buscar(int dato);
    void inorder();
    void preorder();
    void postorder();
}

