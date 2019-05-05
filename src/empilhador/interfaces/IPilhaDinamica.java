package empilhador.interfaces;

import empilhador.exceptions.PilhaDinamicaException;
import java.util.List;

public interface IPilhaDinamica<T>{
    
    public boolean isEmpty();
    public void push(Object valor) throws PilhaDinamicaException;
    public T pop() throws PilhaDinamicaException;
    public T peek();
    public int size() throws PilhaDinamicaException;
    public List<T> imprimir();
    
}