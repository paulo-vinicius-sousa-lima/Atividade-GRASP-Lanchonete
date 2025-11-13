/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.estudo.lanchonete.model;

// Classe que representa um pedido (Model no padrão MVC)
// Aqui ficam apenas os dados e métodos ligados ao pedido
public class Pedido {
    private String cliente;
    private String item;
    private double preco;

    // Construtor que cria o pedido com os dados passados
    public Pedido(String cliente, String item, double preco) {
        this.cliente = cliente;
        this.item = item;
        this.preco = preco;
    }

    // Getters e Setters para acessar e alterar os dados do pedido
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
