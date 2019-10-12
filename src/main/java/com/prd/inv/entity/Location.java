package com.prd.inv.entity;

import java.util.Date;

public class Location {
    private Long id;

    private Long whId;

    private String locaCode;

    private String locaName;

    private Byte locaType;

    private Byte isMrpEnabled;

    private String attribute;

    private Byte isEnabled;

    private Byte isDeleted;

    private String createdByCode;

    private String createdByName;

    private Date gmtCreated;

    private Date gmtModified;

    private String modifiedByCode;

    private String modifiedByName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getWhId() {
        return whId;
    }

    public void setWhId(Long whId) {
        this.whId = whId;
    }

    public String getLocaCode() {
        return locaCode;
    }

    public void setLocaCode(String locaCode) {
        this.locaCode = locaCode == null ? null : locaCode.trim();
    }

    public String getLocaName() {
        return locaName;
    }

    public void setLocaName(String locaName) {
        this.locaName = locaName == null ? null : locaName.trim();
    }

    public Byte getLocaType() {
        return locaType;
    }

    public void setLocaType(Byte locaType) {
        this.locaType = locaType;
    }

    public Byte getIsMrpEnabled() {
        return isMrpEnabled;
    }

    public void setIsMrpEnabled(Byte isMrpEnabled) {
        this.isMrpEnabled = isMrpEnabled;
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

    public Date getGmtCreated() {
        return gmtCreated;
    }

    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
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