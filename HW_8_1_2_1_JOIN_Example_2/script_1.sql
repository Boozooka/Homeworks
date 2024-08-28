create schema my;
create table my.customers(
                             id integer auto_increment primary key,
                             name char(254),
                             surname char(254),
                             age integer,
                             phone_number char(10)
);
insert into my.customers (name, surname, age, phone_number)
    value (lower('arseniy'), 'perdyaev', 24, '8005553535');
insert into my.customers (name, surname, age, phone_number)
    value (lower('aleksey'), 'chipcherishko', 2, '9539797944');
insert into my.customers (name, surname, age, phone_number)
    value (lower('genadiy'), 'chuleh', 24, '8005553535');
insert into my.customers (name, surname, age, phone_number)
    value (lower('aleksey'), 'chauchurku', 2, '9539797944');