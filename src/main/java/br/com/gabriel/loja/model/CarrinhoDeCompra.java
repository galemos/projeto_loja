package br.com.gabriel.loja.model;

import java.util.*;

public class CarrinhoDeCompra {

    private final Map<Produto, Integer> produtosCompra;

    public CarrinhoDeCompra(){
        this.produtosCompra = new LinkedHashMap<>();
    }

    public Map<Produto, Integer> getProdutosCompra() {
        return Collections.unmodifiableMap(produtosCompra);
    }

    public void addProduto(final Produto produto, final int quantidade){
        if (produtosCompra.containsKey(produto)){
            int novaQuantidade = produtosCompra.get(produto) + quantidade;
            produtosCompra.put(produto, novaQuantidade);
        } else {
            produtosCompra.put(produto, quantidade);
        }
    }

    public double getValorTotalCarrinho(){
        double saldoDevedor = 0;

        for (Produto prod : produtosCompra.keySet()) {
            saldoDevedor += prod.getValor() * produtosCompra.get(prod);
        }

        return saldoDevedor;
    }
}
