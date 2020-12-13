package com.bars.entity;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "billing")
public class Billing {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int billingId;
    private int billingCycle;
    private String billingMonth;
    private Double amount;
    private LocalDate startDate;
    private LocalDate endDate;
    private String lastEdited;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "account_id")
    private Account account;

    public Billing() {

    }

    public Billing(int billingId, int billingCycle, String billingMonth, Double amount, LocalDate startDate,
                   LocalDate endDate, String lastEdited, Account account) {
        this.billingId = billingId;
        this.billingCycle = billingCycle;
        this.billingMonth = billingMonth;
        this.amount = amount;
        this.startDate = startDate;
        this.endDate = endDate;
        this.lastEdited = lastEdited;
        this.account = account;
    }

    public int getBillingId() {
        return billingId;
    }

    public void setBillingId(int billingId) {
        this.billingId = billingId;
    }

    public int getBillingCycle() {
        return billingCycle;
    }

    public void setBillingCycle(int billingCycle) {
        this.billingCycle = billingCycle;
    }

    public String getBillingMonth() {
        return billingMonth;
    }

    public void setBillingMonth(String billingMonth) {
        this.billingMonth = billingMonth;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getLastEdited() {
        return lastEdited;
    }

    public void setLastEdited(String lastEdited) {
        this.lastEdited = lastEdited;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
