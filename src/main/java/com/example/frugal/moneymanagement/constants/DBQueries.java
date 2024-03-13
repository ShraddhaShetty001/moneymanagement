package com.example.frugal.moneymanagement.constants;

import lombok.experimental.UtilityClass;

@UtilityClass
public class DBQueries {

    public static final String AMOUNT_SPENT_BY_DATE = "select customer_id as id, sum(withdrawal_amt) as amount_spent from " +
            "bankStatement where customer_id = :customerId and value_date = :requestDate group by value_date, customer_id";
    public static final String FIND_CUSTOMER_BY_ID = "select count(*) from bankStatement where customer_id = :customerId";
}
