public class Pessoa {
    public String nome;
    public int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String apresentar(){
        return "Meu nome é " + nome + " e eu tenho " + idade + " anos.";
    }
}
