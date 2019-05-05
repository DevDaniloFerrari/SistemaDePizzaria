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

        No novo;

        if (valor.getClass().getSimpleName().equals("Character")) {
            novo = new No((char) valor);
            novo.setProximoNo(Topo);
            Topo = novo;
        }

        if (valor.getClass().getSimpleName().equals("String")) {
            int corte;
            String frase = (String) valor;
            boolean primeiroCorte = true;
            do {
                corte = frase.lastIndexOf(" ");

                if (corte == -1) {
                    corte = 0;
                    frase = " " + frase;
                }

                String palavra;

                if (primeiroCorte) {
                    palavra = frase.substring(corte + 1, frase.length());
                } else {
                    palavra = frase.substring(corte, frase.length());
                }

                for (int indice = 0; indice < palavra.length(); indice++) {
                    push((char) palavra.charAt(indice));
                }

                if (corte != 0) {
                    frase = frase.substring(0, corte);
                }

                primeiroCorte = false;

            } while (corte != 0);
        }

    }

    @Override
    public Object pop() throws PilhaDinamicaException {

        if (isEmpty()) {
            throw new PilhaDinamicaException("Pilha vazia!");
        }

        char auxiliar = Topo.getDado();
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

        if (contador != 0) {
            return contador;
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
