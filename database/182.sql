--182.查找重复的电子邮箱

-- mysql
select email from (
    select t.email,count(1) cn from Person t group by t.email
) m where cn>1;
