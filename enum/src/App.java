
import java.util.Scanner;
import model.Cidade;
import model.DiaDaSemana;
import view.PessoaView;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);

        System.out.println("VIew principal");

        System.out.println(Cidade.CURITIBA);

        Cidade cidade = Cidade.CURITIBA;

        //cidade.setNome("Cuiabá");

        System.out.println(cidade);
        System.out.println(cidade.CURITIBA);
/* 
        System.out.println("Digite o nome de uma cidade: ");
        Cidade novCidade = cidade.valueOf(
            in.nextLine()
            .trim()
            .toUpperCase()
            .replace(" ", "_")
        );

        System.out.println("\nA cidade escolhida foi: " + novCidade);
        */
        System.out.println("Digite outra cidade:");

        Cidade outraCidade = Cidade.getCidade(in.nextLine());
        System.out.println("\nOutra cidade escolhida foi: " + outraCidade);

        PessoaView.main(args);

        System.out.println("\n ****** DIA DA SEMANA ******\n");

        System.out.println("Dias úteis");

        for (DiaDaSemana dia : DiaDaSemana.values()) {
            if (dia.isUtil()){
                System.out.println(dia);
            }      
        }

        System.out.println("\n Dias não úteis");

        for (DiaDaSemana dia : DiaDaSemana.values()) {
            if (!dia.isUtil()){
                System.out.println(dia);
            }      
        }




    }
}
