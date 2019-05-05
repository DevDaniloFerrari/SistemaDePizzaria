package models;

public class ClienteModel {

    public ClienteModel(String telefone, String nome, EnderecoModel endereco) {
        this.Telefone = telefone;
        this.Nome = nome;
        this.Endereco = endereco;
    }

    private String Telefone;
    private String Nome;
    private EnderecoModel Endereco;

    @Override
    public String toString() {
        return "ClienteModel{" + "Telefone=" + Telefone + ", Nome=" + Nome + ", Endereco=" + Endereco.toString() + '}';
    }

    
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
    
   public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }
}
