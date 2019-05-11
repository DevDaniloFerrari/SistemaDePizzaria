package empilhador.classes;

import empilhador.exceptions.PilhaDinamicaException;
import empilhador.interfaces.IPilhaDinamica;
import java.util.ArrayList;

public class PilhaDinamica implements IPilhaDinamica {

    private No Topo;

    @Override
    public boolean isEmpty() {
        return (Topo == null);
    }

    @Override
    public void push(Object valor) throws PilhaDinamicaException {

        No novo = new No(valor);

        if (isEmpty()) {
            Topo = novo;
        } else {
            novo.setProximoNo(Topo);
            Topo = novo;
        }
    }

    @Override
    public Object pop() throws PilhaDinamicaException {

        if (isEmpty()) {
            throw new PilhaDinamicaException("Pilha vazia!");
        }

        Object auxiliar = Topo.getDado();
        Topo = Topo.getProximoNo();

        return auxiliar;
    }

    @Override
    public Object peek() {
        return Topo;
    }

    @Override
    public int size() throws PilhaDinamicaException {

        if (isEmpty()) {
            throw new PilhaDinamicaException("Pilha vazia!");
        }

        int contador = 0;

        No Auxiliar = Topo;

        while (Auxiliar != null) {
            Auxiliar = Auxiliar.getProximoNo();
            contador++;
        }

        return contador;

    }

    @Override
    public ArrayList<Object> imprimir() {

        No auxiliar = Topo;
        ArrayList<Object> objetos = new ArrayList();

        while (auxiliar != null) {
            objetos.add(auxiliar.getDado());
            auxiliar = auxiliar.getProximoNo();
        }

        return objetos;

    }

}
