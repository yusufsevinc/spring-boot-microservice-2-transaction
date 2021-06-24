package com.sha.springbootmicroservice2transaction.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="transaction_id")
    private Long transactionId;

    @Column(name = "user_id" , nullable = false)
    private Long userId;

    @Column(name = "product_id" , nullable = false)
    private Long productId;

    @Column(name = "transaction_time")
    private LocalDateTime transactionTime;
}
