CREATE DATABASE IF NOT EXISTS COMMUNITY;
drop table if exists 'COMMUNITY'.'USERS';
create table 'COMMUNITY'.'USERS' (
    'id' bigint(20) not null auto_increment,
    'account' varchar (20) not null,
    'password' text not null,
    'nick_name' varchar (50) not null,
    'deleted' boolean not null default false,
    'updated_at' timestamp not null default now() on update now(),
    'created_at' timestamp not null default now(),
    primary key ('id')
)
engine = InnoDB
default character set = utf8
collate = utf8_bin;