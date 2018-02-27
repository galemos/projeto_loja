package br.com.gabriel.loja.TestesPatterns.Factory;

public class MoedaFactory {
    public static Moeda criarMoeda(Pais pais){
        if(pais.equals(Pais.BRASIL)){
            return new Real();
        }else if(pais.equals(Pais.EUA)){
            return new USDolar();
        }
        throw new IllegalArgumentException("Nao existe esse pais");
    }
}
