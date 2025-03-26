
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Exercicios 2 Produto");
        String opcao;

        CadastroProdutos produto = new CadastroProdutos();

        do { 
            System.out.println("\n Menu \n");
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Remover Produto");
            System.out.println("3 - Buscar Produto");
            System.out.println("4 - Sair");
            opcao = entrada.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("\n Adicionadno ... \n ");
                    produto.adicionarProduto(entrada);
                    break;
                case "2":
                    System.out.println("\n Removendo ... \n ");
                    produto.removerProduto(entrada);
                    break;
                case "3":
                    System.out.println("\n Buscando produto ... \n ");
                    produto.mostraProduto(entrada);
                    break;
            
                default:
                    System.out.println("\n Opção invalida \n ");
                break;
            }

        } while (!opcao.equals("4"));




    }
}
