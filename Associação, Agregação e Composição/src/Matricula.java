public class Matricula {
    private int numMatricula;

    public Matricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    @Override
    public String toString() {
        return "Matricula [numMatricula=" + numMatricula + "]";
    }    
}