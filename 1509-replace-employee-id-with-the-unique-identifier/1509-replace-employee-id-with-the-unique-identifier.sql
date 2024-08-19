# Write your MySQL query statement below
Select e1.unique_id,e.name from Employees as e left join 
EmployeeUNI e1 on e.id=e1.id;