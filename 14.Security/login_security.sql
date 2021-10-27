create database spring_security;
use spring_security ;

create table APP_USER(
USER_ID bigint not null,
USER_NAME varchar(255),
ENCRYTED_PASSWORD varchar(255) not null,
ENABLED bit not null
);

create table APP_ROLE(
 ROLE_ID bigint not null,
ROLE_NAME varchar(50) not null ) ;

 Create table  USER_ROLE (
ID bigint not null, 
USER_ID bigint not null,
ROLE_ID bigint not null );

alter table APP_USER add constraint APP_USER_PK primary key (USER_ID);

alter table APP_USER add constraint APP_USER_UK unique (USER_NAME);

alter table APP_ROLE add constraint APP_ROLE_PK primary key (ROLE_ID);

alter table APP_ROLE add constraint APP_ROLE_UK unique (ROLE_NAME);

alter table USER_ROLE add constraint USER_ROLE_PK primary key (ID);

alter table USER_ROLE add constraint USER_ROLE_UK unique (USER_ID, ROLE_ID);

alter table USER_ROLE add constraint USER_ROLE_FK1 foreign key (USER_ID) references APP_USER (USER_ID);

alter table USER_ROLE add constraint USER_ROLE_FK2 foreign key (ROLE_ID) references APP_ROLE (ROLE_ID);