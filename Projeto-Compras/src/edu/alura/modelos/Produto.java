package edu.alura.modelos;

import java.util.List;

public class Produto {
    private String nome;
    private double preco;
    

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    // Getters && Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }    

    // Methods
    public double somarPrecos(List<Produto> listaCompras) {
        double total = 0;
        for (Produto item : listaCompras) {
            total += item.getPreco();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Produto: " + this.nome + " | Valor: R$ " + this.preco;
    }
}
