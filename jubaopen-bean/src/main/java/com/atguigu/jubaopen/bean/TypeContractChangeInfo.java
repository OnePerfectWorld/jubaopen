package com.atguigu.jubaopen.bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "type_contract_change_info", schema = "jubaopen", catalog = "")
public class TypeContractChangeInfo implements Serializable{
    private int id;
    private String typeContractChangeName;
    private Integer typeContractChangeCode;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "type_contract_change_name")
    public String getTypeContractChangeName() {
        return typeContractChangeName;
    }

    public void setTypeContractChangeName(String typeContractChangeName) {
        this.typeContractChangeName = typeContractChangeName;
    }

    @Basic
    @Column(name = "type_contract_change_code")
    public Integer getTypeContractChangeCode() {
        return typeContractChangeCode;
    }

    public void setTypeContractChangeCode(Integer typeContractChangeCode) {
        this.typeContractChangeCode = typeContractChangeCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TypeContractChangeInfo that = (TypeContractChangeInfo) o;

        if (id != that.id) return false;
        if (typeContractChangeName != null ? !typeContractChangeName.equals(that.typeContractChangeName) : that.typeContractChangeName != null)
            return false;
        if (typeContractChangeCode != null ? !typeContractChangeCode.equals(that.typeContractChangeCode) : that.typeContractChangeCode != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (typeContractChangeName != null ? typeContractChangeName.hashCode() : 0);
        result = 31 * result + (typeContractChangeCode != null ? typeContractChangeCode.hashCode() : 0);
        return result;
    }
}
