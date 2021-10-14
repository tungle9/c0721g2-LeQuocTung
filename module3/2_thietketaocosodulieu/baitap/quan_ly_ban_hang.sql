drop database if exists quan_ly_ban_hang ; 

create database quan_ly_ban_hang; 

use quan_ly_ban_hang ; 

create table Customer(
CustomerID int, 
CustomnerName varchar(50),
CustomerAge int,
primary key(CustomerID) 
);

create table `Order`(
OrderID int primary key, 
OderDate date, 
OderToltalPrice float,
CustomerID_order int ,
foreign key (CustomerID_order) references Customer(CustomerID)
);

create table Product(
ProductID int primary key ,
ProductName varchar(50),
ProductPrice float
);

create table OrderDetail(
OrderID_detail int ,
ProductID_detail int ,
OderQTY  int ,
foreign key (OrderID_detail) references `Order`(OrderID),
foreign key (ProductID_detail) references ProDuct(ProDuctID)
);