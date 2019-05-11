package controllers;

import enfileirador.FilaDePedidos;
import java.sql.SQLException;
import models.PedidoModel;
import models.ProdutoModel;
import models.contexts.PedidoContext;
import java.util.ArrayList;
import models.ClienteModel;
import models.contexts.ClienteContext;

public class PedidoController {

    private final PedidoContext _pedidoContext;
    private final ClienteContext _clienteContext;

    public PedidoController(ClienteContext clienteContext, PedidoContext pedidoContext) {
        this._clienteContext = clienteContext;
        this._pedidoContext = pedidoContext;
    }

    public void solicitar(String telefone, ArrayList<ProdutoModel> produtos) throws SQLException, Exception {
        ClienteModel clienteModel = _clienteContext.obter(telefone);
        ArrayList<ProdutoModel> produtosModel = new ArrayList();

        for (ProdutoModel produto : produtos) {
            produtosModel.add(produto);
            _pedidoContext.adicionar(telefone, produto.getIdProduto());
        }

        FilaDePedidos.incluirPedido(new PedidoModel(clienteModel, produtosModel));
    }

    public void completarPedido() throws Exception {
        FilaDePedidos.removerPedido();
    }

    public void listarPedidos() {
        FilaDePedidos.pedidosEmEspera();
    }

    public PedidoModel obter(String telefone) throws SQLException {
        return _pedidoContext.obter(telefone);
    }
}
