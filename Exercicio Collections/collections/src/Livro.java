public class Livro implements Comparable<Livro>{
    private String nome, autor, genero;
    private int quantidade;

    public Livro(String nome, String autor, String genero, int quantidade) {
        this.nome = nome;
        this.autor = autor;
        this.genero = genero;
        this.quantidade = quantidade;
    }

    public int verEstoque(){
        return quantidade;
    } 

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getAtuor() {return autor;}
    public void setAtuor(String autor) {this.autor = autor;}
    public String getGenero() {return genero;}
    public void setGenero(String genero) {this.genero = genero;}
    public int getQuantidade() {return quantidade;}
    public void setQuantidade(int quantidade) {this.quantidade = quantidade;}

    public String toString() {
        return "Livro [nome=" + nome + ", autor=" + autor + ", genero=" + genero + ", quantidade=" + quantidade + "]";
    }

    public int compareTo(Livro o) {
        return this.getNome().compareTo(o.getNome());
}


    


    

    

    
}
