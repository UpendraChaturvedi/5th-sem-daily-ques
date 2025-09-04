-- Last updated: 9/4/2025, 12:04:07 PM
# Write your MySQL query statement below
select class from courses group by class having count(student)>=5;
