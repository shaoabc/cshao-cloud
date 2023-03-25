package cn.cshao.common.model.slldb;

import java.util.Date;

public class SllImages {
    private Long resNo;

    private String resExt;

    private Integer resType;

    private String resCtl;

    private String srcNo;

    private Integer srcOrd;

    private String domain;

    private Date createTime;

    private String createUser;

    private Date updateTime;

    private String updateUser;

    public Long getResNo() {
        return resNo;
    }

    public void setResNo(Long resNo) {
        this.resNo = resNo;
    }

    public String getResExt() {
        return resExt;
    }

    public void setResExt(String resExt) {
        this.resExt = resExt == null ? null : resExt.trim();
    }

    public Integer getResType() {
        return resType;
    }

    public void setResType(Integer resType) {
        this.resType = resType;
    }

    public String getResCtl() {
        return resCtl;
    }

    public void setResCtl(String resCtl) {
        this.resCtl = resCtl == null ? null : resCtl.trim();
    }

    public String getSrcNo() {
        return srcNo;
    }

    public void setSrcNo(String srcNo) {
        this.srcNo = srcNo == null ? null : srcNo.trim();
    }

    public Integer getSrcOrd() {
        return srcOrd;
    }

    public void setSrcOrd(Integer srcOrd) {
        this.srcOrd = srcOrd;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain == null ? null : domain.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }
}