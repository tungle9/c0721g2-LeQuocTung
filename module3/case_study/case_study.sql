drop database if exists case_study;
create database case_study ; 
use case_study ;

create table ViTri (
IDViTri int primary key ,
TenViTri varchar(45) );

create table TrinhDo (
IDTrinhDo int primary key ,
TrinhDo varchar(45) );

create table BoPhan (
IDBoPhan int primary key ,
TenBoPhan varchar(45) );


create table NhanVien (
IDNhanVien int primary key , 
HoTen varchar(50) ,
IDViTri int ,
IDTrinhDo int , 
IDBoPhan int,
NgaySinh date , 
SoCMND int , 
Luong int , 
SDT int ,
Email varchar(45),
DiaChi varchar(45),
foreign key (IDVitri ) references ViTri ( IDvitri) , 
foreign key (IDTrinhdo ) references TrinhDo(IDTrinhDo) ,
foreign key (IDBoPhan) references BoPhan(IDBoPhan) 
);

create table LoaiKhach(
IDLoaiKhach int primary key auto_increment , 
TenLoaiKhach varchar(45) 
);

create table KhachHang (
IDKhachHang int primary key auto_increment , 
IDLoaiKhach int ,
HoTen varchar(45) , 
NgaySinh date ,
SoCMND int , 
SDT int , 
Email varchar(45),
DiaChi varchar(45),
foreign key (IDLoaiKhach) references LoaiKhach(IDLoaiKhach)
);

create table KieuThue(
IDKieuThue int primary key  , 
TenKieuThue varchar(45) ,
Gia int 
);

create table LoaiDichVu (
IDLoaiDichVu int primary key, 
 TenLoaiDichVu varchar(45) 
);

create table DichVu(
IDDichVu int primary key , 
TenDichVu varchar(45) , 
DienTich int , 
SoTang int , 
SoNguoiToiDa int , 
ChiPhiThue varchar (45) , 
IDKieuThue int , 
IDLoaiDichVu int , 
TrangThai varchar (45) ,
foreign key (IDKieuThue) references KieuThue(IDKieuThue), 
foreign key (IDLoaiDichVu) references LoaiDichVu(IDLoaiDichVu) 
);


create table DichVuDiKem(
IDDichVuDiKem int primary key ,
TenDichVuDiKem varchar(45) ,
Gia int ,
DonVi int ,
TrangThaiKhaDung varchar(45)
);

create table HopDong(
IDHopDong int not null primary key , 
IDNhanVien int ,
IDKhachHang int ,
IDDichVu int ,
NgayLamHopDong date , 
NgayKetThuc date,
TienDatCoc int , 
TongTien int, 
foreign key (IDNhanVien) references NhanVien( IDNhanVien) ,
foreign key (IDKhachHang) references KhachHang(IDKhachHang),
foreign key ( IDDichVu ) references DichVu (IDDichVu)
);

create table HopDongChiTiet(
IDHopDongChiTiet int  ,
IDHopDong int ,
IDDichVuDiKem int ,
SoLuong int ,
primary key (IDHopDongChiTiet,IDHopDong , IDDichVuDiKem), 
foreign key (IDHopDong) references HopDong(IDHopDong) , 
foreign key  (IDDichVuDiKem) references DichVuDiKem(IDDichVuDiKem) 
);


-- task 1 
insert into nhanvien (IDNhanVien , HoTen ,SDT,DiaChi,NgaySinh)
values (1,'Nguyễn Văn Hùng',123456,'Da Nang','1990-10-10'),
 (2,'Phan Văn Tiến',4654654,'Da Nang','1991-11-2'),
 (3,'Lê Văn KHoa',4654654,'Da Nang','1994-12-8'),
 (4,'Lê Văn Ba',4154654,'Da Nang','1998-7-10');

insert into TrinhDo 
values (1, 'Cao Dang') ,
 (2, 'Dai hoc') ,
 (3, 'Trung Cap') ,
 (4, 'THPT') ;
 
 insert into ViTri
 values (1,'Buồng Phòng'),
 (2,'Bảo vệ'),
 (3,'quản lý'),
 (4,'giám đốc'),
 (5,'shipper');
 
 insert into BoPhan
 values (1,'Hành chính'),
		(2,'đi ca'),
		(3,'thời vụ');

insert into LoaiKhach(TenLoaiKhach)
values ('Diamond') , ('Platinium'),('Gold'),('Silver'),
		('Member');

insert into LoaiDichVu
value (1,'Villa'),(2,'House'),(3,'Room');


insert into khachhang(HoTen,NgaySinh,SoCMND,SDT,DiaChi)
values ('Văn Tèo','1997-12-12',211322,123123,'Quang Nam'),
 ('Văn Nam,','1994-12-16',212322,1232123,'Ha Nam'),
 ('Văn Bắc,','1987-2-12',215322,1235123,'Quang Ngai'),
 ('Văn Đông,','1991-4-12',215322,1235123,'Quang Tri');
 
 insert into kieuthue
 values (1,'Ngày',250000),
  (2,'Giờ',80000),
  (3,'Tháng',3000000)
 ;
 
 insert into dichvu(IDDichVu,TenDichVu,DienTich,SoTang,SoNguoiToiDa,ChiPhiThue,
 IDKieuThue,IDLoaiDichVu,TrangThai)
 values (1,'Villa',500,20,5,100000,1,null,'Trống'),
  (2,'House',200,15,4,100000,1,1,'Trống'),
  (3,'Room',150,7,2,100000,1,1,'Trống');
  
  insert into HopDong
  value (1,2,1,3,'2021-10-19','2021-11-19',1500000,30000000),
   (2,2,2,2,'2021-10-19','2021-11-19',700000,10000000),
   (3,3,3,1,'2021-10-19','2021-11-19',300000,900000);
   
     
insert into DichVuDiKem(IDDichVuDiKem,TenDichVuDiKem,Gia)
  values (1,'Massage',1000000),
   (2,'Karaoke',70000),
   (3,'Bánh kem mỹ',700000),
   (4,'Thám hiểm nhà ma',500000);
    
  insert into HopDongChiTiet
  value(1,1,1,5),
  (2,2,2,6),
  (3,3,3,6);

-- task 2 hiển thị tên bắt đầu là h k t 
select *
from NhanVien 
where HoTen like '%t%' or HoTen like '%k%' 
 or HoTen like '%h%' ;
 
 -- task 3 
select *
from khachhang 
where diachi in('da nang ' ,'quang tri') and timestampdiff(year,ngaysinh,curdate()) between 18 and 50  ; 


 
     
   
  
 
 





 




