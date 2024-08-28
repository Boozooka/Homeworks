select name from my.orders o join my.customers c on c.id = o.id
where lower(name) = :name;