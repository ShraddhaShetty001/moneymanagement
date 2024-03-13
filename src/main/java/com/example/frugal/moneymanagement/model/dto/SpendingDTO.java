package com.example.frugal.moneymanagement.model.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class SpendingDTO {
    double amountSpent;
}
