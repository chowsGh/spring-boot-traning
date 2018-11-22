CREATE SCHEMA `ssm_demo` ;

CREATE TABLE `ssm_demo`.`userinfo` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(200) NULL,
  `lastname` VARCHAR(200) NULL,
  `age` INT NULL,
  `birthday` DATETIME NULL,
  PRIMARY KEY (`id`));
