SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS dream_img;
DROP TABLE IF EXISTS upload_img;
DROP TABLE IF EXISTS notice;
DROP TABLE IF EXISTS user_info;




/* Create Tables */

CREATE TABLE dream_img
(
	img_num int NOT NULL AUTO_INCREMENT,
	img_name varchar(10) NOT NULL,
	img_path varchar(255) NOT NULL,
	PRIMARY KEY (img_num)
);


CREATE TABLE notice
(

	write_num int unsigned NOT NULL AUTO_INCREMENT,

	title varchar(30) DEFAULT '<No Title>' ,

	text mediumtext ,

	read_count int unsigned DEFAULT 0 NOT NULL ,

	reg_date date NOT NULL ,
	user_num int NOT NULL,
	PRIMARY KEY (write_num),
	UNIQUE (write_num),
	
);


CREATE TABLE upload_img
(
	write_num int unsigned NOT NULL ,
	up_img mediumblob NOT NULL,
	UNIQUE (write_num)
);


CREATE TABLE user_info
(
	user_num int NOT NULL AUTO_INCREMENT,
	user_id varchar(15) NOT NULL,
	user_pw varchar(20) NOT NULL ,
	user_other varchar(10) NOT NULL ,
	PRIMARY KEY (user_num),
	UNIQUE (user_num),
	UNIQUE (user_id),
	UNIQUE (user_other)
);



/* Create Foreign Keys */

ALTER TABLE upload_img
	ADD FOREIGN KEY (write_num)
	REFERENCES notice (write_num)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE notice
	ADD FOREIGN KEY (user_num)
	REFERENCES user_info (user_num)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



