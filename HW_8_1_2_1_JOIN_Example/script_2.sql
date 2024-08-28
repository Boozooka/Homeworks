create table my.orders(
                          id integer auto_increment primary key,
                          date date,
                          customer_id integer,
                          product_name char(252),
                          amount integer
);

insert into my.orders(date, customer_id, product_name, amount)
    value ('2023-01-30', 1, 'bicycle', 30000);
insert into my.orders(date, customer_id, product_name, amount)
    value ('2023-05-05', 2, 'tablet', 12000);
insert into my.orders(date, customer_id, product_name, amount)
    value ('2019-05-05', 3, 'comb', 100);
insert into my.orders(date, customer_id, product_name, amount)
    value ('2014-01-30', 4, 'bread', 94000);