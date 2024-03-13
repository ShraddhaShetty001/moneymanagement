create table bankStatement
(
    id varchar not null,
    customer_id varchar not null,
    transaction_date date,
    narration        varchar,
    chq_or_ref_no    varchar,
    value_date       date,
    withdrawal_amt    double,
    deposit_amt      double,
    closing_balance  double
);

INSERT INTO bankStatement (id, customer_id, transaction_date, narration, chq_or_ref_no, value_date, withdrawal_amt, deposit_amt, closing_balance) VALUES ('1','cust_in_1', '2024-02-23', 'online payment', null,  '2024-02-23', 1000, null, 100000);
INSERT INTO bankStatement (id, customer_id, transaction_date, narration, chq_or_ref_no, value_date, withdrawal_amt, deposit_amt, closing_balance) VALUES ('2','cust_in_1', '2024-02-22', 'cheque', 'chq_123',  '2024-02-23', 50000, null, 101000);
INSERT INTO bankStatement (id, customer_id, transaction_date, narration, chq_or_ref_no, value_date, withdrawal_amt, deposit_amt, closing_balance) VALUES ('3','cust_in_1', '2024-02-22', 'online payment', null,  '2024-02-23', 4000, null, 156000);
INSERT INTO bankStatement (id, customer_id, transaction_date, narration, chq_or_ref_no, value_date, withdrawal_amt, deposit_amt, closing_balance) VALUES ('4','cust_in_1', '2024-02-20', 'online payment', null,  '2024-02-23', 200, null, 107000);
INSERT INTO bankStatement (id, customer_id, transaction_date, narration, chq_or_ref_no, value_date, withdrawal_amt, deposit_amt, closing_balance) VALUES ('5','cust_in_1', '2024-02-20', 'online payment', null,  '2024-02-23', 200, null, 100000);