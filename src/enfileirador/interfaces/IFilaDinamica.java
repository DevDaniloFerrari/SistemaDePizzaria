package enfileirador.interfaces;

public interface IFilaDinamica {
    public boolean isEmpty();
    public void enqueue(Object object) throws Exception;
    public Object dequeue() throws Exception;
    public Object peek() throws Exception;
    public String show();
}