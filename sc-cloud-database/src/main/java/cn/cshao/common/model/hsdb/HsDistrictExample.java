package cn.cshao.common.model.hsdb;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HsDistrictExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HsDistrictExample() {
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

        public Criteria andDistIdIsNull() {
            addCriterion("dist_id is null");
            return (Criteria) this;
        }

        public Criteria andDistIdIsNotNull() {
            addCriterion("dist_id is not null");
            return (Criteria) this;
        }

        public Criteria andDistIdEqualTo(Integer value) {
            addCriterion("dist_id =", value, "distId");
            return (Criteria) this;
        }

        public Criteria andDistIdNotEqualTo(Integer value) {
            addCriterion("dist_id <>", value, "distId");
            return (Criteria) this;
        }

        public Criteria andDistIdGreaterThan(Integer value) {
            addCriterion("dist_id >", value, "distId");
            return (Criteria) this;
        }

        public Criteria andDistIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dist_id >=", value, "distId");
            return (Criteria) this;
        }

        public Criteria andDistIdLessThan(Integer value) {
            addCriterion("dist_id <", value, "distId");
            return (Criteria) this;
        }

        public Criteria andDistIdLessThanOrEqualTo(Integer value) {
            addCriterion("dist_id <=", value, "distId");
            return (Criteria) this;
        }

        public Criteria andDistIdIn(List<Integer> values) {
            addCriterion("dist_id in", values, "distId");
            return (Criteria) this;
        }

        public Criteria andDistIdNotIn(List<Integer> values) {
            addCriterion("dist_id not in", values, "distId");
            return (Criteria) this;
        }

        public Criteria andDistIdBetween(Integer value1, Integer value2) {
            addCriterion("dist_id between", value1, value2, "distId");
            return (Criteria) this;
        }

        public Criteria andDistIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dist_id not between", value1, value2, "distId");
            return (Criteria) this;
        }

        public Criteria andDistNmIsNull() {
            addCriterion("dist_nm is null");
            return (Criteria) this;
        }

        public Criteria andDistNmIsNotNull() {
            addCriterion("dist_nm is not null");
            return (Criteria) this;
        }

        public Criteria andDistNmEqualTo(String value) {
            addCriterion("dist_nm =", value, "distNm");
            return (Criteria) this;
        }

        public Criteria andDistNmNotEqualTo(String value) {
            addCriterion("dist_nm <>", value, "distNm");
            return (Criteria) this;
        }

        public Criteria andDistNmGreaterThan(String value) {
            addCriterion("dist_nm >", value, "distNm");
            return (Criteria) this;
        }

        public Criteria andDistNmGreaterThanOrEqualTo(String value) {
            addCriterion("dist_nm >=", value, "distNm");
            return (Criteria) this;
        }

        public Criteria andDistNmLessThan(String value) {
            addCriterion("dist_nm <", value, "distNm");
            return (Criteria) this;
        }

        public Criteria andDistNmLessThanOrEqualTo(String value) {
            addCriterion("dist_nm <=", value, "distNm");
            return (Criteria) this;
        }

        public Criteria andDistNmLike(String value) {
            addCriterion("dist_nm like", value, "distNm");
            return (Criteria) this;
        }

        public Criteria andDistNmNotLike(String value) {
            addCriterion("dist_nm not like", value, "distNm");
            return (Criteria) this;
        }

        public Criteria andDistNmIn(List<String> values) {
            addCriterion("dist_nm in", values, "distNm");
            return (Criteria) this;
        }

        public Criteria andDistNmNotIn(List<String> values) {
            addCriterion("dist_nm not in", values, "distNm");
            return (Criteria) this;
        }

        public Criteria andDistNmBetween(String value1, String value2) {
            addCriterion("dist_nm between", value1, value2, "distNm");
            return (Criteria) this;
        }

        public Criteria andDistNmNotBetween(String value1, String value2) {
            addCriterion("dist_nm not between", value1, value2, "distNm");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("`level` is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("`level` is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Byte value) {
            addCriterion("`level` =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Byte value) {
            addCriterion("`level` <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Byte value) {
            addCriterion("`level` >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("`level` >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Byte value) {
            addCriterion("`level` <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Byte value) {
            addCriterion("`level` <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Byte> values) {
            addCriterion("`level` in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Byte> values) {
            addCriterion("`level` not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Byte value1, Byte value2) {
            addCriterion("`level` between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("`level` not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelDescIsNull() {
            addCriterion("level_desc is null");
            return (Criteria) this;
        }

        public Criteria andLevelDescIsNotNull() {
            addCriterion("level_desc is not null");
            return (Criteria) this;
        }

        public Criteria andLevelDescEqualTo(String value) {
            addCriterion("level_desc =", value, "levelDesc");
            return (Criteria) this;
        }

        public Criteria andLevelDescNotEqualTo(String value) {
            addCriterion("level_desc <>", value, "levelDesc");
            return (Criteria) this;
        }

        public Criteria andLevelDescGreaterThan(String value) {
            addCriterion("level_desc >", value, "levelDesc");
            return (Criteria) this;
        }

        public Criteria andLevelDescGreaterThanOrEqualTo(String value) {
            addCriterion("level_desc >=", value, "levelDesc");
            return (Criteria) this;
        }

        public Criteria andLevelDescLessThan(String value) {
            addCriterion("level_desc <", value, "levelDesc");
            return (Criteria) this;
        }

        public Criteria andLevelDescLessThanOrEqualTo(String value) {
            addCriterion("level_desc <=", value, "levelDesc");
            return (Criteria) this;
        }

        public Criteria andLevelDescLike(String value) {
            addCriterion("level_desc like", value, "levelDesc");
            return (Criteria) this;
        }

        public Criteria andLevelDescNotLike(String value) {
            addCriterion("level_desc not like", value, "levelDesc");
            return (Criteria) this;
        }

        public Criteria andLevelDescIn(List<String> values) {
            addCriterion("level_desc in", values, "levelDesc");
            return (Criteria) this;
        }

        public Criteria andLevelDescNotIn(List<String> values) {
            addCriterion("level_desc not in", values, "levelDesc");
            return (Criteria) this;
        }

        public Criteria andLevelDescBetween(String value1, String value2) {
            addCriterion("level_desc between", value1, value2, "levelDesc");
            return (Criteria) this;
        }

        public Criteria andLevelDescNotBetween(String value1, String value2) {
            addCriterion("level_desc not between", value1, value2, "levelDesc");
            return (Criteria) this;
        }

        public Criteria andUpIdIsNull() {
            addCriterion("up_id is null");
            return (Criteria) this;
        }

        public Criteria andUpIdIsNotNull() {
            addCriterion("up_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpIdEqualTo(Integer value) {
            addCriterion("up_id =", value, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdNotEqualTo(Integer value) {
            addCriterion("up_id <>", value, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdGreaterThan(Integer value) {
            addCriterion("up_id >", value, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("up_id >=", value, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdLessThan(Integer value) {
            addCriterion("up_id <", value, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdLessThanOrEqualTo(Integer value) {
            addCriterion("up_id <=", value, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdIn(List<Integer> values) {
            addCriterion("up_id in", values, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdNotIn(List<Integer> values) {
            addCriterion("up_id not in", values, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdBetween(Integer value1, Integer value2) {
            addCriterion("up_id between", value1, value2, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("up_id not between", value1, value2, "upId");
            return (Criteria) this;
        }

        public Criteria andDescIsNull() {
            addCriterion("`desc` is null");
            return (Criteria) this;
        }

        public Criteria andDescIsNotNull() {
            addCriterion("`desc` is not null");
            return (Criteria) this;
        }

        public Criteria andDescEqualTo(String value) {
            addCriterion("`desc` =", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotEqualTo(String value) {
            addCriterion("`desc` <>", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescGreaterThan(String value) {
            addCriterion("`desc` >", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescGreaterThanOrEqualTo(String value) {
            addCriterion("`desc` >=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLessThan(String value) {
            addCriterion("`desc` <", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLessThanOrEqualTo(String value) {
            addCriterion("`desc` <=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLike(String value) {
            addCriterion("`desc` like", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotLike(String value) {
            addCriterion("`desc` not like", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescIn(List<String> values) {
            addCriterion("`desc` in", values, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotIn(List<String> values) {
            addCriterion("`desc` not in", values, "desc");
            return (Criteria) this;
        }

        public Criteria andDescBetween(String value1, String value2) {
            addCriterion("`desc` between", value1, value2, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotBetween(String value1, String value2) {
            addCriterion("`desc` not between", value1, value2, "desc");
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