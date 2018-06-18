package br.com.caelum.contasavancado.interfaces;

public interface Conta {
    public double getSaldo();
    public void deposita(double valor);
    public boolean saca(double valor);
    public void atualiza(double taxaSelic);
}
