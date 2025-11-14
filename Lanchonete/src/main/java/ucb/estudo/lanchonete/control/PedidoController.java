/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.estudo.lanchonete.control;

import ucb.estudo.lanchonete.model.Pedido;
import java.util.ArrayList;
import java.util.List;

// Classe que controla as ações do sistema (Controller no MVC)
// Aqui aplicamos dois padrões GRASP: Controller e Creator
public class PedidoController {
    // Lista para guardar os pedidos criados
    private List<Pedido> pedidos = new ArrayList<>();

    // Método responsável por criar e adicionar um novo pedido
    // Padrão usado: GRASP Creator
    // Justificativa: o padrão Creator foi aplicado aqui na classe PedidoController,
    // pois ela é quem cria os objetos da classe Pedido. O Controller cria o pedido
    // porque é ele quem usa e gerencia esses objetos no sistema.
    // Isso ajuda a manter o código organizado e com baixo acoplamento.
    public void adicionarPedido(String cliente, String item, double preco) {
        Pedido pedido = new Pedido(cliente, item, preco); // Aqui aplicamos o GRASP Creator
        pedidos.add(pedido);
    }

    // Método para listar todos os pedidos realizados
    // Padrão usado: GRASP Controller
    // Justificativa: o Controller recebe a solicitação da view (interface)
    // e coordena a ação de exibir os pedidos, sem que a view acesse o modelo diretamente.
    public void listarPedidos() {
        if (pedidos.isEmpty()) {
            System.out.println("Nenhum pedido foi realizado ainda.");
        } else {
            System.out.println("\n--- Lista de Pedidos ---");
            for (Pedido p : pedidos) {
                // Aqui usamos os getters do modelo para mostrar os dados
                System.out.println("Cliente: " + p.getCliente() +
                                   " | Item: " + p.getItem() +
                                   " | Preço: R$ " + p.getPreco());
            }
        }
    }
}
