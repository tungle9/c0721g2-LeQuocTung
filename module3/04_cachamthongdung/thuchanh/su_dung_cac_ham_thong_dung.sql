use qlsv ; 
select address , count(studentID) 'số lượng học viên' 
from student
group by address ;

select s.studentid , s.studentname , avg(m.mark) as ' điểm trung bình  ' 
from student s join mark m on s.studentid = m.studentid 
group by s.studentid , s.studentname  ; 


select s.studentid , s.studentname , avg(m.mark) as ' điểm trung bình  ' 
from student s join mark m on s.studentid = m.studentid 
group by s.studentid , s.studentname 
having avg(mark) > 10 ; 

select s.studentid, s.studentname , avg(m.mark) as ' điểm trung bình  ' 
from student s join mark m on s.studentid = m.studentid 
group by s.studentid , s.studentname
order by m.mark desc
limit 1 ; 