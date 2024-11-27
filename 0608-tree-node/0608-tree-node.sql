# Write your MySQL query statement below
Select id, case when p_id is null then "Root"
when id not in (Select p_id from Tree where p_id is not null)
then "Leaf" else "Inner" end as type
from Tree 