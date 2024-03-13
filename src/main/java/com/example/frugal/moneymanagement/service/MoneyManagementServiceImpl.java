package com.example.frugal.moneymanagement.service;

import com.example.frugal.moneymanagement.exception.CustomerNotFoundException;
import com.example.frugal.moneymanagement.exception.DataNotFoundException;
import com.example.frugal.moneymanagement.model.dto.SpendingDTO;
import com.example.frugal.moneymanagement.model.entity.Spending;
import com.example.frugal.moneymanagement.repository.MoneyManagementRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
@Slf4j
public class MoneyManagementServiceImpl implements MoneyManagementService {

    private final ModelMapper modelMapper;

    private final MoneyManagementRepository moneyManagementRepository;

    @Override
    public SpendingDTO calculateAmountSpentByDate(final String customerId, final LocalDate requestDate) {
        if (moneyManagementRepository.findByCustomerId(customerId).equals(0)) {
            throw new CustomerNotFoundException("customer not found : " + customerId);
        } else {
            Spending spending = moneyManagementRepository.getAmountSpentByDate(customerId, requestDate);
            if (ObjectUtils.isEmpty(spending)) {
                throw new DataNotFoundException("Data not found for given input");
            } else {
                return modelMapper.map(spending, SpendingDTO.class);
            }
        }
    }
}
