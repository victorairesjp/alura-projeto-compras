package edu.alura.main;

import java.util.Scanner;

import edu.alura.modelos.Cartao;
import edu.alura.modelos.Produto;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cartao limite = new Cartao();
        System.out.println("Digite o limite do seu cartão: ");
        limite.setValorLimite(scanner.nextDouble());
        System.out.println("Cadastro feito com sucesso. Seu novo limite é de: R$ " + limite.getValorLimite());

        Produto produto1 = new Produto();
        System.out.println("Digite aqui o produto comprado: ");
        produto1.setNome(scanner.next());
        System.out.println("Digite aqui o valor gasto: ");
        produto1.setPreco(scanner.nextDouble());

        System.out.println("Compra realizada: " + produto1.getNome());
        System.out.println("Valor gasto: R$ " + produto1.getPreco());

        scanner.close();
    }
}


