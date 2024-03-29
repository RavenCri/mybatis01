package com.raven.pojo;

import java.util.ArrayList;
import java.util.List;

public class PayExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_pay
     *
     * @mbg.generated Fri Mar 22 14:22:36 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_pay
     *
     * @mbg.generated Fri Mar 22 14:22:36 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_pay
     *
     * @mbg.generated Fri Mar 22 14:22:36 CST 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_pay
     *
     * @mbg.generated Fri Mar 22 14:22:36 CST 2015
     */
    public PayExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_pay
     *
     * @mbg.generated Fri Mar 22 14:22:36 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_pay
     *
     * @mbg.generated Fri Mar 22 14:22:36 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_pay
     *
     * @mbg.generated Fri Mar 22 14:22:36 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_pay
     *
     * @mbg.generated Fri Mar 22 14:22:36 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_pay
     *
     * @mbg.generated Fri Mar 22 14:22:36 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_pay
     *
     * @mbg.generated Fri Mar 22 14:22:36 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_pay
     *
     * @mbg.generated Fri Mar 22 14:22:36 CST 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_pay
     *
     * @mbg.generated Fri Mar 22 14:22:36 CST 2015
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_pay
     *
     * @mbg.generated Fri Mar 22 14:22:36 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_pay
     *
     * @mbg.generated Fri Mar 22 14:22:36 CST 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_pay
     *
     * @mbg.generated Fri Mar 22 14:22:36 CST 2015
     */
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPaynameIsNull() {
            addCriterion("payname is null");
            return (Criteria) this;
        }

        public Criteria andPaynameIsNotNull() {
            addCriterion("payname is not null");
            return (Criteria) this;
        }

        public Criteria andPaynameEqualTo(String value) {
            addCriterion("payname =", value, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameNotEqualTo(String value) {
            addCriterion("payname <>", value, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameGreaterThan(String value) {
            addCriterion("payname >", value, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameGreaterThanOrEqualTo(String value) {
            addCriterion("payname >=", value, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameLessThan(String value) {
            addCriterion("payname <", value, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameLessThanOrEqualTo(String value) {
            addCriterion("payname <=", value, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameLike(String value) {
            addCriterion("payname like", value, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameNotLike(String value) {
            addCriterion("payname not like", value, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameIn(List<String> values) {
            addCriterion("payname in", values, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameNotIn(List<String> values) {
            addCriterion("payname not in", values, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameBetween(String value1, String value2) {
            addCriterion("payname between", value1, value2, "payname");
            return (Criteria) this;
        }

        public Criteria andPaynameNotBetween(String value1, String value2) {
            addCriterion("payname not between", value1, value2, "payname");
            return (Criteria) this;
        }

        public Criteria andPayamoutIsNull() {
            addCriterion("payamout is null");
            return (Criteria) this;
        }

        public Criteria andPayamoutIsNotNull() {
            addCriterion("payamout is not null");
            return (Criteria) this;
        }

        public Criteria andPayamoutEqualTo(Double value) {
            addCriterion("payamout =", value, "payamout");
            return (Criteria) this;
        }

        public Criteria andPayamoutNotEqualTo(Double value) {
            addCriterion("payamout <>", value, "payamout");
            return (Criteria) this;
        }

        public Criteria andPayamoutGreaterThan(Double value) {
            addCriterion("payamout >", value, "payamout");
            return (Criteria) this;
        }

        public Criteria andPayamoutGreaterThanOrEqualTo(Double value) {
            addCriterion("payamout >=", value, "payamout");
            return (Criteria) this;
        }

        public Criteria andPayamoutLessThan(Double value) {
            addCriterion("payamout <", value, "payamout");
            return (Criteria) this;
        }

        public Criteria andPayamoutLessThanOrEqualTo(Double value) {
            addCriterion("payamout <=", value, "payamout");
            return (Criteria) this;
        }

        public Criteria andPayamoutIn(List<Double> values) {
            addCriterion("payamout in", values, "payamout");
            return (Criteria) this;
        }

        public Criteria andPayamoutNotIn(List<Double> values) {
            addCriterion("payamout not in", values, "payamout");
            return (Criteria) this;
        }

        public Criteria andPayamoutBetween(Double value1, Double value2) {
            addCriterion("payamout between", value1, value2, "payamout");
            return (Criteria) this;
        }

        public Criteria andPayamoutNotBetween(Double value1, Double value2) {
            addCriterion("payamout not between", value1, value2, "payamout");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNull() {
            addCriterion("paytime is null");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNotNull() {
            addCriterion("paytime is not null");
            return (Criteria) this;
        }

        public Criteria andPaytimeEqualTo(String value) {
            addCriterion("paytime =", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotEqualTo(String value) {
            addCriterion("paytime <>", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThan(String value) {
            addCriterion("paytime >", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThanOrEqualTo(String value) {
            addCriterion("paytime >=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThan(String value) {
            addCriterion("paytime <", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThanOrEqualTo(String value) {
            addCriterion("paytime <=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLike(String value) {
            addCriterion("paytime like", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotLike(String value) {
            addCriterion("paytime not like", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeIn(List<String> values) {
            addCriterion("paytime in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotIn(List<String> values) {
            addCriterion("paytime not in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeBetween(String value1, String value2) {
            addCriterion("paytime between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotBetween(String value1, String value2) {
            addCriterion("paytime not between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaystausIsNull() {
            addCriterion("paystaus is null");
            return (Criteria) this;
        }

        public Criteria andPaystausIsNotNull() {
            addCriterion("paystaus is not null");
            return (Criteria) this;
        }

        public Criteria andPaystausEqualTo(String value) {
            addCriterion("paystaus =", value, "paystaus");
            return (Criteria) this;
        }

        public Criteria andPaystausNotEqualTo(String value) {
            addCriterion("paystaus <>", value, "paystaus");
            return (Criteria) this;
        }

        public Criteria andPaystausGreaterThan(String value) {
            addCriterion("paystaus >", value, "paystaus");
            return (Criteria) this;
        }

        public Criteria andPaystausGreaterThanOrEqualTo(String value) {
            addCriterion("paystaus >=", value, "paystaus");
            return (Criteria) this;
        }

        public Criteria andPaystausLessThan(String value) {
            addCriterion("paystaus <", value, "paystaus");
            return (Criteria) this;
        }

        public Criteria andPaystausLessThanOrEqualTo(String value) {
            addCriterion("paystaus <=", value, "paystaus");
            return (Criteria) this;
        }

        public Criteria andPaystausLike(String value) {
            addCriterion("paystaus like", value, "paystaus");
            return (Criteria) this;
        }

        public Criteria andPaystausNotLike(String value) {
            addCriterion("paystaus not like", value, "paystaus");
            return (Criteria) this;
        }

        public Criteria andPaystausIn(List<String> values) {
            addCriterion("paystaus in", values, "paystaus");
            return (Criteria) this;
        }

        public Criteria andPaystausNotIn(List<String> values) {
            addCriterion("paystaus not in", values, "paystaus");
            return (Criteria) this;
        }

        public Criteria andPaystausBetween(String value1, String value2) {
            addCriterion("paystaus between", value1, value2, "paystaus");
            return (Criteria) this;
        }

        public Criteria andPaystausNotBetween(String value1, String value2) {
            addCriterion("paystaus not between", value1, value2, "paystaus");
            return (Criteria) this;
        }

        public Criteria andMailIsNull() {
            addCriterion("mail is null");
            return (Criteria) this;
        }

        public Criteria andMailIsNotNull() {
            addCriterion("mail is not null");
            return (Criteria) this;
        }

        public Criteria andMailEqualTo(String value) {
            addCriterion("mail =", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotEqualTo(String value) {
            addCriterion("mail <>", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThan(String value) {
            addCriterion("mail >", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThanOrEqualTo(String value) {
            addCriterion("mail >=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThan(String value) {
            addCriterion("mail <", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThanOrEqualTo(String value) {
            addCriterion("mail <=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLike(String value) {
            addCriterion("mail like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotLike(String value) {
            addCriterion("mail not like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailIn(List<String> values) {
            addCriterion("mail in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotIn(List<String> values) {
            addCriterion("mail not in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailBetween(String value1, String value2) {
            addCriterion("mail between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotBetween(String value1, String value2) {
            addCriterion("mail not between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andAuditpassIsNull() {
            addCriterion("auditpass is null");
            return (Criteria) this;
        }

        public Criteria andAuditpassIsNotNull() {
            addCriterion("auditpass is not null");
            return (Criteria) this;
        }

        public Criteria andAuditpassEqualTo(String value) {
            addCriterion("auditpass =", value, "auditpass");
            return (Criteria) this;
        }

        public Criteria andAuditpassNotEqualTo(String value) {
            addCriterion("auditpass <>", value, "auditpass");
            return (Criteria) this;
        }

        public Criteria andAuditpassGreaterThan(String value) {
            addCriterion("auditpass >", value, "auditpass");
            return (Criteria) this;
        }

        public Criteria andAuditpassGreaterThanOrEqualTo(String value) {
            addCriterion("auditpass >=", value, "auditpass");
            return (Criteria) this;
        }

        public Criteria andAuditpassLessThan(String value) {
            addCriterion("auditpass <", value, "auditpass");
            return (Criteria) this;
        }

        public Criteria andAuditpassLessThanOrEqualTo(String value) {
            addCriterion("auditpass <=", value, "auditpass");
            return (Criteria) this;
        }

        public Criteria andAuditpassLike(String value) {
            addCriterion("auditpass like", value, "auditpass");
            return (Criteria) this;
        }

        public Criteria andAuditpassNotLike(String value) {
            addCriterion("auditpass not like", value, "auditpass");
            return (Criteria) this;
        }

        public Criteria andAuditpassIn(List<String> values) {
            addCriterion("auditpass in", values, "auditpass");
            return (Criteria) this;
        }

        public Criteria andAuditpassNotIn(List<String> values) {
            addCriterion("auditpass not in", values, "auditpass");
            return (Criteria) this;
        }

        public Criteria andAuditpassBetween(String value1, String value2) {
            addCriterion("auditpass between", value1, value2, "auditpass");
            return (Criteria) this;
        }

        public Criteria andAuditpassNotBetween(String value1, String value2) {
            addCriterion("auditpass not between", value1, value2, "auditpass");
            return (Criteria) this;
        }

        public Criteria andXsdcodeIsNull() {
            addCriterion("xsdcode is null");
            return (Criteria) this;
        }

        public Criteria andXsdcodeIsNotNull() {
            addCriterion("xsdcode is not null");
            return (Criteria) this;
        }

        public Criteria andXsdcodeEqualTo(Integer value) {
            addCriterion("xsdcode =", value, "xsdcode");
            return (Criteria) this;
        }

        public Criteria andXsdcodeNotEqualTo(Integer value) {
            addCriterion("xsdcode <>", value, "xsdcode");
            return (Criteria) this;
        }

        public Criteria andXsdcodeGreaterThan(Integer value) {
            addCriterion("xsdcode >", value, "xsdcode");
            return (Criteria) this;
        }

        public Criteria andXsdcodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("xsdcode >=", value, "xsdcode");
            return (Criteria) this;
        }

        public Criteria andXsdcodeLessThan(Integer value) {
            addCriterion("xsdcode <", value, "xsdcode");
            return (Criteria) this;
        }

        public Criteria andXsdcodeLessThanOrEqualTo(Integer value) {
            addCriterion("xsdcode <=", value, "xsdcode");
            return (Criteria) this;
        }

        public Criteria andXsdcodeIn(List<Integer> values) {
            addCriterion("xsdcode in", values, "xsdcode");
            return (Criteria) this;
        }

        public Criteria andXsdcodeNotIn(List<Integer> values) {
            addCriterion("xsdcode not in", values, "xsdcode");
            return (Criteria) this;
        }

        public Criteria andXsdcodeBetween(Integer value1, Integer value2) {
            addCriterion("xsdcode between", value1, value2, "xsdcode");
            return (Criteria) this;
        }

        public Criteria andXsdcodeNotBetween(Integer value1, Integer value2) {
            addCriterion("xsdcode not between", value1, value2, "xsdcode");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_pay
     *
     * @mbg.generated do_not_delete_during_merge Fri Mar 22 14:22:36 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_pay
     *
     * @mbg.generated Fri Mar 22 14:22:36 CST 2015
     */
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