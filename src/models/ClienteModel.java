package models;

public class ClienteModel {

    public ClienteModel(String Nome, EnderecoModel endereco) {
        this.Nome = Nome;
        this.Endereco = endereco;
    }

    private String Nome;
    private EnderecoModel Endereco;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public EnderecoModel getEndereco() {
        return Endereco;
    }

    public void setEndereco(EnderecoModel endereco) {
        this.Endereco = endereco;
    }
    
    
}
