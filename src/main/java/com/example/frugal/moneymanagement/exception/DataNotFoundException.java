package com.example.frugal.moneymanagement.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class DataNotFoundException extends RuntimeException{
    String message;
}
