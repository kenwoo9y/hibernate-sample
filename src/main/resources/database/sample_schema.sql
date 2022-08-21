create table sample_sc.users (
    id serial not null primary key,
    user_name varchar (80) not null,
    password varchar(80),
    email varchar(80),
    first_name varchar(40),
    last_name varchar(40),
    created_time timestamp not null,
    updated_time timestamp not null
);