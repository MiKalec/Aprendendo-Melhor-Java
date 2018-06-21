package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class TestaLista {
    public void criaContaArrayList(){
        List<Conta> contas = new ArrayList<Conta>();
        Random saldo = new Random();
        for(int i = 0; i<10; i++){
            Conta conta = new ContaCorrente();
            conta.deposita(saldo.nextDouble());
            contas.add(conta);
        }
        System.out.println(contas);
    }

    public void criaContaLinkedList(){
        List<Conta> contas = new LinkedList<>();
        Random saldo = new Random();
        for(int i = 0; i<10; i++){
            Conta conta = new ContaCorrente();
            conta.deposita(saldo.nextInt());
            contas.add(conta);
        }
        System.out.println(contas);
    }

    public static void main(String[] args){
        TestaLista t = new TestaLista();
        t.criaContaArrayList();
        t.criaContaLinkedList();
    }
}
