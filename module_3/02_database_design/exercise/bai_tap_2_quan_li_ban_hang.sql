CREATE DATABASE if not exists quan_li_ban_hang;
USE quan_li_ban_hang ;

CREATE TABLE customer(
	c_id INT AUTO_INCREMENT PRIMARY KEY,
    c_name VARCHAR(30) NOT NULL,
    c_age INT CHECK(c_age BETWEEN 5 AND 80)
);

CREATE TABLE orders(
	o_id INT AUTO_INCREMENT PRIMARY KEY,
    c_id INT NOT NULL,
    oc_date DATETIME NOT NULL,
    o_total_price INT,
    FOREIGN KEY (c_id) REFERENCES Customer (c_id)
);
CREATE TABLE product(
	p_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    p_name VARCHAR(30) NOT NULL,
    p_price INT 
);

CREATE TABLE order_detail(
	o_id INT NOT NULL ,
    p_id INT NOT NULL,
    od_qty VARCHAR(30),
    PRIMARY KEY (o_id,p_id),
    FOREIGN KEY (o_id) REFERENCES orders(o_id),
    FOREIGN KEY (p_id) REFERENCES product(p_id)
); 