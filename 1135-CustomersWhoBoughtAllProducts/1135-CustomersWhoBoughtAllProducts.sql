-- Last updated: 9/4/2025, 12:02:16 PM
# Write your MySQL query statement below
select customer_id from customer group by customer_id having count(distinct product_key)=(select count(product_key) from product);