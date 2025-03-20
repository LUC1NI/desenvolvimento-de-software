public class Cafeteira {
    public boolean ligado;
    public int qtdeCafe;
    public int qtdeAgua;

    public Cafeteira(){
        ligado = false;
        qtdeCafe = 0;
        qtdeAgua = 0;
    }

    public void ligar(){
        ligado = true;
    }

    public void desligar(){
        ligado = false;
    }

    public void encherCafe(int qtde){
        if(qtde > 0 && ligado) qtdeCafe += qtde;
    }

    public void encherAgua(int qtde){
        if(qtde > 0 && ligado) qtdeAgua += qtde;
    }

    public String status(){
        return "\n A cafeira está " + ((ligado)? "Ligada" : "Desligada") + 
        "\n Quantidade de Café " + qtdeCafe + "g" + 
        "\n Quantidade de Água " + qtdeAgua + "ml";
    }

    public boolean fazerCafe(){
        if (ligado && qtdeCafe >= 7 && qtdeAgua >= 30) {
            qtdeCafe -= 7;
            qtdeAgua -= 30;
            return true;
        }
        return false;
    }
}
