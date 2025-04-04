import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Aluno aluno = new Aluno("Pedro", new LinkedList<Materia>());
        
        String[] nomesMaterias = {"PHP", "Java", "C++", "Python", "JavaScript", "Ruby", "HTML5"};

        for (String mat : nomesMaterias) {
            aluno.addMateria(new Materia(mat));
        }
        System.out.println(aluno);

        Collections.sort(aluno.getMaterias());

        System.out.println(aluno);

        System.out.println("\n*************** STREAM EM JAVA ***************\n");

        Materia html = aluno.getMaterias()
        .stream()
        .filter(e -> e.getNome().equals("HTML5"))
        .findFirst()
        .orElse(null);

        System.out.println((html != null)? html : "Matéria não encontrada");

        List<Materia> listaNova = aluno.getMaterias()
            .stream()
            .map(m -> new Materia(m.getNome() + "!"))
            .collect(Collectors.toList());

        System.out.println(listaNova);

        aluno.addMateria(new Materia("PHP"));

        listaNova = aluno.getMaterias()
         .stream()
         .filter(m -> m.getNome().equals("PHP"))
         .collect(Collectors.toList());

        System.out.println(listaNova);
        
        System.out.println(aluno.getMaterias()
            .stream()
            .map(Materia::getNome)
            .reduce("Materias: ", 
            (novaString, stringIteradora) -> novaString+ stringIteradora + ", " )
        );

        System.out.println("\n *********** SET EM JAVA *********** \n");

        //HashSet não mantém ordem

        Set<String> hashSet = new HashSet<>();

        hashSet.add("Java");
        hashSet.add("C#");
        hashSet.add("C++");
        hashSet.add("PHP");
        hashSet.add("C#");
        hashSet.add("C++");
        
        System.out.println(hashSet);

        //LinkedHashSet mantém a ordem de inserção

        Set<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Java");
        linkedHashSet.add("C#");
        linkedHashSet.add("C++");
        linkedHashSet.add("PHP");
        linkedHashSet.add("C#");
        linkedHashSet.add("C++");
        
        System.out.println(linkedHashSet);

        //TreeSet mantém em ordem alfabetica - precisa do Comparable

        Set<String> treeSet = new TreeSet<>();

        treeSet.add("Java");
        treeSet.add("C#");
        treeSet.add("C++");
        treeSet.add("PHP");
        treeSet.add("C#");
        treeSet.add("C++");
        
        System.out.println(treeSet);


        


    
    }
}

