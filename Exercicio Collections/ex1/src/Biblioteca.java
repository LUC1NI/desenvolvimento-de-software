import java.util.List;

public class Biblioteca {
    private String nome;
    private List<Livro> livrosDisponiveis;

    public Biblioteca(String nome, List<Livro> livrosDisponiveis) {
        this.nome = nome;
        this.livrosDisponiveis = livrosDisponiveis;
    }

    private String emprestarLivros(List<Livro> livros) {
        

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public List<Livro> getLivrosDisponiveis() {return livrosDisponiveis;}
    public void setLivrosDisponiveis(List<Livro> livrosDisponiveis) {this.livrosDisponiveis = livrosDisponiveis;}

    public String toString() {
        return "Biblioteca [nome=" + nome + ", livrosDisponiveis=" + livrosDisponiveis + "]";
    }

    

    

    
}
