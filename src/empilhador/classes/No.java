package empilhador.classes;

public class No {
    
    private Object Dado;
    private No proximoNo;

    public No(Object Dado) {
        this.Dado = Dado;
        this.proximoNo = null;
    }

    public Object getDado() {
        return Dado;
    }

    public void setDado(Object Dado) {
        this.Dado = Dado;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }
    
    
}