package cn.cshao.common.model.slldb;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SllAgentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SllAgentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andAgIdIsNull() {
            addCriterion("ag_id is null");
            return (Criteria) this;
        }

        public Criteria andAgIdIsNotNull() {
            addCriterion("ag_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgIdEqualTo(Long value) {
            addCriterion("ag_id =", value, "agId");
            return (Criteria) this;
        }

        public Criteria andAgIdNotEqualTo(Long value) {
            addCriterion("ag_id <>", value, "agId");
            return (Criteria) this;
        }

        public Criteria andAgIdGreaterThan(Long value) {
            addCriterion("ag_id >", value, "agId");
            return (Criteria) this;
        }

        public Criteria andAgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ag_id >=", value, "agId");
            return (Criteria) this;
        }

        public Criteria andAgIdLessThan(Long value) {
            addCriterion("ag_id <", value, "agId");
            return (Criteria) this;
        }

        public Criteria andAgIdLessThanOrEqualTo(Long value) {
            addCriterion("ag_id <=", value, "agId");
            return (Criteria) this;
        }

        public Criteria andAgIdIn(List<Long> values) {
            addCriterion("ag_id in", values, "agId");
            return (Criteria) this;
        }

        public Criteria andAgIdNotIn(List<Long> values) {
            addCriterion("ag_id not in", values, "agId");
            return (Criteria) this;
        }

        public Criteria andAgIdBetween(Long value1, Long value2) {
            addCriterion("ag_id between", value1, value2, "agId");
            return (Criteria) this;
        }

        public Criteria andAgIdNotBetween(Long value1, Long value2) {
            addCriterion("ag_id not between", value1, value2, "agId");
            return (Criteria) this;
        }

        public Criteria andAgNoIsNull() {
            addCriterion("ag_no is null");
            return (Criteria) this;
        }

        public Criteria andAgNoIsNotNull() {
            addCriterion("ag_no is not null");
            return (Criteria) this;
        }

        public Criteria andAgNoEqualTo(String value) {
            addCriterion("ag_no =", value, "agNo");
            return (Criteria) this;
        }

        public Criteria andAgNoNotEqualTo(String value) {
            addCriterion("ag_no <>", value, "agNo");
            return (Criteria) this;
        }

        public Criteria andAgNoGreaterThan(String value) {
            addCriterion("ag_no >", value, "agNo");
            return (Criteria) this;
        }

        public Criteria andAgNoGreaterThanOrEqualTo(String value) {
            addCriterion("ag_no >=", value, "agNo");
            return (Criteria) this;
        }

        public Criteria andAgNoLessThan(String value) {
            addCriterion("ag_no <", value, "agNo");
            return (Criteria) this;
        }

        public Criteria andAgNoLessThanOrEqualTo(String value) {
            addCriterion("ag_no <=", value, "agNo");
            return (Criteria) this;
        }

        public Criteria andAgNoLike(String value) {
            addCriterion("ag_no like", value, "agNo");
            return (Criteria) this;
        }

        public Criteria andAgNoNotLike(String value) {
            addCriterion("ag_no not like", value, "agNo");
            return (Criteria) this;
        }

        public Criteria andAgNoIn(List<String> values) {
            addCriterion("ag_no in", values, "agNo");
            return (Criteria) this;
        }

        public Criteria andAgNoNotIn(List<String> values) {
            addCriterion("ag_no not in", values, "agNo");
            return (Criteria) this;
        }

        public Criteria andAgNoBetween(String value1, String value2) {
            addCriterion("ag_no between", value1, value2, "agNo");
            return (Criteria) this;
        }

        public Criteria andAgNoNotBetween(String value1, String value2) {
            addCriterion("ag_no not between", value1, value2, "agNo");
            return (Criteria) this;
        }

        public Criteria andAgNmIsNull() {
            addCriterion("ag_nm is null");
            return (Criteria) this;
        }

        public Criteria andAgNmIsNotNull() {
            addCriterion("ag_nm is not null");
            return (Criteria) this;
        }

        public Criteria andAgNmEqualTo(String value) {
            addCriterion("ag_nm =", value, "agNm");
            return (Criteria) this;
        }

        public Criteria andAgNmNotEqualTo(String value) {
            addCriterion("ag_nm <>", value, "agNm");
            return (Criteria) this;
        }

        public Criteria andAgNmGreaterThan(String value) {
            addCriterion("ag_nm >", value, "agNm");
            return (Criteria) this;
        }

        public Criteria andAgNmGreaterThanOrEqualTo(String value) {
            addCriterion("ag_nm >=", value, "agNm");
            return (Criteria) this;
        }

        public Criteria andAgNmLessThan(String value) {
            addCriterion("ag_nm <", value, "agNm");
            return (Criteria) this;
        }

        public Criteria andAgNmLessThanOrEqualTo(String value) {
            addCriterion("ag_nm <=", value, "agNm");
            return (Criteria) this;
        }

        public Criteria andAgNmLike(String value) {
            addCriterion("ag_nm like", value, "agNm");
            return (Criteria) this;
        }

        public Criteria andAgNmNotLike(String value) {
            addCriterion("ag_nm not like", value, "agNm");
            return (Criteria) this;
        }

        public Criteria andAgNmIn(List<String> values) {
            addCriterion("ag_nm in", values, "agNm");
            return (Criteria) this;
        }

        public Criteria andAgNmNotIn(List<String> values) {
            addCriterion("ag_nm not in", values, "agNm");
            return (Criteria) this;
        }

        public Criteria andAgNmBetween(String value1, String value2) {
            addCriterion("ag_nm between", value1, value2, "agNm");
            return (Criteria) this;
        }

        public Criteria andAgNmNotBetween(String value1, String value2) {
            addCriterion("ag_nm not between", value1, value2, "agNm");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("`type` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("`type` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("`type` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("`type` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("`type` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("`type` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("`type` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("`type` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("`type` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("`type` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("`type` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("`type` not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMdIdSetIsNull() {
            addCriterion("md_id_set is null");
            return (Criteria) this;
        }

        public Criteria andMdIdSetIsNotNull() {
            addCriterion("md_id_set is not null");
            return (Criteria) this;
        }

        public Criteria andMdIdSetEqualTo(String value) {
            addCriterion("md_id_set =", value, "mdIdSet");
            return (Criteria) this;
        }

        public Criteria andMdIdSetNotEqualTo(String value) {
            addCriterion("md_id_set <>", value, "mdIdSet");
            return (Criteria) this;
        }

        public Criteria andMdIdSetGreaterThan(String value) {
            addCriterion("md_id_set >", value, "mdIdSet");
            return (Criteria) this;
        }

        public Criteria andMdIdSetGreaterThanOrEqualTo(String value) {
            addCriterion("md_id_set >=", value, "mdIdSet");
            return (Criteria) this;
        }

        public Criteria andMdIdSetLessThan(String value) {
            addCriterion("md_id_set <", value, "mdIdSet");
            return (Criteria) this;
        }

        public Criteria andMdIdSetLessThanOrEqualTo(String value) {
            addCriterion("md_id_set <=", value, "mdIdSet");
            return (Criteria) this;
        }

        public Criteria andMdIdSetLike(String value) {
            addCriterion("md_id_set like", value, "mdIdSet");
            return (Criteria) this;
        }

        public Criteria andMdIdSetNotLike(String value) {
            addCriterion("md_id_set not like", value, "mdIdSet");
            return (Criteria) this;
        }

        public Criteria andMdIdSetIn(List<String> values) {
            addCriterion("md_id_set in", values, "mdIdSet");
            return (Criteria) this;
        }

        public Criteria andMdIdSetNotIn(List<String> values) {
            addCriterion("md_id_set not in", values, "mdIdSet");
            return (Criteria) this;
        }

        public Criteria andMdIdSetBetween(String value1, String value2) {
            addCriterion("md_id_set between", value1, value2, "mdIdSet");
            return (Criteria) this;
        }

        public Criteria andMdIdSetNotBetween(String value1, String value2) {
            addCriterion("md_id_set not between", value1, value2, "mdIdSet");
            return (Criteria) this;
        }

        public Criteria andSecIdIsNull() {
            addCriterion("sec_id is null");
            return (Criteria) this;
        }

        public Criteria andSecIdIsNotNull() {
            addCriterion("sec_id is not null");
            return (Criteria) this;
        }

        public Criteria andSecIdEqualTo(Integer value) {
            addCriterion("sec_id =", value, "secId");
            return (Criteria) this;
        }

        public Criteria andSecIdNotEqualTo(Integer value) {
            addCriterion("sec_id <>", value, "secId");
            return (Criteria) this;
        }

        public Criteria andSecIdGreaterThan(Integer value) {
            addCriterion("sec_id >", value, "secId");
            return (Criteria) this;
        }

        public Criteria andSecIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sec_id >=", value, "secId");
            return (Criteria) this;
        }

        public Criteria andSecIdLessThan(Integer value) {
            addCriterion("sec_id <", value, "secId");
            return (Criteria) this;
        }

        public Criteria andSecIdLessThanOrEqualTo(Integer value) {
            addCriterion("sec_id <=", value, "secId");
            return (Criteria) this;
        }

        public Criteria andSecIdIn(List<Integer> values) {
            addCriterion("sec_id in", values, "secId");
            return (Criteria) this;
        }

        public Criteria andSecIdNotIn(List<Integer> values) {
            addCriterion("sec_id not in", values, "secId");
            return (Criteria) this;
        }

        public Criteria andSecIdBetween(Integer value1, Integer value2) {
            addCriterion("sec_id between", value1, value2, "secId");
            return (Criteria) this;
        }

        public Criteria andSecIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sec_id not between", value1, value2, "secId");
            return (Criteria) this;
        }

        public Criteria andOffIdIsNull() {
            addCriterion("off_id is null");
            return (Criteria) this;
        }

        public Criteria andOffIdIsNotNull() {
            addCriterion("off_id is not null");
            return (Criteria) this;
        }

        public Criteria andOffIdEqualTo(Integer value) {
            addCriterion("off_id =", value, "offId");
            return (Criteria) this;
        }

        public Criteria andOffIdNotEqualTo(Integer value) {
            addCriterion("off_id <>", value, "offId");
            return (Criteria) this;
        }

        public Criteria andOffIdGreaterThan(Integer value) {
            addCriterion("off_id >", value, "offId");
            return (Criteria) this;
        }

        public Criteria andOffIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("off_id >=", value, "offId");
            return (Criteria) this;
        }

        public Criteria andOffIdLessThan(Integer value) {
            addCriterion("off_id <", value, "offId");
            return (Criteria) this;
        }

        public Criteria andOffIdLessThanOrEqualTo(Integer value) {
            addCriterion("off_id <=", value, "offId");
            return (Criteria) this;
        }

        public Criteria andOffIdIn(List<Integer> values) {
            addCriterion("off_id in", values, "offId");
            return (Criteria) this;
        }

        public Criteria andOffIdNotIn(List<Integer> values) {
            addCriterion("off_id not in", values, "offId");
            return (Criteria) this;
        }

        public Criteria andOffIdBetween(Integer value1, Integer value2) {
            addCriterion("off_id between", value1, value2, "offId");
            return (Criteria) this;
        }

        public Criteria andOffIdNotBetween(Integer value1, Integer value2) {
            addCriterion("off_id not between", value1, value2, "offId");
            return (Criteria) this;
        }

        public Criteria andRgnIdIsNull() {
            addCriterion("rgn_id is null");
            return (Criteria) this;
        }

        public Criteria andRgnIdIsNotNull() {
            addCriterion("rgn_id is not null");
            return (Criteria) this;
        }

        public Criteria andRgnIdEqualTo(Integer value) {
            addCriterion("rgn_id =", value, "rgnId");
            return (Criteria) this;
        }

        public Criteria andRgnIdNotEqualTo(Integer value) {
            addCriterion("rgn_id <>", value, "rgnId");
            return (Criteria) this;
        }

        public Criteria andRgnIdGreaterThan(Integer value) {
            addCriterion("rgn_id >", value, "rgnId");
            return (Criteria) this;
        }

        public Criteria andRgnIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rgn_id >=", value, "rgnId");
            return (Criteria) this;
        }

        public Criteria andRgnIdLessThan(Integer value) {
            addCriterion("rgn_id <", value, "rgnId");
            return (Criteria) this;
        }

        public Criteria andRgnIdLessThanOrEqualTo(Integer value) {
            addCriterion("rgn_id <=", value, "rgnId");
            return (Criteria) this;
        }

        public Criteria andRgnIdIn(List<Integer> values) {
            addCriterion("rgn_id in", values, "rgnId");
            return (Criteria) this;
        }

        public Criteria andRgnIdNotIn(List<Integer> values) {
            addCriterion("rgn_id not in", values, "rgnId");
            return (Criteria) this;
        }

        public Criteria andRgnIdBetween(Integer value1, Integer value2) {
            addCriterion("rgn_id between", value1, value2, "rgnId");
            return (Criteria) this;
        }

        public Criteria andRgnIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rgn_id not between", value1, value2, "rgnId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNull() {
            addCriterion("dept_id is null");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNotNull() {
            addCriterion("dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIdEqualTo(Integer value) {
            addCriterion("dept_id =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(Integer value) {
            addCriterion("dept_id <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(Integer value) {
            addCriterion("dept_id >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dept_id >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(Integer value) {
            addCriterion("dept_id <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(Integer value) {
            addCriterion("dept_id <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<Integer> values) {
            addCriterion("dept_id in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<Integer> values) {
            addCriterion("dept_id not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(Integer value1, Integer value2) {
            addCriterion("dept_id between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dept_id not between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(Long value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(Long value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(Long value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(Long value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(Long value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(Long value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<Long> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<Long> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(Long value1, Long value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(Long value1, Long value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(Long value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(Long value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(Long value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(Long value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(Long value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(Long value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<Long> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<Long> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(Long value1, Long value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(Long value1, Long value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}