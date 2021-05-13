use ss2_bai_test1;
CREATE TABLE customers(
   id INT AUTO_INCREMENT PRIMARY KEY,
   name VARCHAR(40),
   address VARCHAR(255),
   email VARCHAR(255)
);
create TABLE orders(
   id INT AUTO_INCREMENT,
   staff VARCHAR(50),
   PRIMARY KEY(id),
   customer_id INT,
   FOREIGN KEY (customer_id) REFERENCES customers(id)
);
CREATE TABLE contacts
( contact_id INT(11) NOT NULL AUTO_INCREMENT,
  last_name VARCHAR(30) NOT NULL,
  first_name VARCHAR(25),
  birthday DATE,
  CONSTRAINT contacts_pk PRIMARY KEY (contact_id)
);
-- Bảng contacts sẽ có 5 cột và một cột là khoá chính:

-- Cột contact_id có kiểu dữ liệu số nguyên (với tối đa 11 chữ số) và không thể chứa giá trị NULL. Giá trị của cột này sẽ được tự động tăng dần (Giá trị đầu tiên là 1, tiếp theo là 2, 3...).
-- Cột last_name có kiểu dữ liệu VARCHAR (chuỗi - với tối đa 30 ký tự) và không thể chứa giá trị NULL.
-- Cột first_name có kiểu dữ liệu VARCHAR (chuỗi - với tối đa 25 ký tự) và có thể chứa giá trị NULL.
-- Cột birthday có kiểu dữ liệu ngày tháng và có thể chứa giá trị NULL.
-- Khoá chính của bảng này có tên là contacts_pk và được gán cho cột contact_id.
CREATE TABLE suppliers
( supplier_id INT(11) NOT NULL AUTO_INCREMENT,
  supplier_name VARCHAR(50) NOT NULL,
  account_rep VARCHAR(30) NOT NULL DEFAULT 'TBD',
  CONSTRAINT suppliers_pk PRIMARY KEY (supplier_id)
);