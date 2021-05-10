-- auto Generated on 2021-05-10
DROP TABLE IF EXISTS book;
CREATE TABLE book(
	id INT (11) NOT NULL AUTO_INCREMENT COMMENT '主键 ID',
	`name` VARCHAR (50)  DEFAULT '' COMMENT '书名',
	author VARCHAR (50)  DEFAULT '' COMMENT '作者',
	price DOUBLE (16,4)  COMMENT '价格',
	publish_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '出版日期',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT '书表';