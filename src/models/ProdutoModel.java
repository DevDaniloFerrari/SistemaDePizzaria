package models;

public class ProdutoModel {

    public ProdutoModel(String descricao, float preco) {
        this.Descricao = descricao;
        this.Preco = preco;
    }

    public ProdutoModel(int IdProduto, String Descricao, float Preco) {
        this.IdProduto = IdProduto;
        this.Descricao = Descricao;
        this.Preco = Preco;
    }

    private int IdProduto;
    private String Descricao;
    private float Preco;

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public float getPreco() {
        return Preco;
    }

    public void setPreco(float Preco) {
        this.Preco = Preco;
    }

    public int getIdProduto() {
        return IdProduto;
    }

    

}
