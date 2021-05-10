-- Created by Ashish Karn
-- Last modification date: 2021-05-08 18:55:03.182
-- tables
-- Table: country
DROP TABLE IF EXISTS `country`;
CREATE TABLE country (
   code varchar(3)  NOT NULL,
   country_name varchar(50)  NOT NULL,
   CONSTRAINT country_pk PRIMARY KEY (code)
) ;
-- End of file.