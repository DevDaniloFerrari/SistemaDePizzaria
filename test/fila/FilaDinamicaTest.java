package fila;

import enfileirador.entities.FilaDinamica;
import enfileirador.exceptions.FilaDinamicaException;
import enfileirador.interfaces.IFilaDinamica;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FilaDinamicaTest {

    IFilaDinamica filaDinamica;

    @Before
    public void inicializarTests() {
        filaDinamica = new FilaDinamica();
    }
    
    @Test
    public void testFilaVazia() {
        Assert.assertTrue(filaDinamica.isEmpty());
    }

    @Test
    public void testInserirUmValorNaFila() throws FilaDinamicaException, Exception {
        filaDinamica.enqueue(1);
        Assert.assertEquals("1", filaDinamica.dequeue().toString());
    }

    @Test
    public void testInserirDoisValoresNaFila() throws FilaDinamicaException, Exception {
        filaDinamica.enqueue(1);
        filaDinamica.enqueue(2);
        Assert.assertEquals("1", filaDinamica.dequeue().toString());
        Assert.assertEquals("2", filaDinamica.dequeue().toString());
    }

    @Test
    public void testInserirTresValoresNaFila() throws FilaDinamicaException, Exception {
        filaDinamica.enqueue(1);
        filaDinamica.enqueue(2);
        filaDinamica.enqueue(3);
        Assert.assertEquals("1", filaDinamica.dequeue().toString());
        Assert.assertEquals("2", filaDinamica.dequeue().toString());
        Assert.assertEquals("3", filaDinamica.dequeue().toString());
    }

    @Test(expected = FilaDinamicaException.class)
    public void testRemoverComFilaVazia() throws Exception {
        filaDinamica.dequeue();
    }

    @Test
    public void testObterUltimoDaFila() throws Exception {
        filaDinamica.enqueue(1);
        filaDinamica.enqueue(2);
        filaDinamica.enqueue(3);
        Assert.assertEquals("3", filaDinamica.peek().toString());
    }

    @Test
    public void testInserirObjetosVariadosNaFila() throws Exception {
        filaDinamica.enqueue(1);
        filaDinamica.enqueue('a');
        filaDinamica.enqueue("test");
        filaDinamica.enqueue(1.5f);

        Assert.assertEquals("1", filaDinamica.dequeue().toString());
        Assert.assertEquals("a", filaDinamica.dequeue().toString());
        Assert.assertEquals("test", filaDinamica.dequeue().toString());
        Assert.assertEquals("1.5", filaDinamica.dequeue().toString());

    }

    @Test
    public void testImprimirFila() throws Exception {
        filaDinamica.enqueue(1);
        filaDinamica.enqueue(2);
        filaDinamica.enqueue("danilo");
        filaDinamica.enqueue('A');
        Assert.assertEquals("Posicao[0] = 1;Posicao[1] = 2;Posicao[2] = danilo;Posicao[3] = A", filaDinamica.show());
    }

}
