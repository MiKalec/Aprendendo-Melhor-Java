package br.com.caelum.contas.main;

import java.util.*;

public class TestaPerformance {
    public void tempoComList(Collection<Integer> teste){
        System.out.println("Iniciando com list...");
        teste = new ArrayList<>();
        long inicio = System.currentTimeMillis();

        int total = 30000;

        for(int i=0; i<total; i++){
            teste.add(i);
        }

        long posAdd = System.currentTimeMillis();
        double tempoAdd = (posAdd-inicio) /1000.0;
        System.out.println("Tempo adicionando: " + tempoAdd);

        for(int i=0; i<total; i++){
            teste.contains(i);
        }
        long fim = System.currentTimeMillis();

        double tempoContem = (fim - posAdd) / 1000.0;
        System.out.println("Tempo conferindo contém: " + tempoContem);

        double tempo = (fim-inicio) / 1000.0;
        System.out.println("Tempo total gasto: " + tempo);
    }

    public void tempoComHashSet(Collection<Integer> teste){
        System.out.println("Iniciando com hashSet...");
        teste = new HashSet<>();
        long inicio = System.currentTimeMillis();

        int total = 30000;

        for(int i=0; i<total; i++){
            teste.add(i);
        }
        long posAdd = System.currentTimeMillis();
        double tempoAdd = (posAdd-inicio) /1000.0;
        System.out.println("Tempo adicionando: " + tempoAdd);

        for(int i=0; i<total; i++){
            teste.contains(i);
        }
        long fim = System.currentTimeMillis();
        double tempoContem = (fim - posAdd) / 1000.0;
        System.out.println("Tempo conferindo contém: " + tempoContem);

        double tempo = (fim-inicio) / 1000.0;
        System.out.println("Tempo total gasto: " + tempo);
    }

    public void adicionaPrimeiraPosiçãoLinkedList(List<Integer> teste){
        System.out.println("Iniciando com LinkedList...");
        teste = new LinkedList<>();
        long inicio = System.currentTimeMillis();

        int total = 30000;
        for(int i=0; i<total; i++){
            teste.add(0, i);
        }
        long fim = System.currentTimeMillis();
        double tempo = (fim-inicio) / 1000.0;
        System.out.println("Tempo total gasto: " + tempo);
    }

    public void adicionaPrimeiraPosiçãoArrayList(List<Integer> teste){
        System.out.println("Iniciando com ArrayList...");
        teste = new ArrayList<>();
        long inicio = System.currentTimeMillis();

        int total = 30000;
        for(int i=0; i<total; i++){
            teste.add(0, i);
        }
        long fim = System.currentTimeMillis();
        double tempo = (fim-inicio) / 1000.0;
        System.out.println("Tempo total gasto: " + tempo);
    }

    public static void main(String[] args){
        TestaPerformance t = new TestaPerformance();
        Collection<Integer> teste = null;
        List<Integer> teste2 = null;
        t.tempoComList(teste);
        System.out.println();
        t.tempoComHashSet(teste);
        System.out.println();
        t.adicionaPrimeiraPosiçãoArrayList(teste2);
        System.out.println();
        t.adicionaPrimeiraPosiçãoLinkedList(teste2);
    }
}
