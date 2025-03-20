package pacote;

public class Carro {
    public String marca;
    protected String modelo;
    private boolean ligado;
    private boolean andando;

    public String getMarca(){
        return marca;
    }    
    public String getModelo(){
        return modelo;
    }
    public boolean isLigado(){
        return ligado;
    }
    public boolean isAndando(){
        return andando;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }
    public void setAndando(boolean andando){
        this.andando = andando;
    }
}
