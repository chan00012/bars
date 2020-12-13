package com.bars.repository;

import com.bars.entity.Billing;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface BillingRepository extends JpaRepository<Billing, Integer> {

    List<Billing> findByBillingCycleAndStartDateAndEndDate(int billingCycle, LocalDate startDate, LocalDate endDate);

}
