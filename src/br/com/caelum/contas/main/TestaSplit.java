package br.com.caelum.contas.main;

public class TestaSplit {
    public void splitAndRevert(String s){
        String[] frase = s.split(" ");
        String novaFrase = "";
        for(int i = frase.length - 1; i>=0; i--){
            novaFrase += frase[i] + " ";
        }
        System.out.println(novaFrase.trim());

    }
    public static void main(String[] args){
        TestaSplit t = new TestaSplit();
        String s = "Socorram-me, subi no ônibus em Marrocos";

        t.splitAndRevert(s);


    }
}
