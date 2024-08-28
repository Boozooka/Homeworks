select product_name
from my.customers c inner join my.orders o on c.id = o.customer_id
where c.name = 'aleksey'