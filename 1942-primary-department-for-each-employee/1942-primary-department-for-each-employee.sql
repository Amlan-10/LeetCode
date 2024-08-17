# Write your MySQL query statement below
SELECT DISTINCT Employee_id,department_id
FROM Employee where Employee_id in (SELECT
Employee_id from Employee group by Employee_id 
having count(Employee_id)=1)
OR primary_flag='Y';