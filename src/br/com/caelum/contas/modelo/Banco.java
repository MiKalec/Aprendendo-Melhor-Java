package br.com.caelum.contas.modelo;

import java.util.List;
import java.util.Map;

public class Banco {
    private String nome;
    private int numero;
    private List<Conta> contas;
    private Map<String, Conta> mapaContas;
    public Banco(String nome, int numero){
        this.nome = nome;
        this.numero = numero;
        this.contas = null;
        this.mapaContas = null;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public Map<String, Conta> getMapaContas() {
        return mapaContas;
    }

    public boolean contemConta(Conta conta){
        return this.contas.contains(conta);
    }

    public void adiciona(Conta conta){
        this.contas.add(conta);
        this.mapaContas.put(conta.getTitular(), conta);
    }

    public Conta pega(int x){
        return this.contas.get(x);
    }

    public int pegaQuantidadeDeContas(){
        return this.contas.size();
    }

    public Conta buscaPorTitular(String titular){
        return this.mapaContas.get(titular);
    }

    /*public void reposicionaArray(int i){
        Conta[] novoArray = new Conta[i];
        int j =0;
        for(Conta c: this.contas){
            novoArray[j] = c;
            j++;
        }
        this.contas = novoArray;
    }*/
}
