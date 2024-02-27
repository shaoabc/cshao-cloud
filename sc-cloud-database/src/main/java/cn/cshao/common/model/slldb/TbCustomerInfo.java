package cn.cshao.common.model.slldb;

import java.util.Date;

public class TbCustomerInfo {
    private Long id;

    private String month;

    private String variety;

    private String empNo;

    private String empNm;

    private String empCategory;

    private String mktDate;

    private String unRegion;

    private String region;

    private String province;

    private String city;

    private String office;

    private String officeMgr;

    private String hospital;

    private String hosScale;

    private String hosAccess;

    private Integer hosCapacity;

    private String hosCnGrade;

    private String hosEnGrade;

    private String section;

    private String position;

    private String rank;

    private String cusCategory;

    private String otherEnergy;

    private String cusNm;

    private Integer fixCusCapacity;

    private String qtrStarGrade;

    private String cusGrade;

    private Integer mcNum;

    private Integer npNum;

    private Integer xlNum;

    private Integer tfNum;

    private Integer wNm;

    private Integer pNm;

    private Integer sNm;

    private Integer eNm;

    private Integer nNm;

    private Byte status;

    private Date pushTime;

    private String auditReason;

    private Date auditTime;

    private Long auditor;

    private String mongoId;

    private Date createTime;

    private Long createUser;

    private Date updateTime;

    private Long updateUser;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month == null ? null : month.trim();
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety == null ? null : variety.trim();
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo == null ? null : empNo.trim();
    }

    public String getEmpNm() {
        return empNm;
    }

    public void setEmpNm(String empNm) {
        this.empNm = empNm == null ? null : empNm.trim();
    }

    public String getEmpCategory() {
        return empCategory;
    }

    public void setEmpCategory(String empCategory) {
        this.empCategory = empCategory == null ? null : empCategory.trim();
    }

    public String getMktDate() {
        return mktDate;
    }

    public void setMktDate(String mktDate) {
        this.mktDate = mktDate == null ? null : mktDate.trim();
    }

    public String getUnRegion() {
        return unRegion;
    }

    public void setUnRegion(String unRegion) {
        this.unRegion = unRegion == null ? null : unRegion.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office == null ? null : office.trim();
    }

    public String getOfficeMgr() {
        return officeMgr;
    }

    public void setOfficeMgr(String officeMgr) {
        this.officeMgr = officeMgr == null ? null : officeMgr.trim();
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital == null ? null : hospital.trim();
    }

    public String getHosScale() {
        return hosScale;
    }

    public void setHosScale(String hosScale) {
        this.hosScale = hosScale == null ? null : hosScale.trim();
    }

    public String getHosAccess() {
        return hosAccess;
    }

    public void setHosAccess(String hosAccess) {
        this.hosAccess = hosAccess == null ? null : hosAccess.trim();
    }

    public Integer getHosCapacity() {
        return hosCapacity;
    }

    public void setHosCapacity(Integer hosCapacity) {
        this.hosCapacity = hosCapacity;
    }

    public String getHosCnGrade() {
        return hosCnGrade;
    }

    public void setHosCnGrade(String hosCnGrade) {
        this.hosCnGrade = hosCnGrade == null ? null : hosCnGrade.trim();
    }

    public String getHosEnGrade() {
        return hosEnGrade;
    }

    public void setHosEnGrade(String hosEnGrade) {
        this.hosEnGrade = hosEnGrade == null ? null : hosEnGrade.trim();
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section == null ? null : section.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank == null ? null : rank.trim();
    }

    public String getCusCategory() {
        return cusCategory;
    }

    public void setCusCategory(String cusCategory) {
        this.cusCategory = cusCategory == null ? null : cusCategory.trim();
    }

    public String getOtherEnergy() {
        return otherEnergy;
    }

    public void setOtherEnergy(String otherEnergy) {
        this.otherEnergy = otherEnergy == null ? null : otherEnergy.trim();
    }

    public String getCusNm() {
        return cusNm;
    }

    public void setCusNm(String cusNm) {
        this.cusNm = cusNm == null ? null : cusNm.trim();
    }

    public Integer getFixCusCapacity() {
        return fixCusCapacity;
    }

    public void setFixCusCapacity(Integer fixCusCapacity) {
        this.fixCusCapacity = fixCusCapacity;
    }

    public String getQtrStarGrade() {
        return qtrStarGrade;
    }

    public void setQtrStarGrade(String qtrStarGrade) {
        this.qtrStarGrade = qtrStarGrade == null ? null : qtrStarGrade.trim();
    }

    public String getCusGrade() {
        return cusGrade;
    }

    public void setCusGrade(String cusGrade) {
        this.cusGrade = cusGrade == null ? null : cusGrade.trim();
    }

    public Integer getMcNum() {
        return mcNum;
    }

    public void setMcNum(Integer mcNum) {
        this.mcNum = mcNum;
    }

    public Integer getNpNum() {
        return npNum;
    }

    public void setNpNum(Integer npNum) {
        this.npNum = npNum;
    }

    public Integer getXlNum() {
        return xlNum;
    }

    public void setXlNum(Integer xlNum) {
        this.xlNum = xlNum;
    }

    public Integer getTfNum() {
        return tfNum;
    }

    public void setTfNum(Integer tfNum) {
        this.tfNum = tfNum;
    }

    public Integer getwNm() {
        return wNm;
    }

    public void setwNm(Integer wNm) {
        this.wNm = wNm;
    }

    public Integer getpNm() {
        return pNm;
    }

    public void setpNm(Integer pNm) {
        this.pNm = pNm;
    }

    public Integer getsNm() {
        return sNm;
    }

    public void setsNm(Integer sNm) {
        this.sNm = sNm;
    }

    public Integer geteNm() {
        return eNm;
    }

    public void seteNm(Integer eNm) {
        this.eNm = eNm;
    }

    public Integer getnNm() {
        return nNm;
    }

    public void setnNm(Integer nNm) {
        this.nNm = nNm;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getPushTime() {
        return pushTime;
    }

    public void setPushTime(Date pushTime) {
        this.pushTime = pushTime;
    }

    public String getAuditReason() {
        return auditReason;
    }

    public void setAuditReason(String auditReason) {
        this.auditReason = auditReason == null ? null : auditReason.trim();
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public Long getAuditor() {
        return auditor;
    }

    public void setAuditor(Long auditor) {
        this.auditor = auditor;
    }

    public String getMongoId() {
        return mongoId;
    }

    public void setMongoId(String mongoId) {
        this.mongoId = mongoId == null ? null : mongoId.trim();
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