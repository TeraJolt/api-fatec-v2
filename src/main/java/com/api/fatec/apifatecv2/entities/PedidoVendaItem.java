package com.api.fatec.apifatecv2.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name="tb_pedido_venda_item")
public class PedidoVendaItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer quantidade;
    private BigDecimal valor_total;
    private BigDecimal valor_unitario;

    @ManyToOne
    @JoinColumn(name = "pedido_venda_id")
    @JsonIgnore
    private PedidoVenda pedidoVenda;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;

    public PedidoVendaItem() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValor_total() {
        return valor_total;
    }

    public void setValor_total() {
        this.valor_total = new BigDecimal(this.quantidade * this.valor_unitario.doubleValue());
    }

    public BigDecimal getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(BigDecimal valor_unitario) {
        this.valor_unitario = valor_unitario;
    }

    public PedidoVenda getPedidoVenda() {
        return pedidoVenda;
    }

    public void setPedidoVenda(PedidoVenda pedidoVenda) {
        this.pedidoVenda = pedidoVenda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
