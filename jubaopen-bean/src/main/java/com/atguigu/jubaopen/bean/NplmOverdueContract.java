package com.atguigu.jubaopen.bean;

import javax.persistence.*;
import javax.sql.rowset.serial.SerialArray;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "NPLM_OVERDUE_CONTRACT", schema = "jubaopen", catalog = "")
public class NplmOverdueContract implements Serializable {
    private String id;
    private String loanContractNum;
    private String overdueStatus;
    private Integer overdueDays;
    private Integer instalmentCnt;
    private Integer allDays;
    private Integer allInstalmentCnt;
    private Integer allNumber;
    private Integer principalInterest;
    private Integer allForfeit;
    private Integer allAmerce;
    private Integer allShould;
    private Integer allIndeed;
    private Integer currentRepay;
    private Integer allRepaymentAmount;
    private String firstDate;
    private String startDate;
    private String serialStartDate;
    private String overdueHistory;
    private String computeDate;
    private String creator;
    private Timestamp createTime;
    private String updater;
    private Timestamp updateTime;
    private String updateType;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "LOAN_CONTRACT_NUM")
    public String getLoanContractNum() {
        return loanContractNum;
    }

    public void setLoanContractNum(String loanContractNum) {
        this.loanContractNum = loanContractNum;
    }

    @Basic
    @Column(name = "OVERDUE_STATUS")
    public String getOverdueStatus() {
        return overdueStatus;
    }

    public void setOverdueStatus(String overdueStatus) {
        this.overdueStatus = overdueStatus;
    }

    @Basic
    @Column(name = "OVERDUE_DAYS")
    public Integer getOverdueDays() {
        return overdueDays;
    }

    public void setOverdueDays(Integer overdueDays) {
        this.overdueDays = overdueDays;
    }

    @Basic
    @Column(name = "INSTALMENT_CNT")
    public Integer getInstalmentCnt() {
        return instalmentCnt;
    }

    public void setInstalmentCnt(Integer instalmentCnt) {
        this.instalmentCnt = instalmentCnt;
    }

    @Basic
    @Column(name = "ALL_DAYS")
    public Integer getAllDays() {
        return allDays;
    }

    public void setAllDays(Integer allDays) {
        this.allDays = allDays;
    }

    @Basic
    @Column(name = "ALL_INSTALMENT_CNT")
    public Integer getAllInstalmentCnt() {
        return allInstalmentCnt;
    }

    public void setAllInstalmentCnt(Integer allInstalmentCnt) {
        this.allInstalmentCnt = allInstalmentCnt;
    }

    @Basic
    @Column(name = "ALL_NUMBER")
    public Integer getAllNumber() {
        return allNumber;
    }

    public void setAllNumber(Integer allNumber) {
        this.allNumber = allNumber;
    }

    @Basic
    @Column(name = "PRINCIPAL_INTEREST")
    public Integer getPrincipalInterest() {
        return principalInterest;
    }

    public void setPrincipalInterest(Integer principalInterest) {
        this.principalInterest = principalInterest;
    }

    @Basic
    @Column(name = "ALL_FORFEIT")
    public Integer getAllForfeit() {
        return allForfeit;
    }

    public void setAllForfeit(Integer allForfeit) {
        this.allForfeit = allForfeit;
    }

    @Basic
    @Column(name = "ALL_AMERCE")
    public Integer getAllAmerce() {
        return allAmerce;
    }

    public void setAllAmerce(Integer allAmerce) {
        this.allAmerce = allAmerce;
    }

    @Basic
    @Column(name = "ALL_SHOULD")
    public Integer getAllShould() {
        return allShould;
    }

    public void setAllShould(Integer allShould) {
        this.allShould = allShould;
    }

    @Basic
    @Column(name = "ALL_INDEED")
    public Integer getAllIndeed() {
        return allIndeed;
    }

    public void setAllIndeed(Integer allIndeed) {
        this.allIndeed = allIndeed;
    }

    @Basic
    @Column(name = "CURRENT_REPAY")
    public Integer getCurrentRepay() {
        return currentRepay;
    }

    public void setCurrentRepay(Integer currentRepay) {
        this.currentRepay = currentRepay;
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
    @Column(name = "FIRST_DATE")
    public String getFirstDate() {
        return firstDate;
    }

    public void setFirstDate(String firstDate) {
        this.firstDate = firstDate;
    }

    @Basic
    @Column(name = "START_DATE")
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "SERIAL_START_DATE")
    public String getSerialStartDate() {
        return serialStartDate;
    }

    public void setSerialStartDate(String serialStartDate) {
        this.serialStartDate = serialStartDate;
    }

    @Basic
    @Column(name = "OVERDUE_HISTORY")
    public String getOverdueHistory() {
        return overdueHistory;
    }

    public void setOverdueHistory(String overdueHistory) {
        this.overdueHistory = overdueHistory;
    }

    @Basic
    @Column(name = "COMPUTE_DATE")
    public String getComputeDate() {
        return computeDate;
    }

    public void setComputeDate(String computeDate) {
        this.computeDate = computeDate;
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

        NplmOverdueContract that = (NplmOverdueContract) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (loanContractNum != null ? !loanContractNum.equals(that.loanContractNum) : that.loanContractNum != null)
            return false;
        if (overdueStatus != null ? !overdueStatus.equals(that.overdueStatus) : that.overdueStatus != null)
            return false;
        if (overdueDays != null ? !overdueDays.equals(that.overdueDays) : that.overdueDays != null) return false;
        if (instalmentCnt != null ? !instalmentCnt.equals(that.instalmentCnt) : that.instalmentCnt != null)
            return false;
        if (allDays != null ? !allDays.equals(that.allDays) : that.allDays != null) return false;
        if (allInstalmentCnt != null ? !allInstalmentCnt.equals(that.allInstalmentCnt) : that.allInstalmentCnt != null)
            return false;
        if (allNumber != null ? !allNumber.equals(that.allNumber) : that.allNumber != null) return false;
        if (principalInterest != null ? !principalInterest.equals(that.principalInterest) : that.principalInterest != null)
            return false;
        if (allForfeit != null ? !allForfeit.equals(that.allForfeit) : that.allForfeit != null) return false;
        if (allAmerce != null ? !allAmerce.equals(that.allAmerce) : that.allAmerce != null) return false;
        if (allShould != null ? !allShould.equals(that.allShould) : that.allShould != null) return false;
        if (allIndeed != null ? !allIndeed.equals(that.allIndeed) : that.allIndeed != null) return false;
        if (currentRepay != null ? !currentRepay.equals(that.currentRepay) : that.currentRepay != null) return false;
        if (allRepaymentAmount != null ? !allRepaymentAmount.equals(that.allRepaymentAmount) : that.allRepaymentAmount != null)
            return false;
        if (firstDate != null ? !firstDate.equals(that.firstDate) : that.firstDate != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (serialStartDate != null ? !serialStartDate.equals(that.serialStartDate) : that.serialStartDate != null)
            return false;
        if (overdueHistory != null ? !overdueHistory.equals(that.overdueHistory) : that.overdueHistory != null)
            return false;
        if (computeDate != null ? !computeDate.equals(that.computeDate) : that.computeDate != null) return false;
        if (creator != null ? !creator.equals(that.creator) : that.creator != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updater != null ? !updater.equals(that.updater) : that.updater != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (updateType != null ? !updateType.equals(that.updateType) : that.updateType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (loanContractNum != null ? loanContractNum.hashCode() : 0);
        result = 31 * result + (overdueStatus != null ? overdueStatus.hashCode() : 0);
        result = 31 * result + (overdueDays != null ? overdueDays.hashCode() : 0);
        result = 31 * result + (instalmentCnt != null ? instalmentCnt.hashCode() : 0);
        result = 31 * result + (allDays != null ? allDays.hashCode() : 0);
        result = 31 * result + (allInstalmentCnt != null ? allInstalmentCnt.hashCode() : 0);
        result = 31 * result + (allNumber != null ? allNumber.hashCode() : 0);
        result = 31 * result + (principalInterest != null ? principalInterest.hashCode() : 0);
        result = 31 * result + (allForfeit != null ? allForfeit.hashCode() : 0);
        result = 31 * result + (allAmerce != null ? allAmerce.hashCode() : 0);
        result = 31 * result + (allShould != null ? allShould.hashCode() : 0);
        result = 31 * result + (allIndeed != null ? allIndeed.hashCode() : 0);
        result = 31 * result + (currentRepay != null ? currentRepay.hashCode() : 0);
        result = 31 * result + (allRepaymentAmount != null ? allRepaymentAmount.hashCode() : 0);
        result = 31 * result + (firstDate != null ? firstDate.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (serialStartDate != null ? serialStartDate.hashCode() : 0);
        result = 31 * result + (overdueHistory != null ? overdueHistory.hashCode() : 0);
        result = 31 * result + (computeDate != null ? computeDate.hashCode() : 0);
        result = 31 * result + (creator != null ? creator.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updater != null ? updater.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (updateType != null ? updateType.hashCode() : 0);
        return result;
    }
}
