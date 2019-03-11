-- 595. 大的国家

--mysql
select t.name,t.population,t.area from World t where t.population >=25000000 or t.area>=3000000;
