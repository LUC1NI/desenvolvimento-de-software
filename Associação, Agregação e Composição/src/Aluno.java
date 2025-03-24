public class Aluno {
    private String nome, sobrenome;
    private Matricula matricula; //Composição
    private Materia materia; //Associação
    private Endereco endereco; //Agregação

public Aluno(String nome, String sobrenome, Endereco endereco, Materia materia){
    this.nome =  nome;
    this.sobrenome = sobrenome;
    this.matricula = new Matricula(1);
    this.endereco = endereco;
    this.materia = materia;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getSobrenome() {
    return sobrenome;
}

public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
}

public Matricula getMatricula() {
    return matricula;
}

public void setMatricula(Matricula matricula) {
    this.matricula = matricula;
}

public Materia getMateria() {
    return materia;
}

public void setMateria(Materia materia) {
    this.materia = materia;
}

public Endereco getEndereco() {
    return endereco;
}

public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
}

public void setRua(String rua){
    endereco.setRua(rua);
}

@Override
public String toString() {
    return "Aluno [nome=" + nome + ", sobrenome=" + sobrenome + "\n   " + matricula + "\n   " + materia
            + "\n   " + endereco + "]";
}




}
