use classicmodels ; 

ALTER TABLE customers ADD INDEX idx_customerName(customerName);

ALTER TABLE customers ADD INDEX idx_full_name(contactFirstName, contactLastName);

 select * 
from customers 
where customerName ='land of toys inc.';

EXPLAIN SELECT * 
FROM customers
 WHERE contactFirstName = 'Jean' or contactFirstName = 'King';

ALTER TABLE customers
 DROP INDEX idx_full_name;
