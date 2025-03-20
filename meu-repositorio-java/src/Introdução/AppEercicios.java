import java.util.Scanner;

public class AppEercicios {
public static void main(String[] args) throws Exception {
Scanner entrada = new Scanner(System.in);
boolean menu = true, calc;
int opcao, par, cod1, qtde1, cod2, qtde2, operacao;
float ipi, preco1, preco2, valor1, valor2, resultado;
//int[] vetor = {1,2,3,4,5,6,7,8,9,10};
int[] vetor = new int[10];
for (int i = 0; i < vetor.length; i++) {
vetor[i] = i+1;
}

while (menu) {
System.out.println(
    "Escolha uma opção do Menu\n" +
    "1 - Par ou Impar\n"+
    "2 - Produtos\n"+
    "3 - Calculadora\n"+
    "0 - Encerrar\n"
);
opcao = entrada.nextInt();

switch (opcao) {
    case 1:
        System.out.println("Escolha 1 para Par e 2 para Impar");
        par = entrada.nextInt();
        for (int v : vetor) {
            if ((v % 2) == 0 && par == 2) {
                System.out.println("Par " + v);
            }
            if ((v % 2) != 0 && par == 1) {
                System.out.println("Impar " + v);
            }
        }
        
    break;
    case 2:
        System.out.println("Informe o IPI");
        ipi = entrada.nextFloat();

        System.out.println("Digite o código do produto 1");
        cod1 = entrada.nextInt();
        System.out.println("digite a quantidade do produto 1");
        qtde1 = entrada.nextInt();
        System.out.println("Digite o preço do produto 1");
        preco1 = entrada.nextFloat();

        System.out.println("Digite o código do produto 2");
        cod2 = entrada.nextInt();
        System.out.println("digite a quantidade do produto 2");
        qtde2 = entrada.nextInt();
        System.out.println("Digite o preço do produto 2");
        preco2 = entrada.nextFloat();

        System.out.format("Produto %d Quantidade %d Valor R$ %.2f %n Produto %d Quantidade %d Valor R$ %.2f%n Total com IPI R$ %.2f%n", cod1, qtde1, preco1, cod2, qtde2, preco2,((preco2 * qtde2) + (preco1 * qtde1) * ((ipi/100)+1)));
    break;
    case 3:
    calc = true;
    while (calc) {
        System.out.println(
            "Escolha uma operação\n" +
            "1 - soma\n" +
            "2 - subtração\n" +
            "3 - divisão\n" +
            "4 - multiplicação\n" +
            "5 - potenciação\n" +
            "9 - voltar ao menu principal\n" +
            "0 - Encerrar\n"
        );
        operacao = entrada.nextInt();
        switch (operacao) {
            case 1:
            /*System.out.println("Digite o valor 1");
            valor1 = entrada.nextFloat();
            System.out.println("Digite o valor 2");
            valor2 = entrada.nextFloat();*/
            valor1 = perdirUmFloat("1");
            valor2 = perdirUmFloat("2");
            resultado = valor1 + valor2;
            System.out.println("O resultado da soma é " + resultado);
            break;
            case 2:
            System.out.println("Digite o valor 1");
            valor1 = entrada.nextFloat();
            System.out.println("Digite o valor 2");
            valor2 = entrada.nextFloat();
            resultado = valor1 - valor2;
            System.out.println("O resultado da subtração é " + resultado);
            break;
            case 3:
            /*System.out.println("Digite o valor 1");
            valor1 = entrada.nextFloat();
            System.out.println("Digite o valor 2");
            valor2 = entrada.nextFloat();*/
            valor1 = perdirUmFloat("do divisor");
            valor2 = perdirUmFloat("do dividendo");
            resultado = valor1 / valor2;
            System.out.println("O resultado da divisão é " + resultado);
            break;
            case 4:
            System.out.println("Digite o valor 1");
            valor1 = entrada.nextFloat();
            System.out.println("Digite o valor 2");
            valor2 = entrada.nextFloat();
            resultado = valor1 * valor2;
            System.out.println("O resultado da multiplicação é " + resultado);
            break;
            case 5:
            System.out.println("Digite o valor 1");
            valor1 = entrada.nextFloat();
            System.out.println("Digite o valor 2");
            valor2 = (int) entrada.nextFloat();

            for (resultado = valor1; valor2 > 1; valor2--) {
                //resultado = resultado * valor1;
                resultado *= valor1;
            }

            System.out.println("O resultado da potenciação3 é " + resultado);
            break;
            case 9:
                calc = false;
            break;
            case 0:
                menu = false;
                calc = false;
                encerrar();
            break;
            default:
                System.out.println("Escolha uma operação válida");
            break;
        }
    }
        
    break;
    case 0:
        menu = false;
        encerrar();
    break;
    default:
        System.out.println("Digite um número válido");
    break;
}
}
}

public static float perdirUmFloat(String texto){
    Scanner entrada = new Scanner(System.in);
    //float resposta;
    System.out.println("Digite o valor " + texto);
    //resposta = entrada.nextFloat();
    //return resposta;
    return entrada.nextFloat();
}

public static void encerrar(){
    System.out.println("O sistema será encerrado");
}



}