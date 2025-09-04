-- Last updated: 9/4/2025, 12:00:31 PM
# Write your MySQL query stat
SELECT s.user_id, ROUND(AVG(IF(c.action="confirmed",1,0)),2) AS confirmation_rate
FROM Signups AS s
LEFT JOIN Confirmations AS c
ON s.user_id = c.user_id
GROUP BY s.user_id;