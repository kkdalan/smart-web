

create database demo;
use demo;

CREATE TABLE customer (
	id bigint(20) NOT NULL AUTO_INCREMENT,
    name varchar(255) DEFAULT NULL,
    contact varchar(255) DEFAULT NULL,
    telephone varchar(255) DEFAULT NULL,
    email varchar(255) DEFAULT NULL,
    remark text,
    PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO customer VALUES('1','customer1','Jack',13512345678,'jack@gmail.com',null);
INSERT INTO customer VALUES('2','customer2','Rose',13623456789,'rose@gmail.com',null);

CREATE TABLE product (
	id bigint(20) NOT NULL AUTO_INCREMENT,
    name varchar(255) DEFAULT NULL,
    price decimal(15,2),
    PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO product VALUES(1,'product1',1000);
INSERT INTO product VALUES(2,'product2',2000);

CREATE TABLE log (
	created varchar(25),
    description text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

select * from Customer;
select * from product;
select * from log;

create database demo_test;
use demo_test;