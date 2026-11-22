package entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Collections;

public class Pedido {

    private Integer id;
    private Date instante;
    private Cliente cliente;
    private Endereco enderecoDeEntrega;
    private Pagamento pagamento;
    private static int counterId = 1;

    private List<ItemPedido> itens = new ArrayList();

    public Pedido(Cliente cliente, Endereco enderecoDeEntrega) {
        this.cliente = cliente;
        this.enderecoDeEntrega = enderecoDeEntrega;
        this.instante = new Date();
        this.id = counterId++;
        if (cliente != null) {
            cliente.adicionarPedido(this);
        }
    }

    public Integer getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getInstante() {
        return instante;
    }

    public Endereco getEnderecoDeEntrega() {
        return enderecoDeEntrega;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void setEnderecoDeEntrega(Endereco enderecoDeEntrega) {
        this.enderecoDeEntrega = enderecoDeEntrega;
    }

    public void adicionarItem(ItemPedido item) {
        if (item != null && !itens.contains(item)) {
            itens.add(item);
        }
    }

    @Override
    public String toString() {
        return "Pedido [id = " + id + ", instante = " + instante + ", cliente = " + cliente
                + ", enderecoDeEntrega = " + enderecoDeEntrega + ", pagamento = " + pagamento
                + ", itens = " + itens + "]";
    }
}
