
import java.util.List;

public class Cliente {
    private String nome;
    private List<Livro> livrosEmprestados;

    public Cliente(String nome, List<Livro> livrosEmprestados) {
        this.nome = nome;
        this.livrosEmprestados = livrosEmprestados;
    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public List<Livro> getLivrosEmprestados() {return livrosEmprestados;}
    public void setLivrosEmprestados(List<Livro> livrosEmprestados) {this.livrosEmprestados = livrosEmprestados;}

    public String toString() {
        return "Cliente [nome=" + nome + ", livrosEmprestados=" + livrosEmprestados + "]";
    }

    

    

    



    
}
