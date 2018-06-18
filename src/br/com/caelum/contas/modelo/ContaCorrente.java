package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta{
    @Override
    public String getTipo(){
        return super.getTipo() + " Corrente";
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
