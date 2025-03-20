package DataeStrings;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App6 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int dia, mes, ano;
        LocalDate dataAtual, dataEspecifica, dataConvertida;
        Month objetoMes;
        DateTimeFormatter frmtExibir, frmtReceber, frmtHora;
        String dataString, horaFormatada, texto;
        LocalTime horaAtual, horaFutura, meioDia;
        System.out.println("Trabalhando com Datas em Java");
/*
        dataAtual = LocalDate.now();
        System.out.println("Data Atual " + dataAtual);

        dataEspecifica = LocalDate.of(2025, 3, 28);
        System.out.println("Data Especifica " + dataEspecifica);

        dia = dataAtual.getDayOfMonth();
        mes = dataAtual.getMonthValue();
        ano = dataAtual.getYear();

        System.out.println("Dia " + dia);
        System.out.println("Mes " + mes);
        System.out.println("Ano " + ano);

        objetoMes = dataAtual.getMonth();
        //TextStyle.SHORT -> Mostra Abreviado TextStyle.NARROW -> Mostra uma letra
        System.out.println(objetoMes.getDisplayName(TextStyle.FULL, new Locale("pt", "BR")));

        System.out.println("Digite uma data (dd/MM/yyyy)");
        dataString = entrada.nextLine();

        frmtReceber = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        frmtExibir = DateTimeFormatter.ofPattern("dd/MMMM/yyyy", new Locale("en", "USA"));

        dataConvertida = LocalDate.parse(dataString, frmtReceber);
        System.out.println("Data convertida " + dataConvertida);

        System.out.println("Data Atual " + dataAtual.format(frmtReceber));
        System.out.println("Data Convertida " + dataConvertida.format(frmtExibir));

        System.out.println("\n\n LocalTime\n");

        horaAtual = LocalTime.now();
        System.out.println("Hora Atual: " + horaAtual);

        horaFutura = horaAtual.plusHours(1);
        horaFutura = horaFutura.plusMinutes(10);

        System.out.println("Hora Atual somando 1:10 " + horaFutura);

        horaFutura = horaFutura.minusHours(1);
        horaFutura = horaFutura.minusMinutes(10);

        System.out.println("Hora Futura menos 1:10 " + horaFutura);

        frmtHora = DateTimeFormatter.ofPattern("HH:mm:ss");

        horaFormatada = horaFutura.format(frmtHora);
        System.out.println("Hora formatada " + horaFormatada);


        meioDia = LocalTime.of(12,0);
        System.out.println("é antes do meio dia? " + horaAtual.isBefore(meioDia));
*/
        System.out.println("\n\n Manipulação de String\n");

        texto = "   Hello, world!   ";

        System.out.println("Texto Original: " + texto);
        System.out.println("Tamanho do texto " + texto.length());
        System.out.println("Todas as letras MAIUSCULO " + texto.toUpperCase());
        System.out.println("Todas as letras em minusculo " + texto.toLowerCase());
        System.out.println("Remover os espaços extras " + texto.trim());
        System.out.println("Substituindo palavras " + 
        texto.trim().replace("Hello", "Hi").replace("!", "?"));



    }
}

