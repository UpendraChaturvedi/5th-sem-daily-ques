-- Last updated: 9/4/2025, 11:59:47 AM
# Write your MySQL query statement below
select teacher_id,count(distinct subject_id) as cnt from teacher group by teacher_id;