create database QLSV;

use QLSV;

create table Class(
ClassID int not null auto_increment,
Classname varchar(60) not null,
StartDate datetime not null ,
Status bit,
primary key (ClassID)
);

create table Student (
StudentID int not null auto_increment ,
StudentName varchar(30) not null , 
Address varchar(50),
Phone varchar(20),
Status bit,
ClassID int not null ,
primary key (StudentID),
foreign key(ClassID) references Class (ClassID)
);

create table Subject (
SubID int auto_increment,
SubName varchar(50),
Credit tinyint not null default 1 check (Credit >=1 ),
Status bit default 1 ,
primary key (SubID)
);

create table Mark(
MarkID int not null auto_increment primary key ,
SubID int not null , 
StudentID int not null ,
Mark float default 0 check ( Mark between 0 and 100 ) ,
Examtimes tinyint default 1 ,
unique(SubID , StudentID ),
foreign key (SubID) references Subject (SubID),
foreign key (StudentID) references Student (StudentID)
);


