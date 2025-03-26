import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Como sua agenda vai se chamar ?");
        String nomeAgenda = entrada.nextLine();

        String opcao;

        System.out.println("Agenda " + nomeAgenda + " criada com sucesso!");

        Agenda agenda = new Agenda();

        do {
            System.out.println("\n \nMenu");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Excluir contato");
            System.out.println("3 - Listar todos os contatos");
            System.out.println("4 - Buscar contato");
            System.out.println("5 - Sair");
            opcao = entrada.nextLine();
        
            switch (opcao) {
                case "1":
                    System.out.println("\nAdicionando contato na " + nomeAgenda + "...\n");
                    agenda.adicionarContato(entrada);
                    break;
                case "2":
                    System.out.println("\nExcluindo contato na " + nomeAgenda + "...\n");
                    System.out.print("Digite o nome do contato que vc quer remover: ");
                    String nomeRet = entrada.nextLine();
                    agenda.removerContato(nomeRet);
                    break;
                case "3": 
                    System.out.println("\nListando todos os contatos na " + nomeAgenda + "...\n");
                    System.out.println(agenda.exibirContatos());
                    break;
                case "4": 
                    System.out.println("\nBuscando contato na " + nomeAgenda + "...\n");
                    String buscaNome = entrada.nextLine();
                    System.out.println("\n Digite o nome do contato que vc quer buscar: ");
                    agenda.buscarContato(buscaNome); // Chama o método de busca na Agenda
                    break;
                case "5":
                    System.out.println("Saindo...\n");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (!opcao.equals("5"));


        // Exibe os contatos após a remoção
        System.out.println(agenda.exibirContatos());
    }
}