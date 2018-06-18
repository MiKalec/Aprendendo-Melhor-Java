package br.com.caelum.contasavancado.modelo;

import br.com.caelum.contasavancado.interfaces.Conta;

public class ContaPoupanca implements Conta {
    private String titular;
    private int numero;
    private String agencia;
    protected double saldo;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public void deposita(double valor) {
        if(valor>=0){
            this.saldo = this.saldo + valor;
        }else{
            System.out.println("Valor inválido.");
        }
    }

    @Override
    public boolean saca(double valor) {
        if(getSaldo()<valor || valor < 0) return false;

        this.saldo = this.saldo - valor;

        return true;
    }

    @Override
    public void atualiza(double taxaSelic) {

    }
}
