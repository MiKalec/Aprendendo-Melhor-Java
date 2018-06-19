package br.com.caelum.contas.modelo;

import br.com.caelum.contas.exceptions.SaldoInsuficienteException;

public class ContaCorrente extends Conta implements Tributavel {

    @Override
    public double getValorImposto() {
        return this.getSaldo() * 0.01;
    }

    public String getTipo(){
        return "Conta Corrente";
    }
    @Override
    public void saca(double valor){
        if(valor < 0){
            throw new IllegalArgumentException("Valor inválido");
        } if(valor > this.getSaldo()){
            throw new SaldoInsuficienteException(valor);
        } else{
        this.saldo -= (valor + 0.10);
        }

        /*if(valor <= saldo){
            this.saldo -= (valor+0.10);
            return true;
        }
        return false;*/
    }
}
