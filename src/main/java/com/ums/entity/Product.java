package com.ums.entity;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.HttpStatus;

@Entity
@Table(name="Product")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product extends Base {


    @NotNull(message = "productID")
    private String productID;

    //    @NotEmpty(message="productNAME")
    private String productNAME;

    @NotEmpty(message = "productDESCRIPTION")
    private String productDESCRIPTION;

    @NotNull(message = "product price is required")
    private Double productPRICE;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = true)
    private Order order;

    public void Product(HttpStatus httpStatus, String productNotFound) {

    }

    private Boolean isDelete = false;
}
