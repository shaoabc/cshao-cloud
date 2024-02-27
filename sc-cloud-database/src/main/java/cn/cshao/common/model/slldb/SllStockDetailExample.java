package cn.cshao.common.model.slldb;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SllStockDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SllStockDetailExample() {
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

        public Criteria andStdIdIsNull() {
            addCriterion("std_id is null");
            return (Criteria) this;
        }

        public Criteria andStdIdIsNotNull() {
            addCriterion("std_id is not null");
            return (Criteria) this;
        }

        public Criteria andStdIdEqualTo(Long value) {
            addCriterion("std_id =", value, "stdId");
            return (Criteria) this;
        }

        public Criteria andStdIdNotEqualTo(Long value) {
            addCriterion("std_id <>", value, "stdId");
            return (Criteria) this;
        }

        public Criteria andStdIdGreaterThan(Long value) {
            addCriterion("std_id >", value, "stdId");
            return (Criteria) this;
        }

        public Criteria andStdIdGreaterThanOrEqualTo(Long value) {
            addCriterion("std_id >=", value, "stdId");
            return (Criteria) this;
        }

        public Criteria andStdIdLessThan(Long value) {
            addCriterion("std_id <", value, "stdId");
            return (Criteria) this;
        }

        public Criteria andStdIdLessThanOrEqualTo(Long value) {
            addCriterion("std_id <=", value, "stdId");
            return (Criteria) this;
        }

        public Criteria andStdIdIn(List<Long> values) {
            addCriterion("std_id in", values, "stdId");
            return (Criteria) this;
        }

        public Criteria andStdIdNotIn(List<Long> values) {
            addCriterion("std_id not in", values, "stdId");
            return (Criteria) this;
        }

        public Criteria andStdIdBetween(Long value1, Long value2) {
            addCriterion("std_id between", value1, value2, "stdId");
            return (Criteria) this;
        }

        public Criteria andStdIdNotBetween(Long value1, Long value2) {
            addCriterion("std_id not between", value1, value2, "stdId");
            return (Criteria) this;
        }

        public Criteria andStdNoIsNull() {
            addCriterion("std_no is null");
            return (Criteria) this;
        }

        public Criteria andStdNoIsNotNull() {
            addCriterion("std_no is not null");
            return (Criteria) this;
        }

        public Criteria andStdNoEqualTo(String value) {
            addCriterion("std_no =", value, "stdNo");
            return (Criteria) this;
        }

        public Criteria andStdNoNotEqualTo(String value) {
            addCriterion("std_no <>", value, "stdNo");
            return (Criteria) this;
        }

        public Criteria andStdNoGreaterThan(String value) {
            addCriterion("std_no >", value, "stdNo");
            return (Criteria) this;
        }

        public Criteria andStdNoGreaterThanOrEqualTo(String value) {
            addCriterion("std_no >=", value, "stdNo");
            return (Criteria) this;
        }

        public Criteria andStdNoLessThan(String value) {
            addCriterion("std_no <", value, "stdNo");
            return (Criteria) this;
        }

        public Criteria andStdNoLessThanOrEqualTo(String value) {
            addCriterion("std_no <=", value, "stdNo");
            return (Criteria) this;
        }

        public Criteria andStdNoLike(String value) {
            addCriterion("std_no like", value, "stdNo");
            return (Criteria) this;
        }

        public Criteria andStdNoNotLike(String value) {
            addCriterion("std_no not like", value, "stdNo");
            return (Criteria) this;
        }

        public Criteria andStdNoIn(List<String> values) {
            addCriterion("std_no in", values, "stdNo");
            return (Criteria) this;
        }

        public Criteria andStdNoNotIn(List<String> values) {
            addCriterion("std_no not in", values, "stdNo");
            return (Criteria) this;
        }

        public Criteria andStdNoBetween(String value1, String value2) {
            addCriterion("std_no between", value1, value2, "stdNo");
            return (Criteria) this;
        }

        public Criteria andStdNoNotBetween(String value1, String value2) {
            addCriterion("std_no not between", value1, value2, "stdNo");
            return (Criteria) this;
        }

        public Criteria andPhIdIsNull() {
            addCriterion("ph_id is null");
            return (Criteria) this;
        }

        public Criteria andPhIdIsNotNull() {
            addCriterion("ph_id is not null");
            return (Criteria) this;
        }

        public Criteria andPhIdEqualTo(Long value) {
            addCriterion("ph_id =", value, "phId");
            return (Criteria) this;
        }

        public Criteria andPhIdNotEqualTo(Long value) {
            addCriterion("ph_id <>", value, "phId");
            return (Criteria) this;
        }

        public Criteria andPhIdGreaterThan(Long value) {
            addCriterion("ph_id >", value, "phId");
            return (Criteria) this;
        }

        public Criteria andPhIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ph_id >=", value, "phId");
            return (Criteria) this;
        }

        public Criteria andPhIdLessThan(Long value) {
            addCriterion("ph_id <", value, "phId");
            return (Criteria) this;
        }

        public Criteria andPhIdLessThanOrEqualTo(Long value) {
            addCriterion("ph_id <=", value, "phId");
            return (Criteria) this;
        }

        public Criteria andPhIdIn(List<Long> values) {
            addCriterion("ph_id in", values, "phId");
            return (Criteria) this;
        }

        public Criteria andPhIdNotIn(List<Long> values) {
            addCriterion("ph_id not in", values, "phId");
            return (Criteria) this;
        }

        public Criteria andPhIdBetween(Long value1, Long value2) {
            addCriterion("ph_id between", value1, value2, "phId");
            return (Criteria) this;
        }

        public Criteria andPhIdNotBetween(Long value1, Long value2) {
            addCriterion("ph_id not between", value1, value2, "phId");
            return (Criteria) this;
        }

        public Criteria andMdNoIsNull() {
            addCriterion("md_no is null");
            return (Criteria) this;
        }

        public Criteria andMdNoIsNotNull() {
            addCriterion("md_no is not null");
            return (Criteria) this;
        }

        public Criteria andMdNoEqualTo(String value) {
            addCriterion("md_no =", value, "mdNo");
            return (Criteria) this;
        }

        public Criteria andMdNoNotEqualTo(String value) {
            addCriterion("md_no <>", value, "mdNo");
            return (Criteria) this;
        }

        public Criteria andMdNoGreaterThan(String value) {
            addCriterion("md_no >", value, "mdNo");
            return (Criteria) this;
        }

        public Criteria andMdNoGreaterThanOrEqualTo(String value) {
            addCriterion("md_no >=", value, "mdNo");
            return (Criteria) this;
        }

        public Criteria andMdNoLessThan(String value) {
            addCriterion("md_no <", value, "mdNo");
            return (Criteria) this;
        }

        public Criteria andMdNoLessThanOrEqualTo(String value) {
            addCriterion("md_no <=", value, "mdNo");
            return (Criteria) this;
        }

        public Criteria andMdNoLike(String value) {
            addCriterion("md_no like", value, "mdNo");
            return (Criteria) this;
        }

        public Criteria andMdNoNotLike(String value) {
            addCriterion("md_no not like", value, "mdNo");
            return (Criteria) this;
        }

        public Criteria andMdNoIn(List<String> values) {
            addCriterion("md_no in", values, "mdNo");
            return (Criteria) this;
        }

        public Criteria andMdNoNotIn(List<String> values) {
            addCriterion("md_no not in", values, "mdNo");
            return (Criteria) this;
        }

        public Criteria andMdNoBetween(String value1, String value2) {
            addCriterion("md_no between", value1, value2, "mdNo");
            return (Criteria) this;
        }

        public Criteria andMdNoNotBetween(String value1, String value2) {
            addCriterion("md_no not between", value1, value2, "mdNo");
            return (Criteria) this;
        }

        public Criteria andCfmNumIsNull() {
            addCriterion("cfm_num is null");
            return (Criteria) this;
        }

        public Criteria andCfmNumIsNotNull() {
            addCriterion("cfm_num is not null");
            return (Criteria) this;
        }

        public Criteria andCfmNumEqualTo(Integer value) {
            addCriterion("cfm_num =", value, "cfmNum");
            return (Criteria) this;
        }

        public Criteria andCfmNumNotEqualTo(Integer value) {
            addCriterion("cfm_num <>", value, "cfmNum");
            return (Criteria) this;
        }

        public Criteria andCfmNumGreaterThan(Integer value) {
            addCriterion("cfm_num >", value, "cfmNum");
            return (Criteria) this;
        }

        public Criteria andCfmNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("cfm_num >=", value, "cfmNum");
            return (Criteria) this;
        }

        public Criteria andCfmNumLessThan(Integer value) {
            addCriterion("cfm_num <", value, "cfmNum");
            return (Criteria) this;
        }

        public Criteria andCfmNumLessThanOrEqualTo(Integer value) {
            addCriterion("cfm_num <=", value, "cfmNum");
            return (Criteria) this;
        }

        public Criteria andCfmNumIn(List<Integer> values) {
            addCriterion("cfm_num in", values, "cfmNum");
            return (Criteria) this;
        }

        public Criteria andCfmNumNotIn(List<Integer> values) {
            addCriterion("cfm_num not in", values, "cfmNum");
            return (Criteria) this;
        }

        public Criteria andCfmNumBetween(Integer value1, Integer value2) {
            addCriterion("cfm_num between", value1, value2, "cfmNum");
            return (Criteria) this;
        }

        public Criteria andCfmNumNotBetween(Integer value1, Integer value2) {
            addCriterion("cfm_num not between", value1, value2, "cfmNum");
            return (Criteria) this;
        }

        public Criteria andRestNumIsNull() {
            addCriterion("rest_num is null");
            return (Criteria) this;
        }

        public Criteria andRestNumIsNotNull() {
            addCriterion("rest_num is not null");
            return (Criteria) this;
        }

        public Criteria andRestNumEqualTo(Integer value) {
            addCriterion("rest_num =", value, "restNum");
            return (Criteria) this;
        }

        public Criteria andRestNumNotEqualTo(Integer value) {
            addCriterion("rest_num <>", value, "restNum");
            return (Criteria) this;
        }

        public Criteria andRestNumGreaterThan(Integer value) {
            addCriterion("rest_num >", value, "restNum");
            return (Criteria) this;
        }

        public Criteria andRestNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("rest_num >=", value, "restNum");
            return (Criteria) this;
        }

        public Criteria andRestNumLessThan(Integer value) {
            addCriterion("rest_num <", value, "restNum");
            return (Criteria) this;
        }

        public Criteria andRestNumLessThanOrEqualTo(Integer value) {
            addCriterion("rest_num <=", value, "restNum");
            return (Criteria) this;
        }

        public Criteria andRestNumIn(List<Integer> values) {
            addCriterion("rest_num in", values, "restNum");
            return (Criteria) this;
        }

        public Criteria andRestNumNotIn(List<Integer> values) {
            addCriterion("rest_num not in", values, "restNum");
            return (Criteria) this;
        }

        public Criteria andRestNumBetween(Integer value1, Integer value2) {
            addCriterion("rest_num between", value1, value2, "restNum");
            return (Criteria) this;
        }

        public Criteria andRestNumNotBetween(Integer value1, Integer value2) {
            addCriterion("rest_num not between", value1, value2, "restNum");
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

        public Criteria andBatchNoIsNull() {
            addCriterion("batch_no is null");
            return (Criteria) this;
        }

        public Criteria andBatchNoIsNotNull() {
            addCriterion("batch_no is not null");
            return (Criteria) this;
        }

        public Criteria andBatchNoEqualTo(String value) {
            addCriterion("batch_no =", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotEqualTo(String value) {
            addCriterion("batch_no <>", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoGreaterThan(String value) {
            addCriterion("batch_no >", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoGreaterThanOrEqualTo(String value) {
            addCriterion("batch_no >=", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoLessThan(String value) {
            addCriterion("batch_no <", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoLessThanOrEqualTo(String value) {
            addCriterion("batch_no <=", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoLike(String value) {
            addCriterion("batch_no like", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotLike(String value) {
            addCriterion("batch_no not like", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoIn(List<String> values) {
            addCriterion("batch_no in", values, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotIn(List<String> values) {
            addCriterion("batch_no not in", values, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoBetween(String value1, String value2) {
            addCriterion("batch_no between", value1, value2, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotBetween(String value1, String value2) {
            addCriterion("batch_no not between", value1, value2, "batchNo");
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