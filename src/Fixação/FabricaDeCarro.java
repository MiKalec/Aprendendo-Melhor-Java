package Fixação;

public class FabricaDeCarro {
    //cria-se uma instancia static que acompanhará a classe
    private static FabricaDeCarro unicaFabrica = new FabricaDeCarro();
    //garante que ele nao poderá ser instanciado
    private FabricaDeCarro(){

    }
    //retorna a única instancia possível
    public static FabricaDeCarro getUnicaFabrica() {
        return unicaFabrica;
    }
}
