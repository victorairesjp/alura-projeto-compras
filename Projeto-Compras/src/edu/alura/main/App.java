package edu.alura.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.alura.modelos.Cartao;
import edu.alura.modelos.Produto;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Produto> listaCompras = new ArrayList<>();

        Cartao cartao1 = new Cartao();
        System.out.println("Digite o limite do seu cartão: ");
        cartao1.setValorLimite(scanner.nextDouble());
        System.out.println("Cadastro feito com sucesso. Seu novo limite é de: R$ " + cartao1.getValorLimite());

        double totalGasto = 0;
        double saldo = cartao1.getValorLimite();

        while (saldo > 0) {
            System.out.println("Digite aqui o produto que deseja comprar: ");
            String nomeProduto = scanner.next();
            System.out.println("Digite aqui o valor do produto: ");
            double precoProduto = scanner.nextDouble();
            Produto produto = new Produto(nomeProduto, precoProduto);

            if (precoProduto <= saldo) {
                listaCompras.add(new Produto(produto.getNome(), produto.getPreco()));
                totalGasto += produto.getPreco();
                saldo = cartao1.calcularSaldo(totalGasto);
                System.out.println("Seu novo saldo é de R$ " + saldo);
            }
            else {
                System.out.println("Você não pode fazer essa compra por insuficiência de saldo.");
                break;
            }
        }

        System.out.println("Compras realizadas: " + listaCompras.toString());
        System.out.println("Valor gasto: R$ " + totalGasto);

        scanner.close();
    }
}


