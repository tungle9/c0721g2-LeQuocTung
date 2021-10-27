use classicmodels ; 

alter table products add index idx_productcode(productcode);
explain select *
 from products
 where productCode = 'S12_4675';

alter table products add index idx_name_price(productname , buyprice);
explain select * 
from products 
where productname = 'Chrysler Airflow' or buyPrice > 95.00;

-- view ; 

create view products_view as
select productcode , productname , buyprice , productvendor
from products ;

select *
from products_view ;

create or replace view products_view as
select productcode , productname , buyprice , productvendor , productline
from products
where productvendor = 'Red Start Diecast'
 ;
 
 drop view products_view ; 
 
 -- store procedures 
 
 delimiter // 
 create procedure full_products()
 begin
 select * 
 from products ; 
 end //
 delimiter ;
 
 call full_products();
  -- thêm sản phẩm 
delimiter //
create procedure them_san_pham (`name` varchar(70),line varchar(50))
begin
insert into products(productName,productLine)
values (`name`,line) ;
end //
delimiter ;
 
call them_san_pham('xedapdien','Vintage Cars');

delimiter //
create procedure sua_san_pham (`name` varchar(70),line varchar(50))
begin
update products
set productName = `name` ,productLine = line 
where productcode is null ;
end //
delimiter ;


SET SQL_SAFE_UPDATES = 0;
call sua_san_pham('xe tang' , 'Ships');

delimiter //
create procedure xoa_san_pham (`code` varchar(15))
begin 
delete from products
where productcode = code ; 
end //
delimiter ;

call xoa_san_pham('123');

 


