-- Last updated: 9/4/2025, 12:04:05 PM
# Write your MySQL query statement below
select id,
case when p_id is null then "Root"
     when id in (select p_id from tree) then "Inner"
     else 'Leaf'
     end as type
from tree;
