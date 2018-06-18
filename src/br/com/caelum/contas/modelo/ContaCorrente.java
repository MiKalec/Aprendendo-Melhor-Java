package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta{

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
