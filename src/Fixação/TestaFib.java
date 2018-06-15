package Fixação;

public class TestaFib {
    public static void main(String[]args){
        Fibonacci f = new Fibonacci();
        for(int i = 1; i<=10; i++){
            int resultado = f.calculaFibonacci(i);
            System.out.println(resultado);
        }
    }
}
