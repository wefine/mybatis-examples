CREATE DATABASE IF NOT EXISTS mybatis
    DEFAULT CHARACTER SET utf8;

USE mybatis;

DROP TABLE IF EXISTS city;
CREATE TABLE city (
    id      INT PRIMARY KEY AUTO_INCREMENT,
    name    VARCHAR(64),
    state   VARCHAR(16),
    country VARCHAR(16)
)
    ENGINE = InnoDB
    DEFAULT CHARSET = utf8;

INSERT INTO city (name, state, country) VALUES ('San Francisco', 'CA', 'US');
