package com.atguigu.jubaopen.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "nplm_borrower_info", schema = "jubaopen", catalog = "")
public class NplmBorrowerInfo  implements Serializable{
    private int id;
    private Integer applyClientId;
    private Integer ecifId;
    private String clientName;
    private String mobile;
    private String oldName;
    private String sex;
    private String nation;
    private String birthday;
    private String marital;
    private Integer haveChildren;
    private Integer childrenCount;
    private String nationality;
    private String hProvince;
    private String hCity;
    private String hDress;
    private String identityType;
    private String identityNum;
    private String identityValidDate;
    private String haveCar;
    private String houseExplain;
    private String resideExplain;
    private String resideYear;
    private String degree;
    private String diploma;
    private Integer yearIncome;
    private String industry;
    private String job;
    private String company;
    private String companyType;
    private String department;
    private String position;
    private Integer workTime;
    private String workTimeUnit;
    private String clientArea;
    private String clientType;
    private String fNation;
    private String fProvince;
    private String fCity;
    private String fArea;
    private String fStreet;
    private String fZipcode;
    private String cNation;
    private String cProvince;
    private String cCity;
    private String cArea;
    private String cStreet;
    private String cZipcode;
    private String mobile1;
    private String mobile2;
    private String mobile3;
    private String fTel1;
    private String fTel2;
    private String fTel3;
    private String cTel1;
    private String cTel2;
    private String cTel3;
    private String email1;
    private String email2;
    private String email3;
    private Integer creditAmount;
    private String sociaLlSecurity;
    private String creator;
    private Timestamp createTime;
    private String updater;
    private Timestamp updateTime;
    private String updateType;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "APPLY_CLIENT_ID")
    public Integer getApplyClientId() {
        return applyClientId;
    }

    public void setApplyClientId(Integer applyClientId) {
        this.applyClientId = applyClientId;
    }

    @Basic
    @Column(name = "ECIF_ID")
    public Integer getEcifId() {
        return ecifId;
    }

    public void setEcifId(Integer ecifId) {
        this.ecifId = ecifId;
    }

    @Basic
    @Column(name = "CLIENT_NAME")
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @Basic
    @Column(name = "MOBILE")
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "OLD_NAME")
    public String getOldName() {
        return oldName;
    }

    public void setOldName(String oldName) {
        this.oldName = oldName;
    }

    @Basic
    @Column(name = "SEX")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "NATION")
    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    @Basic
    @Column(name = "BIRTHDAY")
    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "MARITAL")
    public String getMarital() {
        return marital;
    }

    public void setMarital(String marital) {
        this.marital = marital;
    }

    @Basic
    @Column(name = "HAVE_CHILDREN")
    public Integer getHaveChildren() {
        return haveChildren;
    }

    public void setHaveChildren(Integer haveChildren) {
        this.haveChildren = haveChildren;
    }

    @Basic
    @Column(name = "CHILDREN_COUNT")
    public Integer getChildrenCount() {
        return childrenCount;
    }

    public void setChildrenCount(Integer childrenCount) {
        this.childrenCount = childrenCount;
    }

    @Basic
    @Column(name = "NATIONALITY")
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Basic
    @Column(name = "H_PROVINCE")
    public String gethProvince() {
        return hProvince;
    }

    public void sethProvince(String hProvince) {
        this.hProvince = hProvince;
    }

    @Basic
    @Column(name = "H_CITY")
    public String gethCity() {
        return hCity;
    }

    public void sethCity(String hCity) {
        this.hCity = hCity;
    }

    @Basic
    @Column(name = "H_DRESS")
    public String gethDress() {
        return hDress;
    }

    public void sethDress(String hDress) {
        this.hDress = hDress;
    }

    @Basic
    @Column(name = "IDENTITY_TYPE")
    public String getIdentityType() {
        return identityType;
    }

    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }

    @Basic
    @Column(name = "IDENTITY_NUM")
    public String getIdentityNum() {
        return identityNum;
    }

    public void setIdentityNum(String identityNum) {
        this.identityNum = identityNum;
    }

    @Basic
    @Column(name = "IDENTITY_VALID_DATE")
    public String getIdentityValidDate() {
        return identityValidDate;
    }

    public void setIdentityValidDate(String identityValidDate) {
        this.identityValidDate = identityValidDate;
    }

    @Basic
    @Column(name = "HAVE_CAR")
    public String getHaveCar() {
        return haveCar;
    }

    public void setHaveCar(String haveCar) {
        this.haveCar = haveCar;
    }

    @Basic
    @Column(name = "HOUSE_EXPLAIN")
    public String getHouseExplain() {
        return houseExplain;
    }

    public void setHouseExplain(String houseExplain) {
        this.houseExplain = houseExplain;
    }

    @Basic
    @Column(name = "RESIDE_EXPLAIN")
    public String getResideExplain() {
        return resideExplain;
    }

    public void setResideExplain(String resideExplain) {
        this.resideExplain = resideExplain;
    }

    @Basic
    @Column(name = "RESIDE_YEAR")
    public String getResideYear() {
        return resideYear;
    }

    public void setResideYear(String resideYear) {
        this.resideYear = resideYear;
    }

    @Basic
    @Column(name = "DEGREE")
    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Basic
    @Column(name = "DIPLOMA")
    public String getDiploma() {
        return diploma;
    }

    public void setDiploma(String diploma) {
        this.diploma = diploma;
    }

    @Basic
    @Column(name = "YEAR_INCOME")
    public Integer getYearIncome() {
        return yearIncome;
    }

    public void setYearIncome(Integer yearIncome) {
        this.yearIncome = yearIncome;
    }

    @Basic
    @Column(name = "INDUSTRY")
    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    @Basic
    @Column(name = "JOB")
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Basic
    @Column(name = "COMPANY")
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Basic
    @Column(name = "COMPANY_TYPE")
    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    @Basic
    @Column(name = "DEPARTMENT")
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Basic
    @Column(name = "POSITION")
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Basic
    @Column(name = "WORK_TIME")
    public Integer getWorkTime() {
        return workTime;
    }

    public void setWorkTime(Integer workTime) {
        this.workTime = workTime;
    }

    @Basic
    @Column(name = "WORK_TIME_UNIT")
    public String getWorkTimeUnit() {
        return workTimeUnit;
    }

    public void setWorkTimeUnit(String workTimeUnit) {
        this.workTimeUnit = workTimeUnit;
    }

    @Basic
    @Column(name = "CLIENT_AREA")
    public String getClientArea() {
        return clientArea;
    }

    public void setClientArea(String clientArea) {
        this.clientArea = clientArea;
    }

    @Basic
    @Column(name = "CLIENT_TYPE")
    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    @Basic
    @Column(name = "F_NATION")
    public String getfNation() {
        return fNation;
    }

    public void setfNation(String fNation) {
        this.fNation = fNation;
    }

    @Basic
    @Column(name = "F_PROVINCE")
    public String getfProvince() {
        return fProvince;
    }

    public void setfProvince(String fProvince) {
        this.fProvince = fProvince;
    }

    @Basic
    @Column(name = "F_CITY")
    public String getfCity() {
        return fCity;
    }

    public void setfCity(String fCity) {
        this.fCity = fCity;
    }

    @Basic
    @Column(name = "F_AREA")
    public String getfArea() {
        return fArea;
    }

    public void setfArea(String fArea) {
        this.fArea = fArea;
    }

    @Basic
    @Column(name = "F_STREET")
    public String getfStreet() {
        return fStreet;
    }

    public void setfStreet(String fStreet) {
        this.fStreet = fStreet;
    }

    @Basic
    @Column(name = "F_ZIPCODE")
    public String getfZipcode() {
        return fZipcode;
    }

    public void setfZipcode(String fZipcode) {
        this.fZipcode = fZipcode;
    }

    @Basic
    @Column(name = "C_NATION")
    public String getcNation() {
        return cNation;
    }

    public void setcNation(String cNation) {
        this.cNation = cNation;
    }

    @Basic
    @Column(name = "C_PROVINCE")
    public String getcProvince() {
        return cProvince;
    }

    public void setcProvince(String cProvince) {
        this.cProvince = cProvince;
    }

    @Basic
    @Column(name = "C_CITY")
    public String getcCity() {
        return cCity;
    }

    public void setcCity(String cCity) {
        this.cCity = cCity;
    }

    @Basic
    @Column(name = "C_AREA")
    public String getcArea() {
        return cArea;
    }

    public void setcArea(String cArea) {
        this.cArea = cArea;
    }

    @Basic
    @Column(name = "C_STREET")
    public String getcStreet() {
        return cStreet;
    }

    public void setcStreet(String cStreet) {
        this.cStreet = cStreet;
    }

    @Basic
    @Column(name = "C_ZIPCODE")
    public String getcZipcode() {
        return cZipcode;
    }

    public void setcZipcode(String cZipcode) {
        this.cZipcode = cZipcode;
    }

    @Basic
    @Column(name = "MOBILE1")
    public String getMobile1() {
        return mobile1;
    }

    public void setMobile1(String mobile1) {
        this.mobile1 = mobile1;
    }

    @Basic
    @Column(name = "MOBILE2")
    public String getMobile2() {
        return mobile2;
    }

    public void setMobile2(String mobile2) {
        this.mobile2 = mobile2;
    }

    @Basic
    @Column(name = "MOBILE3")
    public String getMobile3() {
        return mobile3;
    }

    public void setMobile3(String mobile3) {
        this.mobile3 = mobile3;
    }

    @Basic
    @Column(name = "F_TEL1")
    public String getfTel1() {
        return fTel1;
    }

    public void setfTel1(String fTel1) {
        this.fTel1 = fTel1;
    }

    @Basic
    @Column(name = "F_TEL2")
    public String getfTel2() {
        return fTel2;
    }

    public void setfTel2(String fTel2) {
        this.fTel2 = fTel2;
    }

    @Basic
    @Column(name = "F_TEL3")
    public String getfTel3() {
        return fTel3;
    }

    public void setfTel3(String fTel3) {
        this.fTel3 = fTel3;
    }

    @Basic
    @Column(name = "C_TEL1")
    public String getcTel1() {
        return cTel1;
    }

    public void setcTel1(String cTel1) {
        this.cTel1 = cTel1;
    }

    @Basic
    @Column(name = "C_TEL2")
    public String getcTel2() {
        return cTel2;
    }

    public void setcTel2(String cTel2) {
        this.cTel2 = cTel2;
    }

    @Basic
    @Column(name = "C_TEL3")
    public String getcTel3() {
        return cTel3;
    }

    public void setcTel3(String cTel3) {
        this.cTel3 = cTel3;
    }

    @Basic
    @Column(name = "EMAIL1")
    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    @Basic
    @Column(name = "EMAIL2")
    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    @Basic
    @Column(name = "EMAIL3")
    public String getEmail3() {
        return email3;
    }

    public void setEmail3(String email3) {
        this.email3 = email3;
    }

    @Basic
    @Column(name = "CREDIT_AMOUNT")
    public Integer getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(Integer creditAmount) {
        this.creditAmount = creditAmount;
    }

    @Basic
    @Column(name = "SOCIALl_SECURITY")
    public String getSociaLlSecurity() {
        return sociaLlSecurity;
    }

    public void setSociaLlSecurity(String sociaLlSecurity) {
        this.sociaLlSecurity = sociaLlSecurity;
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

        NplmBorrowerInfo that = (NplmBorrowerInfo) o;

        if (id != that.id) return false;
        if (applyClientId != null ? !applyClientId.equals(that.applyClientId) : that.applyClientId != null)
            return false;
        if (ecifId != null ? !ecifId.equals(that.ecifId) : that.ecifId != null) return false;
        if (clientName != null ? !clientName.equals(that.clientName) : that.clientName != null) return false;
        if (mobile != null ? !mobile.equals(that.mobile) : that.mobile != null) return false;
        if (oldName != null ? !oldName.equals(that.oldName) : that.oldName != null) return false;
        if (sex != null ? !sex.equals(that.sex) : that.sex != null) return false;
        if (nation != null ? !nation.equals(that.nation) : that.nation != null) return false;
        if (birthday != null ? !birthday.equals(that.birthday) : that.birthday != null) return false;
        if (marital != null ? !marital.equals(that.marital) : that.marital != null) return false;
        if (haveChildren != null ? !haveChildren.equals(that.haveChildren) : that.haveChildren != null) return false;
        if (childrenCount != null ? !childrenCount.equals(that.childrenCount) : that.childrenCount != null)
            return false;
        if (nationality != null ? !nationality.equals(that.nationality) : that.nationality != null) return false;
        if (hProvince != null ? !hProvince.equals(that.hProvince) : that.hProvince != null) return false;
        if (hCity != null ? !hCity.equals(that.hCity) : that.hCity != null) return false;
        if (hDress != null ? !hDress.equals(that.hDress) : that.hDress != null) return false;
        if (identityType != null ? !identityType.equals(that.identityType) : that.identityType != null) return false;
        if (identityNum != null ? !identityNum.equals(that.identityNum) : that.identityNum != null) return false;
        if (identityValidDate != null ? !identityValidDate.equals(that.identityValidDate) : that.identityValidDate != null)
            return false;
        if (haveCar != null ? !haveCar.equals(that.haveCar) : that.haveCar != null) return false;
        if (houseExplain != null ? !houseExplain.equals(that.houseExplain) : that.houseExplain != null) return false;
        if (resideExplain != null ? !resideExplain.equals(that.resideExplain) : that.resideExplain != null)
            return false;
        if (resideYear != null ? !resideYear.equals(that.resideYear) : that.resideYear != null) return false;
        if (degree != null ? !degree.equals(that.degree) : that.degree != null) return false;
        if (diploma != null ? !diploma.equals(that.diploma) : that.diploma != null) return false;
        if (yearIncome != null ? !yearIncome.equals(that.yearIncome) : that.yearIncome != null) return false;
        if (industry != null ? !industry.equals(that.industry) : that.industry != null) return false;
        if (job != null ? !job.equals(that.job) : that.job != null) return false;
        if (company != null ? !company.equals(that.company) : that.company != null) return false;
        if (companyType != null ? !companyType.equals(that.companyType) : that.companyType != null) return false;
        if (department != null ? !department.equals(that.department) : that.department != null) return false;
        if (position != null ? !position.equals(that.position) : that.position != null) return false;
        if (workTime != null ? !workTime.equals(that.workTime) : that.workTime != null) return false;
        if (workTimeUnit != null ? !workTimeUnit.equals(that.workTimeUnit) : that.workTimeUnit != null) return false;
        if (clientArea != null ? !clientArea.equals(that.clientArea) : that.clientArea != null) return false;
        if (clientType != null ? !clientType.equals(that.clientType) : that.clientType != null) return false;
        if (fNation != null ? !fNation.equals(that.fNation) : that.fNation != null) return false;
        if (fProvince != null ? !fProvince.equals(that.fProvince) : that.fProvince != null) return false;
        if (fCity != null ? !fCity.equals(that.fCity) : that.fCity != null) return false;
        if (fArea != null ? !fArea.equals(that.fArea) : that.fArea != null) return false;
        if (fStreet != null ? !fStreet.equals(that.fStreet) : that.fStreet != null) return false;
        if (fZipcode != null ? !fZipcode.equals(that.fZipcode) : that.fZipcode != null) return false;
        if (cNation != null ? !cNation.equals(that.cNation) : that.cNation != null) return false;
        if (cProvince != null ? !cProvince.equals(that.cProvince) : that.cProvince != null) return false;
        if (cCity != null ? !cCity.equals(that.cCity) : that.cCity != null) return false;
        if (cArea != null ? !cArea.equals(that.cArea) : that.cArea != null) return false;
        if (cStreet != null ? !cStreet.equals(that.cStreet) : that.cStreet != null) return false;
        if (cZipcode != null ? !cZipcode.equals(that.cZipcode) : that.cZipcode != null) return false;
        if (mobile1 != null ? !mobile1.equals(that.mobile1) : that.mobile1 != null) return false;
        if (mobile2 != null ? !mobile2.equals(that.mobile2) : that.mobile2 != null) return false;
        if (mobile3 != null ? !mobile3.equals(that.mobile3) : that.mobile3 != null) return false;
        if (fTel1 != null ? !fTel1.equals(that.fTel1) : that.fTel1 != null) return false;
        if (fTel2 != null ? !fTel2.equals(that.fTel2) : that.fTel2 != null) return false;
        if (fTel3 != null ? !fTel3.equals(that.fTel3) : that.fTel3 != null) return false;
        if (cTel1 != null ? !cTel1.equals(that.cTel1) : that.cTel1 != null) return false;
        if (cTel2 != null ? !cTel2.equals(that.cTel2) : that.cTel2 != null) return false;
        if (cTel3 != null ? !cTel3.equals(that.cTel3) : that.cTel3 != null) return false;
        if (email1 != null ? !email1.equals(that.email1) : that.email1 != null) return false;
        if (email2 != null ? !email2.equals(that.email2) : that.email2 != null) return false;
        if (email3 != null ? !email3.equals(that.email3) : that.email3 != null) return false;
        if (creditAmount != null ? !creditAmount.equals(that.creditAmount) : that.creditAmount != null) return false;
        if (sociaLlSecurity != null ? !sociaLlSecurity.equals(that.sociaLlSecurity) : that.sociaLlSecurity != null)
            return false;
        if (creator != null ? !creator.equals(that.creator) : that.creator != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updater != null ? !updater.equals(that.updater) : that.updater != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (updateType != null ? !updateType.equals(that.updateType) : that.updateType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (applyClientId != null ? applyClientId.hashCode() : 0);
        result = 31 * result + (ecifId != null ? ecifId.hashCode() : 0);
        result = 31 * result + (clientName != null ? clientName.hashCode() : 0);
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        result = 31 * result + (oldName != null ? oldName.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (nation != null ? nation.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (marital != null ? marital.hashCode() : 0);
        result = 31 * result + (haveChildren != null ? haveChildren.hashCode() : 0);
        result = 31 * result + (childrenCount != null ? childrenCount.hashCode() : 0);
        result = 31 * result + (nationality != null ? nationality.hashCode() : 0);
        result = 31 * result + (hProvince != null ? hProvince.hashCode() : 0);
        result = 31 * result + (hCity != null ? hCity.hashCode() : 0);
        result = 31 * result + (hDress != null ? hDress.hashCode() : 0);
        result = 31 * result + (identityType != null ? identityType.hashCode() : 0);
        result = 31 * result + (identityNum != null ? identityNum.hashCode() : 0);
        result = 31 * result + (identityValidDate != null ? identityValidDate.hashCode() : 0);
        result = 31 * result + (haveCar != null ? haveCar.hashCode() : 0);
        result = 31 * result + (houseExplain != null ? houseExplain.hashCode() : 0);
        result = 31 * result + (resideExplain != null ? resideExplain.hashCode() : 0);
        result = 31 * result + (resideYear != null ? resideYear.hashCode() : 0);
        result = 31 * result + (degree != null ? degree.hashCode() : 0);
        result = 31 * result + (diploma != null ? diploma.hashCode() : 0);
        result = 31 * result + (yearIncome != null ? yearIncome.hashCode() : 0);
        result = 31 * result + (industry != null ? industry.hashCode() : 0);
        result = 31 * result + (job != null ? job.hashCode() : 0);
        result = 31 * result + (company != null ? company.hashCode() : 0);
        result = 31 * result + (companyType != null ? companyType.hashCode() : 0);
        result = 31 * result + (department != null ? department.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (workTime != null ? workTime.hashCode() : 0);
        result = 31 * result + (workTimeUnit != null ? workTimeUnit.hashCode() : 0);
        result = 31 * result + (clientArea != null ? clientArea.hashCode() : 0);
        result = 31 * result + (clientType != null ? clientType.hashCode() : 0);
        result = 31 * result + (fNation != null ? fNation.hashCode() : 0);
        result = 31 * result + (fProvince != null ? fProvince.hashCode() : 0);
        result = 31 * result + (fCity != null ? fCity.hashCode() : 0);
        result = 31 * result + (fArea != null ? fArea.hashCode() : 0);
        result = 31 * result + (fStreet != null ? fStreet.hashCode() : 0);
        result = 31 * result + (fZipcode != null ? fZipcode.hashCode() : 0);
        result = 31 * result + (cNation != null ? cNation.hashCode() : 0);
        result = 31 * result + (cProvince != null ? cProvince.hashCode() : 0);
        result = 31 * result + (cCity != null ? cCity.hashCode() : 0);
        result = 31 * result + (cArea != null ? cArea.hashCode() : 0);
        result = 31 * result + (cStreet != null ? cStreet.hashCode() : 0);
        result = 31 * result + (cZipcode != null ? cZipcode.hashCode() : 0);
        result = 31 * result + (mobile1 != null ? mobile1.hashCode() : 0);
        result = 31 * result + (mobile2 != null ? mobile2.hashCode() : 0);
        result = 31 * result + (mobile3 != null ? mobile3.hashCode() : 0);
        result = 31 * result + (fTel1 != null ? fTel1.hashCode() : 0);
        result = 31 * result + (fTel2 != null ? fTel2.hashCode() : 0);
        result = 31 * result + (fTel3 != null ? fTel3.hashCode() : 0);
        result = 31 * result + (cTel1 != null ? cTel1.hashCode() : 0);
        result = 31 * result + (cTel2 != null ? cTel2.hashCode() : 0);
        result = 31 * result + (cTel3 != null ? cTel3.hashCode() : 0);
        result = 31 * result + (email1 != null ? email1.hashCode() : 0);
        result = 31 * result + (email2 != null ? email2.hashCode() : 0);
        result = 31 * result + (email3 != null ? email3.hashCode() : 0);
        result = 31 * result + (creditAmount != null ? creditAmount.hashCode() : 0);
        result = 31 * result + (sociaLlSecurity != null ? sociaLlSecurity.hashCode() : 0);
        result = 31 * result + (creator != null ? creator.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updater != null ? updater.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (updateType != null ? updateType.hashCode() : 0);
        return result;
    }
}
