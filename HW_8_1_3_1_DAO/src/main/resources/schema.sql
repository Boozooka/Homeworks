create schema if not exists my;
create table if not exists my.orders(
                          id integer auto_increment primary key,
                          date date,
                          customer_id integer,
                          product_name char(252),
                          amount integer,
                          foreign key f_id(customer_id) REFERENCES my.customers(id)
);

create table if not exists my.customers(
                             id integer auto_increment primary key,
                             name char(254),
                             surname char(254),
                             age integer,
                             phone_number char(10)
);

