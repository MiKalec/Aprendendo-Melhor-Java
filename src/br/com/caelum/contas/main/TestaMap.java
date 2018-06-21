package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class TestaMap {

    public void adicionaContaNoMapa(Map mapa, String chave){
        mapa.put(chave, criaContaCorrente());
    }

    public Conta criaContaCorrente(){
        Conta conta = new ContaCorrente();
        //Random aleatorio = new Random();
        //conta.deposita(aleatorio.nextDouble());
        return conta;
    }

    public static void main(String[] args){
        Map<String, Conta> mapaDeContas = new HashMap<>();
        TestaMap t = new TestaMap();
        t.adicionaContaNoMapa(mapaDeContas, "diretor");
        t.adicionaContaNoMapa(mapaDeContas, "gerente");
        t.adicionaContaNoMapa(mapaDeContas, "diretor");
        t.adicionaContaNoMapa(mapaDeContas, "diretor");
        t.adicionaContaNoMapa(mapaDeContas, "diretor");
        t.adicionaContaNoMapa(mapaDeContas, "gerente");
        t.adicionaContaNoMapa(mapaDeContas, "diretor");
        t.adicionaContaNoMapa(mapaDeContas, "diretor");
        t.adicionaContaNoMapa(mapaDeContas, "gerente");
        t.adicionaContaNoMapa(mapaDeContas, "diretor");

        Conta contaDir = mapaDeContas.get("diretor");
        System.out.println(contaDir);
    }
}
