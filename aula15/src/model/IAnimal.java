package model;

public interface IAnimal extends Comparable<IAnimal>{

    String TESTE = "Teste";
    
    String emitirSom();
    String andar();
    
   // String getNome(); // não é uam boa pratica

    default String padrao(){
        return "Método padrão";
    }



}
