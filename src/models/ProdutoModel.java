package models;

public class ProdutoModel {

    public ProdutoModel(String produto, float preco) {
        this.Nome = produto;
        this.Preco = preco;
    }

    private String Nome;
    private float Preco;

    public String getProduto() {
        return Nome;
    }

    public void setProduto(String produto) {
        this.Nome = produto;
    }

    public float getPreco() {
        return Preco;
    }

    public void setPreco(float preco) {
        this.Preco = preco;
    }

}
