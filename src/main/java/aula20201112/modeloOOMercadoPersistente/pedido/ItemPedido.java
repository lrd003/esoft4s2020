package aula20201112.modeloOOMercadoPersistente.pedido;

import aula20201112.modeloOOMercadoPersistente.BaseEntity;
import aula20201112.modeloOOMercadoPersistente.produto.Produto;

public class ItemPedido extends BaseEntity {
    private double quantidade;
    private double valorUnitário;
    private Produto produto;

    public ItemPedido(Produto produto, double quantidade, double valorUnitário) {
        super();
        this.valorUnitário = valorUnitário;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public Produto getProduto() {
        return produto;
    }
    public double getQuantidade() {
        return quantidade;
    }
    public double getValorUnitário() {
        return valorUnitário;
    }
    public double getValorTotal() {
        return valorUnitário * quantidade;
    }
    

}
