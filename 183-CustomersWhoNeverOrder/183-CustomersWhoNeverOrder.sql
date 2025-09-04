-- Last updated: 9/4/2025, 12:06:35 PM
# Write your MySQL query statement below
select name as customers from customers
where id not in
(select customerid from orders)
