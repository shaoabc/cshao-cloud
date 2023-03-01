package cn.cshao.common.model.slldb;

import java.util.Date;

public class SllPharOrder {
    private Long ordId;

    private String ordNo;

    private Long paId;

    private Integer hpId;

    private Long mdId;

    private Integer mdRound;

    private Integer phaseNum;

    private Integer auditNum;

    private Integer buyNum;

    private Integer aidNum;

    private Integer selfNum;

    private Long buyPhId;

    private Long aidPhId;

    private Byte isAssist;

    private Long assistor;

    private Date pushTime;

    private Long auditor;

    private Date auditTime;

    private String auditRsnSet;

    private String auditReason;

    private Byte stepNo;

    private Byte status;

    private Date createTime;

    private Long createUser;

    private Date updateTime;

    private Long updateUser;

    private String reasonDesc;

    public Long getOrdId() {
        return ordId;
    }

    public void setOrdId(Long ordId) {
        this.ordId = ordId;
    }

    public String getOrdNo() {
        return ordNo;
    }

    public void setOrdNo(String ordNo) {
        this.ordNo = ordNo == null ? null : ordNo.trim();
    }

    public Long getPaId() {
        return paId;
    }

    public void setPaId(Long paId) {
        this.paId = paId;
    }

    public Integer getHpId() {
        return hpId;
    }

    public void setHpId(Integer hpId) {
        this.hpId = hpId;
    }

    public Long getMdId() {
        return mdId;
    }

    public void setMdId(Long mdId) {
        this.mdId = mdId;
    }

    public Integer getMdRound() {
        return mdRound;
    }

    public void setMdRound(Integer mdRound) {
        this.mdRound = mdRound;
    }

    public Integer getPhaseNum() {
        return phaseNum;
    }

    public void setPhaseNum(Integer phaseNum) {
        this.phaseNum = phaseNum;
    }

    public Integer getAuditNum() {
        return auditNum;
    }

    public void setAuditNum(Integer auditNum) {
        this.auditNum = auditNum;
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

    public Integer getSelfNum() {
        return selfNum;
    }

    public void setSelfNum(Integer selfNum) {
        this.selfNum = selfNum;
    }

    public Long getBuyPhId() {
        return buyPhId;
    }

    public void setBuyPhId(Long buyPhId) {
        this.buyPhId = buyPhId;
    }

    public Long getAidPhId() {
        return aidPhId;
    }

    public void setAidPhId(Long aidPhId) {
        this.aidPhId = aidPhId;
    }

    public Byte getIsAssist() {
        return isAssist;
    }

    public void setIsAssist(Byte isAssist) {
        this.isAssist = isAssist;
    }

    public Long getAssistor() {
        return assistor;
    }

    public void setAssistor(Long assistor) {
        this.assistor = assistor;
    }

    public Date getPushTime() {
        return pushTime;
    }

    public void setPushTime(Date pushTime) {
        this.pushTime = pushTime;
    }

    public Long getAuditor() {
        return auditor;
    }

    public void setAuditor(Long auditor) {
        this.auditor = auditor;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public String getAuditRsnSet() {
        return auditRsnSet;
    }

    public void setAuditRsnSet(String auditRsnSet) {
        this.auditRsnSet = auditRsnSet == null ? null : auditRsnSet.trim();
    }

    public String getAuditReason() {
        return auditReason;
    }

    public void setAuditReason(String auditReason) {
        this.auditReason = auditReason == null ? null : auditReason.trim();
    }

    public Byte getStepNo() {
        return stepNo;
    }

    public void setStepNo(Byte stepNo) {
        this.stepNo = stepNo;
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

    public String getReasonDesc() {
        return reasonDesc;
    }

    public void setReasonDesc(String reasonDesc) {
        this.reasonDesc = reasonDesc == null ? null : reasonDesc.trim();
    }
}