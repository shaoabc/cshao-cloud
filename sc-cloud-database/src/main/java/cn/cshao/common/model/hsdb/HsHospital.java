package cn.cshao.common.model.hsdb;

import java.util.Date;

public class HsHospital {
    private Integer hospId;

    private String hospNo;

    private String hospNm;

    private String alias;

    private Integer distId;

    private String addr;

    private Byte clazz;

    private Byte nature;

    private Byte grade;

    private Byte status;

    private Date createTime;

    private String createUser;

    private Date updateTime;

    private String updateUser;

    public Integer getHospId() {
        return hospId;
    }

    public void setHospId(Integer hospId) {
        this.hospId = hospId;
    }

    public String getHospNo() {
        return hospNo;
    }

    public void setHospNo(String hospNo) {
        this.hospNo = hospNo == null ? null : hospNo.trim();
    }

    public String getHospNm() {
        return hospNm;
    }

    public void setHospNm(String hospNm) {
        this.hospNm = hospNm == null ? null : hospNm.trim();
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias == null ? null : alias.trim();
    }

    public Integer getDistId() {
        return distId;
    }

    public void setDistId(Integer distId) {
        this.distId = distId;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public Byte getClazz() {
        return clazz;
    }

    public void setClazz(Byte clazz) {
        this.clazz = clazz;
    }

    public Byte getNature() {
        return nature;
    }

    public void setNature(Byte nature) {
        this.nature = nature;
    }

    public Byte getGrade() {
        return grade;
    }

    public void setGrade(Byte grade) {
        this.grade = grade;
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