package models;

public class EnderecoModel {

    public EnderecoModel(String Logradouro, String Numero, String Complemento) {
        this.Logradouro = Logradouro;
        this.Numero = Numero;
        this.Complemento = Complemento;
    }
    
    private String Logradouro, Numero, Complemento;

    public String getLogradouro() {
        return Logradouro;
    }

    public void setLogradouro(String Logradouro) {
        this.Logradouro = Logradouro;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getComplemento() {
        return Complemento;
    }

    public void setComplemento(String Complemento) {
        this.Complemento = Complemento;
    }
    
    
    
}