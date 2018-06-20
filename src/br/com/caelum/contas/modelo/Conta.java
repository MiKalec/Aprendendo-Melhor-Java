package br.com.caelum.contas.modelo;

public abstract class Conta {
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

    public abstract String getTipo();

    public static int getNumContasCriadas() {
        return numContasCriadas;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void saca(double valor){
        if(valor> this.getSaldo()){
            throw new IllegalArgumentException("Valor inválido");
        }else{
            this.saldo -= valor;
        }
        /*if(getSaldo()<valor || valor < 0) return false;

        this.saldo = this.saldo - valor;

        return true;*/
    }

    public void deposita(double valor){
        if(valor<=0){
            throw new IllegalArgumentException("Valor Inválido");
        }else{
            this.saldo += valor;
        }

        /*if(valor>=0){
            this.saldo = this.saldo + valor;
        }else{
            System.out.println("Valor inválido.");
        }*/

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
        dados += "\nTipo: "	+ this.getTipo();
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

    @Override
    public String toString(){
        return "[Titular: " + titular.toUpperCase() + ", número: " + numero + ", agencia:" + agencia + "]";
    }

    @Override
    public boolean equals(Object object){
        if(object == null) return false;

        Conta verifica = (Conta) object;

        return (this.numero == verifica.numero &&
                this.agencia.equals(verifica.agencia));

    }
    //public Conta(){}

    /*public Conta(String titular, int numero, String agencia, Data data){
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = 0.0;
        this.dataAbertura = data;
        Conta.numContasCriadas++;
        this.setIdentificador(Conta.getNumContasCriadas());
    }*/

}
