create database form_register ;
use form_register ;

create table form_user(
id int primary key auto_increment ,
first_name varchar(50),
last_name varchar(50),
phone_number varchar(50),
age int ,
e_mail varchar(50));