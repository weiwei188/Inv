package com.prd.inv.entity;

import java.math.BigDecimal;

public class Inventory {
    private Integer id;

    private Long itemId;

    private Long whId;

    private Long locaId;

    private Byte serialControl;

    private String serialNo;

    private BigDecimal quantity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Byte getSerialControl() {
        return serialControl;
    }

    public void setSerialControl(Byte serialControl) {
        this.serialControl = serialControl;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo == null ? null : serialNo.trim();
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
}