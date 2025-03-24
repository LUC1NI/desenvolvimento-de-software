import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Aula 7");

        Materia materia1 = new Materia("PHP", 100000);
        Materia materia2 = new Materia("Java", 500);

        Aluno aluno = new Aluno("Pedro", "Silva", new Endereco("XV", "800000", 123), materia2);

        System.out.println(aluno);

        aluno.getEndereco().setRua("Rua nova");

        System.out.println("\n" + aluno);

        aluno.setRua("Outra rua");

        System.out.println("\n" + aluno);

        List<Materia> materias = new ArrayList<>();
        materias.add(materia2);
        materias.add(new Materia("C++", 10000));

        materia2.setNome("JavaScript");

        System.out.println("\n" + aluno);
        System.out.println("\n" + materias);

    }
}
