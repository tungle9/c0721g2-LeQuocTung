use qlsv ; 
select * from student;

select * 
from student
where Status = true ;

select * 
from subject 
where Credit < 10;  

SELECT S.StudentId, S.StudentName, C.ClassName
FROM Student S join Class C on S.ClassId = C.ClassID
where C.Classname = '12/5';

select S.StudentId , S.StudentName , Sub.Subname , M.mark 
FROM Student S join Mark M on S.StudentId = M.StudentId join Subject Sub on M.SubId = Sub.SubId
WHERE Sub.SubName = 'CF';

