import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("\n Exercicio 1: Data e String \n");
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n Olá, como vc se chama ? \n");
        String nome = entrada.nextLine();
        System.out.println("\n Qual seu sobrenome ? \n");
        String sobrenome = entrada.nextLine();
        System.out.println("\n Qual sua data de nascimento (dd/MM/yyyy) ? \n");
        String data = entrada.nextLine();

        LocalDate dataNascimento = null;
        if (data.matches("\\d{2}/\\d{2}/\\d{4}")) {
            dataNascimento = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            System.out.println("Data válida: " + dataNascimento);
        } else {
            System.out.println("Data inválida. Por favor, use o formato dd/MM/yyyy.");
        }

        Pessoa pessoa1 = new Pessoa(nome, sobrenome, dataNascimento, null);

        System.out.println("\n Qual seu email ? \n");
        String email = entrada.nextLine();

        pessoa1.adicionarEmail(email);

        // Displaying the information of pessoa1
        System.out.println(pessoa1.getInformacoes());
    }
}