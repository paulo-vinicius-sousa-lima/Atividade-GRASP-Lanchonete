/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ucb.estudo.lanchonete.view;

import ucb.estudo.lanchonete.controller.PedidoController;
import java.util.Scanner;

// Classe principal (View no MVC)
// Aqui aplicamos o padrão MVC separando a interface do controle
public class Lanchonete {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PedidoController controller = new PedidoController(); // GRASP Controller: recebe e controla as ações

        int opcao;
        do {
            System.out.println("=== SISTEMA DE PEDIDOS DA LANCHONETE ATLANTA ===");
            System.out.println("1. Adicionar pedido");
            System.out.println("2. Listar pedidos");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpa o buffer

            switch (opcao) {
                case 1 -> {
                    // Usuário digita os dados do pedido, a view só pega os dados e manda pro controller
                    System.out.print("Nome do cliente: ");
                    String cliente = sc.nextLine();
                    System.out.print("Item: ");
                    String item = sc.nextLine();
                    System.out.print("Preço: R$ ");
                    double preco = sc.nextDouble();

                    // Aqui chamamos o método do controller (GRASP Controller)
                    // O controller é responsável por criar o pedido (GRASP Creator)
                    controller.adicionarPedido(cliente, item, preco);
                    System.out.println("Pedido adicionado com sucesso!");
                    System.out.println();
                }
                // Aqui também chamamos o controller para listar
                // A view não acessa os dados diretamente
                case 2 -> {
                    controller.listarPedidos();
                    System.out.println();
                }
                case 3 -> {
                    System.out.println();
                    System.out.println("Encerrando o sistema...");
                }
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 3);

        sc.close();
    }
}
