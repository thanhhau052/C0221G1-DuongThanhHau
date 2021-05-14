use quan_li_ban_hang;
insert into customer(cNAME,cAGE)
values ("Minh Quan",10),
("Ngoc Oanh",20),
("Hong Ha",50);

insert into orders(cID,oDATE)
values (1,"2006-03-21"),
	(2,"2006-03-23"),
    (1,"2006-03-16");
    
insert into product(pName,pPrice)
values ("May Giat",3),
	 ("Tu Lanh",5),
      ("Dieu Hoa",7),
       ("Quat",1),
        ("Bep Dien",2);
        
insert into orderdetail(oID,pID,odQTY)
values (1,1,3),
(1,3,7),
(1,4,2),
(2,1,1),
(3,1,8),
(2,5,4),
(2,3,3);


select o.oID, o.oDate, p.pPrice 
from orders o join orderdetail od on o.oID = od.oID join product p on od.pID = p.pID;

select c.cName,  p.pName
from customer c join orders o on c.cID = o.cID
join orderdetail od on o.oID = od.oID 
join product p on od.pID = p.pID;


select  c.cName 
from  customer c
where not  exists ( 
select o.cID from orders o where  o.cID = c.cID );


select o.oID,  o.oDate, sum(od.odQTY * p.pPrice) as oTotalPrice
from  orders o 
join orderdetail od on  o.oID = od.oID
join product p on od.pID = p.pID 
group by o.oID,  o.oDate;