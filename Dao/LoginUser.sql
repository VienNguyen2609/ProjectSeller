create database USERLOGIN 
go 
use USERLOGIN 
go
create table account(
idUser int  IDENTITY(1,1) primary key , 
username varchar(20) unique NOT NULL , 
pass varchar(10) NOT NULL, 
gmail nchar(50 ) NOT NULL  
) 

create table productSeller(
idProduct varchar(10) primary key ,
nameProduct varchar(30) NOT NULL,
size int , 
price money , 
quantity int , 
color varchar(20)
)

create table ProductBill(
idBILL int  IDENTITY(1,1)  PRIMARY KEY  ,
username varchar(20)  , 
idProduct varchar(10) ,
nameProduct varchar(30) ,
price money , 
quantity int ,
totalTax AS (price * quantity) PERSISTED,
CONSTRAINT fk_ProductBill_User FOREIGN KEY (username) REFERENCES account(username),
CONSTRAINT fk_ProductBill_Product FOREIGN KEY (idProduct) REFERENCES productSeller(idProduct))

select * from account
insert into account values 
('vien12' , '123','huuu')
insert into productSeller values 
('P01' , 'Nike',39 , 100 , 6,'Green')
select * from productSeller
select * from ProductBill
insert into ProductBill values 
( 'vien12','P01','Nike' , 100, 6 )
select *  from ProductBill where username ='vien12'