package br.com.caelum.contas.modelo;

public class Conta {
    private String titular;
    private int numero;
    private String agencia;
    protected double saldo;
    private Data dataAbertura;
    private static int numContasCriadas;
    private int identificador;

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public Data getDataAbertura() {
        return dataAbertura;
    }

    public String getTipo(){ return "Conta";}

    public static int getNumContasCriadas() {
        return numContasCriadas;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getIdentificador() {
        return identificador;
    }

    public boolean saca(double valor){
        if(getSaldo()<valor || valor < 0) return false;

        this.saldo = this.saldo - valor;

        return true;
    }

    public void deposita(double valor){
        if(valor>=0){
            this.saldo = this.saldo + valor;
        }else{
            System.out.println("Valor inválido.");
        }

    }

    private double calculaRendimento(){
        double rendimento = getSaldo() * 0.1;
        return rendimento;
    }

    public String imprimeDados(){
        String dados = "Titular: " + getTitular();
        dados += "\nNúmero da conta: " + getNumero();
        dados += "\nAgência: " + getAgencia();
        dados += "\nSaldo: " + getSaldo();
        dados += "\nbr.com.caelum.contas.modelo.Data de Abertura: " + getDataAbertura().formatada();
        dados += "\nRendimento mensal: " + calculaRendimento();
        dados += "\nIdentificador: " + getIdentificador();
        return dados;
    }

    public boolean transfere(double valor, Conta destino){

        if(this.saldo>=valor){
            this.saca(valor);
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public Conta(){}

    public Conta(String titular, int numero, String agencia, Data data){
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = 0.0;
        this.dataAbertura = data;
        Conta.numContasCriadas++;
        this.setIdentificador(Conta.getNumContasCriadas());
    }

}
