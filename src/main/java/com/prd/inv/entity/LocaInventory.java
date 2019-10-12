package com.prd.inv.entity;

import java.math.BigDecimal;

public class LocaInventory {
    private Long id;

    private Long itemId;

    private Long whId;

    private Long locaId;

    private BigDecimal quantity;

    private BigDecimal availableQuantity;

    private BigDecimal assignedQuantity;

    private BigDecimal frozenQuantity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getWhId() {
        return whId;
    }

    public void setWhId(Long whId) {
        this.whId = whId;
    }

    public Long getLocaId() {
        return locaId;
    }

    public void setLocaId(Long locaId) {
        this.locaId = locaId;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(BigDecimal availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public BigDecimal getAssignedQuantity() {
        return assignedQuantity;
    }

    public void setAssignedQuantity(BigDecimal assignedQuantity) {
        this.assignedQuantity = assignedQuantity;
    }

    public BigDecimal getFrozenQuantity() {
        return frozenQuantity;
    }

    public void setFrozenQuantity(BigDecimal frozenQuantity) {
        this.frozenQuantity = frozenQuantity;
    }

    @Override
    public String toString() {
        return "LocaInventory{" +
                "id='" + id + '\'' +
                ", whId='" + whId + '\'' +
                ", locaId='" + locaId + '\'' +
                ", quantity='" + quantity + '\'' +
                ", availableQuantity='" + availableQuantity + '\'' +
                ", assignedQuantity='" + assignedQuantity + '\'' +
                ", frozenQuantity='" + frozenQuantity + '\'' +
                '}';
    }
}