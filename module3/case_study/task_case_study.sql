use case_study ; 
-- task 12  ; 
select hd.id_hop_dong ,nv.ho_ten,kh.ho_ten,kh.sdt,
dv.ten_dich_vu , count(hdct.so_luong)as 'số lượng dich vụ đi kèm',hd.tien_dat_coc
from hop_dong hd join nhan_vien nv
on hd.id_nhan_vien = nv.id_nhan_vien join khach_hang kh
on kh.id_khach_hang = hd.id_khach_hang join dich_vu dv
on dv.id_dich_vu = hd.id_dich_vu join hop_dong_chi_tiet hdct
on hdct.id_hop_dong = hd.id_hop_dong join dich_vu_di_kem dvdk
on dvdk.id_dich_vu_di_kem = hdct.id_dich_vu_di_kem 
where year((hd.ngay_lam_hop_dong) = 2020 and (month(hd.ngay_lam_hop_dong) between 10 and 12))
and not (year(hd.ngay_lam_hop_dong=2020) and (month(hd.ngay_lam_hop_dong) = 6));


-- 13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất 
select max(hdct.so_luong) as 'sử dụng nhiều nhất' , dvdk.ten_dich_vu_di_kem
from dich_vu_di_kem dvdk join hop_dong_chi_tiet hdct
on dvdk.id_dich_vu_di_kem = hdct.id_dich_vu_di_kem
group by hdct.so_luong
order by hdct.so_luong desc
limit 3 ;


-- 14.	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất.
 -- Thông tin hiển thị bao gồm IDHopDong, TenLoaiDichVu, TenDichVuDiKem, SoLanSuDung.
select hd.id_hop_dong ,ldv.ten_loai_dich_vu , dvdk.ten_dich_vu_di_kem ,hdct.so_luong
from hop_dong hd join  hop_dong_chi_tiet hdct
 on hd.id_hop_dong = hdct.id_hop_dong right join dich_vu_di_kem dvdk
 on hdct.id_dich_vu_di_kem = dvdk.id_dich_vu_di_kem  right join dich_vu dv 
 on hd.id_dich_vu = dv.id_dich_vu right join loai_dich_vu ldv
 on dv.id_dich_vu = ldv.id_loai_dich_vu 
 where hdct.so_luong = 1  ;
 
 -- task 15 15.	Hiển thi thông tin của tất cả nhân viên bao gồm IDNhanVien, HoTen, TrinhDo, TenBoPhan,
 -- SoDienThoai, DiaChi mới chỉ lập được tối đa 3 hợp đồng từ năm 2018 đến 2019.
 select nv.id_nhan_vien,nv.ho_ten,td.trinh_do,bp.ten_bo_phan,
 nv.sdt,nv.dia_chi 
 from vi_tri vt  join nhan_vien nv 
 on vt.id_vi_tri = nv.id_vi_tri join trinh_do td
 on td.id_trinh_do = nv.id_trinh_do join bo_phan bp
 on bp.id_bo_phan = nv.id_bo_phan join hop_dong hd
 on hd.id_nhan_vien = nv.id_nhan_vien
 where year(hd.ngay_lam_hop_dong) between 2018 and 2019;
 
 -- 16.	Xóa những Nhân viên chưa từng lập được hợp đồng
  -- nào từ năm 2017 đến năm 2019.
SET SQL_SAFE_UPDATES = 0;
 delete 
 from  nhan_vien nv
 where nv.id_nhan_vien not in ( 
 select hd.id_nhan_vien
 from hop_dong hd
 where hd.ngay_lam_hop_dong is null  or (hd.id_nhan_vien = nv.id_nhan_vien and year(hd.ngay_lam_hop_dong) between 2017 and 2019 ))
 ;
 
 -- task 17 
 update khach_hang kh
 set kh.id_loai_khach = 1  
 where kh.id_khach_hang in (
 select * 
from( select kh.id_loai_khach
 from khach_hang kh join hop_dong hd on hd.id_khach_hang = kh.id_khach_hang
 where year(hd.ngay_lam_hop_dong) = 2019 and kh.id_loai_khach = 2 
 having sum(hd.tong_tien) >= 10000000 )) ; 
 
 -- task 18
 SET SQL_SAFE_UPDATES = 0;
 delete 
 from khach_hang kh
 where kh.id_khach_hang not in (
 select hd.id_khach_hang
 from hop_dong hd 
 where year(hd.ngay_lam_hop_dong) >  2016 );
 
 -- task 19 
 -- 19.	Cập nhật giá cho các Dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2019 lên gấp đôi.
 update dich_vu_di_kem dvdk
 set dvdk.gia = dvdk.gia*2 
 where dvdk.id_dich_vu_di_kem in (
 select *
 from (select dvdk.id_dich_vu_di_kem 
 from hop_dong_chi_tiet hdct join dich_vu_di_kem dvdk
on hdct.id_dich_vu_di_kem = dvdk.id_dich_vu_kem 
where hdct.so_luong > 10 )); 

-- task 20 
select id_nhan_vien 'id' ,ho_ten,email,sdt,ngay_sinh,dia_chi
from nhan_vien 
union 
select id_khach_hang 'id' ,ho_ten,email,sdt,ngay_sinh,dia_chi
from khach_hang  ; 

 
 
 