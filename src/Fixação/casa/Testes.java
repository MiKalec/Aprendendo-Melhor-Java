package Fixação.casa;

public class Testes {
    public static void main(String [] args){
        Pessoa p = new Pessoa();
        p.nome = "Jonas";
        p.idade = 24;

        for(int i =0; i<5; i++){
            p.fazAniversario();
        }
        System.out.println(p.nome + "\nIdade: "+ p.idade);

        Porta p1 = new Porta();
        p1.aberta = true;
        p1.abre();
        p1.pinta("vermelho");

        Porta p2 = new Porta();
        p2.aberta = true;
        p2.abre();
        p2.pinta("vermelho");

        Porta p3 = new Porta();
        p3.aberta = true;
        p3.abre();
        p3.pinta("vermelho");
        p3.fecha();

        Casa c = new Casa();
        c.porta1 = p1;
        c.porta2 = p2;
        c.porta3 = p3;

        System.out.println("Quantas portas estão abertas? "+ c.quantasPortasAbertas());

    }
}
