public class Triangulo {
    public float base;
    public float altura;

    public Triangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    }

    public float area(){
        return (base * altura) / 2;
    }
}
