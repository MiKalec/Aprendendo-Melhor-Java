package br.com.caelum.contas.modelo;

public class SeguroDeVida implements Tributavel {
    private String titular;
    private double valor;
    private int numeroApolice;

    public double getValor() {
        return valor;
    }

    public int getNumeroApolice() {
        return numeroApolice;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setNumeroApolice(int numeroApolice) {
        this.numeroApolice = numeroApolice;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public double getValorImposto() {
        return 42 + (this.getValor()*0.02);
    }

    @Override
    public String getTitular() {
        return this.titular;
    }

    @Override
    public String getTipo() {
        return "Seguro de Vida";
    }
}
