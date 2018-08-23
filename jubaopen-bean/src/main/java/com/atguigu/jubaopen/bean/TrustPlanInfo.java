package com.atguigu.jubaopen.bean;

import javax.persistence.*;
import javax.sql.rowset.serial.SerialArray;
import java.io.Serializable;

@Entity
@Table(name = "trust_plan_info", schema = "jubaopen", catalog = "")
public class TrustPlanInfo implements Serializable{
    private int id;
    private String trustPlanName;
    private Integer trustPlanCode;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "trust_plan_name")
    public String getTrustPlanName() {
        return trustPlanName;
    }

    public void setTrustPlanName(String trustPlanName) {
        this.trustPlanName = trustPlanName;
    }

    @Basic
    @Column(name = "trust_plan_code")
    public Integer getTrustPlanCode() {
        return trustPlanCode;
    }

    public void setTrustPlanCode(Integer trustPlanCode) {
        this.trustPlanCode = trustPlanCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TrustPlanInfo that = (TrustPlanInfo) o;

        if (id != that.id) return false;
        if (trustPlanName != null ? !trustPlanName.equals(that.trustPlanName) : that.trustPlanName != null)
            return false;
        if (trustPlanCode != null ? !trustPlanCode.equals(that.trustPlanCode) : that.trustPlanCode != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (trustPlanName != null ? trustPlanName.hashCode() : 0);
        result = 31 * result + (trustPlanCode != null ? trustPlanCode.hashCode() : 0);
        return result;
    }
}
