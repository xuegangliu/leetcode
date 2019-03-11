--620. 有趣的电影

--oracle
select t.id,t.movie,t.description,t.rating from cinema t where t.description != 'boring' and mod(t.id,2)=1 order by rating desc;
