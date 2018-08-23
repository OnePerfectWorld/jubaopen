package com.atguigu.jubaopen.bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "contract_type_info", schema = "jubaopen", catalog = "")
public class ContractTypeInfo implements Serializable{
    private int id;
    private String contractType;
    private Integer contractTypeCode;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "contract_type")
    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    @Basic
    @Column(name = "contract_type_code")
    public Integer getContractTypeCode() {
        return contractTypeCode;
    }

    public void setContractTypeCode(Integer contractTypeCode) {
        this.contractTypeCode = contractTypeCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContractTypeInfo that = (ContractTypeInfo) o;

        if (id != that.id) return false;
        if (contractType != null ? !contractType.equals(that.contractType) : that.contractType != null) return false;
        if (contractTypeCode != null ? !contractTypeCode.equals(that.contractTypeCode) : that.contractTypeCode != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (contractType != null ? contractType.hashCode() : 0);
        result = 31 * result + (contractTypeCode != null ? contractTypeCode.hashCode() : 0);
        return result;
    }
}
