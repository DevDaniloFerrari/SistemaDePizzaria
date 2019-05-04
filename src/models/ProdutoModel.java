package models;

public class ProdutoModel {

    public ProdutoModel(String nome, float preco) {
        this.Nome = nome;
        this.Preco = preco;
    }

    public ProdutoModel(int Id, String Nome, float Preco) {
        this.Id = Id;
        this.Nome = Nome;
        this.Preco = Preco;
    }

    private int Id;
    private String Nome;
    private float Preco;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public float getPreco() {
        return Preco;
    }

    public void setPreco(float Preco) {
        this.Preco = Preco;
    }

    public int getId() {
        return Id;
    }

    

}
