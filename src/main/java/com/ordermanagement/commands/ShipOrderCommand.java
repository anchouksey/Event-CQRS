package com.ordermanagement.commands;

import org.axonframework.commandhandling.TargetAggregateIdentifier;
import java.util.Objects;

public class ShipOrderCommand {

    @TargetAggregateIdentifier
    private final String orderId;

    public String getOrderId() {
        return orderId;
    }

    public ShipOrderCommand(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShipOrderCommand that = (ShipOrderCommand) o;
        return orderId.equals(that.orderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId);
    }
}
