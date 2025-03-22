public class Carro {
    public String marca;
    public String modelo;
    public boolean ligado;
    public boolean andando;

    public Carro(){}

    public Carro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        this.ligado = false;
        this.andando = false;
    }

    public void ligar(){
        this.ligado = true;
    }

    public void desligar(){
        this.ligado = false;
    }

    public void andar(){
        this.andando = true;
    }

    public void parar(){
        this.andando = false;
    }
}
