package br.com.caelum.contas.main;
import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.Data;

public class Banco {
    public static void main(String[] args){
        Data data = new Data(29,2,1987);
        Conta c = new Conta("Hugo", 1234543, "45678-9", data);

        c.deposita(200.0);
        c.saca(10);
        System.out.println(c.imprimeDados());
        System.out.println(Conta.getNumContasCriadas());

    }
}
