package com.example.frugal.moneymanagement.service;

import com.example.frugal.moneymanagement.model.dto.SpendingDTO;

import java.time.LocalDate;

public interface MoneyManagementService {

    SpendingDTO calculateAmountSpentByDate(final String customerId, final LocalDate requestDate);
}
