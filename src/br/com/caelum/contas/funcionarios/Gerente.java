package br.com.caelum.contas.funcionarios;

public class Gerente extends Funcionario {
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
        //teste pra ver se ta commitando ou nao
        int a = 1;
    }

}
