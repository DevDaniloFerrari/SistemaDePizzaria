package enfileirador;

import enfileirador.entities.FilaDinamica;
import enfileirador.interfaces.IFilaDinamica;
import java.util.List;
import models.PedidoModel;

public class FilaDePedidos {

    static IFilaDinamica<PedidoModel> fila = new FilaDinamica();
    
    public static void incluirPedido(PedidoModel model) throws Exception{
        fila.enqueue(model);
    }
    
    public static PedidoModel removerPedido() throws Exception{
        return fila.dequeue();
    }
    
    public static List<PedidoModel> pedidosEmEspera(){
        return fila.show();
    }
}