package DataeStrings;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite o sobrenome: ");
        String sobreNome = scanner.nextLine();
        
        System.out.print("Digite a data de nascimento (dd/MM/yyyy): ");
        String dataNascimentoStr = scanner.nextLine();
        
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        
        Pessoa pessoa = new Pessoa(dataNascimento, null, nome, sobreNome);
        
        String email;
        do {
            System.out.print("Digite o e-mail: ");
            email = scanner.nextLine();
            pessoa.adicionarEmail(email);
        } while (pessoa.getEmail() == null); // Continue until a valid email is added

        
        System.out.println(pessoa.getInformacoes());
        
        scanner.close();
    }
}
