package com.atguigu.jubaopen.bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "trust_institution_info", schema = "jubaopen", catalog = "")
public class TrustInstitutionInfo implements Serializable{
    private int id;
    private String trustInstitutionName;
    private Integer trustInstitutionCode;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "trust_institution_name")
    public String getTrustInstitutionName() {
        return trustInstitutionName;
    }

    public void setTrustInstitutionName(String trustInstitutionName) {
        this.trustInstitutionName = trustInstitutionName;
    }

    @Basic
    @Column(name = "trust_institution_code")
    public Integer getTrustInstitutionCode() {
        return trustInstitutionCode;
    }

    public void setTrustInstitutionCode(Integer trustInstitutionCode) {
        this.trustInstitutionCode = trustInstitutionCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TrustInstitutionInfo that = (TrustInstitutionInfo) o;

        if (id != that.id) return false;
        if (trustInstitutionName != null ? !trustInstitutionName.equals(that.trustInstitutionName) : that.trustInstitutionName != null)
            return false;
        if (trustInstitutionCode != null ? !trustInstitutionCode.equals(that.trustInstitutionCode) : that.trustInstitutionCode != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (trustInstitutionName != null ? trustInstitutionName.hashCode() : 0);
        result = 31 * result + (trustInstitutionCode != null ? trustInstitutionCode.hashCode() : 0);
        return result;
    }
}
