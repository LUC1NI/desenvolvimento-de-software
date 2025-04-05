public class Livro implements Comparable<Livro>{
    private String nome, atuor, genero;
    private int quantidade;

    public Livro(String nome, String atuor, String genero, int quantidade) {
        this.nome = nome;
        this.atuor = atuor;
        this.genero = genero;
        this.quantidade = quantidade;
    }

    public int verEstoque(){
        return quantidade;
    }

    

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getAtuor() {return atuor;}
    public void setAtuor(String atuor) {this.atuor = atuor;}
    public String getGenero() {return genero;}
    public void setGenero(String genero) {this.genero = genero;}
    public int getQuantidade() {return quantidade;}
    public void setQuantidade(int quantidade) {this.quantidade = quantidade;}

    public String toString() {
        return "Livro [nome=" + nome + ", atuor=" + atuor + ", genero=" + genero + ", quantidade=" + quantidade + "]";
    }

    public int compareTo(Livro o) {
        return 0;
    }

    


    

    

    
}
