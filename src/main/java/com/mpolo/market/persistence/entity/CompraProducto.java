package com.mpolo.market.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "compras_producto")
public class CompraProducto {

    @Column(name = "id_compra")
    private Integer idCompra;



}
