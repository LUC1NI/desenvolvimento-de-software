import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nome;
    private List<Livro> livrosDisponiveis;

    public Biblioteca(String nome, List<Livro> livrosDisponiveis) {
        this.nome = nome;
        this.livrosDisponiveis = livrosDisponiveis;
    }

    public List<Livro> emprestarLivros(List<Livro> livros) {
        List<Livro> livrosDisponiveis = new ArrayList<>();
        
        for (Livro livro : livros) {
            if (livro.verEstoque() > 0) {
                livrosDisponiveis.add(livro);
                livro.setQuantidade(livro.getQuantidade() - 1);
            }
        }
        return livrosDisponiveis;
    }

    public void devolverLivros(List<Livro> livros) {
        for (Livro livro : livros) {
            int quantidadeAtual = livro.getQuantidade();
            livro.setQuantidade(quantidadeAtual + 1); 
        }
    } 

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public List<Livro> getLivrosDisponiveis() {return livrosDisponiveis;}
    public void setLivrosDisponiveis(List<Livro> livrosDisponiveis) {this.livrosDisponiveis = livrosDisponiveis;}

    public String toString() {
        return "Biblioteca [nome=" + nome + ", livrosDisponiveis=" + livrosDisponiveis + "]";
    }

    
}
