package org.school.manager.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table students
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table students
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table students
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table students
     *
     * @mbggenerated
     */
    public StudentsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table students
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table students
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table students
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table students
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table students
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table students
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table students
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table students
     *
     * @mbggenerated
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
     * This method corresponds to the database table students
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table students
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table students
     *
     * @mbggenerated
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

        public Criteria andSidIsNull() {
            addCriterion("sId is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sId is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(String value) {
            addCriterion("sId =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(String value) {
            addCriterion("sId <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(String value) {
            addCriterion("sId >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(String value) {
            addCriterion("sId >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(String value) {
            addCriterion("sId <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(String value) {
            addCriterion("sId <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLike(String value) {
            addCriterion("sId like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotLike(String value) {
            addCriterion("sId not like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<String> values) {
            addCriterion("sId in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<String> values) {
            addCriterion("sId not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(String value1, String value2) {
            addCriterion("sId between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(String value1, String value2) {
            addCriterion("sId not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSnameIsNull() {
            addCriterion("sName is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("sName is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("sName =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("sName <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("sName >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("sName >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("sName <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("sName <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("sName like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("sName not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("sName in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("sName not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("sName between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("sName not between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andNsexIsNull() {
            addCriterion("nSex is null");
            return (Criteria) this;
        }

        public Criteria andNsexIsNotNull() {
            addCriterion("nSex is not null");
            return (Criteria) this;
        }

        public Criteria andNsexEqualTo(Integer value) {
            addCriterion("nSex =", value, "nsex");
            return (Criteria) this;
        }

        public Criteria andNsexNotEqualTo(Integer value) {
            addCriterion("nSex <>", value, "nsex");
            return (Criteria) this;
        }

        public Criteria andNsexGreaterThan(Integer value) {
            addCriterion("nSex >", value, "nsex");
            return (Criteria) this;
        }

        public Criteria andNsexGreaterThanOrEqualTo(Integer value) {
            addCriterion("nSex >=", value, "nsex");
            return (Criteria) this;
        }

        public Criteria andNsexLessThan(Integer value) {
            addCriterion("nSex <", value, "nsex");
            return (Criteria) this;
        }

        public Criteria andNsexLessThanOrEqualTo(Integer value) {
            addCriterion("nSex <=", value, "nsex");
            return (Criteria) this;
        }

        public Criteria andNsexIn(List<Integer> values) {
            addCriterion("nSex in", values, "nsex");
            return (Criteria) this;
        }

        public Criteria andNsexNotIn(List<Integer> values) {
            addCriterion("nSex not in", values, "nsex");
            return (Criteria) this;
        }

        public Criteria andNsexBetween(Integer value1, Integer value2) {
            addCriterion("nSex between", value1, value2, "nsex");
            return (Criteria) this;
        }

        public Criteria andNsexNotBetween(Integer value1, Integer value2) {
            addCriterion("nSex not between", value1, value2, "nsex");
            return (Criteria) this;
        }

        public Criteria andSidcardIsNull() {
            addCriterion("sIdCard is null");
            return (Criteria) this;
        }

        public Criteria andSidcardIsNotNull() {
            addCriterion("sIdCard is not null");
            return (Criteria) this;
        }

        public Criteria andSidcardEqualTo(String value) {
            addCriterion("sIdCard =", value, "sidcard");
            return (Criteria) this;
        }

        public Criteria andSidcardNotEqualTo(String value) {
            addCriterion("sIdCard <>", value, "sidcard");
            return (Criteria) this;
        }

        public Criteria andSidcardGreaterThan(String value) {
            addCriterion("sIdCard >", value, "sidcard");
            return (Criteria) this;
        }

        public Criteria andSidcardGreaterThanOrEqualTo(String value) {
            addCriterion("sIdCard >=", value, "sidcard");
            return (Criteria) this;
        }

        public Criteria andSidcardLessThan(String value) {
            addCriterion("sIdCard <", value, "sidcard");
            return (Criteria) this;
        }

        public Criteria andSidcardLessThanOrEqualTo(String value) {
            addCriterion("sIdCard <=", value, "sidcard");
            return (Criteria) this;
        }

        public Criteria andSidcardLike(String value) {
            addCriterion("sIdCard like", value, "sidcard");
            return (Criteria) this;
        }

        public Criteria andSidcardNotLike(String value) {
            addCriterion("sIdCard not like", value, "sidcard");
            return (Criteria) this;
        }

        public Criteria andSidcardIn(List<String> values) {
            addCriterion("sIdCard in", values, "sidcard");
            return (Criteria) this;
        }

        public Criteria andSidcardNotIn(List<String> values) {
            addCriterion("sIdCard not in", values, "sidcard");
            return (Criteria) this;
        }

        public Criteria andSidcardBetween(String value1, String value2) {
            addCriterion("sIdCard between", value1, value2, "sidcard");
            return (Criteria) this;
        }

        public Criteria andSidcardNotBetween(String value1, String value2) {
            addCriterion("sIdCard not between", value1, value2, "sidcard");
            return (Criteria) this;
        }

        public Criteria andNschoolnoIsNull() {
            addCriterion("nSchoolNo is null");
            return (Criteria) this;
        }

        public Criteria andNschoolnoIsNotNull() {
            addCriterion("nSchoolNo is not null");
            return (Criteria) this;
        }

        public Criteria andNschoolnoEqualTo(Integer value) {
            addCriterion("nSchoolNo =", value, "nschoolno");
            return (Criteria) this;
        }

        public Criteria andNschoolnoNotEqualTo(Integer value) {
            addCriterion("nSchoolNo <>", value, "nschoolno");
            return (Criteria) this;
        }

        public Criteria andNschoolnoGreaterThan(Integer value) {
            addCriterion("nSchoolNo >", value, "nschoolno");
            return (Criteria) this;
        }

        public Criteria andNschoolnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("nSchoolNo >=", value, "nschoolno");
            return (Criteria) this;
        }

        public Criteria andNschoolnoLessThan(Integer value) {
            addCriterion("nSchoolNo <", value, "nschoolno");
            return (Criteria) this;
        }

        public Criteria andNschoolnoLessThanOrEqualTo(Integer value) {
            addCriterion("nSchoolNo <=", value, "nschoolno");
            return (Criteria) this;
        }

        public Criteria andNschoolnoIn(List<Integer> values) {
            addCriterion("nSchoolNo in", values, "nschoolno");
            return (Criteria) this;
        }

        public Criteria andNschoolnoNotIn(List<Integer> values) {
            addCriterion("nSchoolNo not in", values, "nschoolno");
            return (Criteria) this;
        }

        public Criteria andNschoolnoBetween(Integer value1, Integer value2) {
            addCriterion("nSchoolNo between", value1, value2, "nschoolno");
            return (Criteria) this;
        }

        public Criteria andNschoolnoNotBetween(Integer value1, Integer value2) {
            addCriterion("nSchoolNo not between", value1, value2, "nschoolno");
            return (Criteria) this;
        }

        public Criteria andSstudentnoIsNull() {
            addCriterion("sStudentNo is null");
            return (Criteria) this;
        }

        public Criteria andSstudentnoIsNotNull() {
            addCriterion("sStudentNo is not null");
            return (Criteria) this;
        }

        public Criteria andSstudentnoEqualTo(String value) {
            addCriterion("sStudentNo =", value, "sstudentno");
            return (Criteria) this;
        }

        public Criteria andSstudentnoNotEqualTo(String value) {
            addCriterion("sStudentNo <>", value, "sstudentno");
            return (Criteria) this;
        }

        public Criteria andSstudentnoGreaterThan(String value) {
            addCriterion("sStudentNo >", value, "sstudentno");
            return (Criteria) this;
        }

        public Criteria andSstudentnoGreaterThanOrEqualTo(String value) {
            addCriterion("sStudentNo >=", value, "sstudentno");
            return (Criteria) this;
        }

        public Criteria andSstudentnoLessThan(String value) {
            addCriterion("sStudentNo <", value, "sstudentno");
            return (Criteria) this;
        }

        public Criteria andSstudentnoLessThanOrEqualTo(String value) {
            addCriterion("sStudentNo <=", value, "sstudentno");
            return (Criteria) this;
        }

        public Criteria andSstudentnoLike(String value) {
            addCriterion("sStudentNo like", value, "sstudentno");
            return (Criteria) this;
        }

        public Criteria andSstudentnoNotLike(String value) {
            addCriterion("sStudentNo not like", value, "sstudentno");
            return (Criteria) this;
        }

        public Criteria andSstudentnoIn(List<String> values) {
            addCriterion("sStudentNo in", values, "sstudentno");
            return (Criteria) this;
        }

        public Criteria andSstudentnoNotIn(List<String> values) {
            addCriterion("sStudentNo not in", values, "sstudentno");
            return (Criteria) this;
        }

        public Criteria andSstudentnoBetween(String value1, String value2) {
            addCriterion("sStudentNo between", value1, value2, "sstudentno");
            return (Criteria) this;
        }

        public Criteria andSstudentnoNotBetween(String value1, String value2) {
            addCriterion("sStudentNo not between", value1, value2, "sstudentno");
            return (Criteria) this;
        }

        public Criteria andSclassIsNull() {
            addCriterion("sClass is null");
            return (Criteria) this;
        }

        public Criteria andSclassIsNotNull() {
            addCriterion("sClass is not null");
            return (Criteria) this;
        }

        public Criteria andSclassEqualTo(String value) {
            addCriterion("sClass =", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassNotEqualTo(String value) {
            addCriterion("sClass <>", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassGreaterThan(String value) {
            addCriterion("sClass >", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassGreaterThanOrEqualTo(String value) {
            addCriterion("sClass >=", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassLessThan(String value) {
            addCriterion("sClass <", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassLessThanOrEqualTo(String value) {
            addCriterion("sClass <=", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassLike(String value) {
            addCriterion("sClass like", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassNotLike(String value) {
            addCriterion("sClass not like", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassIn(List<String> values) {
            addCriterion("sClass in", values, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassNotIn(List<String> values) {
            addCriterion("sClass not in", values, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassBetween(String value1, String value2) {
            addCriterion("sClass between", value1, value2, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassNotBetween(String value1, String value2) {
            addCriterion("sClass not between", value1, value2, "sclass");
            return (Criteria) this;
        }

        public Criteria andSphoneIsNull() {
            addCriterion("sPhone is null");
            return (Criteria) this;
        }

        public Criteria andSphoneIsNotNull() {
            addCriterion("sPhone is not null");
            return (Criteria) this;
        }

        public Criteria andSphoneEqualTo(String value) {
            addCriterion("sPhone =", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneNotEqualTo(String value) {
            addCriterion("sPhone <>", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneGreaterThan(String value) {
            addCriterion("sPhone >", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneGreaterThanOrEqualTo(String value) {
            addCriterion("sPhone >=", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneLessThan(String value) {
            addCriterion("sPhone <", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneLessThanOrEqualTo(String value) {
            addCriterion("sPhone <=", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneLike(String value) {
            addCriterion("sPhone like", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneNotLike(String value) {
            addCriterion("sPhone not like", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneIn(List<String> values) {
            addCriterion("sPhone in", values, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneNotIn(List<String> values) {
            addCriterion("sPhone not in", values, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneBetween(String value1, String value2) {
            addCriterion("sPhone between", value1, value2, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneNotBetween(String value1, String value2) {
            addCriterion("sPhone not between", value1, value2, "sphone");
            return (Criteria) this;
        }

        public Criteria andSemailIsNull() {
            addCriterion("sEmail is null");
            return (Criteria) this;
        }

        public Criteria andSemailIsNotNull() {
            addCriterion("sEmail is not null");
            return (Criteria) this;
        }

        public Criteria andSemailEqualTo(String value) {
            addCriterion("sEmail =", value, "semail");
            return (Criteria) this;
        }

        public Criteria andSemailNotEqualTo(String value) {
            addCriterion("sEmail <>", value, "semail");
            return (Criteria) this;
        }

        public Criteria andSemailGreaterThan(String value) {
            addCriterion("sEmail >", value, "semail");
            return (Criteria) this;
        }

        public Criteria andSemailGreaterThanOrEqualTo(String value) {
            addCriterion("sEmail >=", value, "semail");
            return (Criteria) this;
        }

        public Criteria andSemailLessThan(String value) {
            addCriterion("sEmail <", value, "semail");
            return (Criteria) this;
        }

        public Criteria andSemailLessThanOrEqualTo(String value) {
            addCriterion("sEmail <=", value, "semail");
            return (Criteria) this;
        }

        public Criteria andSemailLike(String value) {
            addCriterion("sEmail like", value, "semail");
            return (Criteria) this;
        }

        public Criteria andSemailNotLike(String value) {
            addCriterion("sEmail not like", value, "semail");
            return (Criteria) this;
        }

        public Criteria andSemailIn(List<String> values) {
            addCriterion("sEmail in", values, "semail");
            return (Criteria) this;
        }

        public Criteria andSemailNotIn(List<String> values) {
            addCriterion("sEmail not in", values, "semail");
            return (Criteria) this;
        }

        public Criteria andSemailBetween(String value1, String value2) {
            addCriterion("sEmail between", value1, value2, "semail");
            return (Criteria) this;
        }

        public Criteria andSemailNotBetween(String value1, String value2) {
            addCriterion("sEmail not between", value1, value2, "semail");
            return (Criteria) this;
        }

        public Criteria andSweixinIsNull() {
            addCriterion("sWeiXin is null");
            return (Criteria) this;
        }

        public Criteria andSweixinIsNotNull() {
            addCriterion("sWeiXin is not null");
            return (Criteria) this;
        }

        public Criteria andSweixinEqualTo(String value) {
            addCriterion("sWeiXin =", value, "sweixin");
            return (Criteria) this;
        }

        public Criteria andSweixinNotEqualTo(String value) {
            addCriterion("sWeiXin <>", value, "sweixin");
            return (Criteria) this;
        }

        public Criteria andSweixinGreaterThan(String value) {
            addCriterion("sWeiXin >", value, "sweixin");
            return (Criteria) this;
        }

        public Criteria andSweixinGreaterThanOrEqualTo(String value) {
            addCriterion("sWeiXin >=", value, "sweixin");
            return (Criteria) this;
        }

        public Criteria andSweixinLessThan(String value) {
            addCriterion("sWeiXin <", value, "sweixin");
            return (Criteria) this;
        }

        public Criteria andSweixinLessThanOrEqualTo(String value) {
            addCriterion("sWeiXin <=", value, "sweixin");
            return (Criteria) this;
        }

        public Criteria andSweixinLike(String value) {
            addCriterion("sWeiXin like", value, "sweixin");
            return (Criteria) this;
        }

        public Criteria andSweixinNotLike(String value) {
            addCriterion("sWeiXin not like", value, "sweixin");
            return (Criteria) this;
        }

        public Criteria andSweixinIn(List<String> values) {
            addCriterion("sWeiXin in", values, "sweixin");
            return (Criteria) this;
        }

        public Criteria andSweixinNotIn(List<String> values) {
            addCriterion("sWeiXin not in", values, "sweixin");
            return (Criteria) this;
        }

        public Criteria andSweixinBetween(String value1, String value2) {
            addCriterion("sWeiXin between", value1, value2, "sweixin");
            return (Criteria) this;
        }

        public Criteria andSweixinNotBetween(String value1, String value2) {
            addCriterion("sWeiXin not between", value1, value2, "sweixin");
            return (Criteria) this;
        }

        public Criteria andSqqIsNull() {
            addCriterion("sQQ is null");
            return (Criteria) this;
        }

        public Criteria andSqqIsNotNull() {
            addCriterion("sQQ is not null");
            return (Criteria) this;
        }

        public Criteria andSqqEqualTo(String value) {
            addCriterion("sQQ =", value, "sqq");
            return (Criteria) this;
        }

        public Criteria andSqqNotEqualTo(String value) {
            addCriterion("sQQ <>", value, "sqq");
            return (Criteria) this;
        }

        public Criteria andSqqGreaterThan(String value) {
            addCriterion("sQQ >", value, "sqq");
            return (Criteria) this;
        }

        public Criteria andSqqGreaterThanOrEqualTo(String value) {
            addCriterion("sQQ >=", value, "sqq");
            return (Criteria) this;
        }

        public Criteria andSqqLessThan(String value) {
            addCriterion("sQQ <", value, "sqq");
            return (Criteria) this;
        }

        public Criteria andSqqLessThanOrEqualTo(String value) {
            addCriterion("sQQ <=", value, "sqq");
            return (Criteria) this;
        }

        public Criteria andSqqLike(String value) {
            addCriterion("sQQ like", value, "sqq");
            return (Criteria) this;
        }

        public Criteria andSqqNotLike(String value) {
            addCriterion("sQQ not like", value, "sqq");
            return (Criteria) this;
        }

        public Criteria andSqqIn(List<String> values) {
            addCriterion("sQQ in", values, "sqq");
            return (Criteria) this;
        }

        public Criteria andSqqNotIn(List<String> values) {
            addCriterion("sQQ not in", values, "sqq");
            return (Criteria) this;
        }

        public Criteria andSqqBetween(String value1, String value2) {
            addCriterion("sQQ between", value1, value2, "sqq");
            return (Criteria) this;
        }

        public Criteria andSqqNotBetween(String value1, String value2) {
            addCriterion("sQQ not between", value1, value2, "sqq");
            return (Criteria) this;
        }

        public Criteria andSmarkIsNull() {
            addCriterion("sMark is null");
            return (Criteria) this;
        }

        public Criteria andSmarkIsNotNull() {
            addCriterion("sMark is not null");
            return (Criteria) this;
        }

        public Criteria andSmarkEqualTo(String value) {
            addCriterion("sMark =", value, "smark");
            return (Criteria) this;
        }

        public Criteria andSmarkNotEqualTo(String value) {
            addCriterion("sMark <>", value, "smark");
            return (Criteria) this;
        }

        public Criteria andSmarkGreaterThan(String value) {
            addCriterion("sMark >", value, "smark");
            return (Criteria) this;
        }

        public Criteria andSmarkGreaterThanOrEqualTo(String value) {
            addCriterion("sMark >=", value, "smark");
            return (Criteria) this;
        }

        public Criteria andSmarkLessThan(String value) {
            addCriterion("sMark <", value, "smark");
            return (Criteria) this;
        }

        public Criteria andSmarkLessThanOrEqualTo(String value) {
            addCriterion("sMark <=", value, "smark");
            return (Criteria) this;
        }

        public Criteria andSmarkLike(String value) {
            addCriterion("sMark like", value, "smark");
            return (Criteria) this;
        }

        public Criteria andSmarkNotLike(String value) {
            addCriterion("sMark not like", value, "smark");
            return (Criteria) this;
        }

        public Criteria andSmarkIn(List<String> values) {
            addCriterion("sMark in", values, "smark");
            return (Criteria) this;
        }

        public Criteria andSmarkNotIn(List<String> values) {
            addCriterion("sMark not in", values, "smark");
            return (Criteria) this;
        }

        public Criteria andSmarkBetween(String value1, String value2) {
            addCriterion("sMark between", value1, value2, "smark");
            return (Criteria) this;
        }

        public Criteria andSmarkNotBetween(String value1, String value2) {
            addCriterion("sMark not between", value1, value2, "smark");
            return (Criteria) this;
        }

        public Criteria andDcreateIsNull() {
            addCriterion("dCreate is null");
            return (Criteria) this;
        }

        public Criteria andDcreateIsNotNull() {
            addCriterion("dCreate is not null");
            return (Criteria) this;
        }

        public Criteria andDcreateEqualTo(Date value) {
            addCriterion("dCreate =", value, "dcreate");
            return (Criteria) this;
        }

        public Criteria andDcreateNotEqualTo(Date value) {
            addCriterion("dCreate <>", value, "dcreate");
            return (Criteria) this;
        }

        public Criteria andDcreateGreaterThan(Date value) {
            addCriterion("dCreate >", value, "dcreate");
            return (Criteria) this;
        }

        public Criteria andDcreateGreaterThanOrEqualTo(Date value) {
            addCriterion("dCreate >=", value, "dcreate");
            return (Criteria) this;
        }

        public Criteria andDcreateLessThan(Date value) {
            addCriterion("dCreate <", value, "dcreate");
            return (Criteria) this;
        }

        public Criteria andDcreateLessThanOrEqualTo(Date value) {
            addCriterion("dCreate <=", value, "dcreate");
            return (Criteria) this;
        }

        public Criteria andDcreateIn(List<Date> values) {
            addCriterion("dCreate in", values, "dcreate");
            return (Criteria) this;
        }

        public Criteria andDcreateNotIn(List<Date> values) {
            addCriterion("dCreate not in", values, "dcreate");
            return (Criteria) this;
        }

        public Criteria andDcreateBetween(Date value1, Date value2) {
            addCriterion("dCreate between", value1, value2, "dcreate");
            return (Criteria) this;
        }

        public Criteria andDcreateNotBetween(Date value1, Date value2) {
            addCriterion("dCreate not between", value1, value2, "dcreate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table students
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table students
     *
     * @mbggenerated
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