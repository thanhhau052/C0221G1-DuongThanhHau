USE quan_li_ban_hang;
INSERT INTO customer(c_name,c_age)
VALUES ("Minh Quan",10),
("Ngoc Oanh",20),
("Hong Ha",50);

INSERT INTO orders(c_id,o_date)
VALUES (1,"2006-03-21"),
	(2,"2006-03-23"),
    (1,"2006-03-16");
    
INSERT INTO product(p_name,p_price)
VALUES ("May Giat",3),
	 ("Tu Lanh",5),
      ("Dieu Hoa",7),
       ("Quat",1),
        ("Bep Dien",2);
        
INSERT INTO orderdetail(o_id,p_id,od_qty)
VALUES (1,1,3),
(1,3,7),
(1,4,2),
(2,1,1),
(3,1,8),
(2,5,4),
(2,3,3);


select o.o_id, o.o_date, p.p_price 
from orders o join orderdetail od on o.o_id = od.o_id join product p on od.p_id = p.p_id;

select c.c_name,  p.p_name
from customer c join orders o on c.c_id = o.c_id
join orderdetail od on o.o_id = od.o_id 
join product p on od.p_id = p.p_id;


select  c.c_name 
from  customer c
where not  exists ( 
select o.c_id from orders o where  o.c_id = c.c_id );


select o.o_id,  o.o_date, sum(od.od_qty * p.p_price) as o_total_price
from  orders o 
join orderdetail od on  o.o_id = od.o_id
join product p on od.p_id = p.p_id 
group by o.o_id,  o.o_date;