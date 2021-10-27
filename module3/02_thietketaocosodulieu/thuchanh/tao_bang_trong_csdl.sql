drop database if exists QuanLyDiemThi;

create database QuanLyDiemThi;

use QuanLyDiemThi;

create table HocSinh(
MaHS int(10) auto_increment,
TenHS varchar(50) ,
NgaySinh date,
Lop int(2),
GT varchar(20),
primary key (MaHS)
);

create table MonHoc(
MaMH int(10) primary key,
tenMH varchar(20)
);

create table BangDiem(
MaHS int(10),
MaMH int(10),
DiemThi int,
NgayKT datetime,
primary key ( MaHS,MaMH),
foreign key (MaHS) references HocSinh(MaHS),
foreign key (MaMH) references MonHoc(MaMH)
);

create table GiaoVien(
MaGV int(10) primary key,
TenGV varchar(20),
SDT int(11)
);

alter table MonHoc add MaGV int(10);
alter table MonHoc add constraint FK_MaGV foreign key (MaGV) references GiaoVien(MaGV);
