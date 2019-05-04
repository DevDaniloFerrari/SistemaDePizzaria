package models;

import java.util.List;

public class PedidoModel {

    public PedidoModel(ClienteModel cliente, List<ProdutoModel> produtos) {
        this.cliente = cliente;
        this.produtos = produtos;
    }

    public ClienteModel cliente;
    public List<ProdutoModel> produtos;

}