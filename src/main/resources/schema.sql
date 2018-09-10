CREATE TABLE `tbl_demo` (
  `seq` INT NOT NULL auto_increment,
  `user_name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`seq`));


INSERT INTO tbl_demo(user_name) values('홍길동'),('임꺽정'),('역발산');
