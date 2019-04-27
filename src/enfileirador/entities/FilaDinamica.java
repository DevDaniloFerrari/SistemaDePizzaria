package enfileirador.entities;

import enfileirador.exceptions.FilaDinamicaException;
import enfileirador.interfaces.IFilaDinamica;

public class FilaDinamica implements IFilaDinamica {

    protected No Inicio, Fim;

    public FilaDinamica() {
        Inicio = Fim = null;
    }

    @Override
    public boolean isEmpty() {
        return (Inicio == null);
    }

    @Override
    public void enqueue(Object informacao) throws FilaDinamicaException {

        No novoNo = new No(informacao);

        if (isEmpty()) {
            Inicio = Fim = novoNo;
        } else {
            Fim.setProximoNo(novoNo);
            Fim = novoNo;
        }
    }

    @Override
    public Object dequeue() throws FilaDinamicaException {

        if (isEmpty()) {
            throw new FilaDinamicaException("Fila vazia!");
        }

        Object retorno;

        retorno = Inicio.getInformacao();

        if (Inicio == Fim) {
            Inicio = Fim = null;
        } else {
            Inicio = Inicio.getProximoNo();
        }

        return retorno;
    }

    @Override
    public Object peek() throws FilaDinamicaException {
        return Fim.getInformacao();
    }

    @Override
    public String show() {

        No auxiliar = Inicio;
        String retorno = "";
        boolean primeiraIteracao = true;
        int contador = 0;

        while (auxiliar != null) {
            if (primeiraIteracao) {
                retorno += String.format("Posicao[%d] = ", contador) + auxiliar.getInformacao().toString();
                auxiliar = auxiliar.getProximoNo();
                primeiraIteracao = false;
                contador++;
            } else {
                retorno += ";" + String.format("Posicao[%d] = ", contador) + auxiliar.getInformacao().toString();
                auxiliar = auxiliar.getProximoNo();
                contador++;
            }
        }
        return retorno;
    }

}
