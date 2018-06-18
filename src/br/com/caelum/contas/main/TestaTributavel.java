package br.com.caelum.contas.main;

import br.com.caelum.contas.interfaces.Tributavel;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaTributavel {
    public static void main(String[] args){
        ContaCorrente cc = new ContaCorrente();
        cc.deposita(100);
        System.out.println(cc.getValorImposto());

        Tributavel t = cc;
        System.out.println(t.getValorImposto());
    }
}