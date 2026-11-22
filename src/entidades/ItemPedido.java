package entidades;


public class ItemPedido {

    private Double desconto;
    private Integer quantidade;
    private Double preco;
    private Pedido pedido;
    private Produto produto;

    public ItemPedido(Double desconto, Pedido pedido, Produto produto, Integer quantidade) {
        this.desconto = desconto;
        this.pedido = pedido;
        this.produto = produto;
        this.quantidade = quantidade;
        if (produto != null) {
           this.preco = produto.getPreco();
           produto.adicionarItem(this);
        } else {
            this.preco = 0.0;
        }
    }

    public Double getDesconto() {
        return desconto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        String nomeProd = null;
        if (produto != null) {
            nomeProd = produto.getNome();
        }
        return "Item-Pedido [produto = " + nomeProd + ", quantidade = " + quantidade
        + ", preço = " + preco + ", desconto = R$" + desconto + "]";
    }

}
