package br.com.gabriel.loja.TestesPatterns.Strategy;

public class ISS implements Imposto {
    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }
}
