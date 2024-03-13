package com.example.frugal.moneymanagement.controller;

import com.example.frugal.moneymanagement.model.dto.SpendingDTO;
import com.example.frugal.moneymanagement.model.entity.Spending;
import com.example.frugal.moneymanagement.service.MoneyManagementService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/frugal/api")
@RequiredArgsConstructor
@Validated
public class MoneyManagementController {

    private final MoneyManagementService moneyManagementService;

    @GetMapping(value = {"/spendings/{customer_id}", "/spendings/", "/spendings"}, produces = "application/json")
    public ResponseEntity<SpendingDTO> getAmountSpentByRequestDate(
            @PathVariable(name = "customer_id") String customerId,
            @RequestParam(name = "request_date") @DateTimeFormat(pattern = "yyyy-mm-dd") @Validated LocalDate requestDate) {
        return new ResponseEntity<>(moneyManagementService.calculateAmountSpentByDate(customerId, requestDate),
                HttpStatus.OK);

    }
}
