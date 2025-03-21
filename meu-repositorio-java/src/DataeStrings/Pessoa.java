package DataeStrings;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

    private String nome;
    private String sobreNome;
    private LocalDate dataNascimento;
    private String email;

    public Pessoa(LocalDate dataNascimento, String email, String nome, String sobreNome) {
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.nome = nome;
        this.sobreNome = sobreNome;
    }
    private int idade() {
        LocalDate hoje = LocalDate.now();
        if (dataNascimento != null) {
            return Period.between(dataNascimento, hoje).getYears();
        } else {
            return 0; // Retorna 0 se a data de nascimento não estiver definida
        }
    }
    private boolean validaEmail() {
        if (email == null || email.isEmpty()) {
            return false; // Retorna falso se o email for nulo ou vazio
        }
        
        int atIndex = email.indexOf('@');
        int dotIndex = email.indexOf('.', atIndex); // Encontra o ponto após o "@"
    
        // Verifica se "@" e "." estão presentes e se "." vem após "@"
        return atIndex > 0 && dotIndex > atIndex + 1 && dotIndex < email.length() - 1;
    }
    public void adicionarEmail(String email) {
        // Temporariamente define o e-mail para validação
        this.email = email; // Define o e-mail para validação

        if (validaEmail()) {
            System.out.println("E-mail adicionado com sucesso: " + email);
        } else {
            System.out.println("E-mail inválido: " + email);
            this.email = null; // Reseta o e-mail se for inválido
        }
    }
    public boolean maior() {
        return idade() >= 18 ? true : false;
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
        return "Nome: " + nome + " " + sobreNome + "\n" +
               "Data de Nascimento: " + dataNascimento + "\n" +
               "Email: " + email + "\n" +
               "Idade: " + idade() + " anos";
    }
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + " " + sobreNome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Email: " + email);
    }
}
