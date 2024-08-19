# Write your MySQL query statement below
SELECT W2.id FROM 
WEATHER W1 INNER JOIN WEATHER W2 ON 
DATEDIFF(w1.recordDate,w2.recordDate)=-1 
where w1.temperature<w2.temperature;