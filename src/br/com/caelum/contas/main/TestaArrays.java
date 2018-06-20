package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;




public class TestaArrays {
    private void criaArray(Conta[] contas){
        for(int i =0; i<contas.length; i++){
            Conta c = new ContaCorrente();
            c.deposita(i*100);
            contas[i] = c;
        }
    }

    private void media(Conta[] contas){
        double soma = 0;
        for(Conta c:contas){
            soma += c.getSaldo();
        }
        System.out.println(soma/contas.length);
    }

    public static void main(String[] args){
        TestaArrays t = new TestaArrays();
        Conta[] contas = new Conta[10];
        t.criaArray(contas);
        t.media(contas);
    }
}
