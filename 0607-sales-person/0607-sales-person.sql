# Write your MySQL query statement below
SELECT name from SalesPerson 
where sales_id not in
(Select o.sales_id from company c inner join
orders o on c.com_id=o.com_id where c.name='RED');