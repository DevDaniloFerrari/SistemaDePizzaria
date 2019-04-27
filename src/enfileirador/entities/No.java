package enfileirador.entities;

public class No {

    private Object Informacao;
    private No ProximoNo;

    public No(Object Informacao) {
        this.Informacao = Informacao;
        this.ProximoNo = null;
    }

    
    
    public Object getInformacao() {
        return Informacao;
    }

    public void setInformacao(Object Informacao) {
        this.Informacao = Informacao;
    }

    public No getProximoNo() {
        return ProximoNo;
    }

    public void setProximoNo(No ProximoNo) {
        this.ProximoNo = ProximoNo;
    }
    
    
    
}