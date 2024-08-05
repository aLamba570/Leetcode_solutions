# Write your MySQL query statement below
select distinct views.author_id as id from views where author_id = viewer_id order by id