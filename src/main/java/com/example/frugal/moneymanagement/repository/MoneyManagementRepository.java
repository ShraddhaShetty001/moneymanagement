package com.example.frugal.moneymanagement.repository;

import com.example.frugal.moneymanagement.constants.DBQueries;
import com.example.frugal.moneymanagement.model.entity.Spending;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface MoneyManagementRepository extends JpaRepository<Spending, String> {
    @Query(value = DBQueries.AMOUNT_SPENT_BY_DATE, nativeQuery = true)
    Spending getAmountSpentByDate(String customerId, LocalDate requestDate);

    @Query(value = DBQueries.FIND_CUSTOMER_BY_ID, nativeQuery = true)
    Integer findByCustomerId(String customerId);
}
