package br.com.caelum.contas.modelo;

import br.com.caelum.contas.interfaces.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {

    @Override
    public double getValorImposto() {
        return this.getSaldo() * 0.01;
    }

    public String getTipo(){
        return "Conta Corrente";
    }
    @Override
    public boolean saca(double valor){
        if(valor <= saldo){
            this.saldo -= (valor+0.10);
            return true;
        }
        return false;
    }
}
