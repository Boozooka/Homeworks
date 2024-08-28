insert into my.customers (name, surname, age, phone_number)
    value (lower('arseniy'), 'perdyaev', 24, '8005553535');
insert into my.customers (name, surname, age, phone_number)
    value (lower('aleksey'), 'chipcherishko', 2, '9539797944');
insert into my.customers (name, surname, age, phone_number)
    value (lower('genadiy'), 'chuleh', 24, '8005553535');
insert into my.customers (name, surname, age, phone_number)
    value (lower('aleksey'), 'chauchurku', 2, '9539797944');

insert into my.orders(date, customer_id, product_name, amount)
    value ('2023-01-30', 1, 'bicycle', 30000);
insert into my.orders(date, customer_id, product_name, amount)
    value ('2023-05-05', 2, 'tablet', 12000);
insert into my.orders(date, customer_id, product_name, amount)
    value ('2019-05-05', 3, 'comb', 100);
insert into my.orders(date, customer_id, product_name, amount)
    value ('2014-01-30', 4, 'bread', 94000);