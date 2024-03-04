package com.ums.entity;
import jakarta.validation.constraints.Size;
import lombok.*;
import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="Orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Order extends Base{

    @Column(name="orderID",nullable = false)
    private Long orderID;

    @Column(name="orderNAME",nullable = false)
    private String orderName;

    @Column(name="Quantity")
    private int Quantity;

    @OneToMany(mappedBy="order",cascade=CascadeType.ALL,orphanRemoval=true)
    private List<Product> products;

    private Boolean isDelete = false;
}