
import java.util.Scanner;


public class App2 {
    public static void main(String[] args) throws Exception {
        /*
         * .next() -> Entrada de uma palavra
         * .nextLine() -> Entrada de uma linha
         * .nextInt() -> Entrada de um inteiro
         * .nextFloat() -> Entrada de um float
         * .nextLong() -> Entrada de um Long
         * .nextBoolean() -> Entrade de um booleano
         */
        Scanner entrada = new Scanner(System.in);
        int valor1 = 5;
        int valor2 = 10;
        int soma, subtracao, divisao, multiplicacao, restoDivisao, anoNasc, idade;
        String texto;

        System.out.println("Operações matemáticas");

        soma = valor1 + valor2;
        subtracao = valor1 - valor2;
        divisao = valor1 / valor2;
        multiplicacao = valor1 * valor2;
        restoDivisao = valor1 % 2;

        System.out.println("Soma = " + soma);
        System.out.println("Subtração = " + subtracao);
        System.out.println("Divisão = " + divisao);
        System.out.println("Multiplicação = " + multiplicacao);
        System.out.println("Resto da Divisão por 2 = " + restoDivisao);

        //Incremento e Decremento

        System.out.println("Incremento Valor1 = " + valor1++);
        System.out.println("Incremento Valor2 = " + ++valor2);
        //System.out.println(valor1);

        System.out.println("Decremento Valor1 = " + valor1--);
        System.out.println("Decremento Valor2 = " + --valor2);

        //Estruturas de Decisão

        if (valor2 != 10) {
            System.out.println("Valor2 é diferente de 10");
        } else if(valor1 == 10) {
            System.out.println("Valor um é igual a 10");
        }else{
            System.out.println("Nenhum dos casos");
        }

        switch (valor1) {
            case 10:
                    System.out.println("Valor1 é 10");
                break;
            case 5:
                    System.out.println("Valor1 é 5");
                break;
            case 2:
                    System.out.println("Valor1 é 2");
                break;
        
            default:
                    System.out.println("Nenhum dos casos");
                break;
        }

        //Operador Ternário

        System.out.println("Digite o ano do seu nascimento");
        anoNasc = entrada.nextInt();
        idade = 2025 - anoNasc;

        if (idade >= 18) {
            System.out.println("Usuário maior de idade");
        } else {
            System.out.println("Usuário menor de idade");
        }

        //(Teste Lógico) ? Bloco Verdadeiro : Bloco Falso;
        texto = (idade >= 18)? "maior" : "menor";
        System.out.println("Usuário " + texto + " de idade");

        System.out.println((idade >= 18)? "Usuário maior de idade" : "Usuário menor de idade");


        //Estruturas de Laço
        System.out.println("\nWhile");
        while (valor1 > 0) {
            System.out.println("Valor1 é " + --valor1);
        }

        System.out.println("\nDo While");

        do {
            System.out.println("Valor1 é " + valor1++);
        } while (valor1 < 5);

        //System.out.println(valor1);

        System.out.println("\nFor");

        int vetor[] = {5,7,8,9,3,2,1};
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Vetor posição " + i + " é igual a " + vetor[i]);
        }

        for(int v: vetor){
            System.out.println("O valor é " + v);
        }

       /*  System.out.println("#################");
        int i = 0;
        for ( ; ; ) {
            if (i < vetor.length) {
                System.out.println("Vetor posição " + i + " é igual a " + vetor[i++]);
            }else{
                break;
            }
        }*/



        System.out.println("\n\n\n");

    }
}
