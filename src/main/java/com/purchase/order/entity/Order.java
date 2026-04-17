package com.purchase.order.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Orders")
@Getter
@Setter
public class Order {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;

@Enumerated(EnumType.STRING)
@Column
private OrderStatus status;

@Column
private String itemName;
}

