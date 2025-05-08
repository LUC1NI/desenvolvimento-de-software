package model;

public class Cachorro implements IAnimal, Testavel{
    private String nome, som;
    private int idade;

    public Cachorro(String nome, String som, int idade) {
        this.nome = nome;
        this.som = som;
        this.idade = idade;
    }

    @Override
    public String teste() {
        return "testando...";
    }

    @Override
    public String emitirSom() {
        return nome + " emitindo som " + som;
    }
    @Override
    public String andar() {
        return "andando...";
    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getSom() {return som;}
    public void setSom(String som) {this.som = som;}
    public int getIdade() {return idade;}
    public void setIdade(int idade) {this.idade = idade;}

    @Override
    public String toString() {
        return "Cachorro [nome=" + nome + ", som=" + som + ", idade=" + idade + "]";
    }

    @Override
    public int compareTo(IAnimal o) {
        return emitirSom().compareTo(o.emitirSom());
    }


    
}
