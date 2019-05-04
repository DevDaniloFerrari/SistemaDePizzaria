package controllers;

import java.sql.SQLException;
import models.PedidoModel;
import models.contexts.PedidoContext;

public class PedidoController {
    
    private final PedidoContext _context;

    public PedidoController(PedidoContext _context) {
        this._context = _context;
    }
    
    public void solicitar(String telefone, int idProduto){
        _context.adicionar(telefone, idProduto);
    }
    
    public PedidoModel obter(String telefone) throws SQLException{
        return _context.obter(telefone);
    }
}