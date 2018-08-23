package com.atguigu.jubaopen.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "nplm_contract_attribute", schema = "jubaopen", catalog = "")
public class NplmContractAttribute implements Serializable{
    private int id;
    private Integer loanContractId;
    private Integer loanContractNum;
    private String businessType;
    private String isExpedited;
    private Timestamp signDate;
    private Integer signType;
    private String approveDate;
    private String firstRepayDate;
    private Integer feeFlag;
    private String interestFlag;
    private Integer interestType;
    private Integer graceDays;
    private Integer irr;
    private Integer lnsRate;
    private String channelCode;
    private String channelName;
    private String loanOfficerId;
    private String cityId;
    private String city;
    private String isModify;
    private String isSchemeModify;
    private Integer recycleWay;
    private String isRecycleLoad;
    private Integer recycleLoanCnt;
    private String oldContractNum;
    private Integer settleAmount;
    private String newContractNum;
    private String isShorten;
    private String isExtend;
    private String isChangeProduce;
    private String isOverdue;
    private String isPayAhead;
    private String isPayPart;
    private String purpose;
    private String purposeSon;
    private String purposeDetail;
    private String isDivAccount;
    private String systemType;
    private String highRisk;
    private String isBuyout;
    private String feeProcessType;
    private String studentCorpName;
    private String settleDate;
    private String habitTime;
    private String repayDay;
    private String applyId;
    private String oldApplyId;
    private String deptId;
    private String deptName;
    private String creator;
    private Timestamp createTime;
    private String updater;
    private Timestamp updateTime;
    private String updateType;
    private Integer frontChargeDiscount;
    private Integer monthMRate;
    private Integer handleChargeRate;
    private Integer loanTimes;
    private String pawn;
    private Integer handleCharge;
    private Integer monthChargeDiscount;
    private Integer guaranteeFee;
    private String guaranteeCompany;
    private String trustInstitution;
    private String trustProducts;
    private String trustPlan;
    private String typeContractChange;
    private Integer amountContractChange;
    private String loanTime;
    private String def7;
    private String def8;
    private String def9;
    private String def10;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "loan_contract_id")
    public Integer getLoanContractId() {
        return loanContractId;
    }

    public void setLoanContractId(Integer loanContractId) {
        this.loanContractId = loanContractId;
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
    @Column(name = "business_type")
    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    @Basic
    @Column(name = "is_expedited")
    public String getIsExpedited() {
        return isExpedited;
    }

    public void setIsExpedited(String isExpedited) {
        this.isExpedited = isExpedited;
    }

    @Basic
    @Column(name = "sign_date")
    public Timestamp getSignDate() {
        return signDate;
    }

    public void setSignDate(Timestamp signDate) {
        this.signDate = signDate;
    }

    @Basic
    @Column(name = "sign_type")
    public Integer getSignType() {
        return signType;
    }

    public void setSignType(Integer signType) {
        this.signType = signType;
    }

    @Basic
    @Column(name = "approve_date")
    public String getApproveDate() {
        return approveDate;
    }

    public void setApproveDate(String approveDate) {
        this.approveDate = approveDate;
    }

    @Basic
    @Column(name = "first_repay_date")
    public String getFirstRepayDate() {
        return firstRepayDate;
    }

    public void setFirstRepayDate(String firstRepayDate) {
        this.firstRepayDate = firstRepayDate;
    }

    @Basic
    @Column(name = "fee_flag")
    public Integer getFeeFlag() {
        return feeFlag;
    }

    public void setFeeFlag(Integer feeFlag) {
        this.feeFlag = feeFlag;
    }

    @Basic
    @Column(name = "interest_flag")
    public String getInterestFlag() {
        return interestFlag;
    }

    public void setInterestFlag(String interestFlag) {
        this.interestFlag = interestFlag;
    }

    @Basic
    @Column(name = "interest_type")
    public Integer getInterestType() {
        return interestType;
    }

    public void setInterestType(Integer interestType) {
        this.interestType = interestType;
    }

    @Basic
    @Column(name = "grace_days")
    public Integer getGraceDays() {
        return graceDays;
    }

    public void setGraceDays(Integer graceDays) {
        this.graceDays = graceDays;
    }

    @Basic
    @Column(name = "irr")
    public Integer getIrr() {
        return irr;
    }

    public void setIrr(Integer irr) {
        this.irr = irr;
    }

    @Basic
    @Column(name = "lns_rate")
    public Integer getLnsRate() {
        return lnsRate;
    }

    public void setLnsRate(Integer lnsRate) {
        this.lnsRate = lnsRate;
    }

    @Basic
    @Column(name = "channel_code")
    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    @Basic
    @Column(name = "channel_name")
    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    @Basic
    @Column(name = "loan_officer_id")
    public String getLoanOfficerId() {
        return loanOfficerId;
    }

    public void setLoanOfficerId(String loanOfficerId) {
        this.loanOfficerId = loanOfficerId;
    }

    @Basic
    @Column(name = "cityID")
    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    @Basic
    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "is_modify")
    public String getIsModify() {
        return isModify;
    }

    public void setIsModify(String isModify) {
        this.isModify = isModify;
    }

    @Basic
    @Column(name = "is_scheme_modify")
    public String getIsSchemeModify() {
        return isSchemeModify;
    }

    public void setIsSchemeModify(String isSchemeModify) {
        this.isSchemeModify = isSchemeModify;
    }

    @Basic
    @Column(name = "recycle_way")
    public Integer getRecycleWay() {
        return recycleWay;
    }

    public void setRecycleWay(Integer recycleWay) {
        this.recycleWay = recycleWay;
    }

    @Basic
    @Column(name = "is_recycle_load")
    public String getIsRecycleLoad() {
        return isRecycleLoad;
    }

    public void setIsRecycleLoad(String isRecycleLoad) {
        this.isRecycleLoad = isRecycleLoad;
    }

    @Basic
    @Column(name = "recycle_loan_cnt")
    public Integer getRecycleLoanCnt() {
        return recycleLoanCnt;
    }

    public void setRecycleLoanCnt(Integer recycleLoanCnt) {
        this.recycleLoanCnt = recycleLoanCnt;
    }

    @Basic
    @Column(name = "old_contract_num")
    public String getOldContractNum() {
        return oldContractNum;
    }

    public void setOldContractNum(String oldContractNum) {
        this.oldContractNum = oldContractNum;
    }

    @Basic
    @Column(name = "settle_amount")
    public Integer getSettleAmount() {
        return settleAmount;
    }

    public void setSettleAmount(Integer settleAmount) {
        this.settleAmount = settleAmount;
    }

    @Basic
    @Column(name = "new_contract_num")
    public String getNewContractNum() {
        return newContractNum;
    }

    public void setNewContractNum(String newContractNum) {
        this.newContractNum = newContractNum;
    }

    @Basic
    @Column(name = "is_shorten")
    public String getIsShorten() {
        return isShorten;
    }

    public void setIsShorten(String isShorten) {
        this.isShorten = isShorten;
    }

    @Basic
    @Column(name = "is_extend")
    public String getIsExtend() {
        return isExtend;
    }

    public void setIsExtend(String isExtend) {
        this.isExtend = isExtend;
    }

    @Basic
    @Column(name = "is_change_produce")
    public String getIsChangeProduce() {
        return isChangeProduce;
    }

    public void setIsChangeProduce(String isChangeProduce) {
        this.isChangeProduce = isChangeProduce;
    }

    @Basic
    @Column(name = "is_overdue")
    public String getIsOverdue() {
        return isOverdue;
    }

    public void setIsOverdue(String isOverdue) {
        this.isOverdue = isOverdue;
    }

    @Basic
    @Column(name = "is_pay_ahead")
    public String getIsPayAhead() {
        return isPayAhead;
    }

    public void setIsPayAhead(String isPayAhead) {
        this.isPayAhead = isPayAhead;
    }

    @Basic
    @Column(name = "is_pay_part")
    public String getIsPayPart() {
        return isPayPart;
    }

    public void setIsPayPart(String isPayPart) {
        this.isPayPart = isPayPart;
    }

    @Basic
    @Column(name = "purpose")
    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Basic
    @Column(name = "purpose_son")
    public String getPurposeSon() {
        return purposeSon;
    }

    public void setPurposeSon(String purposeSon) {
        this.purposeSon = purposeSon;
    }

    @Basic
    @Column(name = "purpose_detail")
    public String getPurposeDetail() {
        return purposeDetail;
    }

    public void setPurposeDetail(String purposeDetail) {
        this.purposeDetail = purposeDetail;
    }

    @Basic
    @Column(name = "is_div_account")
    public String getIsDivAccount() {
        return isDivAccount;
    }

    public void setIsDivAccount(String isDivAccount) {
        this.isDivAccount = isDivAccount;
    }

    @Basic
    @Column(name = "system_type")
    public String getSystemType() {
        return systemType;
    }

    public void setSystemType(String systemType) {
        this.systemType = systemType;
    }

    @Basic
    @Column(name = "high_risk")
    public String getHighRisk() {
        return highRisk;
    }

    public void setHighRisk(String highRisk) {
        this.highRisk = highRisk;
    }

    @Basic
    @Column(name = "is_buyout")
    public String getIsBuyout() {
        return isBuyout;
    }

    public void setIsBuyout(String isBuyout) {
        this.isBuyout = isBuyout;
    }

    @Basic
    @Column(name = "fee_process_type")
    public String getFeeProcessType() {
        return feeProcessType;
    }

    public void setFeeProcessType(String feeProcessType) {
        this.feeProcessType = feeProcessType;
    }

    @Basic
    @Column(name = "student_corp_name")
    public String getStudentCorpName() {
        return studentCorpName;
    }

    public void setStudentCorpName(String studentCorpName) {
        this.studentCorpName = studentCorpName;
    }

    @Basic
    @Column(name = "settle_date")
    public String getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(String settleDate) {
        this.settleDate = settleDate;
    }

    @Basic
    @Column(name = "habit_time")
    public String getHabitTime() {
        return habitTime;
    }

    public void setHabitTime(String habitTime) {
        this.habitTime = habitTime;
    }

    @Basic
    @Column(name = "RepayDay")
    public String getRepayDay() {
        return repayDay;
    }

    public void setRepayDay(String repayDay) {
        this.repayDay = repayDay;
    }

    @Basic
    @Column(name = "apply_Id")
    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }

    @Basic
    @Column(name = "old_Apply_Id")
    public String getOldApplyId() {
        return oldApplyId;
    }

    public void setOldApplyId(String oldApplyId) {
        this.oldApplyId = oldApplyId;
    }

    @Basic
    @Column(name = "dept_id")
    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    @Basic
    @Column(name = "dept_name")
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
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

    @Basic
    @Column(name = "FRONT_CHARGE_DISCOUNT")
    public Integer getFrontChargeDiscount() {
        return frontChargeDiscount;
    }

    public void setFrontChargeDiscount(Integer frontChargeDiscount) {
        this.frontChargeDiscount = frontChargeDiscount;
    }

    @Basic
    @Column(name = "MONTH_M_RATE")
    public Integer getMonthMRate() {
        return monthMRate;
    }

    public void setMonthMRate(Integer monthMRate) {
        this.monthMRate = monthMRate;
    }

    @Basic
    @Column(name = "HANDLE_CHARGE_RATE")
    public Integer getHandleChargeRate() {
        return handleChargeRate;
    }

    public void setHandleChargeRate(Integer handleChargeRate) {
        this.handleChargeRate = handleChargeRate;
    }

    @Basic
    @Column(name = "LOAN_TIMES")
    public Integer getLoanTimes() {
        return loanTimes;
    }

    public void setLoanTimes(Integer loanTimes) {
        this.loanTimes = loanTimes;
    }

    @Basic
    @Column(name = "PAWN")
    public String getPawn() {
        return pawn;
    }

    public void setPawn(String pawn) {
        this.pawn = pawn;
    }

    @Basic
    @Column(name = "HANDLE_CHARGE")
    public Integer getHandleCharge() {
        return handleCharge;
    }

    public void setHandleCharge(Integer handleCharge) {
        this.handleCharge = handleCharge;
    }

    @Basic
    @Column(name = "MONTH_CHARGE_DISCOUNT")
    public Integer getMonthChargeDiscount() {
        return monthChargeDiscount;
    }

    public void setMonthChargeDiscount(Integer monthChargeDiscount) {
        this.monthChargeDiscount = monthChargeDiscount;
    }

    @Basic
    @Column(name = "GUARANTEE_FEE")
    public Integer getGuaranteeFee() {
        return guaranteeFee;
    }

    public void setGuaranteeFee(Integer guaranteeFee) {
        this.guaranteeFee = guaranteeFee;
    }

    @Basic
    @Column(name = "GUARANTEE_COMPANY")
    public String getGuaranteeCompany() {
        return guaranteeCompany;
    }

    public void setGuaranteeCompany(String guaranteeCompany) {
        this.guaranteeCompany = guaranteeCompany;
    }

    @Basic
    @Column(name = "Trust_Institution")
    public String getTrustInstitution() {
        return trustInstitution;
    }

    public void setTrustInstitution(String trustInstitution) {
        this.trustInstitution = trustInstitution;
    }

    @Basic
    @Column(name = "Trust_Products")
    public String getTrustProducts() {
        return trustProducts;
    }

    public void setTrustProducts(String trustProducts) {
        this.trustProducts = trustProducts;
    }

    @Basic
    @Column(name = "Trust_Plan")
    public String getTrustPlan() {
        return trustPlan;
    }

    public void setTrustPlan(String trustPlan) {
        this.trustPlan = trustPlan;
    }

    @Basic
    @Column(name = "Type_Contract_Change")
    public String getTypeContractChange() {
        return typeContractChange;
    }

    public void setTypeContractChange(String typeContractChange) {
        this.typeContractChange = typeContractChange;
    }

    @Basic
    @Column(name = "Amount_Contract_Change")
    public Integer getAmountContractChange() {
        return amountContractChange;
    }

    public void setAmountContractChange(Integer amountContractChange) {
        this.amountContractChange = amountContractChange;
    }

    @Basic
    @Column(name = "Loan_Time")
    public String getLoanTime() {
        return loanTime;
    }

    public void setLoanTime(String loanTime) {
        this.loanTime = loanTime;
    }

    @Basic
    @Column(name = "def7")
    public String getDef7() {
        return def7;
    }

    public void setDef7(String def7) {
        this.def7 = def7;
    }

    @Basic
    @Column(name = "def8")
    public String getDef8() {
        return def8;
    }

    public void setDef8(String def8) {
        this.def8 = def8;
    }

    @Basic
    @Column(name = "def9")
    public String getDef9() {
        return def9;
    }

    public void setDef9(String def9) {
        this.def9 = def9;
    }

    @Basic
    @Column(name = "def10")
    public String getDef10() {
        return def10;
    }

    public void setDef10(String def10) {
        this.def10 = def10;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NplmContractAttribute that = (NplmContractAttribute) o;

        if (id != that.id) return false;
        if (loanContractId != null ? !loanContractId.equals(that.loanContractId) : that.loanContractId != null)
            return false;
        if (loanContractNum != null ? !loanContractNum.equals(that.loanContractNum) : that.loanContractNum != null)
            return false;
        if (businessType != null ? !businessType.equals(that.businessType) : that.businessType != null) return false;
        if (isExpedited != null ? !isExpedited.equals(that.isExpedited) : that.isExpedited != null) return false;
        if (signDate != null ? !signDate.equals(that.signDate) : that.signDate != null) return false;
        if (signType != null ? !signType.equals(that.signType) : that.signType != null) return false;
        if (approveDate != null ? !approveDate.equals(that.approveDate) : that.approveDate != null) return false;
        if (firstRepayDate != null ? !firstRepayDate.equals(that.firstRepayDate) : that.firstRepayDate != null)
            return false;
        if (feeFlag != null ? !feeFlag.equals(that.feeFlag) : that.feeFlag != null) return false;
        if (interestFlag != null ? !interestFlag.equals(that.interestFlag) : that.interestFlag != null) return false;
        if (interestType != null ? !interestType.equals(that.interestType) : that.interestType != null) return false;
        if (graceDays != null ? !graceDays.equals(that.graceDays) : that.graceDays != null) return false;
        if (irr != null ? !irr.equals(that.irr) : that.irr != null) return false;
        if (lnsRate != null ? !lnsRate.equals(that.lnsRate) : that.lnsRate != null) return false;
        if (channelCode != null ? !channelCode.equals(that.channelCode) : that.channelCode != null) return false;
        if (channelName != null ? !channelName.equals(that.channelName) : that.channelName != null) return false;
        if (loanOfficerId != null ? !loanOfficerId.equals(that.loanOfficerId) : that.loanOfficerId != null)
            return false;
        if (cityId != null ? !cityId.equals(that.cityId) : that.cityId != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (isModify != null ? !isModify.equals(that.isModify) : that.isModify != null) return false;
        if (isSchemeModify != null ? !isSchemeModify.equals(that.isSchemeModify) : that.isSchemeModify != null)
            return false;
        if (recycleWay != null ? !recycleWay.equals(that.recycleWay) : that.recycleWay != null) return false;
        if (isRecycleLoad != null ? !isRecycleLoad.equals(that.isRecycleLoad) : that.isRecycleLoad != null)
            return false;
        if (recycleLoanCnt != null ? !recycleLoanCnt.equals(that.recycleLoanCnt) : that.recycleLoanCnt != null)
            return false;
        if (oldContractNum != null ? !oldContractNum.equals(that.oldContractNum) : that.oldContractNum != null)
            return false;
        if (settleAmount != null ? !settleAmount.equals(that.settleAmount) : that.settleAmount != null) return false;
        if (newContractNum != null ? !newContractNum.equals(that.newContractNum) : that.newContractNum != null)
            return false;
        if (isShorten != null ? !isShorten.equals(that.isShorten) : that.isShorten != null) return false;
        if (isExtend != null ? !isExtend.equals(that.isExtend) : that.isExtend != null) return false;
        if (isChangeProduce != null ? !isChangeProduce.equals(that.isChangeProduce) : that.isChangeProduce != null)
            return false;
        if (isOverdue != null ? !isOverdue.equals(that.isOverdue) : that.isOverdue != null) return false;
        if (isPayAhead != null ? !isPayAhead.equals(that.isPayAhead) : that.isPayAhead != null) return false;
        if (isPayPart != null ? !isPayPart.equals(that.isPayPart) : that.isPayPart != null) return false;
        if (purpose != null ? !purpose.equals(that.purpose) : that.purpose != null) return false;
        if (purposeSon != null ? !purposeSon.equals(that.purposeSon) : that.purposeSon != null) return false;
        if (purposeDetail != null ? !purposeDetail.equals(that.purposeDetail) : that.purposeDetail != null)
            return false;
        if (isDivAccount != null ? !isDivAccount.equals(that.isDivAccount) : that.isDivAccount != null) return false;
        if (systemType != null ? !systemType.equals(that.systemType) : that.systemType != null) return false;
        if (highRisk != null ? !highRisk.equals(that.highRisk) : that.highRisk != null) return false;
        if (isBuyout != null ? !isBuyout.equals(that.isBuyout) : that.isBuyout != null) return false;
        if (feeProcessType != null ? !feeProcessType.equals(that.feeProcessType) : that.feeProcessType != null)
            return false;
        if (studentCorpName != null ? !studentCorpName.equals(that.studentCorpName) : that.studentCorpName != null)
            return false;
        if (settleDate != null ? !settleDate.equals(that.settleDate) : that.settleDate != null) return false;
        if (habitTime != null ? !habitTime.equals(that.habitTime) : that.habitTime != null) return false;
        if (repayDay != null ? !repayDay.equals(that.repayDay) : that.repayDay != null) return false;
        if (applyId != null ? !applyId.equals(that.applyId) : that.applyId != null) return false;
        if (oldApplyId != null ? !oldApplyId.equals(that.oldApplyId) : that.oldApplyId != null) return false;
        if (deptId != null ? !deptId.equals(that.deptId) : that.deptId != null) return false;
        if (deptName != null ? !deptName.equals(that.deptName) : that.deptName != null) return false;
        if (creator != null ? !creator.equals(that.creator) : that.creator != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updater != null ? !updater.equals(that.updater) : that.updater != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (updateType != null ? !updateType.equals(that.updateType) : that.updateType != null) return false;
        if (frontChargeDiscount != null ? !frontChargeDiscount.equals(that.frontChargeDiscount) : that.frontChargeDiscount != null)
            return false;
        if (monthMRate != null ? !monthMRate.equals(that.monthMRate) : that.monthMRate != null) return false;
        if (handleChargeRate != null ? !handleChargeRate.equals(that.handleChargeRate) : that.handleChargeRate != null)
            return false;
        if (loanTimes != null ? !loanTimes.equals(that.loanTimes) : that.loanTimes != null) return false;
        if (pawn != null ? !pawn.equals(that.pawn) : that.pawn != null) return false;
        if (handleCharge != null ? !handleCharge.equals(that.handleCharge) : that.handleCharge != null) return false;
        if (monthChargeDiscount != null ? !monthChargeDiscount.equals(that.monthChargeDiscount) : that.monthChargeDiscount != null)
            return false;
        if (guaranteeFee != null ? !guaranteeFee.equals(that.guaranteeFee) : that.guaranteeFee != null) return false;
        if (guaranteeCompany != null ? !guaranteeCompany.equals(that.guaranteeCompany) : that.guaranteeCompany != null)
            return false;
        if (trustInstitution != null ? !trustInstitution.equals(that.trustInstitution) : that.trustInstitution != null)
            return false;
        if (trustProducts != null ? !trustProducts.equals(that.trustProducts) : that.trustProducts != null)
            return false;
        if (trustPlan != null ? !trustPlan.equals(that.trustPlan) : that.trustPlan != null) return false;
        if (typeContractChange != null ? !typeContractChange.equals(that.typeContractChange) : that.typeContractChange != null)
            return false;
        if (amountContractChange != null ? !amountContractChange.equals(that.amountContractChange) : that.amountContractChange != null)
            return false;
        if (loanTime != null ? !loanTime.equals(that.loanTime) : that.loanTime != null) return false;
        if (def7 != null ? !def7.equals(that.def7) : that.def7 != null) return false;
        if (def8 != null ? !def8.equals(that.def8) : that.def8 != null) return false;
        if (def9 != null ? !def9.equals(that.def9) : that.def9 != null) return false;
        if (def10 != null ? !def10.equals(that.def10) : that.def10 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (loanContractId != null ? loanContractId.hashCode() : 0);
        result = 31 * result + (loanContractNum != null ? loanContractNum.hashCode() : 0);
        result = 31 * result + (businessType != null ? businessType.hashCode() : 0);
        result = 31 * result + (isExpedited != null ? isExpedited.hashCode() : 0);
        result = 31 * result + (signDate != null ? signDate.hashCode() : 0);
        result = 31 * result + (signType != null ? signType.hashCode() : 0);
        result = 31 * result + (approveDate != null ? approveDate.hashCode() : 0);
        result = 31 * result + (firstRepayDate != null ? firstRepayDate.hashCode() : 0);
        result = 31 * result + (feeFlag != null ? feeFlag.hashCode() : 0);
        result = 31 * result + (interestFlag != null ? interestFlag.hashCode() : 0);
        result = 31 * result + (interestType != null ? interestType.hashCode() : 0);
        result = 31 * result + (graceDays != null ? graceDays.hashCode() : 0);
        result = 31 * result + (irr != null ? irr.hashCode() : 0);
        result = 31 * result + (lnsRate != null ? lnsRate.hashCode() : 0);
        result = 31 * result + (channelCode != null ? channelCode.hashCode() : 0);
        result = 31 * result + (channelName != null ? channelName.hashCode() : 0);
        result = 31 * result + (loanOfficerId != null ? loanOfficerId.hashCode() : 0);
        result = 31 * result + (cityId != null ? cityId.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (isModify != null ? isModify.hashCode() : 0);
        result = 31 * result + (isSchemeModify != null ? isSchemeModify.hashCode() : 0);
        result = 31 * result + (recycleWay != null ? recycleWay.hashCode() : 0);
        result = 31 * result + (isRecycleLoad != null ? isRecycleLoad.hashCode() : 0);
        result = 31 * result + (recycleLoanCnt != null ? recycleLoanCnt.hashCode() : 0);
        result = 31 * result + (oldContractNum != null ? oldContractNum.hashCode() : 0);
        result = 31 * result + (settleAmount != null ? settleAmount.hashCode() : 0);
        result = 31 * result + (newContractNum != null ? newContractNum.hashCode() : 0);
        result = 31 * result + (isShorten != null ? isShorten.hashCode() : 0);
        result = 31 * result + (isExtend != null ? isExtend.hashCode() : 0);
        result = 31 * result + (isChangeProduce != null ? isChangeProduce.hashCode() : 0);
        result = 31 * result + (isOverdue != null ? isOverdue.hashCode() : 0);
        result = 31 * result + (isPayAhead != null ? isPayAhead.hashCode() : 0);
        result = 31 * result + (isPayPart != null ? isPayPart.hashCode() : 0);
        result = 31 * result + (purpose != null ? purpose.hashCode() : 0);
        result = 31 * result + (purposeSon != null ? purposeSon.hashCode() : 0);
        result = 31 * result + (purposeDetail != null ? purposeDetail.hashCode() : 0);
        result = 31 * result + (isDivAccount != null ? isDivAccount.hashCode() : 0);
        result = 31 * result + (systemType != null ? systemType.hashCode() : 0);
        result = 31 * result + (highRisk != null ? highRisk.hashCode() : 0);
        result = 31 * result + (isBuyout != null ? isBuyout.hashCode() : 0);
        result = 31 * result + (feeProcessType != null ? feeProcessType.hashCode() : 0);
        result = 31 * result + (studentCorpName != null ? studentCorpName.hashCode() : 0);
        result = 31 * result + (settleDate != null ? settleDate.hashCode() : 0);
        result = 31 * result + (habitTime != null ? habitTime.hashCode() : 0);
        result = 31 * result + (repayDay != null ? repayDay.hashCode() : 0);
        result = 31 * result + (applyId != null ? applyId.hashCode() : 0);
        result = 31 * result + (oldApplyId != null ? oldApplyId.hashCode() : 0);
        result = 31 * result + (deptId != null ? deptId.hashCode() : 0);
        result = 31 * result + (deptName != null ? deptName.hashCode() : 0);
        result = 31 * result + (creator != null ? creator.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updater != null ? updater.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (updateType != null ? updateType.hashCode() : 0);
        result = 31 * result + (frontChargeDiscount != null ? frontChargeDiscount.hashCode() : 0);
        result = 31 * result + (monthMRate != null ? monthMRate.hashCode() : 0);
        result = 31 * result + (handleChargeRate != null ? handleChargeRate.hashCode() : 0);
        result = 31 * result + (loanTimes != null ? loanTimes.hashCode() : 0);
        result = 31 * result + (pawn != null ? pawn.hashCode() : 0);
        result = 31 * result + (handleCharge != null ? handleCharge.hashCode() : 0);
        result = 31 * result + (monthChargeDiscount != null ? monthChargeDiscount.hashCode() : 0);
        result = 31 * result + (guaranteeFee != null ? guaranteeFee.hashCode() : 0);
        result = 31 * result + (guaranteeCompany != null ? guaranteeCompany.hashCode() : 0);
        result = 31 * result + (trustInstitution != null ? trustInstitution.hashCode() : 0);
        result = 31 * result + (trustProducts != null ? trustProducts.hashCode() : 0);
        result = 31 * result + (trustPlan != null ? trustPlan.hashCode() : 0);
        result = 31 * result + (typeContractChange != null ? typeContractChange.hashCode() : 0);
        result = 31 * result + (amountContractChange != null ? amountContractChange.hashCode() : 0);
        result = 31 * result + (loanTime != null ? loanTime.hashCode() : 0);
        result = 31 * result + (def7 != null ? def7.hashCode() : 0);
        result = 31 * result + (def8 != null ? def8.hashCode() : 0);
        result = 31 * result + (def9 != null ? def9.hashCode() : 0);
        result = 31 * result + (def10 != null ? def10.hashCode() : 0);
        return result;
    }
}
