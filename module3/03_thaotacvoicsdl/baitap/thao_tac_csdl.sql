use quan_ly_ban_hang ; 

insert into customer 
values (1,'Minh Quan', 10) ,
	(2,'Ngoc Anh',20),
    (3,'Hong Ha',50);
    
insert into `order`
values (1,3/21/2006,null,1),
		(2,3/23/2006,null,2),
        (3,3/16/2006,null,3);

insert into product
values (1,'may giat', 5),
		(2,'may ui', 10),
	(3,'may sinh to', 10);
    
insert into orderdetail
values (1,1,5),
	(1,3,8),
    (2,2,4),
    (3,3,2);
    
select *
from `order` ; 
-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách
-- sản phẩm được mua bởi các khách
select c.customnerName , p.productName , o.orderID 
from customer c join `order` o on
 c.customerid = o.customerid_order join product p
 on p.ProductID = o.OrderID 
 ; 
 -- Hiển thị tên những khách hàng không mua bất kỳ một
 -- sản phẩm nào 
 select  c.CustomerID ,c.customnerName ,o.OrderID 
from customer c join `order` o on
 c.CustomerID = o.CustomerID_order
 where o.customerid_order is null ; 
 ; 
 
 
 -- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng 
 -- hóa đơn (giá một hóa đơn được tính bằng tổng
 select ord.productid_detail , `order`.orderid , sum(ord.oderqty * p.productprice ) 
from orderdetail ord join `order` on 
 ord.orderid_detail = `order`.orderID 
 join product p on p.productID = ord.productid_detail
 group by  `order`.orderid , ord.orderid_detail ; 
 ; 
 
 






