create database USERLOGIN 
go 
use USERLOGIN 
go
create table account(
idUser int  IDENTITY(1,1), 
username varchar(20) , 
pass char(10) , 
gmail nchar(50 ) , 
) 

create table productSeller(
idProduct varchar(10) primary key ,
nameProduct varchar(30) ,
size int , 
price money , 
quantity int , 
color varchar(20)
)

select * from account
select * from productSeller
delete from productSeller where id ='P01'