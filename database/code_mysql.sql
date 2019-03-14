--182.查找重复的电子邮箱
-- mysql
select email from (
    select t.email,count(1) cn from Person t group by t.email
) m where cn>1;

-- 595. 大的国家
--mysql
select t.name,t.population,t.area from World t where t.population >=25000000 or t.area>=3000000;
