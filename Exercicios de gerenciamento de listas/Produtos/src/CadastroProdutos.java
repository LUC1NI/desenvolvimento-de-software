import java.util.ArrayList;
import java.util.Scanner;

public class CadastroProdutos {
    Scanner entrada = new Scanner(System.in);
    int code = 1;

    public ArrayList<Produto> productslList;

    public CadastroProdutos() {
        this.productslList = new ArrayList<>();
    }

    public void adicionarProduto(Scanner entrada) {
        System.out.println("Digite o nome do produto:");
        String nome = entrada.nextLine();
        for (Produto p : productslList) {
            if(p.getNome().equals(nome)) {
                System.out.println("Produto já existe!");
                return;
            }
        }
        System.out.println("Digite o preço do produto:");
        double preco = entrada.nextDouble();
        Produto novoProduto = new Produto(code, nome, preco);
        productslList.add(novoProduto);
        System.out.println("Produto adicionado com sucesso! codigo : " + code);
        code++;
    }

    public void removerProduto(Scanner entrada){
        System.out.println("Digite o nome do produto que deseja remover:");
        String nome = entrada.nextLine();
        for (Produto p : productslList) {
            if(p.getNome().equals(nome)) {
                productslList.remove(p);
                System.out.println("Produto removido com sucesso!");
                return;
            }
        }
        System.out.println("Produto não encontrado!");
    }

    public void mostraProduto(Scanner entrada) {
        System.out.println("Digite o codigo do produto que deseja mostrar:");
        int codigo = entrada.nextInt();
        for (Produto p : productslList) {
            if(p.getCodigo() == codigo) {
                System.out.println("Nome: " + p.getNome());
                System.out.println("Preco: " + p.getPreco());
                System.out.println("Codigo: " + p.getCodigo());
                return;
            }
        }
                System.out.println("Produto não encontrado!");
    }

    

    
    
}
