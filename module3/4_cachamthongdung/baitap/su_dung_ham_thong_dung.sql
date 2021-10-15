use qlsv ; 


-- Hiển thị tất cả các thông tin môn học (bảng subject) 
-- có credit lớn nhất.
select sub.SubID , sub.SubName, max(sub.Credit)
from subject sub join mark m on 
sub.subid = m.subid
group by sub.SubName , sub.subid 
order by sub.Credit desc
limit 1 ; 
;
 --  Hiển thị các thông tin môn
 -- học có điểm thi lớn nhất.
select sub.SubID , m.Mark ,sub.SubName
from subject sub join mark m on 
sub.subid = m.subid
group by sub.SubID ,  m.Mark  , sub.subname 
order by m.mark desc
limit 1 
;
-- Hiển thị các thông tin sinh viên và
-- điểm trung bình của mỗi sinh viên, xếp hạng theo
-- thứ tự điểm giảm dần
select s.StudentName , s.StudentID , avg(m.Mark)
from student s join mark m on s.studentid = m.studentid 
group by s.StudentID , StudentName 
order by m.Mark asc ;



