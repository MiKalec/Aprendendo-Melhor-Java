package br.com.caelum.contas.clientes;

import br.com.caelum.contas.interfaces.Autenticavel;

public class Cliente implements Autenticavel {
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getSenha() {
        return senha;
    }

    @Override
    public boolean autentica(int senha) {
        if(this.senha == senha){
            return true;
        }
        return false;
    }
}
