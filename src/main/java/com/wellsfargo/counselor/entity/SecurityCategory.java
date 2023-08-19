package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class SecurityCategory {

    @Id
    @GeneratedValue()
    private long securityCategoryId;

    @Column(nullable = false)
    private String categoryName;

    protected SecurityCategory(){

    }

    public SecurityCategory(String categoryName) {
        this.categoryName = categoryName;
    }

    public long getSecurityCategoryId() {
        return securityCategoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
