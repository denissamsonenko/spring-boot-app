CREATE TABLE IF NOT EXISTS customer(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50)   NOT NULL ,
    last_name  VARCHAR(100)  NOT NULL ,
    address    VARCHAR(100)  NOT NULL ,
    salary     INT       NOT NULL
);