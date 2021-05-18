-- Bước 1 : Tạo database 
drop database demo;
create  database  demo;


-- Bước 2: Tạo bảng product với các trường dữ liệu...
use demo;
create  table products(
	product_id int, -- id sp
    product_code varchar(50),  -- ma sp
    product_name varchar(50),  -- ten sp
    product_price int,  -- gia sp
    product_amount  int,  -- so tien sp
    produc_description varchar(50),  -- mo ta sp
    product_status varchar(50)  -- trang thai sp
    );

-- Chèn dữ liệu  vào bảng 

insert into products (product_id,product_code,product_name,product_price,product_amount,produc_description,product_status)
values
( 1,"p1","oto",10000,20000,"yamaha","hang con"),
( 2,"p2","xe may",1000,5000,"yamaha","hang con"),
( 3,"p3","xe tai",50000,80000,"huynh dai","hang con"),
( 4,"p4","tau",300,1000,"viet nam","hang con"),
( 5,"p5","may bay",100000,200000,"viet nam","hang con");

-- xem bang vua nhap

select * 
from products;
 
 -- Bước 3 :
    /*
		Tạo Unique Index trên bảng Products (sử dụng cột productCode để tạo chỉ mục)
		Tạo Composite Index trên bảng Products (sử dụng 2 cột productName và productPrice)
		Sử dụng câu lệnh EXPLAIN để biết được câu lệnh SQL của bạn thực thi như nào
		So sánh câu truy vấn trước và sau khi tạo index
   */
 -- Tạo Unique Index trên bảng Products (sử dụng cột productCode để tạo chỉ mục)
 alter table products
 add unique index idx_product( product_code);
 
 
 -- tạo coposite index trên bảng product ( sử dụng 2 cột product_name và product_price)

 alter table products
 add unique index idx_product1( product_name, product_price);
 
   
-- Sử dụng câu lệnh EXPLAIN để biết được câu lệnh SQL của bạn thực thi như nào
explain select * 
from products 
where product_code ="p3";
/*
	 Bước 4 : 
     Tạo view lấy về các thông tin: productCode, productName, productPrice, productStatus từ bảng products.
	 Tiến hành sửa đổi view
	 Tiến hành xoá view
*/
--  Tạo view 
Create view view_thong_tin as
select product_code, product_name, product_price,product_status
from products;

-- Xem thông tin của view vừa tạo 
select * 
from view_thong_tin;

-- sửa đổi view 
update  view_thong_tin
set product_code="h1"
where product_name="oto";

-- xóa view 
drop view view_thong_tin;


/*
	Bước 5:
    Tạo store procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product
	Tạo store procedure thêm một sản phẩm mới
    Tạo store procedure sửa thông tin sản phẩm theo id
    Tạo store procedure xoá sản phẩm theo id
*/


-- Tạo sp lấy tất cả thông tin của tất cả sả phẩm trong product
delimiter //
create procedure thong_tin_sp()
begin
select *
from products;

end ; //
delimiter ;
-- gọi hàm 
call thong_tin_sp();


-- Tạo store procedure thêm một sản phẩm mới

delimiter //
create procedure them_sp
( in
	product_id int , 
    product_code varchar(50), 
    product_name varchar(50),  
    product_price int,  
    product_amount  int, 
    produc_description varchar(50), 
    product_status varchar(50)
)
begin 
insert into products
values (product_id,product_code, product_name,product_price,product_amount
,produc_description,product_status);

end; //
delimiter ;
call them_sp(7,"h2","xe dap", 100,200,"yamaha","hang con");



-- Tạo store procedure sửa thông tin sản phẩm theo id

delimiter //
create procedure sua_sp_theo_id( in
    product_id1 int , 
    product_code1 varchar(50), 
    product_name1 varchar(50),  
    product_price1 int,  
    product_amount1  int, 
    produc_description1 varchar(50), 
    product_status1 varchar(50))

begin 
update products 
set product_id= product_id1,
	product_code=product_code1,
    product_name=product_name1,
    product_price=product_price1,
    product_amount=product_amount1,
    produc_description=produc_description1,
	product_status=product_status1
    where product_id=product_id1;
end; //
delimiter ;

call   sua_sp_theo_id(1,"s1", "xe 3 may", 20,50,"usa","het hang");

-- Tạo sp xóa sản phẩm theo id
delimiter //
create procedure xoa_sp(in id int )
begin
delete from products 
where products.product_id=id;

end; //
delimiter ;

call xoa_sp(3);