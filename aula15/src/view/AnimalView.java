package view;

import java.util.ArrayList;

import controller.AnimalController;
import model.Cachorro;
import model.Gato;
import model.IAnimal;

public abstract class AnimalView {
    public static void main() {
        AnimalController controller = new AnimalController(new ArrayList<IAnimal>());

        Gato gato1 = new Gato("Garfield", "lasanha", 8);
        Gato gato2 = new Gato("Felix", "Miau", 18);

        Cachorro dog1 = new Cachorro("Pluto", "au au", 22);
        Cachorro dog2 = new Cachorro("Laica", "Nenhum", 14);

        controller.adicionarAnimal(dog1);
        controller.adicionarAnimal(dog2);
        controller.adicionarAnimal(gato1);
        controller.adicionarAnimal(gato2);

        controller.listarSoma().forEach(System.out::println);
        controller.ordenarAnimal();
        controller.listarSoma().forEach(System.out::println);
    }
}
