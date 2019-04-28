package models.contexts;

import enfileirador.interfaces.IFilaDinamica;
import models.PedidoModel;

public class PedidosContext {

    public PedidosContext(IFilaDinamica<PedidoModel> pedidos) {
        this.pedidos = pedidos;
    }

    private static IFilaDinamica<PedidoModel> pedidos;

    public static IFilaDinamica<PedidoModel> getPedidos() {
        return pedidos;
    }

}
