public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Lista de Exerícios 3");

        System.out.println("\n\nExercício 1 - Pessoa\n");
        Pessoa pessoa = new Pessoa("Pedro", 30);

        System.out.println(pessoa.apresentar());

        System.out.println("\n\nExercício 2 - Livro\n");
        Livro livro = new Livro("Cerberus", "autor", 2000);

        System.out.println(livro.informacoes());

        System.out.println("\n\nExercício 3 - Conta Bancária");

       // System.out.println(0.1f + 0.2f);

       Conta conta = new Conta(123, "Pedro");

       conta.sacar(500);
       System.out.println(conta.imprimir());
       conta.depositar(1000);
       conta.sacar(500);
       System.out.println(conta.imprimir());

       System.out.println("\n\nExercício 4 - Triangulo\n");
       Triangulo triangulo = new Triangulo(5, 10);

       System.out.println("A área do tringuloa é " + triangulo.area());

       System.out.println("\n\nExercício 5 - Cafeteira");
       Cafeteira cafe = new Cafeteira();
       
       /*boolean res = cafe.fazerCafe(); 
       if (res) {
            System.out.println("Café quentinho");
        }else{
            System.out.println("Acabou o café");
        }*/
        System.out.println((cafe.fazerCafe())? "Café quentinho" : "Acabou o café");
     
       System.out.println(cafe.status());
       cafe.encherCafe(10);
       cafe.encherAgua(100);
        cafe.qtdeCafe = 1000;
       cafe.ligar();
       cafe.encherCafe(10);
       cafe.encherAgua(100);

       System.out.println((cafe.fazerCafe())? "Café quentinho" : "Acabou o café");
       System.out.println(cafe.status());

       System.out.println((cafe.fazerCafe())? "Café quentinho" : "Acabou o café");
       System.out.println(cafe.status());
    }
}
