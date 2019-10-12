package com.prd.inv.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Item {
    private Long id;

    private String itemCode;

    private String itemName;

    private Byte itemType;

    private Byte itemGroup;

    private String itemCate;

    private String unit;

    private Long defaultWhId;

    private Long defaultLocaId;

    private Byte serialControl;

    private Byte serialStyle;

    private Byte specControl;

    private BigDecimal safeInventory;

    private Date gmtCreated;

    private String createdByCode;

    private String createdByName;

    private Date gmtModified;

    private String modifiedByCode;

    private String modifiedByName;

    private Byte isDeleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode == null ? null : itemCode.trim();
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public Byte getItemType() {
        return itemType;
    }

    public void setItemType(Byte itemType) {
        this.itemType = itemType;
    }

    public Byte getItemGroup() {
        return itemGroup;
    }

    public void setItemGroup(Byte itemGroup) {
        this.itemGroup = itemGroup;
    }

    public String getItemCate() {
        return itemCate;
    }

    public void setItemCate(String itemCate) {
        this.itemCate = itemCate == null ? null : itemCate.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Long getDefaultWhId() {
        return defaultWhId;
    }

    public void setDefaultWhId(Long defaultWhId) {
        this.defaultWhId = defaultWhId;
    }

    public Long getDefaultLocaId() {
        return defaultLocaId;
    }

    public void setDefaultLocaId(Long defaultLocaId) {
        this.defaultLocaId = defaultLocaId;
    }

    public Byte getSerialControl() {
        return serialControl;
    }

    public void setSerialControl(Byte serialControl) {
        this.serialControl = serialControl;
    }

    public Byte getSerialStyle() {
        return serialStyle;
    }

    public void setSerialStyle(Byte serialStyle) {
        this.serialStyle = serialStyle;
    }

    public Byte getSpecControl() {
        return specControl;
    }

    public void setSpecControl(Byte specControl) {
        this.specControl = specControl;
    }

    public BigDecimal getSafeInventory() {
        return safeInventory;
    }

    public void setSafeInventory(BigDecimal safeInventory) {
        this.safeInventory = safeInventory;
    }

    public Date getGmtCreated() {
        return gmtCreated;
    }

    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    public String getCreatedByCode() {
        return createdByCode;
    }

    public void setCreatedByCode(String createdByCode) {
        this.createdByCode = createdByCode == null ? null : createdByCode.trim();
    }

    public String getCreatedByName() {
        return createdByName;
    }

    public void setCreatedByName(String createdByName) {
        this.createdByName = createdByName == null ? null : createdByName.trim();
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getModifiedByCode() {
        return modifiedByCode;
    }

    public void setModifiedByCode(String modifiedByCode) {
        this.modifiedByCode = modifiedByCode == null ? null : modifiedByCode.trim();
    }

    public String getModifiedByName() {
        return modifiedByName;
    }

    public void setModifiedByName(String modifiedByName) {
        this.modifiedByName = modifiedByName == null ? null : modifiedByName.trim();
    }

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }
}