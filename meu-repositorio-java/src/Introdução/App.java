import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Comentário de Linha
        
        /*
         * Comentário de Bloco
         */

        System.out.println("Hello, World!");

        System.out.println("#############");

        //Variáveis primitivas
        int ano = 2025;
        float numeroComVirgula = 3.6f;
        char letra = 'a';
        boolean aprovado = true;

        //TypeCast
        ano = (int)numeroComVirgula;

        System.out.println("O ano é " + ano);
        System.out.println("###########");

        numeroComVirgula = (float)ano;
        System.out.println("O numero com virgula é " + numeroComVirgula);

        //Wrapper Class
        String nome = new String("João Lucini");
        System.out.println(nome);   
        Integer numeroInteiro = 10;
        Float numeroFloat = Float.valueOf(10.5f);
        Boolean presenca = false;

        String numero = "30";
        Float novoNumero = Float.parseFloat(numero);

        System.out.println("o novo Numero + 5 é " + (novoNumero + 5) + ".");

        System.out.printf("o numero formato é %.2f !%n", novoNumero);

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entrada de texto");
        String texto = entrada.nextLine();
        System.out.println("O texto é " + texto);

        System.out.println("Entrada de inteiro");
        int entradaInteiro = entrada.nextInt();

    }
}
