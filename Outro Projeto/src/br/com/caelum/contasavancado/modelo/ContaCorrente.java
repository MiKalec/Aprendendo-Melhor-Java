package br.com.caelum.contasavancado.modelo;

import br.com.caelum.contasavancado.interfaces.Conta;
import br.com.caelum.contasavancado.interfaces.ContaTributavel;

public class ContaCorrente implements ContaTributavel {
    private String titular;
    private int numero;
    private String agencia;
    private double saldo;


    @Override
    public double getValorImposto() {
        return this.getSaldo()*0.01;
    }

    public String getTitular() {
        return titular;
    }

    @Override
    public String getTipo() {
        return "Conta Corrente";
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
        if(valor <= saldo){
            this.saldo -= (valor+0.10);
            return true;
        }
        return false;

    }

    @Override
    public void atualiza(double taxaSelic) {
        this.saldo += this.saldo * taxaSelic;
    }
}
