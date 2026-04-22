SELECT name
FROM customers 
WHERE name NOT IN (SELECT c.name
                    FROM customers c JOIN orders o
                    ON c.id = o.customer_id
                    GROUP BY c.name)

