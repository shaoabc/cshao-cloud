package cn.cshao.common.model.slldb;

import java.util.Date;

public class SllAgent {
    private Long agId;

    private String agNo;

    private String agNm;

    private Byte type;

    private String mobile;

    private String mdIdSet;

    private Integer secId;

    private Integer offId;

    private Integer rgnId;

    private Integer deptId;

    private Byte status;

    private Date createTime;

    private Long createUser;

    private Date updateTime;

    private Long updateUser;

    public Long getAgId() {
        return agId;
    }

    public void setAgId(Long agId) {
        this.agId = agId;
    }

    public String getAgNo() {
        return agNo;
    }

    public void setAgNo(String agNo) {
        this.agNo = agNo == null ? null : agNo.trim();
    }

    public String getAgNm() {
        return agNm;
    }

    public void setAgNm(String agNm) {
        this.agNm = agNm == null ? null : agNm.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getMdIdSet() {
        return mdIdSet;
    }

    public void setMdIdSet(String mdIdSet) {
        this.mdIdSet = mdIdSet == null ? null : mdIdSet.trim();
    }

    public Integer getSecId() {
        return secId;
    }

    public void setSecId(Integer secId) {
        this.secId = secId;
    }

    public Integer getOffId() {
        return offId;
    }

    public void setOffId(Integer offId) {
        this.offId = offId;
    }

    public Integer getRgnId() {
        return rgnId;
    }

    public void setRgnId(Integer rgnId) {
        this.rgnId = rgnId;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
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
}