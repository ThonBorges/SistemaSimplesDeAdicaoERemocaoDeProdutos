package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;


public class Programa {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Informe os dados do produto: ");
        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("Quantidade em estoque: ");
        int quantidade = sc.nextInt();

        System.out.println("Preço: ");
        double preco = sc.nextDouble();

        Product product = new Product(nome, preco, quantidade);

        System.out.println();
        System.out.println("Dados do produto: " + product);

        System.out.println();
        System.out.print("Selecione a quantidade de produtos para ser adicionado ao estoque: ");
        quantidade = sc.nextInt();
        product.adicionaProdutos(quantidade);

        System.out.println();
        System.out.println("Dados atualizados: " + product);

        System.out.println();
        System.out.print("Selecione a quantidade de produtos que deseja remover do estoque: ");
        int removeQuantidade = sc.nextInt();
        product.removeProdutos(removeQuantidade);

        System.out.println();
        System.out.println("Dados atualizados: " + product);

        sc.close();
    }
}
