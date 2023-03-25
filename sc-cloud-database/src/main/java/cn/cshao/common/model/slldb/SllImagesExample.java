package cn.cshao.common.model.slldb;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SllImagesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SllImagesExample() {
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

        public Criteria andResNoIsNull() {
            addCriterion("res_no is null");
            return (Criteria) this;
        }

        public Criteria andResNoIsNotNull() {
            addCriterion("res_no is not null");
            return (Criteria) this;
        }

        public Criteria andResNoEqualTo(Long value) {
            addCriterion("res_no =", value, "resNo");
            return (Criteria) this;
        }

        public Criteria andResNoNotEqualTo(Long value) {
            addCriterion("res_no <>", value, "resNo");
            return (Criteria) this;
        }

        public Criteria andResNoGreaterThan(Long value) {
            addCriterion("res_no >", value, "resNo");
            return (Criteria) this;
        }

        public Criteria andResNoGreaterThanOrEqualTo(Long value) {
            addCriterion("res_no >=", value, "resNo");
            return (Criteria) this;
        }

        public Criteria andResNoLessThan(Long value) {
            addCriterion("res_no <", value, "resNo");
            return (Criteria) this;
        }

        public Criteria andResNoLessThanOrEqualTo(Long value) {
            addCriterion("res_no <=", value, "resNo");
            return (Criteria) this;
        }

        public Criteria andResNoIn(List<Long> values) {
            addCriterion("res_no in", values, "resNo");
            return (Criteria) this;
        }

        public Criteria andResNoNotIn(List<Long> values) {
            addCriterion("res_no not in", values, "resNo");
            return (Criteria) this;
        }

        public Criteria andResNoBetween(Long value1, Long value2) {
            addCriterion("res_no between", value1, value2, "resNo");
            return (Criteria) this;
        }

        public Criteria andResNoNotBetween(Long value1, Long value2) {
            addCriterion("res_no not between", value1, value2, "resNo");
            return (Criteria) this;
        }

        public Criteria andResExtIsNull() {
            addCriterion("res_ext is null");
            return (Criteria) this;
        }

        public Criteria andResExtIsNotNull() {
            addCriterion("res_ext is not null");
            return (Criteria) this;
        }

        public Criteria andResExtEqualTo(String value) {
            addCriterion("res_ext =", value, "resExt");
            return (Criteria) this;
        }

        public Criteria andResExtNotEqualTo(String value) {
            addCriterion("res_ext <>", value, "resExt");
            return (Criteria) this;
        }

        public Criteria andResExtGreaterThan(String value) {
            addCriterion("res_ext >", value, "resExt");
            return (Criteria) this;
        }

        public Criteria andResExtGreaterThanOrEqualTo(String value) {
            addCriterion("res_ext >=", value, "resExt");
            return (Criteria) this;
        }

        public Criteria andResExtLessThan(String value) {
            addCriterion("res_ext <", value, "resExt");
            return (Criteria) this;
        }

        public Criteria andResExtLessThanOrEqualTo(String value) {
            addCriterion("res_ext <=", value, "resExt");
            return (Criteria) this;
        }

        public Criteria andResExtLike(String value) {
            addCriterion("res_ext like", value, "resExt");
            return (Criteria) this;
        }

        public Criteria andResExtNotLike(String value) {
            addCriterion("res_ext not like", value, "resExt");
            return (Criteria) this;
        }

        public Criteria andResExtIn(List<String> values) {
            addCriterion("res_ext in", values, "resExt");
            return (Criteria) this;
        }

        public Criteria andResExtNotIn(List<String> values) {
            addCriterion("res_ext not in", values, "resExt");
            return (Criteria) this;
        }

        public Criteria andResExtBetween(String value1, String value2) {
            addCriterion("res_ext between", value1, value2, "resExt");
            return (Criteria) this;
        }

        public Criteria andResExtNotBetween(String value1, String value2) {
            addCriterion("res_ext not between", value1, value2, "resExt");
            return (Criteria) this;
        }

        public Criteria andResTypeIsNull() {
            addCriterion("res_type is null");
            return (Criteria) this;
        }

        public Criteria andResTypeIsNotNull() {
            addCriterion("res_type is not null");
            return (Criteria) this;
        }

        public Criteria andResTypeEqualTo(Integer value) {
            addCriterion("res_type =", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeNotEqualTo(Integer value) {
            addCriterion("res_type <>", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeGreaterThan(Integer value) {
            addCriterion("res_type >", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("res_type >=", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeLessThan(Integer value) {
            addCriterion("res_type <", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeLessThanOrEqualTo(Integer value) {
            addCriterion("res_type <=", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeIn(List<Integer> values) {
            addCriterion("res_type in", values, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeNotIn(List<Integer> values) {
            addCriterion("res_type not in", values, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeBetween(Integer value1, Integer value2) {
            addCriterion("res_type between", value1, value2, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("res_type not between", value1, value2, "resType");
            return (Criteria) this;
        }

        public Criteria andResCtlIsNull() {
            addCriterion("res_ctl is null");
            return (Criteria) this;
        }

        public Criteria andResCtlIsNotNull() {
            addCriterion("res_ctl is not null");
            return (Criteria) this;
        }

        public Criteria andResCtlEqualTo(String value) {
            addCriterion("res_ctl =", value, "resCtl");
            return (Criteria) this;
        }

        public Criteria andResCtlNotEqualTo(String value) {
            addCriterion("res_ctl <>", value, "resCtl");
            return (Criteria) this;
        }

        public Criteria andResCtlGreaterThan(String value) {
            addCriterion("res_ctl >", value, "resCtl");
            return (Criteria) this;
        }

        public Criteria andResCtlGreaterThanOrEqualTo(String value) {
            addCriterion("res_ctl >=", value, "resCtl");
            return (Criteria) this;
        }

        public Criteria andResCtlLessThan(String value) {
            addCriterion("res_ctl <", value, "resCtl");
            return (Criteria) this;
        }

        public Criteria andResCtlLessThanOrEqualTo(String value) {
            addCriterion("res_ctl <=", value, "resCtl");
            return (Criteria) this;
        }

        public Criteria andResCtlLike(String value) {
            addCriterion("res_ctl like", value, "resCtl");
            return (Criteria) this;
        }

        public Criteria andResCtlNotLike(String value) {
            addCriterion("res_ctl not like", value, "resCtl");
            return (Criteria) this;
        }

        public Criteria andResCtlIn(List<String> values) {
            addCriterion("res_ctl in", values, "resCtl");
            return (Criteria) this;
        }

        public Criteria andResCtlNotIn(List<String> values) {
            addCriterion("res_ctl not in", values, "resCtl");
            return (Criteria) this;
        }

        public Criteria andResCtlBetween(String value1, String value2) {
            addCriterion("res_ctl between", value1, value2, "resCtl");
            return (Criteria) this;
        }

        public Criteria andResCtlNotBetween(String value1, String value2) {
            addCriterion("res_ctl not between", value1, value2, "resCtl");
            return (Criteria) this;
        }

        public Criteria andSrcNoIsNull() {
            addCriterion("src_no is null");
            return (Criteria) this;
        }

        public Criteria andSrcNoIsNotNull() {
            addCriterion("src_no is not null");
            return (Criteria) this;
        }

        public Criteria andSrcNoEqualTo(String value) {
            addCriterion("src_no =", value, "srcNo");
            return (Criteria) this;
        }

        public Criteria andSrcNoNotEqualTo(String value) {
            addCriterion("src_no <>", value, "srcNo");
            return (Criteria) this;
        }

        public Criteria andSrcNoGreaterThan(String value) {
            addCriterion("src_no >", value, "srcNo");
            return (Criteria) this;
        }

        public Criteria andSrcNoGreaterThanOrEqualTo(String value) {
            addCriterion("src_no >=", value, "srcNo");
            return (Criteria) this;
        }

        public Criteria andSrcNoLessThan(String value) {
            addCriterion("src_no <", value, "srcNo");
            return (Criteria) this;
        }

        public Criteria andSrcNoLessThanOrEqualTo(String value) {
            addCriterion("src_no <=", value, "srcNo");
            return (Criteria) this;
        }

        public Criteria andSrcNoLike(String value) {
            addCriterion("src_no like", value, "srcNo");
            return (Criteria) this;
        }

        public Criteria andSrcNoNotLike(String value) {
            addCriterion("src_no not like", value, "srcNo");
            return (Criteria) this;
        }

        public Criteria andSrcNoIn(List<String> values) {
            addCriterion("src_no in", values, "srcNo");
            return (Criteria) this;
        }

        public Criteria andSrcNoNotIn(List<String> values) {
            addCriterion("src_no not in", values, "srcNo");
            return (Criteria) this;
        }

        public Criteria andSrcNoBetween(String value1, String value2) {
            addCriterion("src_no between", value1, value2, "srcNo");
            return (Criteria) this;
        }

        public Criteria andSrcNoNotBetween(String value1, String value2) {
            addCriterion("src_no not between", value1, value2, "srcNo");
            return (Criteria) this;
        }

        public Criteria andSrcOrdIsNull() {
            addCriterion("src_ord is null");
            return (Criteria) this;
        }

        public Criteria andSrcOrdIsNotNull() {
            addCriterion("src_ord is not null");
            return (Criteria) this;
        }

        public Criteria andSrcOrdEqualTo(Integer value) {
            addCriterion("src_ord =", value, "srcOrd");
            return (Criteria) this;
        }

        public Criteria andSrcOrdNotEqualTo(Integer value) {
            addCriterion("src_ord <>", value, "srcOrd");
            return (Criteria) this;
        }

        public Criteria andSrcOrdGreaterThan(Integer value) {
            addCriterion("src_ord >", value, "srcOrd");
            return (Criteria) this;
        }

        public Criteria andSrcOrdGreaterThanOrEqualTo(Integer value) {
            addCriterion("src_ord >=", value, "srcOrd");
            return (Criteria) this;
        }

        public Criteria andSrcOrdLessThan(Integer value) {
            addCriterion("src_ord <", value, "srcOrd");
            return (Criteria) this;
        }

        public Criteria andSrcOrdLessThanOrEqualTo(Integer value) {
            addCriterion("src_ord <=", value, "srcOrd");
            return (Criteria) this;
        }

        public Criteria andSrcOrdIn(List<Integer> values) {
            addCriterion("src_ord in", values, "srcOrd");
            return (Criteria) this;
        }

        public Criteria andSrcOrdNotIn(List<Integer> values) {
            addCriterion("src_ord not in", values, "srcOrd");
            return (Criteria) this;
        }

        public Criteria andSrcOrdBetween(Integer value1, Integer value2) {
            addCriterion("src_ord between", value1, value2, "srcOrd");
            return (Criteria) this;
        }

        public Criteria andSrcOrdNotBetween(Integer value1, Integer value2) {
            addCriterion("src_ord not between", value1, value2, "srcOrd");
            return (Criteria) this;
        }

        public Criteria andDomainIsNull() {
            addCriterion("`domain` is null");
            return (Criteria) this;
        }

        public Criteria andDomainIsNotNull() {
            addCriterion("`domain` is not null");
            return (Criteria) this;
        }

        public Criteria andDomainEqualTo(String value) {
            addCriterion("`domain` =", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotEqualTo(String value) {
            addCriterion("`domain` <>", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainGreaterThan(String value) {
            addCriterion("`domain` >", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainGreaterThanOrEqualTo(String value) {
            addCriterion("`domain` >=", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainLessThan(String value) {
            addCriterion("`domain` <", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainLessThanOrEqualTo(String value) {
            addCriterion("`domain` <=", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainLike(String value) {
            addCriterion("`domain` like", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotLike(String value) {
            addCriterion("`domain` not like", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainIn(List<String> values) {
            addCriterion("`domain` in", values, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotIn(List<String> values) {
            addCriterion("`domain` not in", values, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainBetween(String value1, String value2) {
            addCriterion("`domain` between", value1, value2, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotBetween(String value1, String value2) {
            addCriterion("`domain` not between", value1, value2, "domain");
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

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
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

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("update_user like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("update_user not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
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