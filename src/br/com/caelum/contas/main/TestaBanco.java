package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Banco;
import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaBanco {
    public void printInfos(Banco banco){
        String infos = "";
        for(Conta c : banco.getContas()){
            infos += c.toString() + "\n";
        }
        System.out.print(infos);
    }

    public static void main(String[] args){

        Banco banco = new Banco("Caelum Bank", 999);
        TestaBanco t = new TestaBanco();

        for(int i = 0; i< banco.getContas().length; i++){
            ContaCorrente conta	=	new	ContaCorrente();
            conta.setTitular("Batman" + i);
            conta.setNumero(i);
            conta.setAgencia("1000" + i );
            conta.deposita(1000 + i * 100);
            banco.adiciona(conta);
        }

        System.out.println(banco.contemConta(banco.getContas()[0]));
        Conta c1 = new ContaCorrente();
        System.out.println(banco.contemConta(c1));

        /*ContaCorrente c1	=	new	ContaCorrente();
        c1.setTitular("Batman");
        c1.setNumero(1);
        c1.setAgencia("1000");
        c1.deposita(100000);
        banco.adiciona(c1);

        ContaCorrente c2	=	new	ContaCorrente();
        c1.setTitular("Coringa");
        c1.setNumero(2);
        c1.setAgencia("1000");
        c1.deposita(100000);
        banco.adiciona(c2);

        ContaCorrente c3	=	new	ContaCorrente();
        c1.setTitular("Batgirl");
        c1.setNumero(3);
        c1.setAgencia("1000");
        c1.deposita(100000);
        banco.adiciona(c3);
        */
        t.printInfos(banco);

    }
}
