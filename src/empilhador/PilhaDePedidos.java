package empilhador;

import empilhador.classes.PilhaDinamica;
import empilhador.interfaces.IPilhaDinamica;
import java.util.List;
import models.PedidoModel;

public class PilhaDePedidos {

    static IPilhaDinamica<PedidoModel> pilha = new PilhaDinamica();

    public static void incluirPedido(PedidoModel model) throws Exception {
        pilha.push(model);
    }

    public static PedidoModel removerPedido() throws Exception {
        return pilha.pop();
    }

    public static List<PedidoModel> pedidosEmEspera() {
        return pilha.imprimir();
    }

}
