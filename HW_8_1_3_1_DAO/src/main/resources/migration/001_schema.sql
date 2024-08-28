create table my.customers(
    id int primary key auto_increment,
    name char(252),
    surname char(252),
    age int,
    phone_number char(11)
);

create table my.orders(
    id int primary key auto_increment,
    date date,
    customer_id int,
    product_name char(252),
    amount int
);