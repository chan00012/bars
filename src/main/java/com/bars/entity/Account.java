package com.bars.entity;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int accountId;
    private String accountName;
    private LocalDateTime dateCreated;
    private String isActive;
    private String lastEdited;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "account", fetch = FetchType.EAGER)
    private Set<Billing> billings = new HashSet<>();

    public Account() {

    }

    public Account(int accountId, String accountName, LocalDateTime dateCreated, String isActive, String lastEdited,
                   Customer customer, Set<Billing> billings) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.dateCreated = dateCreated;
        this.isActive = isActive;
        this.lastEdited = lastEdited;
        this.customer = customer;
        this.billings = billings;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public String getLastEdited() {
        return lastEdited;
    }

    public void setLastEdited(String lastEdited) {
        this.lastEdited = lastEdited;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Set<Billing> getBillings() {
        return billings;
    }

    public void setBillings(Set<Billing> billings) {
        this.billings = billings;
    }
}
