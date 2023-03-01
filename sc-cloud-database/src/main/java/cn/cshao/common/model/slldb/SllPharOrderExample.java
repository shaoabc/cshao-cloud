package cn.cshao.common.model.slldb;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SllPharOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SllPharOrderExample() {
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

        public Criteria andOrdIdIsNull() {
            addCriterion("ord_id is null");
            return (Criteria) this;
        }

        public Criteria andOrdIdIsNotNull() {
            addCriterion("ord_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrdIdEqualTo(Long value) {
            addCriterion("ord_id =", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdNotEqualTo(Long value) {
            addCriterion("ord_id <>", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdGreaterThan(Long value) {
            addCriterion("ord_id >", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ord_id >=", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdLessThan(Long value) {
            addCriterion("ord_id <", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdLessThanOrEqualTo(Long value) {
            addCriterion("ord_id <=", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdIn(List<Long> values) {
            addCriterion("ord_id in", values, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdNotIn(List<Long> values) {
            addCriterion("ord_id not in", values, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdBetween(Long value1, Long value2) {
            addCriterion("ord_id between", value1, value2, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdNotBetween(Long value1, Long value2) {
            addCriterion("ord_id not between", value1, value2, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdNoIsNull() {
            addCriterion("ord_no is null");
            return (Criteria) this;
        }

        public Criteria andOrdNoIsNotNull() {
            addCriterion("ord_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrdNoEqualTo(String value) {
            addCriterion("ord_no =", value, "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdNoNotEqualTo(String value) {
            addCriterion("ord_no <>", value, "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdNoGreaterThan(String value) {
            addCriterion("ord_no >", value, "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdNoGreaterThanOrEqualTo(String value) {
            addCriterion("ord_no >=", value, "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdNoLessThan(String value) {
            addCriterion("ord_no <", value, "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdNoLessThanOrEqualTo(String value) {
            addCriterion("ord_no <=", value, "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdNoLike(String value) {
            addCriterion("ord_no like", value, "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdNoNotLike(String value) {
            addCriterion("ord_no not like", value, "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdNoIn(List<String> values) {
            addCriterion("ord_no in", values, "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdNoNotIn(List<String> values) {
            addCriterion("ord_no not in", values, "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdNoBetween(String value1, String value2) {
            addCriterion("ord_no between", value1, value2, "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdNoNotBetween(String value1, String value2) {
            addCriterion("ord_no not between", value1, value2, "ordNo");
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

        public Criteria andHpIdIsNull() {
            addCriterion("hp_id is null");
            return (Criteria) this;
        }

        public Criteria andHpIdIsNotNull() {
            addCriterion("hp_id is not null");
            return (Criteria) this;
        }

        public Criteria andHpIdEqualTo(Integer value) {
            addCriterion("hp_id =", value, "hpId");
            return (Criteria) this;
        }

        public Criteria andHpIdNotEqualTo(Integer value) {
            addCriterion("hp_id <>", value, "hpId");
            return (Criteria) this;
        }

        public Criteria andHpIdGreaterThan(Integer value) {
            addCriterion("hp_id >", value, "hpId");
            return (Criteria) this;
        }

        public Criteria andHpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hp_id >=", value, "hpId");
            return (Criteria) this;
        }

        public Criteria andHpIdLessThan(Integer value) {
            addCriterion("hp_id <", value, "hpId");
            return (Criteria) this;
        }

        public Criteria andHpIdLessThanOrEqualTo(Integer value) {
            addCriterion("hp_id <=", value, "hpId");
            return (Criteria) this;
        }

        public Criteria andHpIdIn(List<Integer> values) {
            addCriterion("hp_id in", values, "hpId");
            return (Criteria) this;
        }

        public Criteria andHpIdNotIn(List<Integer> values) {
            addCriterion("hp_id not in", values, "hpId");
            return (Criteria) this;
        }

        public Criteria andHpIdBetween(Integer value1, Integer value2) {
            addCriterion("hp_id between", value1, value2, "hpId");
            return (Criteria) this;
        }

        public Criteria andHpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hp_id not between", value1, value2, "hpId");
            return (Criteria) this;
        }

        public Criteria andMdIdIsNull() {
            addCriterion("md_id is null");
            return (Criteria) this;
        }

        public Criteria andMdIdIsNotNull() {
            addCriterion("md_id is not null");
            return (Criteria) this;
        }

        public Criteria andMdIdEqualTo(Long value) {
            addCriterion("md_id =", value, "mdId");
            return (Criteria) this;
        }

        public Criteria andMdIdNotEqualTo(Long value) {
            addCriterion("md_id <>", value, "mdId");
            return (Criteria) this;
        }

        public Criteria andMdIdGreaterThan(Long value) {
            addCriterion("md_id >", value, "mdId");
            return (Criteria) this;
        }

        public Criteria andMdIdGreaterThanOrEqualTo(Long value) {
            addCriterion("md_id >=", value, "mdId");
            return (Criteria) this;
        }

        public Criteria andMdIdLessThan(Long value) {
            addCriterion("md_id <", value, "mdId");
            return (Criteria) this;
        }

        public Criteria andMdIdLessThanOrEqualTo(Long value) {
            addCriterion("md_id <=", value, "mdId");
            return (Criteria) this;
        }

        public Criteria andMdIdIn(List<Long> values) {
            addCriterion("md_id in", values, "mdId");
            return (Criteria) this;
        }

        public Criteria andMdIdNotIn(List<Long> values) {
            addCriterion("md_id not in", values, "mdId");
            return (Criteria) this;
        }

        public Criteria andMdIdBetween(Long value1, Long value2) {
            addCriterion("md_id between", value1, value2, "mdId");
            return (Criteria) this;
        }

        public Criteria andMdIdNotBetween(Long value1, Long value2) {
            addCriterion("md_id not between", value1, value2, "mdId");
            return (Criteria) this;
        }

        public Criteria andMdRoundIsNull() {
            addCriterion("md_round is null");
            return (Criteria) this;
        }

        public Criteria andMdRoundIsNotNull() {
            addCriterion("md_round is not null");
            return (Criteria) this;
        }

        public Criteria andMdRoundEqualTo(Integer value) {
            addCriterion("md_round =", value, "mdRound");
            return (Criteria) this;
        }

        public Criteria andMdRoundNotEqualTo(Integer value) {
            addCriterion("md_round <>", value, "mdRound");
            return (Criteria) this;
        }

        public Criteria andMdRoundGreaterThan(Integer value) {
            addCriterion("md_round >", value, "mdRound");
            return (Criteria) this;
        }

        public Criteria andMdRoundGreaterThanOrEqualTo(Integer value) {
            addCriterion("md_round >=", value, "mdRound");
            return (Criteria) this;
        }

        public Criteria andMdRoundLessThan(Integer value) {
            addCriterion("md_round <", value, "mdRound");
            return (Criteria) this;
        }

        public Criteria andMdRoundLessThanOrEqualTo(Integer value) {
            addCriterion("md_round <=", value, "mdRound");
            return (Criteria) this;
        }

        public Criteria andMdRoundIn(List<Integer> values) {
            addCriterion("md_round in", values, "mdRound");
            return (Criteria) this;
        }

        public Criteria andMdRoundNotIn(List<Integer> values) {
            addCriterion("md_round not in", values, "mdRound");
            return (Criteria) this;
        }

        public Criteria andMdRoundBetween(Integer value1, Integer value2) {
            addCriterion("md_round between", value1, value2, "mdRound");
            return (Criteria) this;
        }

        public Criteria andMdRoundNotBetween(Integer value1, Integer value2) {
            addCriterion("md_round not between", value1, value2, "mdRound");
            return (Criteria) this;
        }

        public Criteria andPhaseNumIsNull() {
            addCriterion("phase_num is null");
            return (Criteria) this;
        }

        public Criteria andPhaseNumIsNotNull() {
            addCriterion("phase_num is not null");
            return (Criteria) this;
        }

        public Criteria andPhaseNumEqualTo(Integer value) {
            addCriterion("phase_num =", value, "phaseNum");
            return (Criteria) this;
        }

        public Criteria andPhaseNumNotEqualTo(Integer value) {
            addCriterion("phase_num <>", value, "phaseNum");
            return (Criteria) this;
        }

        public Criteria andPhaseNumGreaterThan(Integer value) {
            addCriterion("phase_num >", value, "phaseNum");
            return (Criteria) this;
        }

        public Criteria andPhaseNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("phase_num >=", value, "phaseNum");
            return (Criteria) this;
        }

        public Criteria andPhaseNumLessThan(Integer value) {
            addCriterion("phase_num <", value, "phaseNum");
            return (Criteria) this;
        }

        public Criteria andPhaseNumLessThanOrEqualTo(Integer value) {
            addCriterion("phase_num <=", value, "phaseNum");
            return (Criteria) this;
        }

        public Criteria andPhaseNumIn(List<Integer> values) {
            addCriterion("phase_num in", values, "phaseNum");
            return (Criteria) this;
        }

        public Criteria andPhaseNumNotIn(List<Integer> values) {
            addCriterion("phase_num not in", values, "phaseNum");
            return (Criteria) this;
        }

        public Criteria andPhaseNumBetween(Integer value1, Integer value2) {
            addCriterion("phase_num between", value1, value2, "phaseNum");
            return (Criteria) this;
        }

        public Criteria andPhaseNumNotBetween(Integer value1, Integer value2) {
            addCriterion("phase_num not between", value1, value2, "phaseNum");
            return (Criteria) this;
        }

        public Criteria andAuditNumIsNull() {
            addCriterion("audit_num is null");
            return (Criteria) this;
        }

        public Criteria andAuditNumIsNotNull() {
            addCriterion("audit_num is not null");
            return (Criteria) this;
        }

        public Criteria andAuditNumEqualTo(Integer value) {
            addCriterion("audit_num =", value, "auditNum");
            return (Criteria) this;
        }

        public Criteria andAuditNumNotEqualTo(Integer value) {
            addCriterion("audit_num <>", value, "auditNum");
            return (Criteria) this;
        }

        public Criteria andAuditNumGreaterThan(Integer value) {
            addCriterion("audit_num >", value, "auditNum");
            return (Criteria) this;
        }

        public Criteria andAuditNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("audit_num >=", value, "auditNum");
            return (Criteria) this;
        }

        public Criteria andAuditNumLessThan(Integer value) {
            addCriterion("audit_num <", value, "auditNum");
            return (Criteria) this;
        }

        public Criteria andAuditNumLessThanOrEqualTo(Integer value) {
            addCriterion("audit_num <=", value, "auditNum");
            return (Criteria) this;
        }

        public Criteria andAuditNumIn(List<Integer> values) {
            addCriterion("audit_num in", values, "auditNum");
            return (Criteria) this;
        }

        public Criteria andAuditNumNotIn(List<Integer> values) {
            addCriterion("audit_num not in", values, "auditNum");
            return (Criteria) this;
        }

        public Criteria andAuditNumBetween(Integer value1, Integer value2) {
            addCriterion("audit_num between", value1, value2, "auditNum");
            return (Criteria) this;
        }

        public Criteria andAuditNumNotBetween(Integer value1, Integer value2) {
            addCriterion("audit_num not between", value1, value2, "auditNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumIsNull() {
            addCriterion("buy_num is null");
            return (Criteria) this;
        }

        public Criteria andBuyNumIsNotNull() {
            addCriterion("buy_num is not null");
            return (Criteria) this;
        }

        public Criteria andBuyNumEqualTo(Integer value) {
            addCriterion("buy_num =", value, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumNotEqualTo(Integer value) {
            addCriterion("buy_num <>", value, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumGreaterThan(Integer value) {
            addCriterion("buy_num >", value, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("buy_num >=", value, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumLessThan(Integer value) {
            addCriterion("buy_num <", value, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumLessThanOrEqualTo(Integer value) {
            addCriterion("buy_num <=", value, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumIn(List<Integer> values) {
            addCriterion("buy_num in", values, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumNotIn(List<Integer> values) {
            addCriterion("buy_num not in", values, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumBetween(Integer value1, Integer value2) {
            addCriterion("buy_num between", value1, value2, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumNotBetween(Integer value1, Integer value2) {
            addCriterion("buy_num not between", value1, value2, "buyNum");
            return (Criteria) this;
        }

        public Criteria andAidNumIsNull() {
            addCriterion("aid_num is null");
            return (Criteria) this;
        }

        public Criteria andAidNumIsNotNull() {
            addCriterion("aid_num is not null");
            return (Criteria) this;
        }

        public Criteria andAidNumEqualTo(Integer value) {
            addCriterion("aid_num =", value, "aidNum");
            return (Criteria) this;
        }

        public Criteria andAidNumNotEqualTo(Integer value) {
            addCriterion("aid_num <>", value, "aidNum");
            return (Criteria) this;
        }

        public Criteria andAidNumGreaterThan(Integer value) {
            addCriterion("aid_num >", value, "aidNum");
            return (Criteria) this;
        }

        public Criteria andAidNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("aid_num >=", value, "aidNum");
            return (Criteria) this;
        }

        public Criteria andAidNumLessThan(Integer value) {
            addCriterion("aid_num <", value, "aidNum");
            return (Criteria) this;
        }

        public Criteria andAidNumLessThanOrEqualTo(Integer value) {
            addCriterion("aid_num <=", value, "aidNum");
            return (Criteria) this;
        }

        public Criteria andAidNumIn(List<Integer> values) {
            addCriterion("aid_num in", values, "aidNum");
            return (Criteria) this;
        }

        public Criteria andAidNumNotIn(List<Integer> values) {
            addCriterion("aid_num not in", values, "aidNum");
            return (Criteria) this;
        }

        public Criteria andAidNumBetween(Integer value1, Integer value2) {
            addCriterion("aid_num between", value1, value2, "aidNum");
            return (Criteria) this;
        }

        public Criteria andAidNumNotBetween(Integer value1, Integer value2) {
            addCriterion("aid_num not between", value1, value2, "aidNum");
            return (Criteria) this;
        }

        public Criteria andSelfNumIsNull() {
            addCriterion("self_num is null");
            return (Criteria) this;
        }

        public Criteria andSelfNumIsNotNull() {
            addCriterion("self_num is not null");
            return (Criteria) this;
        }

        public Criteria andSelfNumEqualTo(Integer value) {
            addCriterion("self_num =", value, "selfNum");
            return (Criteria) this;
        }

        public Criteria andSelfNumNotEqualTo(Integer value) {
            addCriterion("self_num <>", value, "selfNum");
            return (Criteria) this;
        }

        public Criteria andSelfNumGreaterThan(Integer value) {
            addCriterion("self_num >", value, "selfNum");
            return (Criteria) this;
        }

        public Criteria andSelfNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("self_num >=", value, "selfNum");
            return (Criteria) this;
        }

        public Criteria andSelfNumLessThan(Integer value) {
            addCriterion("self_num <", value, "selfNum");
            return (Criteria) this;
        }

        public Criteria andSelfNumLessThanOrEqualTo(Integer value) {
            addCriterion("self_num <=", value, "selfNum");
            return (Criteria) this;
        }

        public Criteria andSelfNumIn(List<Integer> values) {
            addCriterion("self_num in", values, "selfNum");
            return (Criteria) this;
        }

        public Criteria andSelfNumNotIn(List<Integer> values) {
            addCriterion("self_num not in", values, "selfNum");
            return (Criteria) this;
        }

        public Criteria andSelfNumBetween(Integer value1, Integer value2) {
            addCriterion("self_num between", value1, value2, "selfNum");
            return (Criteria) this;
        }

        public Criteria andSelfNumNotBetween(Integer value1, Integer value2) {
            addCriterion("self_num not between", value1, value2, "selfNum");
            return (Criteria) this;
        }

        public Criteria andBuyPhIdIsNull() {
            addCriterion("buy_ph_id is null");
            return (Criteria) this;
        }

        public Criteria andBuyPhIdIsNotNull() {
            addCriterion("buy_ph_id is not null");
            return (Criteria) this;
        }

        public Criteria andBuyPhIdEqualTo(Long value) {
            addCriterion("buy_ph_id =", value, "buyPhId");
            return (Criteria) this;
        }

        public Criteria andBuyPhIdNotEqualTo(Long value) {
            addCriterion("buy_ph_id <>", value, "buyPhId");
            return (Criteria) this;
        }

        public Criteria andBuyPhIdGreaterThan(Long value) {
            addCriterion("buy_ph_id >", value, "buyPhId");
            return (Criteria) this;
        }

        public Criteria andBuyPhIdGreaterThanOrEqualTo(Long value) {
            addCriterion("buy_ph_id >=", value, "buyPhId");
            return (Criteria) this;
        }

        public Criteria andBuyPhIdLessThan(Long value) {
            addCriterion("buy_ph_id <", value, "buyPhId");
            return (Criteria) this;
        }

        public Criteria andBuyPhIdLessThanOrEqualTo(Long value) {
            addCriterion("buy_ph_id <=", value, "buyPhId");
            return (Criteria) this;
        }

        public Criteria andBuyPhIdIn(List<Long> values) {
            addCriterion("buy_ph_id in", values, "buyPhId");
            return (Criteria) this;
        }

        public Criteria andBuyPhIdNotIn(List<Long> values) {
            addCriterion("buy_ph_id not in", values, "buyPhId");
            return (Criteria) this;
        }

        public Criteria andBuyPhIdBetween(Long value1, Long value2) {
            addCriterion("buy_ph_id between", value1, value2, "buyPhId");
            return (Criteria) this;
        }

        public Criteria andBuyPhIdNotBetween(Long value1, Long value2) {
            addCriterion("buy_ph_id not between", value1, value2, "buyPhId");
            return (Criteria) this;
        }

        public Criteria andAidPhIdIsNull() {
            addCriterion("aid_ph_id is null");
            return (Criteria) this;
        }

        public Criteria andAidPhIdIsNotNull() {
            addCriterion("aid_ph_id is not null");
            return (Criteria) this;
        }

        public Criteria andAidPhIdEqualTo(Long value) {
            addCriterion("aid_ph_id =", value, "aidPhId");
            return (Criteria) this;
        }

        public Criteria andAidPhIdNotEqualTo(Long value) {
            addCriterion("aid_ph_id <>", value, "aidPhId");
            return (Criteria) this;
        }

        public Criteria andAidPhIdGreaterThan(Long value) {
            addCriterion("aid_ph_id >", value, "aidPhId");
            return (Criteria) this;
        }

        public Criteria andAidPhIdGreaterThanOrEqualTo(Long value) {
            addCriterion("aid_ph_id >=", value, "aidPhId");
            return (Criteria) this;
        }

        public Criteria andAidPhIdLessThan(Long value) {
            addCriterion("aid_ph_id <", value, "aidPhId");
            return (Criteria) this;
        }

        public Criteria andAidPhIdLessThanOrEqualTo(Long value) {
            addCriterion("aid_ph_id <=", value, "aidPhId");
            return (Criteria) this;
        }

        public Criteria andAidPhIdIn(List<Long> values) {
            addCriterion("aid_ph_id in", values, "aidPhId");
            return (Criteria) this;
        }

        public Criteria andAidPhIdNotIn(List<Long> values) {
            addCriterion("aid_ph_id not in", values, "aidPhId");
            return (Criteria) this;
        }

        public Criteria andAidPhIdBetween(Long value1, Long value2) {
            addCriterion("aid_ph_id between", value1, value2, "aidPhId");
            return (Criteria) this;
        }

        public Criteria andAidPhIdNotBetween(Long value1, Long value2) {
            addCriterion("aid_ph_id not between", value1, value2, "aidPhId");
            return (Criteria) this;
        }

        public Criteria andIsAssistIsNull() {
            addCriterion("is_assist is null");
            return (Criteria) this;
        }

        public Criteria andIsAssistIsNotNull() {
            addCriterion("is_assist is not null");
            return (Criteria) this;
        }

        public Criteria andIsAssistEqualTo(Byte value) {
            addCriterion("is_assist =", value, "isAssist");
            return (Criteria) this;
        }

        public Criteria andIsAssistNotEqualTo(Byte value) {
            addCriterion("is_assist <>", value, "isAssist");
            return (Criteria) this;
        }

        public Criteria andIsAssistGreaterThan(Byte value) {
            addCriterion("is_assist >", value, "isAssist");
            return (Criteria) this;
        }

        public Criteria andIsAssistGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_assist >=", value, "isAssist");
            return (Criteria) this;
        }

        public Criteria andIsAssistLessThan(Byte value) {
            addCriterion("is_assist <", value, "isAssist");
            return (Criteria) this;
        }

        public Criteria andIsAssistLessThanOrEqualTo(Byte value) {
            addCriterion("is_assist <=", value, "isAssist");
            return (Criteria) this;
        }

        public Criteria andIsAssistIn(List<Byte> values) {
            addCriterion("is_assist in", values, "isAssist");
            return (Criteria) this;
        }

        public Criteria andIsAssistNotIn(List<Byte> values) {
            addCriterion("is_assist not in", values, "isAssist");
            return (Criteria) this;
        }

        public Criteria andIsAssistBetween(Byte value1, Byte value2) {
            addCriterion("is_assist between", value1, value2, "isAssist");
            return (Criteria) this;
        }

        public Criteria andIsAssistNotBetween(Byte value1, Byte value2) {
            addCriterion("is_assist not between", value1, value2, "isAssist");
            return (Criteria) this;
        }

        public Criteria andAssistorIsNull() {
            addCriterion("assistor is null");
            return (Criteria) this;
        }

        public Criteria andAssistorIsNotNull() {
            addCriterion("assistor is not null");
            return (Criteria) this;
        }

        public Criteria andAssistorEqualTo(Long value) {
            addCriterion("assistor =", value, "assistor");
            return (Criteria) this;
        }

        public Criteria andAssistorNotEqualTo(Long value) {
            addCriterion("assistor <>", value, "assistor");
            return (Criteria) this;
        }

        public Criteria andAssistorGreaterThan(Long value) {
            addCriterion("assistor >", value, "assistor");
            return (Criteria) this;
        }

        public Criteria andAssistorGreaterThanOrEqualTo(Long value) {
            addCriterion("assistor >=", value, "assistor");
            return (Criteria) this;
        }

        public Criteria andAssistorLessThan(Long value) {
            addCriterion("assistor <", value, "assistor");
            return (Criteria) this;
        }

        public Criteria andAssistorLessThanOrEqualTo(Long value) {
            addCriterion("assistor <=", value, "assistor");
            return (Criteria) this;
        }

        public Criteria andAssistorIn(List<Long> values) {
            addCriterion("assistor in", values, "assistor");
            return (Criteria) this;
        }

        public Criteria andAssistorNotIn(List<Long> values) {
            addCriterion("assistor not in", values, "assistor");
            return (Criteria) this;
        }

        public Criteria andAssistorBetween(Long value1, Long value2) {
            addCriterion("assistor between", value1, value2, "assistor");
            return (Criteria) this;
        }

        public Criteria andAssistorNotBetween(Long value1, Long value2) {
            addCriterion("assistor not between", value1, value2, "assistor");
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

        public Criteria andAuditRsnSetIsNull() {
            addCriterion("audit_rsn_set is null");
            return (Criteria) this;
        }

        public Criteria andAuditRsnSetIsNotNull() {
            addCriterion("audit_rsn_set is not null");
            return (Criteria) this;
        }

        public Criteria andAuditRsnSetEqualTo(String value) {
            addCriterion("audit_rsn_set =", value, "auditRsnSet");
            return (Criteria) this;
        }

        public Criteria andAuditRsnSetNotEqualTo(String value) {
            addCriterion("audit_rsn_set <>", value, "auditRsnSet");
            return (Criteria) this;
        }

        public Criteria andAuditRsnSetGreaterThan(String value) {
            addCriterion("audit_rsn_set >", value, "auditRsnSet");
            return (Criteria) this;
        }

        public Criteria andAuditRsnSetGreaterThanOrEqualTo(String value) {
            addCriterion("audit_rsn_set >=", value, "auditRsnSet");
            return (Criteria) this;
        }

        public Criteria andAuditRsnSetLessThan(String value) {
            addCriterion("audit_rsn_set <", value, "auditRsnSet");
            return (Criteria) this;
        }

        public Criteria andAuditRsnSetLessThanOrEqualTo(String value) {
            addCriterion("audit_rsn_set <=", value, "auditRsnSet");
            return (Criteria) this;
        }

        public Criteria andAuditRsnSetLike(String value) {
            addCriterion("audit_rsn_set like", value, "auditRsnSet");
            return (Criteria) this;
        }

        public Criteria andAuditRsnSetNotLike(String value) {
            addCriterion("audit_rsn_set not like", value, "auditRsnSet");
            return (Criteria) this;
        }

        public Criteria andAuditRsnSetIn(List<String> values) {
            addCriterion("audit_rsn_set in", values, "auditRsnSet");
            return (Criteria) this;
        }

        public Criteria andAuditRsnSetNotIn(List<String> values) {
            addCriterion("audit_rsn_set not in", values, "auditRsnSet");
            return (Criteria) this;
        }

        public Criteria andAuditRsnSetBetween(String value1, String value2) {
            addCriterion("audit_rsn_set between", value1, value2, "auditRsnSet");
            return (Criteria) this;
        }

        public Criteria andAuditRsnSetNotBetween(String value1, String value2) {
            addCriterion("audit_rsn_set not between", value1, value2, "auditRsnSet");
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

        public Criteria andStepNoIsNull() {
            addCriterion("step_no is null");
            return (Criteria) this;
        }

        public Criteria andStepNoIsNotNull() {
            addCriterion("step_no is not null");
            return (Criteria) this;
        }

        public Criteria andStepNoEqualTo(Byte value) {
            addCriterion("step_no =", value, "stepNo");
            return (Criteria) this;
        }

        public Criteria andStepNoNotEqualTo(Byte value) {
            addCriterion("step_no <>", value, "stepNo");
            return (Criteria) this;
        }

        public Criteria andStepNoGreaterThan(Byte value) {
            addCriterion("step_no >", value, "stepNo");
            return (Criteria) this;
        }

        public Criteria andStepNoGreaterThanOrEqualTo(Byte value) {
            addCriterion("step_no >=", value, "stepNo");
            return (Criteria) this;
        }

        public Criteria andStepNoLessThan(Byte value) {
            addCriterion("step_no <", value, "stepNo");
            return (Criteria) this;
        }

        public Criteria andStepNoLessThanOrEqualTo(Byte value) {
            addCriterion("step_no <=", value, "stepNo");
            return (Criteria) this;
        }

        public Criteria andStepNoIn(List<Byte> values) {
            addCriterion("step_no in", values, "stepNo");
            return (Criteria) this;
        }

        public Criteria andStepNoNotIn(List<Byte> values) {
            addCriterion("step_no not in", values, "stepNo");
            return (Criteria) this;
        }

        public Criteria andStepNoBetween(Byte value1, Byte value2) {
            addCriterion("step_no between", value1, value2, "stepNo");
            return (Criteria) this;
        }

        public Criteria andStepNoNotBetween(Byte value1, Byte value2) {
            addCriterion("step_no not between", value1, value2, "stepNo");
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

        public Criteria andReasonDescIsNull() {
            addCriterion("reason_desc is null");
            return (Criteria) this;
        }

        public Criteria andReasonDescIsNotNull() {
            addCriterion("reason_desc is not null");
            return (Criteria) this;
        }

        public Criteria andReasonDescEqualTo(String value) {
            addCriterion("reason_desc =", value, "reasonDesc");
            return (Criteria) this;
        }

        public Criteria andReasonDescNotEqualTo(String value) {
            addCriterion("reason_desc <>", value, "reasonDesc");
            return (Criteria) this;
        }

        public Criteria andReasonDescGreaterThan(String value) {
            addCriterion("reason_desc >", value, "reasonDesc");
            return (Criteria) this;
        }

        public Criteria andReasonDescGreaterThanOrEqualTo(String value) {
            addCriterion("reason_desc >=", value, "reasonDesc");
            return (Criteria) this;
        }

        public Criteria andReasonDescLessThan(String value) {
            addCriterion("reason_desc <", value, "reasonDesc");
            return (Criteria) this;
        }

        public Criteria andReasonDescLessThanOrEqualTo(String value) {
            addCriterion("reason_desc <=", value, "reasonDesc");
            return (Criteria) this;
        }

        public Criteria andReasonDescLike(String value) {
            addCriterion("reason_desc like", value, "reasonDesc");
            return (Criteria) this;
        }

        public Criteria andReasonDescNotLike(String value) {
            addCriterion("reason_desc not like", value, "reasonDesc");
            return (Criteria) this;
        }

        public Criteria andReasonDescIn(List<String> values) {
            addCriterion("reason_desc in", values, "reasonDesc");
            return (Criteria) this;
        }

        public Criteria andReasonDescNotIn(List<String> values) {
            addCriterion("reason_desc not in", values, "reasonDesc");
            return (Criteria) this;
        }

        public Criteria andReasonDescBetween(String value1, String value2) {
            addCriterion("reason_desc between", value1, value2, "reasonDesc");
            return (Criteria) this;
        }

        public Criteria andReasonDescNotBetween(String value1, String value2) {
            addCriterion("reason_desc not between", value1, value2, "reasonDesc");
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