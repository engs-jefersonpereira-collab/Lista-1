package atividade5;

public class Produto {
    
    private String nome;
    private double precoCusto;
    private double precoVenda;
    private int qtdEstoque;

    
    public Produto(String nome, double precoCusto, double precoVenda, int qtdEstoque) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.qtdEstoque = qtdEstoque;
    }

    
    public double lucroPresumido() {
        return (precoVenda - precoCusto) * qtdEstoque;
    }

    
    public void vender(int qtd) {
        if (qtdEstoque >= qtd) {
            qtdEstoque -= qtd;
            System.out.println("Venda realizada");
        } else {
            System.out.println("Estoque insuficiente");
        }
    }

   
    public int getQtdEstoque() {
        return qtdEstoque;
    }
}