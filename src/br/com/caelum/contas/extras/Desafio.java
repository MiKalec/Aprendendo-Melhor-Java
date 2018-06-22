package br.com.caelum.contas.extras;

import java.util.*;

//Será continuada

public class Desafio {

    public static void main(String[] args){
        // Comparador pode ser passado no construtor de TreeSet para
        // que os elementos sejam ordenados conforme este critério
        // de comparação e ordenação.
        // Este comparador pode ser escrito anonimamente dentro do
        // contrutor ou criado como um objeto separadamente. Exemplo
        // abaixo

        Comparator<Integer> decrescente = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 < o2) return 1;
                if(o1 > o2) return -1;
                return 0;
            }
        };

        Collection<Integer> teste = new TreeSet<>(decrescente/* new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 < o2) return 1;
                if(o1 > o2) return -1;
                return 0;
            }
        }*/);

        List<Integer> teste2 = new ArrayList<>();

        for(int i =1; i<=1000; i++){
            teste.add(i);
            teste2.add(i);
        }

        // .sort() pode receber um comparador

        teste2.sort(decrescente);

        System.out.println(teste);
        System.out.println(teste2);

    }

}
