package com.shop.entity;

import com.shop.constant.OrderStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
@Getter@Setter
public class Order {


    @Id
    @GeneratedValue
    @Column(name ="order_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name ="member_id")
    private Member member;

    private LocalDateTime orderData;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    private LocalDateTime localDateTime;

    private LocalDateTime updateTime;


}
