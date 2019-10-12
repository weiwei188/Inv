package com.prd.inv.entity;

import java.util.Date;

public class Warehouse {
    private Long id;

    private String whCode;

    private String whName;

    private Byte isLocaEnabled;

    private Byte isMrpEnabled;

    private Long orgId;

    private String attribute;

    private Byte isEnabled;

    private Byte isDeleted;

    private Date gmtCreated;

    private String createdByCode;

    private String createdByName;

    private Date gmtModified;

    private String modifiedByCode;

    private String modifiedByName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWhCode() {
        return whCode;
    }

    public void setWhCode(String whCode) {
        this.whCode = whCode == null ? null : whCode.trim();
    }

    public String getWhName() {
        return whName;
    }

    public void setWhName(String whName) {
        this.whName = whName == null ? null : whName.trim();
    }

    public Byte getIsLocaEnabled() {
        return isLocaEnabled;
    }

    public void setIsLocaEnabled(Byte isLocaEnabled) {
        this.isLocaEnabled = isLocaEnabled;
    }

    public Byte getIsMrpEnabled() {
        return isMrpEnabled;
    }

    public void setIsMrpEnabled(Byte isMrpEnabled) {
        this.isMrpEnabled = isMrpEnabled;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute == null ? null : attribute.trim();
    }

    public Byte getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Byte isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
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
}