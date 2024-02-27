package cn.cshao.common.model.slldb;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SllBlackPatientExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SllBlackPatientExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPaIdIsNull() {
            addCriterion("pa_id is null");
            return (Criteria) this;
        }

        public Criteria andPaIdIsNotNull() {
            addCriterion("pa_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaIdEqualTo(Long value) {
            addCriterion("pa_id =", value, "paId");
            return (Criteria) this;
        }

        public Criteria andPaIdNotEqualTo(Long value) {
            addCriterion("pa_id <>", value, "paId");
            return (Criteria) this;
        }

        public Criteria andPaIdGreaterThan(Long value) {
            addCriterion("pa_id >", value, "paId");
            return (Criteria) this;
        }

        public Criteria andPaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("pa_id >=", value, "paId");
            return (Criteria) this;
        }

        public Criteria andPaIdLessThan(Long value) {
            addCriterion("pa_id <", value, "paId");
            return (Criteria) this;
        }

        public Criteria andPaIdLessThanOrEqualTo(Long value) {
            addCriterion("pa_id <=", value, "paId");
            return (Criteria) this;
        }

        public Criteria andPaIdIn(List<Long> values) {
            addCriterion("pa_id in", values, "paId");
            return (Criteria) this;
        }

        public Criteria andPaIdNotIn(List<Long> values) {
            addCriterion("pa_id not in", values, "paId");
            return (Criteria) this;
        }

        public Criteria andPaIdBetween(Long value1, Long value2) {
            addCriterion("pa_id between", value1, value2, "paId");
            return (Criteria) this;
        }

        public Criteria andPaIdNotBetween(Long value1, Long value2) {
            addCriterion("pa_id not between", value1, value2, "paId");
            return (Criteria) this;
        }

        public Criteria andPaNmIsNull() {
            addCriterion("pa_nm is null");
            return (Criteria) this;
        }

        public Criteria andPaNmIsNotNull() {
            addCriterion("pa_nm is not null");
            return (Criteria) this;
        }

        public Criteria andPaNmEqualTo(String value) {
            addCriterion("pa_nm =", value, "paNm");
            return (Criteria) this;
        }

        public Criteria andPaNmNotEqualTo(String value) {
            addCriterion("pa_nm <>", value, "paNm");
            return (Criteria) this;
        }

        public Criteria andPaNmGreaterThan(String value) {
            addCriterion("pa_nm >", value, "paNm");
            return (Criteria) this;
        }

        public Criteria andPaNmGreaterThanOrEqualTo(String value) {
            addCriterion("pa_nm >=", value, "paNm");
            return (Criteria) this;
        }

        public Criteria andPaNmLessThan(String value) {
            addCriterion("pa_nm <", value, "paNm");
            return (Criteria) this;
        }

        public Criteria andPaNmLessThanOrEqualTo(String value) {
            addCriterion("pa_nm <=", value, "paNm");
            return (Criteria) this;
        }

        public Criteria andPaNmLike(String value) {
            addCriterion("pa_nm like", value, "paNm");
            return (Criteria) this;
        }

        public Criteria andPaNmNotLike(String value) {
            addCriterion("pa_nm not like", value, "paNm");
            return (Criteria) this;
        }

        public Criteria andPaNmIn(List<String> values) {
            addCriterion("pa_nm in", values, "paNm");
            return (Criteria) this;
        }

        public Criteria andPaNmNotIn(List<String> values) {
            addCriterion("pa_nm not in", values, "paNm");
            return (Criteria) this;
        }

        public Criteria andPaNmBetween(String value1, String value2) {
            addCriterion("pa_nm between", value1, value2, "paNm");
            return (Criteria) this;
        }

        public Criteria andPaNmNotBetween(String value1, String value2) {
            addCriterion("pa_nm not between", value1, value2, "paNm");
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

        public Criteria andCertNoIsNull() {
            addCriterion("cert_no is null");
            return (Criteria) this;
        }

        public Criteria andCertNoIsNotNull() {
            addCriterion("cert_no is not null");
            return (Criteria) this;
        }

        public Criteria andCertNoEqualTo(String value) {
            addCriterion("cert_no =", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotEqualTo(String value) {
            addCriterion("cert_no <>", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoGreaterThan(String value) {
            addCriterion("cert_no >", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoGreaterThanOrEqualTo(String value) {
            addCriterion("cert_no >=", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoLessThan(String value) {
            addCriterion("cert_no <", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoLessThanOrEqualTo(String value) {
            addCriterion("cert_no <=", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoLike(String value) {
            addCriterion("cert_no like", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotLike(String value) {
            addCriterion("cert_no not like", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoIn(List<String> values) {
            addCriterion("cert_no in", values, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotIn(List<String> values) {
            addCriterion("cert_no not in", values, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoBetween(String value1, String value2) {
            addCriterion("cert_no between", value1, value2, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotBetween(String value1, String value2) {
            addCriterion("cert_no not between", value1, value2, "certNo");
            return (Criteria) this;
        }

        public Criteria andOpTypeIsNull() {
            addCriterion("op_type is null");
            return (Criteria) this;
        }

        public Criteria andOpTypeIsNotNull() {
            addCriterion("op_type is not null");
            return (Criteria) this;
        }

        public Criteria andOpTypeEqualTo(Byte value) {
            addCriterion("op_type =", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeNotEqualTo(Byte value) {
            addCriterion("op_type <>", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeGreaterThan(Byte value) {
            addCriterion("op_type >", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("op_type >=", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeLessThan(Byte value) {
            addCriterion("op_type <", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeLessThanOrEqualTo(Byte value) {
            addCriterion("op_type <=", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeIn(List<Byte> values) {
            addCriterion("op_type in", values, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeNotIn(List<Byte> values) {
            addCriterion("op_type not in", values, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeBetween(Byte value1, Byte value2) {
            addCriterion("op_type between", value1, value2, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("op_type not between", value1, value2, "opType");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("`operator` is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("`operator` is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(Long value) {
            addCriterion("`operator` =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(Long value) {
            addCriterion("`operator` <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(Long value) {
            addCriterion("`operator` >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(Long value) {
            addCriterion("`operator` >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(Long value) {
            addCriterion("`operator` <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(Long value) {
            addCriterion("`operator` <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<Long> values) {
            addCriterion("`operator` in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<Long> values) {
            addCriterion("`operator` not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(Long value1, Long value2) {
            addCriterion("`operator` between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(Long value1, Long value2) {
            addCriterion("`operator` not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOpTimeIsNull() {
            addCriterion("op_time is null");
            return (Criteria) this;
        }

        public Criteria andOpTimeIsNotNull() {
            addCriterion("op_time is not null");
            return (Criteria) this;
        }

        public Criteria andOpTimeEqualTo(Date value) {
            addCriterion("op_time =", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeNotEqualTo(Date value) {
            addCriterion("op_time <>", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeGreaterThan(Date value) {
            addCriterion("op_time >", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("op_time >=", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeLessThan(Date value) {
            addCriterion("op_time <", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeLessThanOrEqualTo(Date value) {
            addCriterion("op_time <=", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeIn(List<Date> values) {
            addCriterion("op_time in", values, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeNotIn(List<Date> values) {
            addCriterion("op_time not in", values, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeBetween(Date value1, Date value2) {
            addCriterion("op_time between", value1, value2, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeNotBetween(Date value1, Date value2) {
            addCriterion("op_time not between", value1, value2, "opTime");
            return (Criteria) this;
        }

        public Criteria andContIsNull() {
            addCriterion("cont is null");
            return (Criteria) this;
        }

        public Criteria andContIsNotNull() {
            addCriterion("cont is not null");
            return (Criteria) this;
        }

        public Criteria andContEqualTo(String value) {
            addCriterion("cont =", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContNotEqualTo(String value) {
            addCriterion("cont <>", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContGreaterThan(String value) {
            addCriterion("cont >", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContGreaterThanOrEqualTo(String value) {
            addCriterion("cont >=", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContLessThan(String value) {
            addCriterion("cont <", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContLessThanOrEqualTo(String value) {
            addCriterion("cont <=", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContLike(String value) {
            addCriterion("cont like", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContNotLike(String value) {
            addCriterion("cont not like", value, "cont");
            return (Criteria) this;
        }

        public Criteria andContIn(List<String> values) {
            addCriterion("cont in", values, "cont");
            return (Criteria) this;
        }

        public Criteria andContNotIn(List<String> values) {
            addCriterion("cont not in", values, "cont");
            return (Criteria) this;
        }

        public Criteria andContBetween(String value1, String value2) {
            addCriterion("cont between", value1, value2, "cont");
            return (Criteria) this;
        }

        public Criteria andContNotBetween(String value1, String value2) {
            addCriterion("cont not between", value1, value2, "cont");
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