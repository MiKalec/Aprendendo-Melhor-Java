package br.com.caelum.contas.funcionarios;

import br.com.caelum.contas.modelo.Autenticavel;

public class Gerente extends Funcionario implements Autenticavel {
    private int senha;
    private int numFuncionariosGerenciados;

    public boolean autentica(int senha){
        if(this.senha == senha){
            System.out.println("Acesso Permitido!");
            return true;
        }else {
            System.out.println("Acesso Negado!");
            return false;
        }
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public double getBonificacao(){
        return this.salario * 1.20;
    }
}
