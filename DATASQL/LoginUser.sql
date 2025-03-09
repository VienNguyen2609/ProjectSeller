create database USERLOGIN 
go 
use USERLOGIN 
go
create table account(
username varchar(20) , 
pass char(10) , 
gmail nchar(50 ) , 
Constraint PK_US primary key ( username)
) 

create table productSeller(
nameProduct varchar(30) primary key ,
size int , 
price money , 
quantity int , 
color varchar(20)
)

select * from account
select * from productSeller
select * from productSeller where nameProduct like 'tuan'
delete from account 