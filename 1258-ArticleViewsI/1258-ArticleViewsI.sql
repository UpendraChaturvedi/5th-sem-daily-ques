-- Last updated: 9/4/2025, 12:02:02 PM
# Write your MySQL query statement below
select distinct author_id as id from views where author_id=viewer_id order by id;