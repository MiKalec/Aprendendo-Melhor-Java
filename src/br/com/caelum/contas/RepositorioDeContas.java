package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepositorioDeContas {
    public void salva(List<Conta> contas){
        try (PrintStream stream = new PrintStream("contas.txt")) {
            for (Conta conta : contas) {
                stream.println(conta.getTipo() + "," + conta.getNumero() + ","
                        + conta.getAgencia() + "," + conta.getTitular() + ","
                        + conta.getSaldo());
            }
            stream.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public List<Conta> carrega() {
        List<Conta> contas = new ArrayList<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("contas.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String linha;

        while(scanner.hasNextLine()){
            linha = scanner.nextLine();
            String[] valores = linha.split(",");

            String tipo = valores[0];
            Conta conta;
            if(tipo.equals("Conta Corrente")){
                conta = new ContaCorrente();
            }else{
                conta = new ContaPoupanca();
            }
            conta.setNumero(Integer.parseInt(valores[1]));
            conta.setAgencia(valores[2]);
            conta.setTitular(valores[3]);
            conta.deposita(Double.parseDouble(valores[4]));
            contas.add(conta);
        }

        return contas;
    }
}
