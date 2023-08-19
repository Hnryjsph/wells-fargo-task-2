package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;


@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long securityId;
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String purchaseDate;

    @Column(nullable = false)
    private String purchasePrice;

    @Column(nullable = false)
    private String quantity;

    @OneToOne
    @JoinColumn(name = "security_category_id")
    private  SecurityCategory securityCategory;

    protected Security(){

    }

    public Security(String name, String purchaseDate, String purchasePrice, String quantity, SecurityCategory securityCategory) {
        this.name = name;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
        this.securityCategory = securityCategory;
    }

    public long getSecurityId() {
        return securityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public SecurityCategory getSecurityCategory() {
        return securityCategory;
    }

    public void setSecurityCategory(SecurityCategory securityCategory) {
        this.securityCategory = securityCategory;
    }
}
