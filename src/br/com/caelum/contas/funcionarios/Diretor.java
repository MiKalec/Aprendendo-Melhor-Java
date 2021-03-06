package br.com.caelum.contas.funcionarios;

import br.com.caelum.contas.modelo.Autenticavel;

public class Diretor extends Funcionario implements Autenticavel {
    private int senha;

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public double getBonificacao() {
        return this.salario * 1.10;
    }

    @Override
    public boolean autentica(int senha) {
        if(this.senha == senha){
            return true;        }
        return false;
    }
}
