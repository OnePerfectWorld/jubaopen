package com.atguigu.jubaopen.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "NPLM_repayment_plan", schema = "jubaopen", catalog = "")
public class NplmRepaymentPlan implements Serializable{
    private int id;
    private Integer loanContractNum;
    private Integer instalment;
    private Date preRepaymentDate;
    private Date repaymentDate;
    private Integer capital;
    private Integer interest;
    private Integer installmentFee;
    private Integer amerce;
    private Integer forfeit;
    private Integer penalty;
    private Integer changeFee;
    private Integer otherFee;
    private Integer repaymentAmount;
    private Integer indeedCapital;
    private Integer indeedInterest;
    private Integer indeedInstFee;
    private Integer indeedAmerce;
    private Integer indeedForfeit;
    private Integer indeedPenalty;
    private Integer indeedChangeFee;
    private Integer indeedOtherFee;
    private Integer indeedAmount;
    private Integer reduceCapital;
    private Integer reduceInterest;
    private Integer reduceAmerce;
    private Integer reduceForfeit;
    private Integer reduceInstFee;
    private Integer reducePenalty;
    private Integer reducePreFee;
    private Integer reduceOtherFee;
    private Integer remainCapital;
    private Integer npvRemainCapital;
    private Integer allRepaymentAmount;
    private String repaymentState;
    private String remark;
    private String creator;
    private Timestamp createTime;
    private String updater;
    private Timestamp updateTime;
    private String isOperating;
    private String updateType;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "LOAN_CONTRACT_NUM")
    public Integer getLoanContractNum() {
        return loanContractNum;
    }

    public void setLoanContractNum(Integer loanContractNum) {
        this.loanContractNum = loanContractNum;
    }

    @Basic
    @Column(name = "INSTALMENT")
    public Integer getInstalment() {
        return instalment;
    }

    public void setInstalment(Integer instalment) {
        this.instalment = instalment;
    }

    @Basic
    @Column(name = "PRE_REPAYMENT_DATE")
    public Date getPreRepaymentDate() {
        return preRepaymentDate;
    }

    public void setPreRepaymentDate(Date preRepaymentDate) {
        this.preRepaymentDate = preRepaymentDate;
    }

    @Basic
    @Column(name = "REPAYMENT_DATE")
    public Date getRepaymentDate() {
        return repaymentDate;
    }

    public void setRepaymentDate(Date repaymentDate) {
        this.repaymentDate = repaymentDate;
    }

    @Basic
    @Column(name = "CAPITAL")
    public Integer getCapital() {
        return capital;
    }

    public void setCapital(Integer capital) {
        this.capital = capital;
    }

    @Basic
    @Column(name = "INTEREST")
    public Integer getInterest() {
        return interest;
    }

    public void setInterest(Integer interest) {
        this.interest = interest;
    }

    @Basic
    @Column(name = "INSTALLMENT_FEE")
    public Integer getInstallmentFee() {
        return installmentFee;
    }

    public void setInstallmentFee(Integer installmentFee) {
        this.installmentFee = installmentFee;
    }

    @Basic
    @Column(name = "AMERCE")
    public Integer getAmerce() {
        return amerce;
    }

    public void setAmerce(Integer amerce) {
        this.amerce = amerce;
    }

    @Basic
    @Column(name = "FORFEIT")
    public Integer getForfeit() {
        return forfeit;
    }

    public void setForfeit(Integer forfeit) {
        this.forfeit = forfeit;
    }

    @Basic
    @Column(name = "PENALTY")
    public Integer getPenalty() {
        return penalty;
    }

    public void setPenalty(Integer penalty) {
        this.penalty = penalty;
    }

    @Basic
    @Column(name = "change_fee")
    public Integer getChangeFee() {
        return changeFee;
    }

    public void setChangeFee(Integer changeFee) {
        this.changeFee = changeFee;
    }

    @Basic
    @Column(name = "OTHER_FEE")
    public Integer getOtherFee() {
        return otherFee;
    }

    public void setOtherFee(Integer otherFee) {
        this.otherFee = otherFee;
    }

    @Basic
    @Column(name = "REPAYMENT_AMOUNT")
    public Integer getRepaymentAmount() {
        return repaymentAmount;
    }

    public void setRepaymentAmount(Integer repaymentAmount) {
        this.repaymentAmount = repaymentAmount;
    }

    @Basic
    @Column(name = "INDEED_CAPITAL")
    public Integer getIndeedCapital() {
        return indeedCapital;
    }

    public void setIndeedCapital(Integer indeedCapital) {
        this.indeedCapital = indeedCapital;
    }

    @Basic
    @Column(name = "INDEED_INTEREST")
    public Integer getIndeedInterest() {
        return indeedInterest;
    }

    public void setIndeedInterest(Integer indeedInterest) {
        this.indeedInterest = indeedInterest;
    }

    @Basic
    @Column(name = "INDEED_INST_FEE")
    public Integer getIndeedInstFee() {
        return indeedInstFee;
    }

    public void setIndeedInstFee(Integer indeedInstFee) {
        this.indeedInstFee = indeedInstFee;
    }

    @Basic
    @Column(name = "INDEED_AMERCE")
    public Integer getIndeedAmerce() {
        return indeedAmerce;
    }

    public void setIndeedAmerce(Integer indeedAmerce) {
        this.indeedAmerce = indeedAmerce;
    }

    @Basic
    @Column(name = "INDEED_FORFEIT")
    public Integer getIndeedForfeit() {
        return indeedForfeit;
    }

    public void setIndeedForfeit(Integer indeedForfeit) {
        this.indeedForfeit = indeedForfeit;
    }

    @Basic
    @Column(name = "indeed_penalty")
    public Integer getIndeedPenalty() {
        return indeedPenalty;
    }

    public void setIndeedPenalty(Integer indeedPenalty) {
        this.indeedPenalty = indeedPenalty;
    }

    @Basic
    @Column(name = "indeed_change_fee")
    public Integer getIndeedChangeFee() {
        return indeedChangeFee;
    }

    public void setIndeedChangeFee(Integer indeedChangeFee) {
        this.indeedChangeFee = indeedChangeFee;
    }

    @Basic
    @Column(name = "indeed_OTHER_FEE")
    public Integer getIndeedOtherFee() {
        return indeedOtherFee;
    }

    public void setIndeedOtherFee(Integer indeedOtherFee) {
        this.indeedOtherFee = indeedOtherFee;
    }

    @Basic
    @Column(name = "INDEED_AMOUNT")
    public Integer getIndeedAmount() {
        return indeedAmount;
    }

    public void setIndeedAmount(Integer indeedAmount) {
        this.indeedAmount = indeedAmount;
    }

    @Basic
    @Column(name = "reduce_CAPITAL")
    public Integer getReduceCapital() {
        return reduceCapital;
    }

    public void setReduceCapital(Integer reduceCapital) {
        this.reduceCapital = reduceCapital;
    }

    @Basic
    @Column(name = "reduce_INTEREST")
    public Integer getReduceInterest() {
        return reduceInterest;
    }

    public void setReduceInterest(Integer reduceInterest) {
        this.reduceInterest = reduceInterest;
    }

    @Basic
    @Column(name = "reduce_AMERCE")
    public Integer getReduceAmerce() {
        return reduceAmerce;
    }

    public void setReduceAmerce(Integer reduceAmerce) {
        this.reduceAmerce = reduceAmerce;
    }

    @Basic
    @Column(name = "reduce_FORFEIT")
    public Integer getReduceForfeit() {
        return reduceForfeit;
    }

    public void setReduceForfeit(Integer reduceForfeit) {
        this.reduceForfeit = reduceForfeit;
    }

    @Basic
    @Column(name = "reduce_INST_FEE")
    public Integer getReduceInstFee() {
        return reduceInstFee;
    }

    public void setReduceInstFee(Integer reduceInstFee) {
        this.reduceInstFee = reduceInstFee;
    }

    @Basic
    @Column(name = "reduce_penalty")
    public Integer getReducePenalty() {
        return reducePenalty;
    }

    public void setReducePenalty(Integer reducePenalty) {
        this.reducePenalty = reducePenalty;
    }

    @Basic
    @Column(name = "reduce_PRE_FEE")
    public Integer getReducePreFee() {
        return reducePreFee;
    }

    public void setReducePreFee(Integer reducePreFee) {
        this.reducePreFee = reducePreFee;
    }

    @Basic
    @Column(name = "reduce_OTHER_FEE")
    public Integer getReduceOtherFee() {
        return reduceOtherFee;
    }

    public void setReduceOtherFee(Integer reduceOtherFee) {
        this.reduceOtherFee = reduceOtherFee;
    }

    @Basic
    @Column(name = "REMAIN_CAPITAL")
    public Integer getRemainCapital() {
        return remainCapital;
    }

    public void setRemainCapital(Integer remainCapital) {
        this.remainCapital = remainCapital;
    }

    @Basic
    @Column(name = "NPV_remain_capital")
    public Integer getNpvRemainCapital() {
        return npvRemainCapital;
    }

    public void setNpvRemainCapital(Integer npvRemainCapital) {
        this.npvRemainCapital = npvRemainCapital;
    }

    @Basic
    @Column(name = "ALL_REPAYMENT_AMOUNT")
    public Integer getAllRepaymentAmount() {
        return allRepaymentAmount;
    }

    public void setAllRepaymentAmount(Integer allRepaymentAmount) {
        this.allRepaymentAmount = allRepaymentAmount;
    }

    @Basic
    @Column(name = "REPAYMENT_STATE")
    public String getRepaymentState() {
        return repaymentState;
    }

    public void setRepaymentState(String repaymentState) {
        this.repaymentState = repaymentState;
    }

    @Basic
    @Column(name = "REMARK")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "CREATOR")
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    @Basic
    @Column(name = "CREATE_TIME")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "UPDATER")
    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    @Basic
    @Column(name = "UPDATE_TIME")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "IS_OPERATING")
    public String getIsOperating() {
        return isOperating;
    }

    public void setIsOperating(String isOperating) {
        this.isOperating = isOperating;
    }

    @Basic
    @Column(name = "UPDATE_TYPE")
    public String getUpdateType() {
        return updateType;
    }

    public void setUpdateType(String updateType) {
        this.updateType = updateType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NplmRepaymentPlan that = (NplmRepaymentPlan) o;

        if (id != that.id) return false;
        if (loanContractNum != null ? !loanContractNum.equals(that.loanContractNum) : that.loanContractNum != null)
            return false;
        if (instalment != null ? !instalment.equals(that.instalment) : that.instalment != null) return false;
        if (preRepaymentDate != null ? !preRepaymentDate.equals(that.preRepaymentDate) : that.preRepaymentDate != null)
            return false;
        if (repaymentDate != null ? !repaymentDate.equals(that.repaymentDate) : that.repaymentDate != null)
            return false;
        if (capital != null ? !capital.equals(that.capital) : that.capital != null) return false;
        if (interest != null ? !interest.equals(that.interest) : that.interest != null) return false;
        if (installmentFee != null ? !installmentFee.equals(that.installmentFee) : that.installmentFee != null)
            return false;
        if (amerce != null ? !amerce.equals(that.amerce) : that.amerce != null) return false;
        if (forfeit != null ? !forfeit.equals(that.forfeit) : that.forfeit != null) return false;
        if (penalty != null ? !penalty.equals(that.penalty) : that.penalty != null) return false;
        if (changeFee != null ? !changeFee.equals(that.changeFee) : that.changeFee != null) return false;
        if (otherFee != null ? !otherFee.equals(that.otherFee) : that.otherFee != null) return false;
        if (repaymentAmount != null ? !repaymentAmount.equals(that.repaymentAmount) : that.repaymentAmount != null)
            return false;
        if (indeedCapital != null ? !indeedCapital.equals(that.indeedCapital) : that.indeedCapital != null)
            return false;
        if (indeedInterest != null ? !indeedInterest.equals(that.indeedInterest) : that.indeedInterest != null)
            return false;
        if (indeedInstFee != null ? !indeedInstFee.equals(that.indeedInstFee) : that.indeedInstFee != null)
            return false;
        if (indeedAmerce != null ? !indeedAmerce.equals(that.indeedAmerce) : that.indeedAmerce != null) return false;
        if (indeedForfeit != null ? !indeedForfeit.equals(that.indeedForfeit) : that.indeedForfeit != null)
            return false;
        if (indeedPenalty != null ? !indeedPenalty.equals(that.indeedPenalty) : that.indeedPenalty != null)
            return false;
        if (indeedChangeFee != null ? !indeedChangeFee.equals(that.indeedChangeFee) : that.indeedChangeFee != null)
            return false;
        if (indeedOtherFee != null ? !indeedOtherFee.equals(that.indeedOtherFee) : that.indeedOtherFee != null)
            return false;
        if (indeedAmount != null ? !indeedAmount.equals(that.indeedAmount) : that.indeedAmount != null) return false;
        if (reduceCapital != null ? !reduceCapital.equals(that.reduceCapital) : that.reduceCapital != null)
            return false;
        if (reduceInterest != null ? !reduceInterest.equals(that.reduceInterest) : that.reduceInterest != null)
            return false;
        if (reduceAmerce != null ? !reduceAmerce.equals(that.reduceAmerce) : that.reduceAmerce != null) return false;
        if (reduceForfeit != null ? !reduceForfeit.equals(that.reduceForfeit) : that.reduceForfeit != null)
            return false;
        if (reduceInstFee != null ? !reduceInstFee.equals(that.reduceInstFee) : that.reduceInstFee != null)
            return false;
        if (reducePenalty != null ? !reducePenalty.equals(that.reducePenalty) : that.reducePenalty != null)
            return false;
        if (reducePreFee != null ? !reducePreFee.equals(that.reducePreFee) : that.reducePreFee != null) return false;
        if (reduceOtherFee != null ? !reduceOtherFee.equals(that.reduceOtherFee) : that.reduceOtherFee != null)
            return false;
        if (remainCapital != null ? !remainCapital.equals(that.remainCapital) : that.remainCapital != null)
            return false;
        if (npvRemainCapital != null ? !npvRemainCapital.equals(that.npvRemainCapital) : that.npvRemainCapital != null)
            return false;
        if (allRepaymentAmount != null ? !allRepaymentAmount.equals(that.allRepaymentAmount) : that.allRepaymentAmount != null)
            return false;
        if (repaymentState != null ? !repaymentState.equals(that.repaymentState) : that.repaymentState != null)
            return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (creator != null ? !creator.equals(that.creator) : that.creator != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updater != null ? !updater.equals(that.updater) : that.updater != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (isOperating != null ? !isOperating.equals(that.isOperating) : that.isOperating != null) return false;
        if (updateType != null ? !updateType.equals(that.updateType) : that.updateType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (loanContractNum != null ? loanContractNum.hashCode() : 0);
        result = 31 * result + (instalment != null ? instalment.hashCode() : 0);
        result = 31 * result + (preRepaymentDate != null ? preRepaymentDate.hashCode() : 0);
        result = 31 * result + (repaymentDate != null ? repaymentDate.hashCode() : 0);
        result = 31 * result + (capital != null ? capital.hashCode() : 0);
        result = 31 * result + (interest != null ? interest.hashCode() : 0);
        result = 31 * result + (installmentFee != null ? installmentFee.hashCode() : 0);
        result = 31 * result + (amerce != null ? amerce.hashCode() : 0);
        result = 31 * result + (forfeit != null ? forfeit.hashCode() : 0);
        result = 31 * result + (penalty != null ? penalty.hashCode() : 0);
        result = 31 * result + (changeFee != null ? changeFee.hashCode() : 0);
        result = 31 * result + (otherFee != null ? otherFee.hashCode() : 0);
        result = 31 * result + (repaymentAmount != null ? repaymentAmount.hashCode() : 0);
        result = 31 * result + (indeedCapital != null ? indeedCapital.hashCode() : 0);
        result = 31 * result + (indeedInterest != null ? indeedInterest.hashCode() : 0);
        result = 31 * result + (indeedInstFee != null ? indeedInstFee.hashCode() : 0);
        result = 31 * result + (indeedAmerce != null ? indeedAmerce.hashCode() : 0);
        result = 31 * result + (indeedForfeit != null ? indeedForfeit.hashCode() : 0);
        result = 31 * result + (indeedPenalty != null ? indeedPenalty.hashCode() : 0);
        result = 31 * result + (indeedChangeFee != null ? indeedChangeFee.hashCode() : 0);
        result = 31 * result + (indeedOtherFee != null ? indeedOtherFee.hashCode() : 0);
        result = 31 * result + (indeedAmount != null ? indeedAmount.hashCode() : 0);
        result = 31 * result + (reduceCapital != null ? reduceCapital.hashCode() : 0);
        result = 31 * result + (reduceInterest != null ? reduceInterest.hashCode() : 0);
        result = 31 * result + (reduceAmerce != null ? reduceAmerce.hashCode() : 0);
        result = 31 * result + (reduceForfeit != null ? reduceForfeit.hashCode() : 0);
        result = 31 * result + (reduceInstFee != null ? reduceInstFee.hashCode() : 0);
        result = 31 * result + (reducePenalty != null ? reducePenalty.hashCode() : 0);
        result = 31 * result + (reducePreFee != null ? reducePreFee.hashCode() : 0);
        result = 31 * result + (reduceOtherFee != null ? reduceOtherFee.hashCode() : 0);
        result = 31 * result + (remainCapital != null ? remainCapital.hashCode() : 0);
        result = 31 * result + (npvRemainCapital != null ? npvRemainCapital.hashCode() : 0);
        result = 31 * result + (allRepaymentAmount != null ? allRepaymentAmount.hashCode() : 0);
        result = 31 * result + (repaymentState != null ? repaymentState.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (creator != null ? creator.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updater != null ? updater.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (isOperating != null ? isOperating.hashCode() : 0);
        result = 31 * result + (updateType != null ? updateType.hashCode() : 0);
        return result;
    }
}
