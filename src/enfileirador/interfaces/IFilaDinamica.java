package enfileirador.interfaces;

import java.util.List;


public interface IFilaDinamica<T> {
    public boolean isEmpty();
    public void enqueue(T t) throws Exception;
    public T dequeue() throws Exception;
    public T peek() throws Exception;
    public List<T> show();
}