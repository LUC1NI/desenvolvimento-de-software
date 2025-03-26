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
    // Formatar o telefone (Exemplo: (11) 98765-4321)
    String telefoneFormatado = telefone;
    if (telefone.length() == 11) {
        telefoneFormatado = "(" + telefone.substring(0, 2) + ") " +
                            telefone.substring(2, 7) + "-" +
                            telefone.substring(7);
    }

    return "Contato [Nome: " + nome + ", Telefone: " + telefoneFormatado + "]";
}

}