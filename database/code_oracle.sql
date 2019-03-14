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

