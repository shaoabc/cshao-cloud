package cn.cshao.common.model.slldb;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbCustomerInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbCustomerInfoExample() {
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

        public Criteria andMonthIsNull() {
            addCriterion("`month` is null");
            return (Criteria) this;
        }

        public Criteria andMonthIsNotNull() {
            addCriterion("`month` is not null");
            return (Criteria) this;
        }

        public Criteria andMonthEqualTo(String value) {
            addCriterion("`month` =", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotEqualTo(String value) {
            addCriterion("`month` <>", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThan(String value) {
            addCriterion("`month` >", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThanOrEqualTo(String value) {
            addCriterion("`month` >=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThan(String value) {
            addCriterion("`month` <", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThanOrEqualTo(String value) {
            addCriterion("`month` <=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLike(String value) {
            addCriterion("`month` like", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotLike(String value) {
            addCriterion("`month` not like", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthIn(List<String> values) {
            addCriterion("`month` in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotIn(List<String> values) {
            addCriterion("`month` not in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthBetween(String value1, String value2) {
            addCriterion("`month` between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotBetween(String value1, String value2) {
            addCriterion("`month` not between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andVarietyIsNull() {
            addCriterion("variety is null");
            return (Criteria) this;
        }

        public Criteria andVarietyIsNotNull() {
            addCriterion("variety is not null");
            return (Criteria) this;
        }

        public Criteria andVarietyEqualTo(String value) {
            addCriterion("variety =", value, "variety");
            return (Criteria) this;
        }

        public Criteria andVarietyNotEqualTo(String value) {
            addCriterion("variety <>", value, "variety");
            return (Criteria) this;
        }

        public Criteria andVarietyGreaterThan(String value) {
            addCriterion("variety >", value, "variety");
            return (Criteria) this;
        }

        public Criteria andVarietyGreaterThanOrEqualTo(String value) {
            addCriterion("variety >=", value, "variety");
            return (Criteria) this;
        }

        public Criteria andVarietyLessThan(String value) {
            addCriterion("variety <", value, "variety");
            return (Criteria) this;
        }

        public Criteria andVarietyLessThanOrEqualTo(String value) {
            addCriterion("variety <=", value, "variety");
            return (Criteria) this;
        }

        public Criteria andVarietyLike(String value) {
            addCriterion("variety like", value, "variety");
            return (Criteria) this;
        }

        public Criteria andVarietyNotLike(String value) {
            addCriterion("variety not like", value, "variety");
            return (Criteria) this;
        }

        public Criteria andVarietyIn(List<String> values) {
            addCriterion("variety in", values, "variety");
            return (Criteria) this;
        }

        public Criteria andVarietyNotIn(List<String> values) {
            addCriterion("variety not in", values, "variety");
            return (Criteria) this;
        }

        public Criteria andVarietyBetween(String value1, String value2) {
            addCriterion("variety between", value1, value2, "variety");
            return (Criteria) this;
        }

        public Criteria andVarietyNotBetween(String value1, String value2) {
            addCriterion("variety not between", value1, value2, "variety");
            return (Criteria) this;
        }

        public Criteria andEmpNoIsNull() {
            addCriterion("emp_no is null");
            return (Criteria) this;
        }

        public Criteria andEmpNoIsNotNull() {
            addCriterion("emp_no is not null");
            return (Criteria) this;
        }

        public Criteria andEmpNoEqualTo(String value) {
            addCriterion("emp_no =", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoNotEqualTo(String value) {
            addCriterion("emp_no <>", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoGreaterThan(String value) {
            addCriterion("emp_no >", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoGreaterThanOrEqualTo(String value) {
            addCriterion("emp_no >=", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoLessThan(String value) {
            addCriterion("emp_no <", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoLessThanOrEqualTo(String value) {
            addCriterion("emp_no <=", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoLike(String value) {
            addCriterion("emp_no like", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoNotLike(String value) {
            addCriterion("emp_no not like", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoIn(List<String> values) {
            addCriterion("emp_no in", values, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoNotIn(List<String> values) {
            addCriterion("emp_no not in", values, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoBetween(String value1, String value2) {
            addCriterion("emp_no between", value1, value2, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoNotBetween(String value1, String value2) {
            addCriterion("emp_no not between", value1, value2, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNmIsNull() {
            addCriterion("emp_nm is null");
            return (Criteria) this;
        }

        public Criteria andEmpNmIsNotNull() {
            addCriterion("emp_nm is not null");
            return (Criteria) this;
        }

        public Criteria andEmpNmEqualTo(String value) {
            addCriterion("emp_nm =", value, "empNm");
            return (Criteria) this;
        }

        public Criteria andEmpNmNotEqualTo(String value) {
            addCriterion("emp_nm <>", value, "empNm");
            return (Criteria) this;
        }

        public Criteria andEmpNmGreaterThan(String value) {
            addCriterion("emp_nm >", value, "empNm");
            return (Criteria) this;
        }

        public Criteria andEmpNmGreaterThanOrEqualTo(String value) {
            addCriterion("emp_nm >=", value, "empNm");
            return (Criteria) this;
        }

        public Criteria andEmpNmLessThan(String value) {
            addCriterion("emp_nm <", value, "empNm");
            return (Criteria) this;
        }

        public Criteria andEmpNmLessThanOrEqualTo(String value) {
            addCriterion("emp_nm <=", value, "empNm");
            return (Criteria) this;
        }

        public Criteria andEmpNmLike(String value) {
            addCriterion("emp_nm like", value, "empNm");
            return (Criteria) this;
        }

        public Criteria andEmpNmNotLike(String value) {
            addCriterion("emp_nm not like", value, "empNm");
            return (Criteria) this;
        }

        public Criteria andEmpNmIn(List<String> values) {
            addCriterion("emp_nm in", values, "empNm");
            return (Criteria) this;
        }

        public Criteria andEmpNmNotIn(List<String> values) {
            addCriterion("emp_nm not in", values, "empNm");
            return (Criteria) this;
        }

        public Criteria andEmpNmBetween(String value1, String value2) {
            addCriterion("emp_nm between", value1, value2, "empNm");
            return (Criteria) this;
        }

        public Criteria andEmpNmNotBetween(String value1, String value2) {
            addCriterion("emp_nm not between", value1, value2, "empNm");
            return (Criteria) this;
        }

        public Criteria andEmpCategoryIsNull() {
            addCriterion("emp_category is null");
            return (Criteria) this;
        }

        public Criteria andEmpCategoryIsNotNull() {
            addCriterion("emp_category is not null");
            return (Criteria) this;
        }

        public Criteria andEmpCategoryEqualTo(String value) {
            addCriterion("emp_category =", value, "empCategory");
            return (Criteria) this;
        }

        public Criteria andEmpCategoryNotEqualTo(String value) {
            addCriterion("emp_category <>", value, "empCategory");
            return (Criteria) this;
        }

        public Criteria andEmpCategoryGreaterThan(String value) {
            addCriterion("emp_category >", value, "empCategory");
            return (Criteria) this;
        }

        public Criteria andEmpCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("emp_category >=", value, "empCategory");
            return (Criteria) this;
        }

        public Criteria andEmpCategoryLessThan(String value) {
            addCriterion("emp_category <", value, "empCategory");
            return (Criteria) this;
        }

        public Criteria andEmpCategoryLessThanOrEqualTo(String value) {
            addCriterion("emp_category <=", value, "empCategory");
            return (Criteria) this;
        }

        public Criteria andEmpCategoryLike(String value) {
            addCriterion("emp_category like", value, "empCategory");
            return (Criteria) this;
        }

        public Criteria andEmpCategoryNotLike(String value) {
            addCriterion("emp_category not like", value, "empCategory");
            return (Criteria) this;
        }

        public Criteria andEmpCategoryIn(List<String> values) {
            addCriterion("emp_category in", values, "empCategory");
            return (Criteria) this;
        }

        public Criteria andEmpCategoryNotIn(List<String> values) {
            addCriterion("emp_category not in", values, "empCategory");
            return (Criteria) this;
        }

        public Criteria andEmpCategoryBetween(String value1, String value2) {
            addCriterion("emp_category between", value1, value2, "empCategory");
            return (Criteria) this;
        }

        public Criteria andEmpCategoryNotBetween(String value1, String value2) {
            addCriterion("emp_category not between", value1, value2, "empCategory");
            return (Criteria) this;
        }

        public Criteria andMktDateIsNull() {
            addCriterion("mkt_date is null");
            return (Criteria) this;
        }

        public Criteria andMktDateIsNotNull() {
            addCriterion("mkt_date is not null");
            return (Criteria) this;
        }

        public Criteria andMktDateEqualTo(String value) {
            addCriterion("mkt_date =", value, "mktDate");
            return (Criteria) this;
        }

        public Criteria andMktDateNotEqualTo(String value) {
            addCriterion("mkt_date <>", value, "mktDate");
            return (Criteria) this;
        }

        public Criteria andMktDateGreaterThan(String value) {
            addCriterion("mkt_date >", value, "mktDate");
            return (Criteria) this;
        }

        public Criteria andMktDateGreaterThanOrEqualTo(String value) {
            addCriterion("mkt_date >=", value, "mktDate");
            return (Criteria) this;
        }

        public Criteria andMktDateLessThan(String value) {
            addCriterion("mkt_date <", value, "mktDate");
            return (Criteria) this;
        }

        public Criteria andMktDateLessThanOrEqualTo(String value) {
            addCriterion("mkt_date <=", value, "mktDate");
            return (Criteria) this;
        }

        public Criteria andMktDateLike(String value) {
            addCriterion("mkt_date like", value, "mktDate");
            return (Criteria) this;
        }

        public Criteria andMktDateNotLike(String value) {
            addCriterion("mkt_date not like", value, "mktDate");
            return (Criteria) this;
        }

        public Criteria andMktDateIn(List<String> values) {
            addCriterion("mkt_date in", values, "mktDate");
            return (Criteria) this;
        }

        public Criteria andMktDateNotIn(List<String> values) {
            addCriterion("mkt_date not in", values, "mktDate");
            return (Criteria) this;
        }

        public Criteria andMktDateBetween(String value1, String value2) {
            addCriterion("mkt_date between", value1, value2, "mktDate");
            return (Criteria) this;
        }

        public Criteria andMktDateNotBetween(String value1, String value2) {
            addCriterion("mkt_date not between", value1, value2, "mktDate");
            return (Criteria) this;
        }

        public Criteria andUnRegionIsNull() {
            addCriterion("un_region is null");
            return (Criteria) this;
        }

        public Criteria andUnRegionIsNotNull() {
            addCriterion("un_region is not null");
            return (Criteria) this;
        }

        public Criteria andUnRegionEqualTo(String value) {
            addCriterion("un_region =", value, "unRegion");
            return (Criteria) this;
        }

        public Criteria andUnRegionNotEqualTo(String value) {
            addCriterion("un_region <>", value, "unRegion");
            return (Criteria) this;
        }

        public Criteria andUnRegionGreaterThan(String value) {
            addCriterion("un_region >", value, "unRegion");
            return (Criteria) this;
        }

        public Criteria andUnRegionGreaterThanOrEqualTo(String value) {
            addCriterion("un_region >=", value, "unRegion");
            return (Criteria) this;
        }

        public Criteria andUnRegionLessThan(String value) {
            addCriterion("un_region <", value, "unRegion");
            return (Criteria) this;
        }

        public Criteria andUnRegionLessThanOrEqualTo(String value) {
            addCriterion("un_region <=", value, "unRegion");
            return (Criteria) this;
        }

        public Criteria andUnRegionLike(String value) {
            addCriterion("un_region like", value, "unRegion");
            return (Criteria) this;
        }

        public Criteria andUnRegionNotLike(String value) {
            addCriterion("un_region not like", value, "unRegion");
            return (Criteria) this;
        }

        public Criteria andUnRegionIn(List<String> values) {
            addCriterion("un_region in", values, "unRegion");
            return (Criteria) this;
        }

        public Criteria andUnRegionNotIn(List<String> values) {
            addCriterion("un_region not in", values, "unRegion");
            return (Criteria) this;
        }

        public Criteria andUnRegionBetween(String value1, String value2) {
            addCriterion("un_region between", value1, value2, "unRegion");
            return (Criteria) this;
        }

        public Criteria andUnRegionNotBetween(String value1, String value2) {
            addCriterion("un_region not between", value1, value2, "unRegion");
            return (Criteria) this;
        }

        public Criteria andRegionIsNull() {
            addCriterion("region is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("region is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(String value) {
            addCriterion("region =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(String value) {
            addCriterion("region <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(String value) {
            addCriterion("region >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(String value) {
            addCriterion("region >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(String value) {
            addCriterion("region <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(String value) {
            addCriterion("region <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLike(String value) {
            addCriterion("region like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotLike(String value) {
            addCriterion("region not like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<String> values) {
            addCriterion("region in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<String> values) {
            addCriterion("region not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(String value1, String value2) {
            addCriterion("region between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(String value1, String value2) {
            addCriterion("region not between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andOfficeIsNull() {
            addCriterion("office is null");
            return (Criteria) this;
        }

        public Criteria andOfficeIsNotNull() {
            addCriterion("office is not null");
            return (Criteria) this;
        }

        public Criteria andOfficeEqualTo(String value) {
            addCriterion("office =", value, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeNotEqualTo(String value) {
            addCriterion("office <>", value, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeGreaterThan(String value) {
            addCriterion("office >", value, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeGreaterThanOrEqualTo(String value) {
            addCriterion("office >=", value, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeLessThan(String value) {
            addCriterion("office <", value, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeLessThanOrEqualTo(String value) {
            addCriterion("office <=", value, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeLike(String value) {
            addCriterion("office like", value, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeNotLike(String value) {
            addCriterion("office not like", value, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeIn(List<String> values) {
            addCriterion("office in", values, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeNotIn(List<String> values) {
            addCriterion("office not in", values, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeBetween(String value1, String value2) {
            addCriterion("office between", value1, value2, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeNotBetween(String value1, String value2) {
            addCriterion("office not between", value1, value2, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeMgrIsNull() {
            addCriterion("office_mgr is null");
            return (Criteria) this;
        }

        public Criteria andOfficeMgrIsNotNull() {
            addCriterion("office_mgr is not null");
            return (Criteria) this;
        }

        public Criteria andOfficeMgrEqualTo(String value) {
            addCriterion("office_mgr =", value, "officeMgr");
            return (Criteria) this;
        }

        public Criteria andOfficeMgrNotEqualTo(String value) {
            addCriterion("office_mgr <>", value, "officeMgr");
            return (Criteria) this;
        }

        public Criteria andOfficeMgrGreaterThan(String value) {
            addCriterion("office_mgr >", value, "officeMgr");
            return (Criteria) this;
        }

        public Criteria andOfficeMgrGreaterThanOrEqualTo(String value) {
            addCriterion("office_mgr >=", value, "officeMgr");
            return (Criteria) this;
        }

        public Criteria andOfficeMgrLessThan(String value) {
            addCriterion("office_mgr <", value, "officeMgr");
            return (Criteria) this;
        }

        public Criteria andOfficeMgrLessThanOrEqualTo(String value) {
            addCriterion("office_mgr <=", value, "officeMgr");
            return (Criteria) this;
        }

        public Criteria andOfficeMgrLike(String value) {
            addCriterion("office_mgr like", value, "officeMgr");
            return (Criteria) this;
        }

        public Criteria andOfficeMgrNotLike(String value) {
            addCriterion("office_mgr not like", value, "officeMgr");
            return (Criteria) this;
        }

        public Criteria andOfficeMgrIn(List<String> values) {
            addCriterion("office_mgr in", values, "officeMgr");
            return (Criteria) this;
        }

        public Criteria andOfficeMgrNotIn(List<String> values) {
            addCriterion("office_mgr not in", values, "officeMgr");
            return (Criteria) this;
        }

        public Criteria andOfficeMgrBetween(String value1, String value2) {
            addCriterion("office_mgr between", value1, value2, "officeMgr");
            return (Criteria) this;
        }

        public Criteria andOfficeMgrNotBetween(String value1, String value2) {
            addCriterion("office_mgr not between", value1, value2, "officeMgr");
            return (Criteria) this;
        }

        public Criteria andHospitalIsNull() {
            addCriterion("hospital is null");
            return (Criteria) this;
        }

        public Criteria andHospitalIsNotNull() {
            addCriterion("hospital is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalEqualTo(String value) {
            addCriterion("hospital =", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalNotEqualTo(String value) {
            addCriterion("hospital <>", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalGreaterThan(String value) {
            addCriterion("hospital >", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalGreaterThanOrEqualTo(String value) {
            addCriterion("hospital >=", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalLessThan(String value) {
            addCriterion("hospital <", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalLessThanOrEqualTo(String value) {
            addCriterion("hospital <=", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalLike(String value) {
            addCriterion("hospital like", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalNotLike(String value) {
            addCriterion("hospital not like", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalIn(List<String> values) {
            addCriterion("hospital in", values, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalNotIn(List<String> values) {
            addCriterion("hospital not in", values, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalBetween(String value1, String value2) {
            addCriterion("hospital between", value1, value2, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalNotBetween(String value1, String value2) {
            addCriterion("hospital not between", value1, value2, "hospital");
            return (Criteria) this;
        }

        public Criteria andHosScaleIsNull() {
            addCriterion("hos_scale is null");
            return (Criteria) this;
        }

        public Criteria andHosScaleIsNotNull() {
            addCriterion("hos_scale is not null");
            return (Criteria) this;
        }

        public Criteria andHosScaleEqualTo(String value) {
            addCriterion("hos_scale =", value, "hosScale");
            return (Criteria) this;
        }

        public Criteria andHosScaleNotEqualTo(String value) {
            addCriterion("hos_scale <>", value, "hosScale");
            return (Criteria) this;
        }

        public Criteria andHosScaleGreaterThan(String value) {
            addCriterion("hos_scale >", value, "hosScale");
            return (Criteria) this;
        }

        public Criteria andHosScaleGreaterThanOrEqualTo(String value) {
            addCriterion("hos_scale >=", value, "hosScale");
            return (Criteria) this;
        }

        public Criteria andHosScaleLessThan(String value) {
            addCriterion("hos_scale <", value, "hosScale");
            return (Criteria) this;
        }

        public Criteria andHosScaleLessThanOrEqualTo(String value) {
            addCriterion("hos_scale <=", value, "hosScale");
            return (Criteria) this;
        }

        public Criteria andHosScaleLike(String value) {
            addCriterion("hos_scale like", value, "hosScale");
            return (Criteria) this;
        }

        public Criteria andHosScaleNotLike(String value) {
            addCriterion("hos_scale not like", value, "hosScale");
            return (Criteria) this;
        }

        public Criteria andHosScaleIn(List<String> values) {
            addCriterion("hos_scale in", values, "hosScale");
            return (Criteria) this;
        }

        public Criteria andHosScaleNotIn(List<String> values) {
            addCriterion("hos_scale not in", values, "hosScale");
            return (Criteria) this;
        }

        public Criteria andHosScaleBetween(String value1, String value2) {
            addCriterion("hos_scale between", value1, value2, "hosScale");
            return (Criteria) this;
        }

        public Criteria andHosScaleNotBetween(String value1, String value2) {
            addCriterion("hos_scale not between", value1, value2, "hosScale");
            return (Criteria) this;
        }

        public Criteria andHosAccessIsNull() {
            addCriterion("hos_access is null");
            return (Criteria) this;
        }

        public Criteria andHosAccessIsNotNull() {
            addCriterion("hos_access is not null");
            return (Criteria) this;
        }

        public Criteria andHosAccessEqualTo(String value) {
            addCriterion("hos_access =", value, "hosAccess");
            return (Criteria) this;
        }

        public Criteria andHosAccessNotEqualTo(String value) {
            addCriterion("hos_access <>", value, "hosAccess");
            return (Criteria) this;
        }

        public Criteria andHosAccessGreaterThan(String value) {
            addCriterion("hos_access >", value, "hosAccess");
            return (Criteria) this;
        }

        public Criteria andHosAccessGreaterThanOrEqualTo(String value) {
            addCriterion("hos_access >=", value, "hosAccess");
            return (Criteria) this;
        }

        public Criteria andHosAccessLessThan(String value) {
            addCriterion("hos_access <", value, "hosAccess");
            return (Criteria) this;
        }

        public Criteria andHosAccessLessThanOrEqualTo(String value) {
            addCriterion("hos_access <=", value, "hosAccess");
            return (Criteria) this;
        }

        public Criteria andHosAccessLike(String value) {
            addCriterion("hos_access like", value, "hosAccess");
            return (Criteria) this;
        }

        public Criteria andHosAccessNotLike(String value) {
            addCriterion("hos_access not like", value, "hosAccess");
            return (Criteria) this;
        }

        public Criteria andHosAccessIn(List<String> values) {
            addCriterion("hos_access in", values, "hosAccess");
            return (Criteria) this;
        }

        public Criteria andHosAccessNotIn(List<String> values) {
            addCriterion("hos_access not in", values, "hosAccess");
            return (Criteria) this;
        }

        public Criteria andHosAccessBetween(String value1, String value2) {
            addCriterion("hos_access between", value1, value2, "hosAccess");
            return (Criteria) this;
        }

        public Criteria andHosAccessNotBetween(String value1, String value2) {
            addCriterion("hos_access not between", value1, value2, "hosAccess");
            return (Criteria) this;
        }

        public Criteria andHosCapacityIsNull() {
            addCriterion("hos_capacity is null");
            return (Criteria) this;
        }

        public Criteria andHosCapacityIsNotNull() {
            addCriterion("hos_capacity is not null");
            return (Criteria) this;
        }

        public Criteria andHosCapacityEqualTo(Integer value) {
            addCriterion("hos_capacity =", value, "hosCapacity");
            return (Criteria) this;
        }

        public Criteria andHosCapacityNotEqualTo(Integer value) {
            addCriterion("hos_capacity <>", value, "hosCapacity");
            return (Criteria) this;
        }

        public Criteria andHosCapacityGreaterThan(Integer value) {
            addCriterion("hos_capacity >", value, "hosCapacity");
            return (Criteria) this;
        }

        public Criteria andHosCapacityGreaterThanOrEqualTo(Integer value) {
            addCriterion("hos_capacity >=", value, "hosCapacity");
            return (Criteria) this;
        }

        public Criteria andHosCapacityLessThan(Integer value) {
            addCriterion("hos_capacity <", value, "hosCapacity");
            return (Criteria) this;
        }

        public Criteria andHosCapacityLessThanOrEqualTo(Integer value) {
            addCriterion("hos_capacity <=", value, "hosCapacity");
            return (Criteria) this;
        }

        public Criteria andHosCapacityIn(List<Integer> values) {
            addCriterion("hos_capacity in", values, "hosCapacity");
            return (Criteria) this;
        }

        public Criteria andHosCapacityNotIn(List<Integer> values) {
            addCriterion("hos_capacity not in", values, "hosCapacity");
            return (Criteria) this;
        }

        public Criteria andHosCapacityBetween(Integer value1, Integer value2) {
            addCriterion("hos_capacity between", value1, value2, "hosCapacity");
            return (Criteria) this;
        }

        public Criteria andHosCapacityNotBetween(Integer value1, Integer value2) {
            addCriterion("hos_capacity not between", value1, value2, "hosCapacity");
            return (Criteria) this;
        }

        public Criteria andHosCnGradeIsNull() {
            addCriterion("hos_cn_grade is null");
            return (Criteria) this;
        }

        public Criteria andHosCnGradeIsNotNull() {
            addCriterion("hos_cn_grade is not null");
            return (Criteria) this;
        }

        public Criteria andHosCnGradeEqualTo(String value) {
            addCriterion("hos_cn_grade =", value, "hosCnGrade");
            return (Criteria) this;
        }

        public Criteria andHosCnGradeNotEqualTo(String value) {
            addCriterion("hos_cn_grade <>", value, "hosCnGrade");
            return (Criteria) this;
        }

        public Criteria andHosCnGradeGreaterThan(String value) {
            addCriterion("hos_cn_grade >", value, "hosCnGrade");
            return (Criteria) this;
        }

        public Criteria andHosCnGradeGreaterThanOrEqualTo(String value) {
            addCriterion("hos_cn_grade >=", value, "hosCnGrade");
            return (Criteria) this;
        }

        public Criteria andHosCnGradeLessThan(String value) {
            addCriterion("hos_cn_grade <", value, "hosCnGrade");
            return (Criteria) this;
        }

        public Criteria andHosCnGradeLessThanOrEqualTo(String value) {
            addCriterion("hos_cn_grade <=", value, "hosCnGrade");
            return (Criteria) this;
        }

        public Criteria andHosCnGradeLike(String value) {
            addCriterion("hos_cn_grade like", value, "hosCnGrade");
            return (Criteria) this;
        }

        public Criteria andHosCnGradeNotLike(String value) {
            addCriterion("hos_cn_grade not like", value, "hosCnGrade");
            return (Criteria) this;
        }

        public Criteria andHosCnGradeIn(List<String> values) {
            addCriterion("hos_cn_grade in", values, "hosCnGrade");
            return (Criteria) this;
        }

        public Criteria andHosCnGradeNotIn(List<String> values) {
            addCriterion("hos_cn_grade not in", values, "hosCnGrade");
            return (Criteria) this;
        }

        public Criteria andHosCnGradeBetween(String value1, String value2) {
            addCriterion("hos_cn_grade between", value1, value2, "hosCnGrade");
            return (Criteria) this;
        }

        public Criteria andHosCnGradeNotBetween(String value1, String value2) {
            addCriterion("hos_cn_grade not between", value1, value2, "hosCnGrade");
            return (Criteria) this;
        }

        public Criteria andHosEnGradeIsNull() {
            addCriterion("hos_en_grade is null");
            return (Criteria) this;
        }

        public Criteria andHosEnGradeIsNotNull() {
            addCriterion("hos_en_grade is not null");
            return (Criteria) this;
        }

        public Criteria andHosEnGradeEqualTo(String value) {
            addCriterion("hos_en_grade =", value, "hosEnGrade");
            return (Criteria) this;
        }

        public Criteria andHosEnGradeNotEqualTo(String value) {
            addCriterion("hos_en_grade <>", value, "hosEnGrade");
            return (Criteria) this;
        }

        public Criteria andHosEnGradeGreaterThan(String value) {
            addCriterion("hos_en_grade >", value, "hosEnGrade");
            return (Criteria) this;
        }

        public Criteria andHosEnGradeGreaterThanOrEqualTo(String value) {
            addCriterion("hos_en_grade >=", value, "hosEnGrade");
            return (Criteria) this;
        }

        public Criteria andHosEnGradeLessThan(String value) {
            addCriterion("hos_en_grade <", value, "hosEnGrade");
            return (Criteria) this;
        }

        public Criteria andHosEnGradeLessThanOrEqualTo(String value) {
            addCriterion("hos_en_grade <=", value, "hosEnGrade");
            return (Criteria) this;
        }

        public Criteria andHosEnGradeLike(String value) {
            addCriterion("hos_en_grade like", value, "hosEnGrade");
            return (Criteria) this;
        }

        public Criteria andHosEnGradeNotLike(String value) {
            addCriterion("hos_en_grade not like", value, "hosEnGrade");
            return (Criteria) this;
        }

        public Criteria andHosEnGradeIn(List<String> values) {
            addCriterion("hos_en_grade in", values, "hosEnGrade");
            return (Criteria) this;
        }

        public Criteria andHosEnGradeNotIn(List<String> values) {
            addCriterion("hos_en_grade not in", values, "hosEnGrade");
            return (Criteria) this;
        }

        public Criteria andHosEnGradeBetween(String value1, String value2) {
            addCriterion("hos_en_grade between", value1, value2, "hosEnGrade");
            return (Criteria) this;
        }

        public Criteria andHosEnGradeNotBetween(String value1, String value2) {
            addCriterion("hos_en_grade not between", value1, value2, "hosEnGrade");
            return (Criteria) this;
        }

        public Criteria andSectionIsNull() {
            addCriterion("`section` is null");
            return (Criteria) this;
        }

        public Criteria andSectionIsNotNull() {
            addCriterion("`section` is not null");
            return (Criteria) this;
        }

        public Criteria andSectionEqualTo(String value) {
            addCriterion("`section` =", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionNotEqualTo(String value) {
            addCriterion("`section` <>", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionGreaterThan(String value) {
            addCriterion("`section` >", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionGreaterThanOrEqualTo(String value) {
            addCriterion("`section` >=", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionLessThan(String value) {
            addCriterion("`section` <", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionLessThanOrEqualTo(String value) {
            addCriterion("`section` <=", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionLike(String value) {
            addCriterion("`section` like", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionNotLike(String value) {
            addCriterion("`section` not like", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionIn(List<String> values) {
            addCriterion("`section` in", values, "section");
            return (Criteria) this;
        }

        public Criteria andSectionNotIn(List<String> values) {
            addCriterion("`section` not in", values, "section");
            return (Criteria) this;
        }

        public Criteria andSectionBetween(String value1, String value2) {
            addCriterion("`section` between", value1, value2, "section");
            return (Criteria) this;
        }

        public Criteria andSectionNotBetween(String value1, String value2) {
            addCriterion("`section` not between", value1, value2, "section");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("`position` is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("`position` is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("`position` =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("`position` <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("`position` >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("`position` >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("`position` <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("`position` <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("`position` like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("`position` not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("`position` in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("`position` not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("`position` between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("`position` not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andRankIsNull() {
            addCriterion("`rank` is null");
            return (Criteria) this;
        }

        public Criteria andRankIsNotNull() {
            addCriterion("`rank` is not null");
            return (Criteria) this;
        }

        public Criteria andRankEqualTo(String value) {
            addCriterion("`rank` =", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotEqualTo(String value) {
            addCriterion("`rank` <>", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThan(String value) {
            addCriterion("`rank` >", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThanOrEqualTo(String value) {
            addCriterion("`rank` >=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThan(String value) {
            addCriterion("`rank` <", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThanOrEqualTo(String value) {
            addCriterion("`rank` <=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLike(String value) {
            addCriterion("`rank` like", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotLike(String value) {
            addCriterion("`rank` not like", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankIn(List<String> values) {
            addCriterion("`rank` in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotIn(List<String> values) {
            addCriterion("`rank` not in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankBetween(String value1, String value2) {
            addCriterion("`rank` between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotBetween(String value1, String value2) {
            addCriterion("`rank` not between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andCusCategoryIsNull() {
            addCriterion("cus_category is null");
            return (Criteria) this;
        }

        public Criteria andCusCategoryIsNotNull() {
            addCriterion("cus_category is not null");
            return (Criteria) this;
        }

        public Criteria andCusCategoryEqualTo(String value) {
            addCriterion("cus_category =", value, "cusCategory");
            return (Criteria) this;
        }

        public Criteria andCusCategoryNotEqualTo(String value) {
            addCriterion("cus_category <>", value, "cusCategory");
            return (Criteria) this;
        }

        public Criteria andCusCategoryGreaterThan(String value) {
            addCriterion("cus_category >", value, "cusCategory");
            return (Criteria) this;
        }

        public Criteria andCusCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("cus_category >=", value, "cusCategory");
            return (Criteria) this;
        }

        public Criteria andCusCategoryLessThan(String value) {
            addCriterion("cus_category <", value, "cusCategory");
            return (Criteria) this;
        }

        public Criteria andCusCategoryLessThanOrEqualTo(String value) {
            addCriterion("cus_category <=", value, "cusCategory");
            return (Criteria) this;
        }

        public Criteria andCusCategoryLike(String value) {
            addCriterion("cus_category like", value, "cusCategory");
            return (Criteria) this;
        }

        public Criteria andCusCategoryNotLike(String value) {
            addCriterion("cus_category not like", value, "cusCategory");
            return (Criteria) this;
        }

        public Criteria andCusCategoryIn(List<String> values) {
            addCriterion("cus_category in", values, "cusCategory");
            return (Criteria) this;
        }

        public Criteria andCusCategoryNotIn(List<String> values) {
            addCriterion("cus_category not in", values, "cusCategory");
            return (Criteria) this;
        }

        public Criteria andCusCategoryBetween(String value1, String value2) {
            addCriterion("cus_category between", value1, value2, "cusCategory");
            return (Criteria) this;
        }

        public Criteria andCusCategoryNotBetween(String value1, String value2) {
            addCriterion("cus_category not between", value1, value2, "cusCategory");
            return (Criteria) this;
        }

        public Criteria andOtherEnergyIsNull() {
            addCriterion("other_energy is null");
            return (Criteria) this;
        }

        public Criteria andOtherEnergyIsNotNull() {
            addCriterion("other_energy is not null");
            return (Criteria) this;
        }

        public Criteria andOtherEnergyEqualTo(String value) {
            addCriterion("other_energy =", value, "otherEnergy");
            return (Criteria) this;
        }

        public Criteria andOtherEnergyNotEqualTo(String value) {
            addCriterion("other_energy <>", value, "otherEnergy");
            return (Criteria) this;
        }

        public Criteria andOtherEnergyGreaterThan(String value) {
            addCriterion("other_energy >", value, "otherEnergy");
            return (Criteria) this;
        }

        public Criteria andOtherEnergyGreaterThanOrEqualTo(String value) {
            addCriterion("other_energy >=", value, "otherEnergy");
            return (Criteria) this;
        }

        public Criteria andOtherEnergyLessThan(String value) {
            addCriterion("other_energy <", value, "otherEnergy");
            return (Criteria) this;
        }

        public Criteria andOtherEnergyLessThanOrEqualTo(String value) {
            addCriterion("other_energy <=", value, "otherEnergy");
            return (Criteria) this;
        }

        public Criteria andOtherEnergyLike(String value) {
            addCriterion("other_energy like", value, "otherEnergy");
            return (Criteria) this;
        }

        public Criteria andOtherEnergyNotLike(String value) {
            addCriterion("other_energy not like", value, "otherEnergy");
            return (Criteria) this;
        }

        public Criteria andOtherEnergyIn(List<String> values) {
            addCriterion("other_energy in", values, "otherEnergy");
            return (Criteria) this;
        }

        public Criteria andOtherEnergyNotIn(List<String> values) {
            addCriterion("other_energy not in", values, "otherEnergy");
            return (Criteria) this;
        }

        public Criteria andOtherEnergyBetween(String value1, String value2) {
            addCriterion("other_energy between", value1, value2, "otherEnergy");
            return (Criteria) this;
        }

        public Criteria andOtherEnergyNotBetween(String value1, String value2) {
            addCriterion("other_energy not between", value1, value2, "otherEnergy");
            return (Criteria) this;
        }

        public Criteria andCusNmIsNull() {
            addCriterion("cus_nm is null");
            return (Criteria) this;
        }

        public Criteria andCusNmIsNotNull() {
            addCriterion("cus_nm is not null");
            return (Criteria) this;
        }

        public Criteria andCusNmEqualTo(String value) {
            addCriterion("cus_nm =", value, "cusNm");
            return (Criteria) this;
        }

        public Criteria andCusNmNotEqualTo(String value) {
            addCriterion("cus_nm <>", value, "cusNm");
            return (Criteria) this;
        }

        public Criteria andCusNmGreaterThan(String value) {
            addCriterion("cus_nm >", value, "cusNm");
            return (Criteria) this;
        }

        public Criteria andCusNmGreaterThanOrEqualTo(String value) {
            addCriterion("cus_nm >=", value, "cusNm");
            return (Criteria) this;
        }

        public Criteria andCusNmLessThan(String value) {
            addCriterion("cus_nm <", value, "cusNm");
            return (Criteria) this;
        }

        public Criteria andCusNmLessThanOrEqualTo(String value) {
            addCriterion("cus_nm <=", value, "cusNm");
            return (Criteria) this;
        }

        public Criteria andCusNmLike(String value) {
            addCriterion("cus_nm like", value, "cusNm");
            return (Criteria) this;
        }

        public Criteria andCusNmNotLike(String value) {
            addCriterion("cus_nm not like", value, "cusNm");
            return (Criteria) this;
        }

        public Criteria andCusNmIn(List<String> values) {
            addCriterion("cus_nm in", values, "cusNm");
            return (Criteria) this;
        }

        public Criteria andCusNmNotIn(List<String> values) {
            addCriterion("cus_nm not in", values, "cusNm");
            return (Criteria) this;
        }

        public Criteria andCusNmBetween(String value1, String value2) {
            addCriterion("cus_nm between", value1, value2, "cusNm");
            return (Criteria) this;
        }

        public Criteria andCusNmNotBetween(String value1, String value2) {
            addCriterion("cus_nm not between", value1, value2, "cusNm");
            return (Criteria) this;
        }

        public Criteria andFixCusCapacityIsNull() {
            addCriterion("fix_cus_capacity is null");
            return (Criteria) this;
        }

        public Criteria andFixCusCapacityIsNotNull() {
            addCriterion("fix_cus_capacity is not null");
            return (Criteria) this;
        }

        public Criteria andFixCusCapacityEqualTo(Integer value) {
            addCriterion("fix_cus_capacity =", value, "fixCusCapacity");
            return (Criteria) this;
        }

        public Criteria andFixCusCapacityNotEqualTo(Integer value) {
            addCriterion("fix_cus_capacity <>", value, "fixCusCapacity");
            return (Criteria) this;
        }

        public Criteria andFixCusCapacityGreaterThan(Integer value) {
            addCriterion("fix_cus_capacity >", value, "fixCusCapacity");
            return (Criteria) this;
        }

        public Criteria andFixCusCapacityGreaterThanOrEqualTo(Integer value) {
            addCriterion("fix_cus_capacity >=", value, "fixCusCapacity");
            return (Criteria) this;
        }

        public Criteria andFixCusCapacityLessThan(Integer value) {
            addCriterion("fix_cus_capacity <", value, "fixCusCapacity");
            return (Criteria) this;
        }

        public Criteria andFixCusCapacityLessThanOrEqualTo(Integer value) {
            addCriterion("fix_cus_capacity <=", value, "fixCusCapacity");
            return (Criteria) this;
        }

        public Criteria andFixCusCapacityIn(List<Integer> values) {
            addCriterion("fix_cus_capacity in", values, "fixCusCapacity");
            return (Criteria) this;
        }

        public Criteria andFixCusCapacityNotIn(List<Integer> values) {
            addCriterion("fix_cus_capacity not in", values, "fixCusCapacity");
            return (Criteria) this;
        }

        public Criteria andFixCusCapacityBetween(Integer value1, Integer value2) {
            addCriterion("fix_cus_capacity between", value1, value2, "fixCusCapacity");
            return (Criteria) this;
        }

        public Criteria andFixCusCapacityNotBetween(Integer value1, Integer value2) {
            addCriterion("fix_cus_capacity not between", value1, value2, "fixCusCapacity");
            return (Criteria) this;
        }

        public Criteria andQtrStarGradeIsNull() {
            addCriterion("qtr_star_grade is null");
            return (Criteria) this;
        }

        public Criteria andQtrStarGradeIsNotNull() {
            addCriterion("qtr_star_grade is not null");
            return (Criteria) this;
        }

        public Criteria andQtrStarGradeEqualTo(String value) {
            addCriterion("qtr_star_grade =", value, "qtrStarGrade");
            return (Criteria) this;
        }

        public Criteria andQtrStarGradeNotEqualTo(String value) {
            addCriterion("qtr_star_grade <>", value, "qtrStarGrade");
            return (Criteria) this;
        }

        public Criteria andQtrStarGradeGreaterThan(String value) {
            addCriterion("qtr_star_grade >", value, "qtrStarGrade");
            return (Criteria) this;
        }

        public Criteria andQtrStarGradeGreaterThanOrEqualTo(String value) {
            addCriterion("qtr_star_grade >=", value, "qtrStarGrade");
            return (Criteria) this;
        }

        public Criteria andQtrStarGradeLessThan(String value) {
            addCriterion("qtr_star_grade <", value, "qtrStarGrade");
            return (Criteria) this;
        }

        public Criteria andQtrStarGradeLessThanOrEqualTo(String value) {
            addCriterion("qtr_star_grade <=", value, "qtrStarGrade");
            return (Criteria) this;
        }

        public Criteria andQtrStarGradeLike(String value) {
            addCriterion("qtr_star_grade like", value, "qtrStarGrade");
            return (Criteria) this;
        }

        public Criteria andQtrStarGradeNotLike(String value) {
            addCriterion("qtr_star_grade not like", value, "qtrStarGrade");
            return (Criteria) this;
        }

        public Criteria andQtrStarGradeIn(List<String> values) {
            addCriterion("qtr_star_grade in", values, "qtrStarGrade");
            return (Criteria) this;
        }

        public Criteria andQtrStarGradeNotIn(List<String> values) {
            addCriterion("qtr_star_grade not in", values, "qtrStarGrade");
            return (Criteria) this;
        }

        public Criteria andQtrStarGradeBetween(String value1, String value2) {
            addCriterion("qtr_star_grade between", value1, value2, "qtrStarGrade");
            return (Criteria) this;
        }

        public Criteria andQtrStarGradeNotBetween(String value1, String value2) {
            addCriterion("qtr_star_grade not between", value1, value2, "qtrStarGrade");
            return (Criteria) this;
        }

        public Criteria andCusGradeIsNull() {
            addCriterion("cus_grade is null");
            return (Criteria) this;
        }

        public Criteria andCusGradeIsNotNull() {
            addCriterion("cus_grade is not null");
            return (Criteria) this;
        }

        public Criteria andCusGradeEqualTo(String value) {
            addCriterion("cus_grade =", value, "cusGrade");
            return (Criteria) this;
        }

        public Criteria andCusGradeNotEqualTo(String value) {
            addCriterion("cus_grade <>", value, "cusGrade");
            return (Criteria) this;
        }

        public Criteria andCusGradeGreaterThan(String value) {
            addCriterion("cus_grade >", value, "cusGrade");
            return (Criteria) this;
        }

        public Criteria andCusGradeGreaterThanOrEqualTo(String value) {
            addCriterion("cus_grade >=", value, "cusGrade");
            return (Criteria) this;
        }

        public Criteria andCusGradeLessThan(String value) {
            addCriterion("cus_grade <", value, "cusGrade");
            return (Criteria) this;
        }

        public Criteria andCusGradeLessThanOrEqualTo(String value) {
            addCriterion("cus_grade <=", value, "cusGrade");
            return (Criteria) this;
        }

        public Criteria andCusGradeLike(String value) {
            addCriterion("cus_grade like", value, "cusGrade");
            return (Criteria) this;
        }

        public Criteria andCusGradeNotLike(String value) {
            addCriterion("cus_grade not like", value, "cusGrade");
            return (Criteria) this;
        }

        public Criteria andCusGradeIn(List<String> values) {
            addCriterion("cus_grade in", values, "cusGrade");
            return (Criteria) this;
        }

        public Criteria andCusGradeNotIn(List<String> values) {
            addCriterion("cus_grade not in", values, "cusGrade");
            return (Criteria) this;
        }

        public Criteria andCusGradeBetween(String value1, String value2) {
            addCriterion("cus_grade between", value1, value2, "cusGrade");
            return (Criteria) this;
        }

        public Criteria andCusGradeNotBetween(String value1, String value2) {
            addCriterion("cus_grade not between", value1, value2, "cusGrade");
            return (Criteria) this;
        }

        public Criteria andMcNumIsNull() {
            addCriterion("mc_num is null");
            return (Criteria) this;
        }

        public Criteria andMcNumIsNotNull() {
            addCriterion("mc_num is not null");
            return (Criteria) this;
        }

        public Criteria andMcNumEqualTo(Integer value) {
            addCriterion("mc_num =", value, "mcNum");
            return (Criteria) this;
        }

        public Criteria andMcNumNotEqualTo(Integer value) {
            addCriterion("mc_num <>", value, "mcNum");
            return (Criteria) this;
        }

        public Criteria andMcNumGreaterThan(Integer value) {
            addCriterion("mc_num >", value, "mcNum");
            return (Criteria) this;
        }

        public Criteria andMcNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("mc_num >=", value, "mcNum");
            return (Criteria) this;
        }

        public Criteria andMcNumLessThan(Integer value) {
            addCriterion("mc_num <", value, "mcNum");
            return (Criteria) this;
        }

        public Criteria andMcNumLessThanOrEqualTo(Integer value) {
            addCriterion("mc_num <=", value, "mcNum");
            return (Criteria) this;
        }

        public Criteria andMcNumIn(List<Integer> values) {
            addCriterion("mc_num in", values, "mcNum");
            return (Criteria) this;
        }

        public Criteria andMcNumNotIn(List<Integer> values) {
            addCriterion("mc_num not in", values, "mcNum");
            return (Criteria) this;
        }

        public Criteria andMcNumBetween(Integer value1, Integer value2) {
            addCriterion("mc_num between", value1, value2, "mcNum");
            return (Criteria) this;
        }

        public Criteria andMcNumNotBetween(Integer value1, Integer value2) {
            addCriterion("mc_num not between", value1, value2, "mcNum");
            return (Criteria) this;
        }

        public Criteria andNpNumIsNull() {
            addCriterion("np_num is null");
            return (Criteria) this;
        }

        public Criteria andNpNumIsNotNull() {
            addCriterion("np_num is not null");
            return (Criteria) this;
        }

        public Criteria andNpNumEqualTo(Integer value) {
            addCriterion("np_num =", value, "npNum");
            return (Criteria) this;
        }

        public Criteria andNpNumNotEqualTo(Integer value) {
            addCriterion("np_num <>", value, "npNum");
            return (Criteria) this;
        }

        public Criteria andNpNumGreaterThan(Integer value) {
            addCriterion("np_num >", value, "npNum");
            return (Criteria) this;
        }

        public Criteria andNpNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("np_num >=", value, "npNum");
            return (Criteria) this;
        }

        public Criteria andNpNumLessThan(Integer value) {
            addCriterion("np_num <", value, "npNum");
            return (Criteria) this;
        }

        public Criteria andNpNumLessThanOrEqualTo(Integer value) {
            addCriterion("np_num <=", value, "npNum");
            return (Criteria) this;
        }

        public Criteria andNpNumIn(List<Integer> values) {
            addCriterion("np_num in", values, "npNum");
            return (Criteria) this;
        }

        public Criteria andNpNumNotIn(List<Integer> values) {
            addCriterion("np_num not in", values, "npNum");
            return (Criteria) this;
        }

        public Criteria andNpNumBetween(Integer value1, Integer value2) {
            addCriterion("np_num between", value1, value2, "npNum");
            return (Criteria) this;
        }

        public Criteria andNpNumNotBetween(Integer value1, Integer value2) {
            addCriterion("np_num not between", value1, value2, "npNum");
            return (Criteria) this;
        }

        public Criteria andXlNumIsNull() {
            addCriterion("xl_num is null");
            return (Criteria) this;
        }

        public Criteria andXlNumIsNotNull() {
            addCriterion("xl_num is not null");
            return (Criteria) this;
        }

        public Criteria andXlNumEqualTo(Integer value) {
            addCriterion("xl_num =", value, "xlNum");
            return (Criteria) this;
        }

        public Criteria andXlNumNotEqualTo(Integer value) {
            addCriterion("xl_num <>", value, "xlNum");
            return (Criteria) this;
        }

        public Criteria andXlNumGreaterThan(Integer value) {
            addCriterion("xl_num >", value, "xlNum");
            return (Criteria) this;
        }

        public Criteria andXlNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("xl_num >=", value, "xlNum");
            return (Criteria) this;
        }

        public Criteria andXlNumLessThan(Integer value) {
            addCriterion("xl_num <", value, "xlNum");
            return (Criteria) this;
        }

        public Criteria andXlNumLessThanOrEqualTo(Integer value) {
            addCriterion("xl_num <=", value, "xlNum");
            return (Criteria) this;
        }

        public Criteria andXlNumIn(List<Integer> values) {
            addCriterion("xl_num in", values, "xlNum");
            return (Criteria) this;
        }

        public Criteria andXlNumNotIn(List<Integer> values) {
            addCriterion("xl_num not in", values, "xlNum");
            return (Criteria) this;
        }

        public Criteria andXlNumBetween(Integer value1, Integer value2) {
            addCriterion("xl_num between", value1, value2, "xlNum");
            return (Criteria) this;
        }

        public Criteria andXlNumNotBetween(Integer value1, Integer value2) {
            addCriterion("xl_num not between", value1, value2, "xlNum");
            return (Criteria) this;
        }

        public Criteria andTfNumIsNull() {
            addCriterion("tf_num is null");
            return (Criteria) this;
        }

        public Criteria andTfNumIsNotNull() {
            addCriterion("tf_num is not null");
            return (Criteria) this;
        }

        public Criteria andTfNumEqualTo(Integer value) {
            addCriterion("tf_num =", value, "tfNum");
            return (Criteria) this;
        }

        public Criteria andTfNumNotEqualTo(Integer value) {
            addCriterion("tf_num <>", value, "tfNum");
            return (Criteria) this;
        }

        public Criteria andTfNumGreaterThan(Integer value) {
            addCriterion("tf_num >", value, "tfNum");
            return (Criteria) this;
        }

        public Criteria andTfNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("tf_num >=", value, "tfNum");
            return (Criteria) this;
        }

        public Criteria andTfNumLessThan(Integer value) {
            addCriterion("tf_num <", value, "tfNum");
            return (Criteria) this;
        }

        public Criteria andTfNumLessThanOrEqualTo(Integer value) {
            addCriterion("tf_num <=", value, "tfNum");
            return (Criteria) this;
        }

        public Criteria andTfNumIn(List<Integer> values) {
            addCriterion("tf_num in", values, "tfNum");
            return (Criteria) this;
        }

        public Criteria andTfNumNotIn(List<Integer> values) {
            addCriterion("tf_num not in", values, "tfNum");
            return (Criteria) this;
        }

        public Criteria andTfNumBetween(Integer value1, Integer value2) {
            addCriterion("tf_num between", value1, value2, "tfNum");
            return (Criteria) this;
        }

        public Criteria andTfNumNotBetween(Integer value1, Integer value2) {
            addCriterion("tf_num not between", value1, value2, "tfNum");
            return (Criteria) this;
        }

        public Criteria andWNmIsNull() {
            addCriterion("w_nm is null");
            return (Criteria) this;
        }

        public Criteria andWNmIsNotNull() {
            addCriterion("w_nm is not null");
            return (Criteria) this;
        }

        public Criteria andWNmEqualTo(Integer value) {
            addCriterion("w_nm =", value, "wNm");
            return (Criteria) this;
        }

        public Criteria andWNmNotEqualTo(Integer value) {
            addCriterion("w_nm <>", value, "wNm");
            return (Criteria) this;
        }

        public Criteria andWNmGreaterThan(Integer value) {
            addCriterion("w_nm >", value, "wNm");
            return (Criteria) this;
        }

        public Criteria andWNmGreaterThanOrEqualTo(Integer value) {
            addCriterion("w_nm >=", value, "wNm");
            return (Criteria) this;
        }

        public Criteria andWNmLessThan(Integer value) {
            addCriterion("w_nm <", value, "wNm");
            return (Criteria) this;
        }

        public Criteria andWNmLessThanOrEqualTo(Integer value) {
            addCriterion("w_nm <=", value, "wNm");
            return (Criteria) this;
        }

        public Criteria andWNmIn(List<Integer> values) {
            addCriterion("w_nm in", values, "wNm");
            return (Criteria) this;
        }

        public Criteria andWNmNotIn(List<Integer> values) {
            addCriterion("w_nm not in", values, "wNm");
            return (Criteria) this;
        }

        public Criteria andWNmBetween(Integer value1, Integer value2) {
            addCriterion("w_nm between", value1, value2, "wNm");
            return (Criteria) this;
        }

        public Criteria andWNmNotBetween(Integer value1, Integer value2) {
            addCriterion("w_nm not between", value1, value2, "wNm");
            return (Criteria) this;
        }

        public Criteria andPNmIsNull() {
            addCriterion("p_nm is null");
            return (Criteria) this;
        }

        public Criteria andPNmIsNotNull() {
            addCriterion("p_nm is not null");
            return (Criteria) this;
        }

        public Criteria andPNmEqualTo(Integer value) {
            addCriterion("p_nm =", value, "pNm");
            return (Criteria) this;
        }

        public Criteria andPNmNotEqualTo(Integer value) {
            addCriterion("p_nm <>", value, "pNm");
            return (Criteria) this;
        }

        public Criteria andPNmGreaterThan(Integer value) {
            addCriterion("p_nm >", value, "pNm");
            return (Criteria) this;
        }

        public Criteria andPNmGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_nm >=", value, "pNm");
            return (Criteria) this;
        }

        public Criteria andPNmLessThan(Integer value) {
            addCriterion("p_nm <", value, "pNm");
            return (Criteria) this;
        }

        public Criteria andPNmLessThanOrEqualTo(Integer value) {
            addCriterion("p_nm <=", value, "pNm");
            return (Criteria) this;
        }

        public Criteria andPNmIn(List<Integer> values) {
            addCriterion("p_nm in", values, "pNm");
            return (Criteria) this;
        }

        public Criteria andPNmNotIn(List<Integer> values) {
            addCriterion("p_nm not in", values, "pNm");
            return (Criteria) this;
        }

        public Criteria andPNmBetween(Integer value1, Integer value2) {
            addCriterion("p_nm between", value1, value2, "pNm");
            return (Criteria) this;
        }

        public Criteria andPNmNotBetween(Integer value1, Integer value2) {
            addCriterion("p_nm not between", value1, value2, "pNm");
            return (Criteria) this;
        }

        public Criteria andSNmIsNull() {
            addCriterion("s_nm is null");
            return (Criteria) this;
        }

        public Criteria andSNmIsNotNull() {
            addCriterion("s_nm is not null");
            return (Criteria) this;
        }

        public Criteria andSNmEqualTo(Integer value) {
            addCriterion("s_nm =", value, "sNm");
            return (Criteria) this;
        }

        public Criteria andSNmNotEqualTo(Integer value) {
            addCriterion("s_nm <>", value, "sNm");
            return (Criteria) this;
        }

        public Criteria andSNmGreaterThan(Integer value) {
            addCriterion("s_nm >", value, "sNm");
            return (Criteria) this;
        }

        public Criteria andSNmGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_nm >=", value, "sNm");
            return (Criteria) this;
        }

        public Criteria andSNmLessThan(Integer value) {
            addCriterion("s_nm <", value, "sNm");
            return (Criteria) this;
        }

        public Criteria andSNmLessThanOrEqualTo(Integer value) {
            addCriterion("s_nm <=", value, "sNm");
            return (Criteria) this;
        }

        public Criteria andSNmIn(List<Integer> values) {
            addCriterion("s_nm in", values, "sNm");
            return (Criteria) this;
        }

        public Criteria andSNmNotIn(List<Integer> values) {
            addCriterion("s_nm not in", values, "sNm");
            return (Criteria) this;
        }

        public Criteria andSNmBetween(Integer value1, Integer value2) {
            addCriterion("s_nm between", value1, value2, "sNm");
            return (Criteria) this;
        }

        public Criteria andSNmNotBetween(Integer value1, Integer value2) {
            addCriterion("s_nm not between", value1, value2, "sNm");
            return (Criteria) this;
        }

        public Criteria andENmIsNull() {
            addCriterion("e_nm is null");
            return (Criteria) this;
        }

        public Criteria andENmIsNotNull() {
            addCriterion("e_nm is not null");
            return (Criteria) this;
        }

        public Criteria andENmEqualTo(Integer value) {
            addCriterion("e_nm =", value, "eNm");
            return (Criteria) this;
        }

        public Criteria andENmNotEqualTo(Integer value) {
            addCriterion("e_nm <>", value, "eNm");
            return (Criteria) this;
        }

        public Criteria andENmGreaterThan(Integer value) {
            addCriterion("e_nm >", value, "eNm");
            return (Criteria) this;
        }

        public Criteria andENmGreaterThanOrEqualTo(Integer value) {
            addCriterion("e_nm >=", value, "eNm");
            return (Criteria) this;
        }

        public Criteria andENmLessThan(Integer value) {
            addCriterion("e_nm <", value, "eNm");
            return (Criteria) this;
        }

        public Criteria andENmLessThanOrEqualTo(Integer value) {
            addCriterion("e_nm <=", value, "eNm");
            return (Criteria) this;
        }

        public Criteria andENmIn(List<Integer> values) {
            addCriterion("e_nm in", values, "eNm");
            return (Criteria) this;
        }

        public Criteria andENmNotIn(List<Integer> values) {
            addCriterion("e_nm not in", values, "eNm");
            return (Criteria) this;
        }

        public Criteria andENmBetween(Integer value1, Integer value2) {
            addCriterion("e_nm between", value1, value2, "eNm");
            return (Criteria) this;
        }

        public Criteria andENmNotBetween(Integer value1, Integer value2) {
            addCriterion("e_nm not between", value1, value2, "eNm");
            return (Criteria) this;
        }

        public Criteria andNNmIsNull() {
            addCriterion("n_nm is null");
            return (Criteria) this;
        }

        public Criteria andNNmIsNotNull() {
            addCriterion("n_nm is not null");
            return (Criteria) this;
        }

        public Criteria andNNmEqualTo(Integer value) {
            addCriterion("n_nm =", value, "nNm");
            return (Criteria) this;
        }

        public Criteria andNNmNotEqualTo(Integer value) {
            addCriterion("n_nm <>", value, "nNm");
            return (Criteria) this;
        }

        public Criteria andNNmGreaterThan(Integer value) {
            addCriterion("n_nm >", value, "nNm");
            return (Criteria) this;
        }

        public Criteria andNNmGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_nm >=", value, "nNm");
            return (Criteria) this;
        }

        public Criteria andNNmLessThan(Integer value) {
            addCriterion("n_nm <", value, "nNm");
            return (Criteria) this;
        }

        public Criteria andNNmLessThanOrEqualTo(Integer value) {
            addCriterion("n_nm <=", value, "nNm");
            return (Criteria) this;
        }

        public Criteria andNNmIn(List<Integer> values) {
            addCriterion("n_nm in", values, "nNm");
            return (Criteria) this;
        }

        public Criteria andNNmNotIn(List<Integer> values) {
            addCriterion("n_nm not in", values, "nNm");
            return (Criteria) this;
        }

        public Criteria andNNmBetween(Integer value1, Integer value2) {
            addCriterion("n_nm between", value1, value2, "nNm");
            return (Criteria) this;
        }

        public Criteria andNNmNotBetween(Integer value1, Integer value2) {
            addCriterion("n_nm not between", value1, value2, "nNm");
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

        public Criteria andPushTimeIsNull() {
            addCriterion("push_time is null");
            return (Criteria) this;
        }

        public Criteria andPushTimeIsNotNull() {
            addCriterion("push_time is not null");
            return (Criteria) this;
        }

        public Criteria andPushTimeEqualTo(Date value) {
            addCriterion("push_time =", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeNotEqualTo(Date value) {
            addCriterion("push_time <>", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeGreaterThan(Date value) {
            addCriterion("push_time >", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("push_time >=", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeLessThan(Date value) {
            addCriterion("push_time <", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeLessThanOrEqualTo(Date value) {
            addCriterion("push_time <=", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeIn(List<Date> values) {
            addCriterion("push_time in", values, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeNotIn(List<Date> values) {
            addCriterion("push_time not in", values, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeBetween(Date value1, Date value2) {
            addCriterion("push_time between", value1, value2, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeNotBetween(Date value1, Date value2) {
            addCriterion("push_time not between", value1, value2, "pushTime");
            return (Criteria) this;
        }

        public Criteria andAuditReasonIsNull() {
            addCriterion("audit_reason is null");
            return (Criteria) this;
        }

        public Criteria andAuditReasonIsNotNull() {
            addCriterion("audit_reason is not null");
            return (Criteria) this;
        }

        public Criteria andAuditReasonEqualTo(String value) {
            addCriterion("audit_reason =", value, "auditReason");
            return (Criteria) this;
        }

        public Criteria andAuditReasonNotEqualTo(String value) {
            addCriterion("audit_reason <>", value, "auditReason");
            return (Criteria) this;
        }

        public Criteria andAuditReasonGreaterThan(String value) {
            addCriterion("audit_reason >", value, "auditReason");
            return (Criteria) this;
        }

        public Criteria andAuditReasonGreaterThanOrEqualTo(String value) {
            addCriterion("audit_reason >=", value, "auditReason");
            return (Criteria) this;
        }

        public Criteria andAuditReasonLessThan(String value) {
            addCriterion("audit_reason <", value, "auditReason");
            return (Criteria) this;
        }

        public Criteria andAuditReasonLessThanOrEqualTo(String value) {
            addCriterion("audit_reason <=", value, "auditReason");
            return (Criteria) this;
        }

        public Criteria andAuditReasonLike(String value) {
            addCriterion("audit_reason like", value, "auditReason");
            return (Criteria) this;
        }

        public Criteria andAuditReasonNotLike(String value) {
            addCriterion("audit_reason not like", value, "auditReason");
            return (Criteria) this;
        }

        public Criteria andAuditReasonIn(List<String> values) {
            addCriterion("audit_reason in", values, "auditReason");
            return (Criteria) this;
        }

        public Criteria andAuditReasonNotIn(List<String> values) {
            addCriterion("audit_reason not in", values, "auditReason");
            return (Criteria) this;
        }

        public Criteria andAuditReasonBetween(String value1, String value2) {
            addCriterion("audit_reason between", value1, value2, "auditReason");
            return (Criteria) this;
        }

        public Criteria andAuditReasonNotBetween(String value1, String value2) {
            addCriterion("audit_reason not between", value1, value2, "auditReason");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNull() {
            addCriterion("audit_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(Date value) {
            addCriterion("audit_time =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(Date value) {
            addCriterion("audit_time <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(Date value) {
            addCriterion("audit_time >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("audit_time >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(Date value) {
            addCriterion("audit_time <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("audit_time <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<Date> values) {
            addCriterion("audit_time in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<Date> values) {
            addCriterion("audit_time not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(Date value1, Date value2) {
            addCriterion("audit_time between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("audit_time not between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNull() {
            addCriterion("auditor is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNotNull() {
            addCriterion("auditor is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorEqualTo(Long value) {
            addCriterion("auditor =", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotEqualTo(Long value) {
            addCriterion("auditor <>", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThan(Long value) {
            addCriterion("auditor >", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThanOrEqualTo(Long value) {
            addCriterion("auditor >=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThan(Long value) {
            addCriterion("auditor <", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThanOrEqualTo(Long value) {
            addCriterion("auditor <=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorIn(List<Long> values) {
            addCriterion("auditor in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotIn(List<Long> values) {
            addCriterion("auditor not in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorBetween(Long value1, Long value2) {
            addCriterion("auditor between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotBetween(Long value1, Long value2) {
            addCriterion("auditor not between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andMongoIdIsNull() {
            addCriterion("mongo_id is null");
            return (Criteria) this;
        }

        public Criteria andMongoIdIsNotNull() {
            addCriterion("mongo_id is not null");
            return (Criteria) this;
        }

        public Criteria andMongoIdEqualTo(String value) {
            addCriterion("mongo_id =", value, "mongoId");
            return (Criteria) this;
        }

        public Criteria andMongoIdNotEqualTo(String value) {
            addCriterion("mongo_id <>", value, "mongoId");
            return (Criteria) this;
        }

        public Criteria andMongoIdGreaterThan(String value) {
            addCriterion("mongo_id >", value, "mongoId");
            return (Criteria) this;
        }

        public Criteria andMongoIdGreaterThanOrEqualTo(String value) {
            addCriterion("mongo_id >=", value, "mongoId");
            return (Criteria) this;
        }

        public Criteria andMongoIdLessThan(String value) {
            addCriterion("mongo_id <", value, "mongoId");
            return (Criteria) this;
        }

        public Criteria andMongoIdLessThanOrEqualTo(String value) {
            addCriterion("mongo_id <=", value, "mongoId");
            return (Criteria) this;
        }

        public Criteria andMongoIdLike(String value) {
            addCriterion("mongo_id like", value, "mongoId");
            return (Criteria) this;
        }

        public Criteria andMongoIdNotLike(String value) {
            addCriterion("mongo_id not like", value, "mongoId");
            return (Criteria) this;
        }

        public Criteria andMongoIdIn(List<String> values) {
            addCriterion("mongo_id in", values, "mongoId");
            return (Criteria) this;
        }

        public Criteria andMongoIdNotIn(List<String> values) {
            addCriterion("mongo_id not in", values, "mongoId");
            return (Criteria) this;
        }

        public Criteria andMongoIdBetween(String value1, String value2) {
            addCriterion("mongo_id between", value1, value2, "mongoId");
            return (Criteria) this;
        }

        public Criteria andMongoIdNotBetween(String value1, String value2) {
            addCriterion("mongo_id not between", value1, value2, "mongoId");
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