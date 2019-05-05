package empilhador.classes;

public class No {
    
    private char Dado;
    private No proximoNo;

    public No(char Dado) {
        this.Dado = Dado;
        this.proximoNo = null;
    }

    public char getDado() {
        return Dado;
    }

    public void setDado(char Dado) {
        this.Dado = Dado;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }
    
    
}