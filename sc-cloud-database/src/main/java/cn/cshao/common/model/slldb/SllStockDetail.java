package cn.cshao.common.model.slldb;

import java.util.Date;

public class SllStockDetail {
    private Long stdId;

    private String stdNo;

    private Long phId;

    private String mdNo;

    private Integer cfmNum;

    private Integer restNum;

    private Byte status;

    private Date createTime;

    private Long createUser;

    private Date updateTime;

    private Long updateUser;

    private String batchNo;

    public Long getStdId() {
        return stdId;
    }

    public void setStdId(Long stdId) {
        this.stdId = stdId;
    }

    public String getStdNo() {
        return stdNo;
    }

    public void setStdNo(String stdNo) {
        this.stdNo = stdNo == null ? null : stdNo.trim();
    }

    public Long getPhId() {
        return phId;
    }

    public void setPhId(Long phId) {
        this.phId = phId;
    }

    public String getMdNo() {
        return mdNo;
    }

    public void setMdNo(String mdNo) {
        this.mdNo = mdNo == null ? null : mdNo.trim();
    }

    public Integer getCfmNum() {
        return cfmNum;
    }

    public void setCfmNum(Integer cfmNum) {
        this.cfmNum = cfmNum;
    }

    public Integer getRestNum() {
        return restNum;
    }

    public void setRestNum(Integer restNum) {
        this.restNum = restNum;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo == null ? null : batchNo.trim();
    }
}