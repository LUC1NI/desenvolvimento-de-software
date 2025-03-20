public class Evento {
    private String nome, data;
    private float precoIngresso;
    private int qtdeIngressos, qtdeIngressosVendidos;
    
    public Evento(String nome, String data, float precoIngresso, int qtdeIngressos) {
        this.nome = nome;
        this.data = data;
        this.precoIngresso = precoIngresso;
        this.qtdeIngressos = qtdeIngressos;
        setQtdeIngressosVendidos(0);
    }

    public boolean venderIngresso(int qtde){
        if (qtde > 0 && qtdeIngressos >= qtde) {
            qtdeIngressos =  qtdeIngressos - qtde;
            qtdeIngressosVendidos += qtde;
            return true;
        }

        return false;
    }

    public float verArrecadacao(){
        return qtdeIngressosVendidos * precoIngresso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getPrecoIngresso() {
        return precoIngresso;
    }

    public void setPrecoIngresso(float precoIngresso) {
        this.precoIngresso = precoIngresso;
    }

    public int getQtdeIngressos() {
        return qtdeIngressos;
    }

    public void setQtdeIngressos(int qtdeIngressos) {
        this.qtdeIngressos = qtdeIngressos;
    }

    public int getQtdeIngressosVendidos() {
        return qtdeIngressosVendidos;
    }

    private void setQtdeIngressosVendidos(int qtdeIngressosVendidos) {
        this.qtdeIngressosVendidos = qtdeIngressosVendidos;
    }

    @Override
    public String toString() {
        return "Evento [nome=" + nome + ", data=" + data + ", precoIngresso=" + precoIngresso + ", qtdeIngressos="
                + qtdeIngressos + ", qtdeIngressosVendidos=" + qtdeIngressosVendidos + "]";
    }
    
}
