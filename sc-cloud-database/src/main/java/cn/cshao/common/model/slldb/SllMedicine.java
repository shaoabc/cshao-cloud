package cn.cshao.common.model.slldb;

import java.util.Date;

public class SllMedicine {
    private Long mdId;

    private String mdNo;

    private String mdNm;

    private String specs;

    private String unit;

    private String cover;

    private Byte aidWay;

    private Integer buyNum;

    private Integer aidNum;

    private Byte status;

    private Date createTime;

    private Long createUser;

    private Date updateTime;

    private Long updateUser;

    private String policy;

    public Long getMdId() {
        return mdId;
    }

    public void setMdId(Long mdId) {
        this.mdId = mdId;
    }

    public String getMdNo() {
        return mdNo;
    }

    public void setMdNo(String mdNo) {
        this.mdNo = mdNo == null ? null : mdNo.trim();
    }

    public String getMdNm() {
        return mdNm;
    }

    public void setMdNm(String mdNm) {
        this.mdNm = mdNm == null ? null : mdNm.trim();
    }

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs == null ? null : specs.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    public Byte getAidWay() {
        return aidWay;
    }

    public void setAidWay(Byte aidWay) {
        this.aidWay = aidWay;
    }

    public Integer getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(Integer buyNum) {
        this.buyNum = buyNum;
    }

    public Integer getAidNum() {
        return aidNum;
    }

    public void setAidNum(Integer aidNum) {
        this.aidNum = aidNum;
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

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy == null ? null : policy.trim();
    }
}