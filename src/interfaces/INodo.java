package interfaces;

public interface INodo {


    public IPersona getDato();

    public void setDato(IPersona dato);

    public INodo getIzquierdo();

    public void setIzquierdo(INodo izquierdo);

    public INodo getDerecho();

    public void setDerecho(INodo derecho);
}
