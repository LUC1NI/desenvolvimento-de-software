import java.util.Scanner;

public class AppExercicios2 {
    public static void main(String[] args) throws Exception {
        /*int[] vetor =  new int[10];
        for (int i = 0; i < vetor.length; ) {
            vetor[i] = ++i;
            System.out.println(vetor[i-1]);
        }

        for (int v : vetor) {
            System.out.println(v);
        }*/
        Scanner entrada = new Scanner(System.in);
        int fatorial, ddd, telefone;
        int[] vetorInteiro = new int[5];
        float[] vetorFloat = new float[5];
        float resposta;
        String nome, sobrenome;

        System.out.println("Correção Lista 2");

        System.out.println("Exercício 1 - Número PI");
        System.out.println(pi());

        System.out.println("Exercício 2 - Fatorial");
        System.out.println("Digite um inteiro");
        fatorial = entrada.nextInt();

        System.out.println(fatorial(fatorial));

        System.out.println("Exercício 3 - Maior Número");
        for (int i = 0; i < vetorInteiro.length; i++) {
            System.out.println("Digite um inteiro");
            vetorInteiro[i] = entrada.nextInt();
        }

        System.out.println("Maior Número " + maiorNumero(vetorInteiro));

        System.out.println("Exercício 4 - Soma do vetor");
        for (int i = 0; i < vetorFloat.length; i++) {
            System.out.println("Digite um float");
            vetorFloat[i] = entrada.nextFloat();
        }

        resposta = somaVetor(vetorFloat);
        System.out.println("A Soma dos valores é " + resposta);

        System.out.println("Exercício 5 - Cliente");
        entrada.nextLine(); // Consumir o caracter Enter do Float
        System.out.println("Digite seu nome");
        nome = entrada.nextLine();
        System.out.println("Digite seu sobrenome");
        sobrenome = entrada.nextLine();
        System.out.println("Digite seu DDD");
        ddd = entrada.nextInt();
        System.out.println("Digite seu telefone");
        telefone = entrada.nextInt();

        System.out.println(cliente(nome, ddd, sobrenome, telefone));
    }

    public static float pi(){
        return 3.14f;
    }

    public static int fatorial(int fat){
        int res = fat;
        for (--fat; fat > 1; fat--) {
            res *= fat;
        }
        return res;
    }

    public static int maiorNumero(int[] vetor){
        int res = vetor[0];
        for (int v : vetor) {
            if(v > res) res = v;
        }
        return res;
    }

    public static float somaVetor(float[] vetor){
        float res = 0;
        for (float v : vetor) {
            res += v; 
        }
        return res;
    }

    public static String cliente(String nome, int ddd, String sobrenome, int telefone){
        return 
            "\n  Nome: " + nome +
            "\n  Sobrenome: " + sobrenome +
            "\n  DDD: " + ddd +
            "\n  Telefone: " + telefone;
    }
}
