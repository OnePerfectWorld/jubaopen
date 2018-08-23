package com.atguigu.jubaopen.bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "trust_products_info", schema = "jubaopen", catalog = "")
public class TrustProductsInfo  implements Serializable{
    private int id;
    private String trustProductsName;
    private Integer trustProductsCode;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "trust_products_name")
    public String getTrustProductsName() {
        return trustProductsName;
    }

    public void setTrustProductsName(String trustProductsName) {
        this.trustProductsName = trustProductsName;
    }

    @Basic
    @Column(name = "trust_products_code")
    public Integer getTrustProductsCode() {
        return trustProductsCode;
    }

    public void setTrustProductsCode(Integer trustProductsCode) {
        this.trustProductsCode = trustProductsCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TrustProductsInfo that = (TrustProductsInfo) o;

        if (id != that.id) return false;
        if (trustProductsName != null ? !trustProductsName.equals(that.trustProductsName) : that.trustProductsName != null)
            return false;
        if (trustProductsCode != null ? !trustProductsCode.equals(that.trustProductsCode) : that.trustProductsCode != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (trustProductsName != null ? trustProductsName.hashCode() : 0);
        result = 31 * result + (trustProductsCode != null ? trustProductsCode.hashCode() : 0);
        return result;
    }
}
