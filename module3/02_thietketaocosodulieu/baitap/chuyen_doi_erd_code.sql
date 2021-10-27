drop database if exists xay_dung;

create database xay_dung ; 
use xay_dung ; 

create table phieu_xuat(
SoPX int ,
NgayXuat date ,
primary key (SoPX)
);

create table vat_tu(
MaVTU int primary key,
TenVTU varchar(50)
);

create table chi_tiet_phieu_xuat(
SLXuat int ,
DGXuat int ,
so_phieu_xuat int ,
ma_vat_tu_xuat int ,
primary key (so_phieu_xuat , ma_vat_tu_xuat), 
foreign key (so_phieu_xuat) references phieu_xuat(SoPX),
foreign key (ma_vat_tu_xuat) references vat_tu(MaVTU)
);

create table phieu_nhap(
SoPN int primary key ,
NgayNhap date 
);

create table chi_tiet_phieu_nhap(
SLNhap int ,
DGNhap int ,
so_phieu_nhap int ,
ma_vat_tu int ,
primary key (so_phieu_nhap , ma_vat_tu) , 
foreign key (so_phieu_nhap) references phieu_nhap(SoPN),
foreign key (ma_vat_tu) references vat_tu(MaVTU)
);


create table don_dat_hang(
SoDH int , 
NgayDH date ,
primary key (SoDH)
);

create table chi_tiet_don_hang (
ngay_dat_hang date ,
ma_don_hang int ,
ma_vat_tu int ,
primary key(ma_vat_tu , ma_don_hang),
foreign key (ma_don_hang) references don_dat_hang(SoDH),
foreign key (ma_vat_tu) references vat_tu(MaVTU)
);

create table sdt(
sdt_nha_cung_cap int(12),
sdt_don_dat_hang int(12),
primary key (sdt_nha_cung_cap,sdt_don_dat_hang)
);


create table nha_cung_cap(
ma_ncc int , 
SDT int (12),
ten_ncc varchar(50),
dia_chi varchar(50),
primary key(ma_ncc),
foreign key (SDT) references sdt(sdt_nha_cung_cap)
);



create table cung_cap(
SoDH int , 
ma_nha_cung_cap int ,
ten_nha_cung_cap varchar(50),
ngay_cung_cap date , 
primary key (SoDH,ma_nha_cung_cap),
foreign key (SoDH) references don_dat_hang (SoDH), 
foreign key(ma_nha_cung_cap) references nha_cung_cap(ma_ncc)
);








