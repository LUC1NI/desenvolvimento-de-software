public class Contato {
    private String nome;
    private String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String exibirContatos() {
        return "Contato [nome=" + nome + ", telefone=" + telefone + "]";
    }

    @Override
    public String toString() {
        return exibirContatos(); // Sobrescreve o método toString para exibir informações legíveis
    }
}