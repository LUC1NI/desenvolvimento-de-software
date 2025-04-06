// João Vitor Lucini - 39026957

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List<Livro> livros = new ArrayList<>();
        livros.add(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "Fantasia", 5));
        livros.add(new Livro("1984", "George Orwell", "Ficção", 3));
        livros.add(new Livro("A Revolução dos Bichos", "George Orwell", "Ficção", 2));
        livros.add(new Livro("Dom Casmurro", "Machado de Assis", "Literatura", 4));

        Collections.sort(livros);


        Biblioteca biblioteca = new Biblioteca("Biblioteca do centro", livros);

        System.out.println("Livros disponíveis na biblioteca:");
        for (Livro livro : biblioteca.getLivrosDisponiveis()) {
            System.out.println(livro);
        }

        Cliente cliente = new Cliente("João", new ArrayList<>());

        List<Livro> livrosParaEmprestar = new ArrayList<>();
        livrosParaEmprestar.add(livros.get(0)); 
        livrosParaEmprestar.add(livros.get(1)); 

        List<Livro> livrosEmprestados = biblioteca.emprestarLivros(livrosParaEmprestar);
        cliente.setLivrosEmprestados(livrosEmprestados);

        System.out.println("Livros Emprestados: " + cliente.getLivrosEmprestados());


        biblioteca.devolverLivros(cliente.getLivrosEmprestados());
        cliente.setLivrosEmprestados(new ArrayList<>()); 

        System.out.println("Livros devolvidos com sucesso.");

        System.out.println("Livros disponíveis na biblioteca:");
        for (Livro livro : biblioteca.getLivrosDisponiveis()) {
            System.out.println(livro);
        }
    }
}