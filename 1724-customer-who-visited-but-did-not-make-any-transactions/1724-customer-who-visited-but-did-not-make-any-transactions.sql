# Write your MySQL query statement below
Select customer_id, count(Visits.customer_id) as count_no_trans from Visits Left Join Transactions On Visits.visit_id=Transactions.visit_id
where transactions.transaction_id is null
group by Visits.customer_id
