package entidades;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private Integer id;
    private Instant date;
    private Cliente cliente;
    private Endereco enderecoDeEntrega;
    private Pagamento pagamento;
    private static int counterId = 1;

    private List<ItemPedido> itens = new ArrayList();

    public Pedido(Cliente cliente, Endereco enderecoDeEntrega, Pagamento pagamento) {
        this.cliente = cliente;
        this.enderecoDeEntrega = enderecoDeEntrega;
        this.pagamento = pagamento;
        this.id = counterId++;
    }

    public Integer getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Endereco getEnderecoDeEntrega() {
        return enderecoDeEntrega;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setEnderecoDeEntrega(Endereco enderecoDeEntrega) {
        this.enderecoDeEntrega = enderecoDeEntrega;
    }



}
