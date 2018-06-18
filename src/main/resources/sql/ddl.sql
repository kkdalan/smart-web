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

CREATE TABLE user (
	id bigint(20) NOT NULL AUTO_INCREMENT,
    username varchar(255) DEFAULT NULL,
    password varchar(255) DEFAULT NULL,
    PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE role (
	id bigint(20) NOT NULL AUTO_INCREMENT,
    role_name varchar(255) DEFAULT NULL,
    PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE permission (
	id bigint(20) NOT NULL AUTO_INCREMENT,
    permission_name varchar(255) DEFAULT NULL,
    PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE user_role (
	id bigint(20) NOT NULL AUTO_INCREMENT,
    user_id bigint(20),
    role_id bigint(20),
    PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE role_permission (
	id bigint(20) NOT NULL AUTO_INCREMENT,
    role_id bigint(20),
	permission_id bigint(20),
    PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


select * from Customer;
select * from product;
select * from log;

select * from user;
select * from role;
select * from permission;
select * from user_role;
select * from role_permission;

create database demo_test;
use demo_test;