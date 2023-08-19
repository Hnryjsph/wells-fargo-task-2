package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private long portfolioID;

    @OneToMany
    @JoinColumn(name = "security_id")
    private Security security;
    @ManyToOne
    @JoinColumn(name = "advisor_id")
    private Advisor advisor;

    protected Portfolio(){

    }

    public Portfolio(Security security, Advisor advisor) {
        this.security = security;
        this.advisor = advisor;
    }

    public long getPortfolioID() {
        return portfolioID;
    }

    public Security getSecurity() {
        return security;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }

    public Advisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }
}
