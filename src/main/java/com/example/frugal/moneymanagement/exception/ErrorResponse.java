package com.example.frugal.moneymanagement.exception;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ErrorResponse {
    String errorCode;
    String message;
}
