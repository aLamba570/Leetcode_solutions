# Write your MySQL query statement below
select w1.id as id from weather w1 , weather w2 where DATEDIFF(w1.recorddate, w2.recorddate) =1 and w1.temperature > w2.temperature;