import pacote.Carro;

public class App5 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Carro carro = new Carro();

        carro.marca = "Mitsubishi";
        //carro.modelo = "Lancer Evo X";
        carro.setModelo("Lancer Evo X");
        carro.setLigado(true);
        carro.setAndando(true);
    }
}
