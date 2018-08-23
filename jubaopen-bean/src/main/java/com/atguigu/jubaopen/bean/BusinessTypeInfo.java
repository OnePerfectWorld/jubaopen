package com.atguigu.jubaopen.bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "business_type_info", schema = "jubaopen", catalog = "")
public class BusinessTypeInfo implements Serializable {
    private int id;
    private String businessTypeName;
    private Integer businessTypeCode;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "business_type_name")
    public String getBusinessTypeName() {
        return businessTypeName;
    }

    public void setBusinessTypeName(String businessTypeName) {
        this.businessTypeName = businessTypeName;
    }

    @Basic
    @Column(name = "business_type_code")
    public Integer getBusinessTypeCode() {
        return businessTypeCode;
    }

    public void setBusinessTypeCode(Integer businessTypeCode) {
        this.businessTypeCode = businessTypeCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BusinessTypeInfo that = (BusinessTypeInfo) o;

        if (id != that.id) return false;
        if (businessTypeName != null ? !businessTypeName.equals(that.businessTypeName) : that.businessTypeName != null)
            return false;
        if (businessTypeCode != null ? !businessTypeCode.equals(that.businessTypeCode) : that.businessTypeCode != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (businessTypeName != null ? businessTypeName.hashCode() : 0);
        result = 31 * result + (businessTypeCode != null ? businessTypeCode.hashCode() : 0);
        return result;
    }
}
