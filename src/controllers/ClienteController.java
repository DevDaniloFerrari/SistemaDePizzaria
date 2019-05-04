package controllers;

import java.sql.SQLException;
import java.util.ArrayList;
import models.ClienteModel;
import models.contexts.ClienteContext;

public class ClienteController {

    private final ClienteContext _context; 

    public ClienteController(ClienteContext _context) {
        this._context = _context;
    }
    
    public void adicionar(ClienteModel model){
        _context.adicionar(model);
    }
    
    public void deletar(ClienteModel model){
        _context.deletar(model);
    }
    
    public void atualizar(String telefoneReferencia, ClienteModel model){
        _context.atualizar(telefoneReferencia, model);
    }
    
    public ClienteModel obter(String telefone) throws SQLException{
       return  _context.obter(telefone);
    }
    
    public ArrayList<ClienteModel> obter() throws SQLException{
        return _context.obter();
    }
}