package entidades;

import java.util.ArrayList;
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
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void addProduto(Produto produto) {
        if (produto != null && !produtos.contains(produto)) {
            produtos.add(produto);
        }
    }

    @Override
    public String toString() {
        return "Categoria [id=" + id + ", nome=" + nome + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((produtos == null) ? 0 : produtos.hashCode());
        return result;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (this == null || (getClass() != obj.getClass())) {
            return false;
        }
        Categoria other = (Categoria) obj;
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!produtos.equals(other.produtos)) {
            return false;
        }

        return false;
    }

}
