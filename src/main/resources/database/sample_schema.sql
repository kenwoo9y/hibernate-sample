create table sample_sc.user (
    id varchar(80) not null primary key,
    user_name varchar (80),
    password varchar(80),
    email varchar(80),
    first_name varchar(40),
    last_name varchar(40),
    created_time timestamp,
    updated_time timestamp
);