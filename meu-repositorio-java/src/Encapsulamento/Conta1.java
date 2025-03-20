public class Conta1 {
    private int numConta;
    private String titular;
    private double saldo;

    public Conta1(int numConta, String titular) {
        this.numConta = numConta;
        this.titular = titular;
        setSaldo(0);
    }

    public void depositar(double valor){
        if (valor > 0) saldo += valor;
    }

    public void sacar(double valor){
        if(valor > 0 && saldo >= valor) saldo -= valor;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta [numConta=" + numConta + ", titular=" + titular + ", saldo=" + saldo + "]";
    }
    
}
