create table if not exists cloud.users
(
    user_id  int primary key auto_increment,
    login    char(255) not null,
    password char(255) not null
);