package com.sharath.jpa.models.embedded;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "demo_order")
public class Order {
    @EmbeddedId
    private OrderId id;

    private String orderInfo;
    private String orderDetail;
}
