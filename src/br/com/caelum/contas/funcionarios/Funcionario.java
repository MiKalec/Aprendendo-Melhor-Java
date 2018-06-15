package br.com.caelum.contas.funcionarios;

public class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public double getBonificacao(){
        return this.salario * 0.1;
    }
}
