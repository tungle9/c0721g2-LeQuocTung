use qlsv ; 

select *
from student 
where StudentName like 'h%';
;

select *
from class
where (select month (startdate) = 12) ;


select *
from Subject 
where Credit between 3 and 5 ; 

select *
from student ;


SET SQL_SAFE_UPDATES = 0;	
update student 
Set ClassID = 2
where StudentName = 'Tung';


-- Hiển thị các thông tin: StudentName, SubName, Mark. Dữ liệu
-- sắp xếp theo điểm thi (mark) giảm dần. nếu trùng sắp theo 
-- tên tăng dần.

select S.StudentID,S.StudentName,Sub.SubName,M.Mark
from Student S join Mark M on S.StudentID = M.StudentID 
join `Subject` Sub
on M.SubID = Sub.SubID 
order by M.Mark DESC ;

