package Fixação.casa;

public class Porta {
    boolean aberta = false;
    String cor;
    double dimensaoX;
    double dimensaoY;
    double dimensaoZ;

    void abre(){
        if(!this.aberta){
            this.aberta = true;
        }
    }
    void fecha(){
        if(this.aberta){
            this.aberta = false;
        }
    }
    void pinta(String s){
        this.cor = s;
    }
    boolean estaAberta(){
        return this.aberta;
    }
}
