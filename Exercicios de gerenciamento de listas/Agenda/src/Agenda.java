import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    Scanner entrada = new Scanner(System.in);
    
    private ArrayList<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(Scanner entrada) {
        System.out.print("Digite o nome do contato: ");
        String nome = entrada.nextLine();
        System.out.print("Digite o telefone do contato: ");
        String telefone = entrada.nextLine();

        // Verifica se o contato já existe
        for (Contato c : contatos) {
            if (c.getNome().equals(nome)) {
                System.out.println("Contato com o nome " + nome + " já existe na agenda.");
                return; // Impede a adição de contatos duplicados
            }
        }

        // Cria um novo contato e adiciona à lista
        Contato novoContato = new Contato(nome, telefone);
        contatos.add(novoContato);
        System.out.println("Contato " + nome + " adicionado com sucesso!");
    }

    public void removerContato(String nomeremove) {
        for (Contato c : contatos) {
            if (c.getNome().equals(nomeremove)) { // Use 'nomeremove' aqui
                contatos.remove(c);
                System.out.println("Contato " + nomeremove + " removido com sucesso");
                return; // Para evitar a mensagem de contato não encontrado
            }
        }
        System.out.println("Contato não encontrado na lista de contatos!");
    }

    public Contato buscarContato(String nome) {
    for (Contato c : contatos) {
        if (c.getNome().equals(nome)) {
            System.out.println("\nContato encontrado\n");
            System.out.println(c);// Retorna o contato encontrado
        } else {
        System.out.println("\nContato não encontrado\n");
        }
    }
    return null; // Retorna null se não encontrado
}

    public String exibirContatos() {
        StringBuilder sb = new StringBuilder();
        sb.append("Agenda{");
        sb.append("contatos=").append(contatos);
        sb.append('}');
        return sb.toString();
    }
}