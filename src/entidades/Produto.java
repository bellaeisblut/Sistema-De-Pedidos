package entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Produto {

    private Integer id;
    private String nome;
    private Double preco;
    private static int counterId = 1;

    private List<Categoria> categorias = new ArrayList<>();
    private List<ItemPedido> itens = new ArrayList<>();

    public Produto(String nome, Double preco, Categoria categoria) {
        this.nome = nome;
        this.preco = preco;
        this.id = counterId++;
        adicionarCategoria(categoria);

    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public List<Categoria> getCategorias() {
        return Collections.unmodifiableList(categorias);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void adicionarCategoria(Categoria categoria) {
        if (categoria != null && !categorias.contains(categoria)) {
            categorias.add(categoria);

        }
    }

    public void adicionarItem(ItemPedido Item) {
        if (item != null && !itens.contains(item)) {
            itens.add(item);
        }
    }

    @Override
    public String toString() {
        return "Produto [id =" + id + ", nome = " + nome + ", categoria = " + categorias + " preço = " + preco + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        }
        return false;
    }
}
