package entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Categoria {

    private Integer id;
    private String nome;
    private static int counterId = 1;

    private List<Produto> produtos = new ArrayList<>();

    public Categoria(String nome) {
        this.id = counterId++;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Produto> getProdutos() {
        return Collections.unmodifiableList(produtos);
    }

    public void adicionarProduto(Produto produto) {
        if (produto != null && !produtos.contains(produto)) {
            produtos.add(produto);
        }
    }

    @Override
    public String toString() {
        return "Categoria [id=" + id + ", nome=" + nome + "]";
    }

}
