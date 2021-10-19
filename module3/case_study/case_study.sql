drop database if exists case_study;
use case_study ;

create table vi_tri (
id_vi_tri int primary key ,
ten_vi_tri varchar(45) );

create table trinh_do (
id_trinh_do int primary key ,
trinh_do varchar(45) );

create table bo_phan (
id_bo_phan int primary key ,
ten_bo_phan varchar(45) );


create table nhan_vien (
id_nhan_vien int primary key , 
ho_ten varchar(50) ,
id_vi_tri int ,
id_trinh_do int , 
id_bo_phan int,
ngay_sinh date , 
SoCMND int , 
Luong int , 
SDT int ,
Email varchar(45),
dia_chi varchar(45),
foreign key (id_vi_tri ) references vi_tri ( id_vi_tri) , 
foreign key (id_trinh_do ) references trinh_do(id_trinh_do) ,
foreign key (id_bo_phan) references bo_phan(id_bo_phan) 
);

create table loai_khach(
id_loai_khach int primary key auto_increment , 
ten_loai_khach varchar(45) 
);

create table khach_hang (
id_khach_hang int primary key auto_increment , 
id_loai_khach int ,
ho_ten varchar(45) , 
ngay_sinh date ,
SoCMND int , 
SDT int , 
Email varchar(45),
dia_chi varchar(45),
foreign key (id_loai_khach) references loai_khach(id_loai_khach)
);

create table kieu_thue(
id_kieu_thue int primary key  , 
ten_kieu_thue varchar(45) ,
Gia int 
);

create table loai_dich_vu (
id_loai_dich_vu int primary key, 
 ten_loai_dich_vu varchar(45) 
);

create table dich_vu(
id_dich_vu int primary key , 
ten_dich_vu varchar(45) , 
dien_tich int , 
so_tang int , 
so_nguoi_toi_da int , 
chi_phi_thue varchar (45) , 
id_kieu_thue int , 
id_loai_dich_vu int , 
trang_thai varchar (45) ,
foreign key (id_kieu_thue) references kieu_thue(id_kieu_thue), 
foreign key (id_loai_dich_vu) references loai_dich_vu(id_loai_dich_vu) 
);


create table dich_vu_di_kem(
id_dich_vu_di_kem int primary key ,
ten_dich_vu_di_kem varchar(45) ,
Gia int ,
don_vi int ,
trang_thai_kha_dung varchar(45)
);

create table hop_dong(
id_hop_dong int not null primary key , 
id_nhan_vien int ,
id_khach_hang int ,
id_dich_vu int ,
ngay_lam_hop_dong date , 
ngay_ket_thuc date,
tien_dat_coc int , 
tong_tien int, 
foreign key (id_nhan_vien) references nhan_vien( id_nhan_vien) ,
foreign key (id_khach_hang) references khach_hang(id_khach_hang),
foreign key ( id_dich_vu ) references dich_vu (id_dich_vu)
);

create table hop_dong_chi_tiet(
id_hop_dong_chi_tiet int  ,
id_hop_dong int ,
id_dich_vu_di_kem int ,
so_luong int ,
primary key (id_hop_dong_chi_tiet,id_hop_dong , id_dich_vu_di_kem), 
foreign key (id_hop_dong) references hop_dong(id_hop_dong) , 
foreign key  (id_dich_vu_di_kem) references dich_vu_di_kem(id_dich_vu_di_kem) 
);


-- task 1 
insert into nhan_vien (id_nhan_vien , ho_ten ,SDT,dia_chi,ngay_sinh)
values (1,'Nguyễn Văn Hùng',123456,'Da Nang','1990-10-10'),
 (2,'Phan Văn Tiến',4654654,'Da Nang','1991-11-2'),
 (3,'Lê Văn KHoa',4654654,'Da Nang','1994-12-8'),
 (4,'Lê Văn Ba',4154654,'Da Nang','1998-7-10');

insert into trinh_do 
values (1, 'Cao Dang') ,
 (2, 'Dai hoc') ,
 (3, 'Trung Cap') ,
 (4, 'THPT') ;
 
 insert into vi_tri
 values (1,'Buồng Phòng'),
 (2,'Bảo vệ'),
 (3,'quản lý'),
 (4,'giám đốc'),
 (5,'shipper');
 
 insert into bo_phan
 values (1,'Hành chính'),
		(2,'đi ca'),
		(3,'thời vụ');

insert into loai_khach(ten_loai_khach)
values ('Diamond') , ('Platinium'),('Gold'),('Silver'),
		('Member');

insert into loai_dich_vu
value (1,'Villa'),(2,'House'),(3,'Room');


insert into khach_hang(ho_ten,ngay_sinh,SoCMND,SDT,dia_chi)
values ('Văn Tèo','1997-12-12',211322,123123,'Quang Nam'),
 ('Văn Nam,','1994-12-16',212322,1232123,'Ha Nam'),
 ('Văn Bắc,','1987-2-12',215322,1235123,'Quang Ngai'),
 ('Văn Đông,','1991-4-12',215322,1235123,'Quang Tri');
 
 insert into kieu_thue
 values (1,'Ngày',250000),
  (2,'Giờ',80000),
  (3,'Tháng',3000000)
 ;
 
 insert into dich_vu(id_dich_vu,ten_dich_vu,dien_tich,so_tang,so_nguoi_toi_da,chi_phi_thue,
 id_kieu_thue,id_loai_dich_vu,trang_thai)
 values (1,'Villa',500,20,5,100000,1,null,'Trống'),
  (2,'House',200,15,4,100000,1,1,'Trống'),
  (3,'Room',150,7,2,100000,1,1,'Trống');
  
  insert into hop_dong
  value (1,2,1,3,'2021-10-19','2021-11-19',1500000,30000000),
   (2,2,2,2,'2021-10-19','2021-11-19',700000,10000000),
   (3,3,3,1,'2021-10-19','2021-11-19',300000,900000);
   
     
insert into dich_vu_di_kem(id_dich_vu_di_kem,ten_dich_vu_di_kem,Gia)
  values (1,'Massage',1000000),
   (2,'Karaoke',70000),
   (3,'Bánh kem mỹ',700000),
   (4,'Thám hiểm nhà ma',500000);
    
  insert into hop_dong_chi_tiet
  value(1,1,1,5),
  (2,2,2,6),
  (3,3,3,6);

-- task 2 hiển thị tên bắt đầu là h k t 
select *
from nhan_vien 
where ho_ten like '%t%' or ho_ten like '%k%' 
 or ho_ten like '%h%' ;
 
 -- task 3 
select *
from khach_hang 
where dia_chi in('da nang ' ,'quang tri') and timestampdiff(year,ngay_sinh,curdate()) between 18 and 50  ; 

-- task 4 
select kh.id_khach_hang,kh.ngay_sinh,kh.ho_ten,kh.dia_chi,count(hd.id_khach_hang),
lk.ten_loai_khach
from khach_hang kh join hop_dong hd 
on kh.id_loai_khach = hd.id_khach_hang join 
loai_khach lk on lk.id_loai_khach = kh.id_loai_khach
where kh.id_loai_khach = 1
group by hd.id_khach_hang , lk.id_loai_khach
order by count(hd.id_khach_hang);

-- task 5
select kh.id_khach_hang , kh.ho_ten, lk.ten_loai_khach
,hd.id_hop_dong, dv.ten_dich_vu , hd.ngay_lam_hop_dong,
hd.ngay_ket_thuc,sum(dv.chi_phi_thue+hdct.so_luong + dvdk.gia ) as 'tổng tiền'
from  khach_hang kh  join loai_khach lk 
on kh.id_loai_khach = kh.id_loai_khach 
left join hop_dong hd on kh.id_khach_hang = hd.id_khach_hang
left join dich_vu dv on dv.id_dich_vu = hd.id_dich_vu 
left join hop_dong_chi_tiet hdct on hdct.id_hop_dong = hd.id_hop_dong 
left join dich_vu_di_kem dvdk on dvdk.id_dich_vu_di_kem = hdct.id_dich_vu_di_kem 
group by kh.ho_ten;

-- TASK 6  
select dv.id_dich_vu, dv.ten_dich_vu , dv.dien_tich,dv.chi_phi_thue,
dv.ten_dich_vu
from dich_vu dv
join hop_dong hd on dv.id_dich_vu = hd.id_dich_vu
where (year(hd.ngay_lam_hop_dong) = 2019) and (month(hd.ngay_lam_hop_dong) between 1 and 3 );

-- task 7 
select dv.id_dich_vu, dv.ten_dich_vu , dv.dien_tich,dv.chi_phi_thue,
dv.ten_dich_vu
from dich_vu dv
join hop_dong hd on dv.id_dich_vu = hd.id_dich_vu
where (year(hd.ngay_lam_hop_dong) = 2020) and not (year(hd.ngay_lam_hop_dong) = 2019)  ;

-- task 8 
 select distinct ho_ten  
 from khach_hang  ;
 
 -- task 9 
select hd.id_hop_dong,hd.ngay_lam_hop_dong,hd.ngay_ket_thuc, kh.ho_ten, kh.id_khach_hang,
sum(dv.chi_phi_thue+hdct.so_luong + dvdk.gia ) as 'tổng tiền'
from hop_dong hd join khach_hang kh 
on hd.id_khach_hang = kh.id_khach_hang join hop_dong_chi_tiet hdct
on hd.id_hop_dong = hdct.id_hop_dong join dich_vu_di_kem dvdk
on dvdk.id_dich_vu_di_kem = hdct.id_dich_vu_di_kem join dich_vu dv 
on dv.id_dich_vu = hd.id_dich_vu
group by kh.ho_ten 
 ; 
 
-- task 10 
select hd.id_hop_dong ,hd.ngay_lam_hop_dong , hd.ngay_ket_thuc,
hd.tien_dat_coc ,count(hdct.id_hop_dong_chi_tiet) as 'số lượng đi kèm'
from hop_dong hd join hop_dong_chi_tiet hdct on
hd.id_hop_dong = hdct.id_hop_dong join dich_vu_di_kem dvdk
on dvdk.id_dich_vu_di_kem = hdct.id_dich_vu_di_kem
group by hd.id_hop_dong  ;

-- task 11 
select kh.ho_ten,kh.dia_chi ,dvdk.id_dich_vu_di_kem,dvdk.ten_dich_vu_di_kem
,dvdk.id_dich_vu_di_kem,dvdk.Gia,kh.id_khach_hang
from khach_hang kh join hop_dong hd
on kh.id_khach_hang = hd.id_khach_hang join hop_dong_chi_tiet hdct
on hd.id_hop_dong = hdct.id_hop_dong join dich_vu_di_kem dvdk
on hdct.id_dich_vu_di_kem = dvdk.id_dich_vu_di_kem
where kh.id_loai_khach = 1 and (kh.dia_chi = 'Vinh' or kh.dia_chi = 'Quang Ngai');

  
  
 
 





 




