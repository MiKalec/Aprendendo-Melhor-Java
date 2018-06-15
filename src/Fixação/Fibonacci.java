package Fixação;

public class Fibonacci {

    int calculaFibonacci(int posicao) {
        int resultado;

        if (posicao == 0) {
            resultado = 0;
        }else if(posicao == 1){
            resultado = 1;
        }else {
            resultado = calculaFibonacci(posicao - 1) + calculaFibonacci(posicao - 2);

        }
        return resultado;
    }


}
