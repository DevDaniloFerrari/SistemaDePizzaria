package fila;

import empilhador.classes.No;
import empilhador.classes.PilhaDinamica;
import empilhador.exceptions.PilhaDinamicaException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PilhaDinamicaTest {

    PilhaDinamica pilhaDinamica;

    @Before
    public void InicializarTest() {
        pilhaDinamica = new PilhaDinamica();
    }

    @Test
    public void testPilhaVazia() {
        Assert.assertTrue(pilhaDinamica.isEmpty());
    }

    @Test
    public void testInserirUmValor() throws PilhaDinamicaException {
        pilhaDinamica.push('a');
        Assert.assertEquals('a', pilhaDinamica.pop());
    }

    @Test
    public void testInserirDoisValores() throws PilhaDinamicaException {
        pilhaDinamica.push('a');
        pilhaDinamica.push('b');
        Assert.assertEquals('b', pilhaDinamica.pop());
        Assert.assertEquals('a', pilhaDinamica.pop());
    }

    @Test(expected = PilhaDinamicaException.class)
    public void testRetirarComPilhaVazia() throws PilhaDinamicaException {
        pilhaDinamica.pop();
    }

    @Test
    public void testContadorDeTamanho() throws PilhaDinamicaException {
        pilhaDinamica.push('a');
        pilhaDinamica.push('b');
        pilhaDinamica.push('c');
        Assert.assertEquals(3, pilhaDinamica.size());
    }

    @Test(expected = PilhaDinamicaException.class)
    public void testContadorComPilhaVazia() throws PilhaDinamicaException {
        pilhaDinamica.size();
    }

    @Test
    public void testTopoComVariosValores() throws PilhaDinamicaException {
        pilhaDinamica.push('a');
        Assert.assertEquals('a', (char) ((No)pilhaDinamica.peek()).getDado());

        pilhaDinamica.push('b');
        Assert.assertEquals('b', (char) ((No)pilhaDinamica.peek()).getDado());

        pilhaDinamica.push('c');
        Assert.assertEquals('c', (char) ((No)pilhaDinamica.peek()).getDado());
    }

}
