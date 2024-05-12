package com.api.fatec.apifatecv2.entities;


import com.api.fatec.apifatecv2.shared.enums.PedidoVendaStatusEnum;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_pedido_venda")
public class PedidoVenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate emissao;
    private BigDecimal total;

    @Enumerated(EnumType.STRING)
    private PedidoVendaStatusEnum status;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pedidoVenda", orphanRemoval = true)
    private List<PedidoVendaItem> itens = new ArrayList<>();

    public PedidoVenda() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getEmissao() {
        return emissao;
    }

    public void setEmissao(LocalDate emissao) {

        this.emissao = emissao;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public PedidoVendaStatusEnum getStatus() {
        return status;
    }

    public void setStatus(PedidoVendaStatusEnum status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<PedidoVendaItem> getItens() {
        return itens;
    }

    /*public void setItens(List<PedidoVendaItem> itens) {
        this.itens = itens;
    }*/

    public void addItem(List<PedidoVendaItem> itens) {
        this.itens = itens;
        int maxIndex = itens.size();
        for(int i = 0; i < maxIndex; i++){
           itens.get(i).setPedidoVenda(this);
           itens.get(i).setValor_total();
        }

    }
}
