import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Collections");

        System.out.println("\n///////// LISTAS EM JAVA ////// \n");

        //Eficiente para busca aleatoria porém menos eficiente em remocão e inscrição
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("PHP");
        arrayList.add("C++");


        //Eficiente em inscrição e remoção porém menos eficiente em busca aleatoria
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Java");
        linkedList.add("PHP");
        linkedList.add("C++");

        linkedList.replaceAll(elemento -> elemento.equals("C++")? "C#" : elemento);

        linkedList.removeIf(elemento -> elemento.equals("C#"));
        linkedList.addAll(Arrays.asList("JavaScript", "Python", "Ruby"));

        int[] iterador = {0};

        linkedList.forEach(e -> System.out.println("ForEach " + iterador[0]++ + "" + e));

        linkedList.forEach(System.out::println);

        Aluno aluno = new Aluno("João", new ArrayList<Materia>
        ());

        String [] nomesMaterias = {"PHP", "Java", "C++", "JavaScript", "CSS3", "HTML5"};

        for (String mat : nomesMaterias) {
            // Somente nesta aula.
            aluno.getMaterias().add(new Materia(mat));
        }

        // não repetir isso

        Materia html = null;
        Materia c = null;

        for (Materia mat : aluno.getMaterias()) {
            if (mat.getNome().equals("HTML5")) {
                html = mat;
            }
            if(mat.getNome().equals("C++")){
                c = mat;
            }
        }

        if(html != null) aluno.getMaterias().remove(html);
        if(c != null) c.setNome("C#");

        Materia css = new Materia("CSS3");

        System.out.println(aluno.getMaterias().size());
        System.out.println("Possui o objeto " + aluno.getMaterias().contains(css));

        aluno.getMaterias().set(2, css);
        System.out.println(aluno);












    }
}
