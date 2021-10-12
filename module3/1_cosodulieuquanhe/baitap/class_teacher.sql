drop database if exists school;

create database school;

create table school.class(
id int,
name varchar(50)
);

create table school.teacher(
id int primary key,
name varchar(50) ,
age int not null , 
country varchar(50) not null );