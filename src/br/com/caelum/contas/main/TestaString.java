package br.com.caelum.contas.main;

public class TestaString {
    //ex5 Cap 13
    private void imprimeLinhaLinha(String s){
        for(int i = 0; i<s.length();i++){
            System.out.println(s.charAt(i));
        }
    }

    public static void main(String[] args){
        String s = " fj11 ";
        String teste = s.replaceAll("1", "2");
        boolean dentro = s.contains("j1");
        boolean vazio = s.isEmpty();
        String semEspaco = s.trim(); //tira espaço do começo e fim


        System.out.println(teste);
        System.out.println(dentro);
        System.out.println(semEspaco);
        System.out.println(vazio);
        System.out.println(s.length());

        TestaString t = new TestaString();
        t.imprimeLinhaLinha(semEspaco);

    }
}
