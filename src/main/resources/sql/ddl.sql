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

select * from Customer;


CREATE TABLE user (
	id bigint(20) NOT NULL AUTO_INCREMENT,
    username varchar(255) DEFAULT NULL,
    password varchar(255) DEFAULT NULL,
    PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO user VALUES('1','alan','alan');
INSERT INTO user VALUES('2','tom','tom');
INSERT INTO user VALUES('3','david','david');


CREATE TABLE role (
	id bigint(20) NOT NULL AUTO_INCREMENT,
    role_name varchar(255) DEFAULT NULL,
    PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO role VALUES('1','admin');
INSERT INTO role VALUES('2','manager');
INSERT INTO role VALUES('3','employee');

CREATE TABLE permission (
	id bigint(20) NOT NULL AUTO_INCREMENT,
    permission_name varchar(255) DEFAULT NULL,
    PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO permission VALUES('1','customer:show');
INSERT INTO permission VALUES('2','customer:create');
INSERT INTO permission VALUES('3','customer:edit');
INSERT INTO permission VALUES('4','customer:delete');
INSERT INTO permission VALUES('5','customer:list');

CREATE TABLE user_role (
	id bigint(20) NOT NULL AUTO_INCREMENT,
    user_id bigint(20),
    role_id bigint(20),
    PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO user_role VALUES('1','1','1');
INSERT INTO user_role VALUES('2','2','2');
INSERT INTO user_role VALUES('3','3','3');

CREATE TABLE role_permission (
	id bigint(20) NOT NULL AUTO_INCREMENT,
    role_id bigint(20),
	permission_id bigint(20),
    PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO role_permission VALUES('1','1','1');
INSERT INTO role_permission VALUES('2','1','2');
INSERT INTO role_permission VALUES('3','1','3');
INSERT INTO role_permission VALUES('4','1','4');
INSERT INTO role_permission VALUES('5','1','5');

INSERT INTO role_permission VALUES('6','2','1');
INSERT INTO role_permission VALUES('7','2','5');
INSERT INTO role_permission VALUES('8','2','4');

INSERT INTO role_permission VALUES('9','3','1');
INSERT INTO role_permission VALUES('10','3','2');
INSERT INTO role_permission VALUES('11','3','3');
INSERT INTO role_permission VALUES('12','3','4');
INSERT INTO role_permission VALUES('13','3','5');
 
create database demo_test;
use demo_test;