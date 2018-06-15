package br.com.caelum.contas.modelo;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    private boolean dataValida(int dia, int mes, int ano){
        if(dia>0 && dia<31){
            if(mes == 2 && dia > 28){
                System.out.println("br.com.caelum.contas.modelo.Data inválida");
                return false;
            }
            return true;
        }
        System.out.println("br.com.caelum.contas.modelo.Data inválida");
        return false;
    }

    String formatada(){
        String formatada = this.dia + "/" + this.mes + "/" + this.ano;
        return formatada;
    }

    public Data(int dia, int mes, int ano){
        if(this.dataValida(dia, mes, ano)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }

    }
}
