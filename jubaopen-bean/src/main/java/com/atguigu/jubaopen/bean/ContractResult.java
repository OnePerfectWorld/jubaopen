package com.atguigu.jubaopen.bean;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

public class ContractResult implements Serializable {

    private String borrowerId;//借款人ID
    private String loanContractNum;//合同编号
    private String contractType;//合同状态
    private String clientName;//客户姓名
    private String identityType;//证件类型
    private String identityNum;//证件号
    private String creditType;//'贷款形式,//贷款品种
    private String businessType;//业务模式
    private String trustInstitution;//信托机构
    private String trustProducts;//信托产品系列
    private String trustPlan;//信托计划
    private String city;//城市地区
    private String deptName;//营业部名称
    private String isExpedited;//是否加急
    private Integer signType;//签约方式
    private Timestamp signDate;//合同签订时间
    private String typeContractChange;//合同变更类型
    private Integer amountContractChange;//合同变更金额
    private Integer loanInstalments;//分期数
    private String isRecycleLoad;//是否循环贷
    private Integer recycleLoanCnt;//循环贷次数
    private Date startDate;//首期还款日
    private Date endDate;//末期还款日
    private String settleDate;//'合同结清日期
    private Integer loanAmount;//贷款金额
    private String repayAccountBankName;//'还款账户开户行名称',//还款银行
    private String repayAccount;//'还款账户',
    private Integer preFee;//'前期费用',
    private String loanType;//放款模式
    private String loanTime;//放款时间
    private Integer putAmount;//'放款金额',


    public String getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(String borrowerId) {
        this.borrowerId = borrowerId;
    }

    public String getTrustInstitution() {
        return trustInstitution;
    }

    public void setTrustInstitution(String trustInstitution) {
        this.trustInstitution = trustInstitution;
    }

    public String getTrustProducts() {
        return trustProducts;
    }

    public void setTrustProducts(String trustProducts) {
        this.trustProducts = trustProducts;
    }

    public String getTrustPlan() {
        return trustPlan;
    }

    public void setTrustPlan(String trustPlan) {
        this.trustPlan = trustPlan;
    }

    public String getTypeContractChange() {
        return typeContractChange;
    }

    public void setTypeContractChange(String typeContractChange) {
        this.typeContractChange = typeContractChange;
    }

    public Integer getAmountContractChange() {
        return amountContractChange;
    }

    public void setAmountContractChange(Integer amountContractChange) {
        this.amountContractChange = amountContractChange;
    }

    public String getLoanTime() {
        return loanTime;
    }

    public void setLoanTime(String loanTime) {
        this.loanTime = loanTime;
    }

    public String getLoanContractNum() {
        return loanContractNum;
    }

    public void setLoanContractNum(String loanContractNum) {
        this.loanContractNum = loanContractNum;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getIdentityType() {
        return identityType;
    }

    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }

    public String getIdentityNum() {
        return identityNum;
    }

    public void setIdentityNum(String identityNum) {
        this.identityNum = identityNum;
    }

    public String getCreditType() {
        return creditType;
    }

    public void setCreditType(String creditType) {
        this.creditType = creditType;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getIsExpedited() {
        return isExpedited;
    }

    public void setIsExpedited(String isExpedited) {
        this.isExpedited = isExpedited;
    }

    public Integer getSignType() {
        return signType;
    }

    public void setSignType(Integer signType) {
        this.signType = signType;
    }

    public Timestamp getSignDate() {
        return signDate;
    }

    public void setSignDate(Timestamp signDate) {
        this.signDate = signDate;
    }

    public Integer getLoanInstalments() {
        return loanInstalments;
    }

    public void setLoanInstalments(Integer loanInstalments) {
        this.loanInstalments = loanInstalments;
    }

    public String getIsRecycleLoad() {
        return isRecycleLoad;
    }

    public void setIsRecycleLoad(String isRecycleLoad) {
        this.isRecycleLoad = isRecycleLoad;
    }

    public Integer getRecycleLoanCnt() {
        return recycleLoanCnt;
    }

    public void setRecycleLoanCnt(Integer recycleLoanCnt) {
        this.recycleLoanCnt = recycleLoanCnt;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(String settleDate) {
        this.settleDate = settleDate;
    }

    public Integer getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Integer loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getRepayAccountBankName() {
        return repayAccountBankName;
    }

    public void setRepayAccountBankName(String repayAccountBankName) {
        this.repayAccountBankName = repayAccountBankName;
    }

    public String getRepayAccount() {
        return repayAccount;
    }

    public void setRepayAccount(String repayAccount) {
        this.repayAccount = repayAccount;
    }

    public Integer getPreFee() {
        return preFee;
    }

    public void setPreFee(Integer preFee) {
        this.preFee = preFee;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public Integer getPutAmount() {
        return putAmount;
    }

    public void setPutAmount(Integer putAmount) {
        this.putAmount = putAmount;
    }

}
