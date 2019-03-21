--620. 有趣的电影
--oracle
select t.id,t.movie,t.description,t.rating from cinema t where t.description != 'boring' and mod(t.id,2)=1 order by rating desc;

--175. 组合两个表
--oracle
select p.FirstName,p.LastName,a.City,a.State from Person p left join Address a on p.PersonId=a.PersonId;

--627. 交换工资
--oracle
update salary s set s.sex=case when s.sex='f' then 'm' when s.sex='m' then 'f' end where 1=1;

--181. 超过经理收入的员工
--oracle
select name Employee from (
 select t.name,t.salary,(select x.Salary from Employee x where x.id=t.ManagerId) par from Employee t where t.ManagerId is not null
) d where d.salary>d.par;


--183. 从不订购的客户
--oracle
select t.Name Customers from Customers t where t.Id not in (
 select distinct(o.CustomerId) from Orders o 
);

--197. 上升的温度
--oracle
select t.Id
from Weather t
      left join Weather s
                on to_char(t.RecordDate - 1, 'yyyyMMdd') =
                   to_char(s.RecordDate, 'yyyyMMdd')
where t.Temperature > s.Temperature;

--596. 超过5名学生的课
--oracle
select class from (
  select class,count(distinct(student)) as nu from courses group by class
) t where t.nu>=5

--176. 第二高的薪水
--oracle
select nvl((
  select Salary from (
    select rownum num,s.* from(
        select Salary from Employee group by Salary order by Salary desc
      ) s
    ) where num=2
  ),null) as SecondHighestSalary
from dual;

--626. 换座位
--oracle
select
  (
    case
      when mod(id,2)=1 and id=(select max(id) from seat) then id
      when mod(id,2)=1 then id+1
      else id-1
      end
    ) as id,student
from seat
order by id asc;