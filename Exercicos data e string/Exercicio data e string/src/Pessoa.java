import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private String nome;
    private String sobreNome;
    private LocalDate dataNascimento;
    private String email;

    public Pessoa(String nome, String sobreNome, LocalDate dataNascimento, String email) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.dataNascimento = dataNascimento;
        this.email = email;
    }

    private int idade() {
        if (dataNascimento == null) {
            return 0; // Retorna 0 se a data de nascimento não foi definida
        }
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataNascimento, dataAtual);
        return periodo.getYears();
    }

    public boolean maior() {
        return idade() >= 18;
    }

    private boolean validaEmail(String email) {
        int posicaoArroba = email.indexOf("@");
        if (posicaoArroba != -1 && email.indexOf(".", posicaoArroba) != -1) {
            return true; // Email válido
        }
        return false; // Email inválido
    }

    public void adicionarEmail(String email) {
        if (validaEmail(email)) {
            this.email = email; // Atribui o e-mail se for válido
        } else {
            System.out.println("Email inválido");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInformacoes() {
        return "Pessoa [nome=" + nome + ", sobreNome=" + sobreNome + ", idade=" + idade() + ", email=" + email + "]";
    }
}