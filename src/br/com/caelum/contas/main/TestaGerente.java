package br.com.caelum.contas.main;

import br.com.caelum.contas.funcionarios.Gerente;

public class TestaGerente {
    public static void main (String[] args){
        Gerente gerente = new Gerente();
        gerente.setNome("João da Silva");
        gerente.setSenha(4321);
    }

}
