package entidades;

import java.util.ArrayList;
import java.util.List;

public class Produto {

    private Integer id;
    private String nome;
    private Double preco;
    private static int counterId = 1;

    private List<Categoria> categorias = new ArrayList<>();

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
        this.id = counterId++;

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
        return categorias;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((categorias == null) ? 0 :categorias.hashCode());
        return result;
        
    }
}
