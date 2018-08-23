package com.atguigu.jubaopen.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "NPLM_repayment_record", schema = "jubaopen", catalog = "")
public class NplmRepaymentRecord implements Serializable {
    private int id;
    private Integer businessRequestId;
    private Integer loanContractNum;
    private Date repaymentDate;
    private Integer overdueDays;
    private Integer overdueAmount;
    private Integer repaymentAmount;
    private Integer successAmount;
    private String status;
    private String remark;
    private String specialCode;
    private Integer sort;
    private String dataCreateType;
    private Timestamp reserveTime;
    private String creator;
    private Timestamp createTime;
    private String updater;
    private Timestamp updateTime;
    private String accountName;
    private String acctIdenType;
    private String acctIdenNum;
    private String accountNo;
    private String accountType;
    private String accountBankid;
    private String accountBranchNo;
    private String accountBankName;
    private String publicPrivate;
    private String actProvince;
    private String accountCity;
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
    @Column(name = "BUSINESS_REQUEST_ID")
    public Integer getBusinessRequestId() {
        return businessRequestId;
    }

    public void setBusinessRequestId(Integer businessRequestId) {
        this.businessRequestId = businessRequestId;
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
    @Column(name = "REPAYMENT_DATE")
    public Date getRepaymentDate() {
        return repaymentDate;
    }

    public void setRepaymentDate(Date repaymentDate) {
        this.repaymentDate = repaymentDate;
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
    @Column(name = "OVERDUE_AMOUNT")
    public Integer getOverdueAmount() {
        return overdueAmount;
    }

    public void setOverdueAmount(Integer overdueAmount) {
        this.overdueAmount = overdueAmount;
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
    @Column(name = "SUCCESS_AMOUNT")
    public Integer getSuccessAmount() {
        return successAmount;
    }

    public void setSuccessAmount(Integer successAmount) {
        this.successAmount = successAmount;
    }

    @Basic
    @Column(name = "STATUS")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
    @Column(name = "SPECIAL_CODE")
    public String getSpecialCode() {
        return specialCode;
    }

    public void setSpecialCode(String specialCode) {
        this.specialCode = specialCode;
    }

    @Basic
    @Column(name = "SORT")
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Basic
    @Column(name = "data_create_type")
    public String getDataCreateType() {
        return dataCreateType;
    }

    public void setDataCreateType(String dataCreateType) {
        this.dataCreateType = dataCreateType;
    }

    @Basic
    @Column(name = "RESERVE_TIME")
    public Timestamp getReserveTime() {
        return reserveTime;
    }

    public void setReserveTime(Timestamp reserveTime) {
        this.reserveTime = reserveTime;
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
    @Column(name = "ACCOUNT_NAME")
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    @Basic
    @Column(name = "ACCT_IDEN_TYPE")
    public String getAcctIdenType() {
        return acctIdenType;
    }

    public void setAcctIdenType(String acctIdenType) {
        this.acctIdenType = acctIdenType;
    }

    @Basic
    @Column(name = "ACCT_IDEN_NUM")
    public String getAcctIdenNum() {
        return acctIdenNum;
    }

    public void setAcctIdenNum(String acctIdenNum) {
        this.acctIdenNum = acctIdenNum;
    }

    @Basic
    @Column(name = "ACCOUNT_NO")
    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    @Basic
    @Column(name = "ACCOUNT_TYPE")
    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @Basic
    @Column(name = "ACCOUNT_BANKID")
    public String getAccountBankid() {
        return accountBankid;
    }

    public void setAccountBankid(String accountBankid) {
        this.accountBankid = accountBankid;
    }

    @Basic
    @Column(name = "ACCOUNT_BRANCH_NO")
    public String getAccountBranchNo() {
        return accountBranchNo;
    }

    public void setAccountBranchNo(String accountBranchNo) {
        this.accountBranchNo = accountBranchNo;
    }

    @Basic
    @Column(name = "ACCOUNT_BANK_NAME")
    public String getAccountBankName() {
        return accountBankName;
    }

    public void setAccountBankName(String accountBankName) {
        this.accountBankName = accountBankName;
    }

    @Basic
    @Column(name = "PUBLIC_PRIVATE")
    public String getPublicPrivate() {
        return publicPrivate;
    }

    public void setPublicPrivate(String publicPrivate) {
        this.publicPrivate = publicPrivate;
    }

    @Basic
    @Column(name = "ACT_PROVINCE")
    public String getActProvince() {
        return actProvince;
    }

    public void setActProvince(String actProvince) {
        this.actProvince = actProvince;
    }

    @Basic
    @Column(name = "ACCOUNT_CITY")
    public String getAccountCity() {
        return accountCity;
    }

    public void setAccountCity(String accountCity) {
        this.accountCity = accountCity;
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

        NplmRepaymentRecord that = (NplmRepaymentRecord) o;

        if (id != that.id) return false;
        if (businessRequestId != null ? !businessRequestId.equals(that.businessRequestId) : that.businessRequestId != null)
            return false;
        if (loanContractNum != null ? !loanContractNum.equals(that.loanContractNum) : that.loanContractNum != null)
            return false;
        if (repaymentDate != null ? !repaymentDate.equals(that.repaymentDate) : that.repaymentDate != null)
            return false;
        if (overdueDays != null ? !overdueDays.equals(that.overdueDays) : that.overdueDays != null) return false;
        if (overdueAmount != null ? !overdueAmount.equals(that.overdueAmount) : that.overdueAmount != null)
            return false;
        if (repaymentAmount != null ? !repaymentAmount.equals(that.repaymentAmount) : that.repaymentAmount != null)
            return false;
        if (successAmount != null ? !successAmount.equals(that.successAmount) : that.successAmount != null)
            return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (specialCode != null ? !specialCode.equals(that.specialCode) : that.specialCode != null) return false;
        if (sort != null ? !sort.equals(that.sort) : that.sort != null) return false;
        if (dataCreateType != null ? !dataCreateType.equals(that.dataCreateType) : that.dataCreateType != null)
            return false;
        if (reserveTime != null ? !reserveTime.equals(that.reserveTime) : that.reserveTime != null) return false;
        if (creator != null ? !creator.equals(that.creator) : that.creator != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updater != null ? !updater.equals(that.updater) : that.updater != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (accountName != null ? !accountName.equals(that.accountName) : that.accountName != null) return false;
        if (acctIdenType != null ? !acctIdenType.equals(that.acctIdenType) : that.acctIdenType != null) return false;
        if (acctIdenNum != null ? !acctIdenNum.equals(that.acctIdenNum) : that.acctIdenNum != null) return false;
        if (accountNo != null ? !accountNo.equals(that.accountNo) : that.accountNo != null) return false;
        if (accountType != null ? !accountType.equals(that.accountType) : that.accountType != null) return false;
        if (accountBankid != null ? !accountBankid.equals(that.accountBankid) : that.accountBankid != null)
            return false;
        if (accountBranchNo != null ? !accountBranchNo.equals(that.accountBranchNo) : that.accountBranchNo != null)
            return false;
        if (accountBankName != null ? !accountBankName.equals(that.accountBankName) : that.accountBankName != null)
            return false;
        if (publicPrivate != null ? !publicPrivate.equals(that.publicPrivate) : that.publicPrivate != null)
            return false;
        if (actProvince != null ? !actProvince.equals(that.actProvince) : that.actProvince != null) return false;
        if (accountCity != null ? !accountCity.equals(that.accountCity) : that.accountCity != null) return false;
        if (updateType != null ? !updateType.equals(that.updateType) : that.updateType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (businessRequestId != null ? businessRequestId.hashCode() : 0);
        result = 31 * result + (loanContractNum != null ? loanContractNum.hashCode() : 0);
        result = 31 * result + (repaymentDate != null ? repaymentDate.hashCode() : 0);
        result = 31 * result + (overdueDays != null ? overdueDays.hashCode() : 0);
        result = 31 * result + (overdueAmount != null ? overdueAmount.hashCode() : 0);
        result = 31 * result + (repaymentAmount != null ? repaymentAmount.hashCode() : 0);
        result = 31 * result + (successAmount != null ? successAmount.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (specialCode != null ? specialCode.hashCode() : 0);
        result = 31 * result + (sort != null ? sort.hashCode() : 0);
        result = 31 * result + (dataCreateType != null ? dataCreateType.hashCode() : 0);
        result = 31 * result + (reserveTime != null ? reserveTime.hashCode() : 0);
        result = 31 * result + (creator != null ? creator.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updater != null ? updater.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (accountName != null ? accountName.hashCode() : 0);
        result = 31 * result + (acctIdenType != null ? acctIdenType.hashCode() : 0);
        result = 31 * result + (acctIdenNum != null ? acctIdenNum.hashCode() : 0);
        result = 31 * result + (accountNo != null ? accountNo.hashCode() : 0);
        result = 31 * result + (accountType != null ? accountType.hashCode() : 0);
        result = 31 * result + (accountBankid != null ? accountBankid.hashCode() : 0);
        result = 31 * result + (accountBranchNo != null ? accountBranchNo.hashCode() : 0);
        result = 31 * result + (accountBankName != null ? accountBankName.hashCode() : 0);
        result = 31 * result + (publicPrivate != null ? publicPrivate.hashCode() : 0);
        result = 31 * result + (actProvince != null ? actProvince.hashCode() : 0);
        result = 31 * result + (accountCity != null ? accountCity.hashCode() : 0);
        result = 31 * result + (updateType != null ? updateType.hashCode() : 0);
        return result;
    }
}
