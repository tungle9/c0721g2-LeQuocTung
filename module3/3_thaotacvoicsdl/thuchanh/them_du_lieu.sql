use QLSV;

insert into Class
values (1,'12/5','1998-10-16',1);
insert into Class
values (2,'12/5','1998-11-11',1);

update class set Status = 0
where ClassID = 2 ; 

insert into student (StudentName, Address, Phone, Status, ClassId)
values ('Tung','Da Nang ' , '111111' , 1,1);
insert into student (StudentName, Address, Phone, Status, ClassId)
values ('Hieu','Da Nang ' , '2222222' ,0,2);
insert into student (StudentName, Address, Phone, Status, ClassId)
values ('Tien','Da Nang ' , '2222222' ,0,1);

 
 delete from student 
 where ClassID = 2;
 
 
 insert into subject
 values (1,'cf',5,1),
      (2,'c',6,1),
(3, 'HDJ', 5, 1),
(4, 'RDBMS', 10, 1);
 
 
 insert into mark (SubID,StudentID,Mark,Examtimes)
 values (1,24,8,1),
 (1,25,10,2),
 (2,28,12,1);
 


