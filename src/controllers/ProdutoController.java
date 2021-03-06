package controllers;

import java.sql.SQLException;
import java.util.ArrayList;
import models.ProdutoModel;
import models.contexts.ProdutoContext;

public class ProdutoController {
    
    private final ProdutoContext _context;

    public ProdutoController(ProdutoContext context ) {
        this._context = context;
    }
    
    public void adicionar(ProdutoModel model){
        _context.adicionar(model);
    }
    
    public void deletar(int id){
        _context.deletar(id);
    }
    
    public void atualizar(ProdutoModel model){
        _context.atualizar(model);
    }
    
    public ProdutoModel obter(int id) throws SQLException {
        return _context.obter(id);
    }
    
    public ArrayList<ProdutoModel> obter(String nome) throws SQLException{
        return _context.obter(nome);
    }
    
    public ArrayList<ProdutoModel> obter() throws SQLException{
        return _context.obter();
    }
    
    public int ultimoIdProduto() throws SQLException{
        return _context.ultimoIdProduto();
    }
    
}