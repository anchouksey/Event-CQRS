package com.ordermanagement.commands;

import org.axonframework.commandhandling.TargetAggregateIdentifier;
import java.util.Objects;

public class CreateOrderCommand {

    @TargetAggregateIdentifier
    private final String orderId;

    private final String productId;

    public String getOrderId() {
        return orderId;
    }

    public String getProductId() {
        return productId;
    }

    public CreateOrderCommand(String orderId, String productId) {
        this.orderId = orderId;
        this.productId = productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateOrderCommand that = (CreateOrderCommand) o;
        return orderId.equals(that.orderId) && productId.equals(that.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, productId);
    }
}
