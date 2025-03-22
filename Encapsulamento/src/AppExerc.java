public class AppExerc {
    public static void main(String[] args) throws Exception {
        System.out.println("Lista 4");
        
        System.out.println("\n\n Exercício 1 - Conta\n");
        Conta1 santander = new Conta1(123, "Pedro");

        System.out.println(santander);

        santander.depositar(20);
        santander.sacar(10);
        System.out.println(santander);
        santander.sacar(100);
        System.out.println(santander);

        System.out.println("\n\n Exercício 2 - Reserva\n");
        Reserva reserva = new Reserva("Pedro", 10, "19/03/2025", 100);

        System.out.println(reserva);

        System.out.println(reserva.exibirReserva());


        System.out.println("\n\n Exercício 3 - Evento");
        Evento ccxp = new Evento("CCXP", "19/03/2025", 100, 100);

        System.out.println(ccxp);

        ccxp.venderIngresso(30);
        ccxp.venderIngresso(20);

        System.out.println(ccxp);

        ccxp.venderIngresso(100);

        System.out.println("Arrecadação do Evento: R$ " + ccxp.verArrecadacao());




    }
}
