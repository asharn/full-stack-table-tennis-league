-- Created by Ashish Karn
-- Last modification date: 2021-05-08 18:55:03.182
-- tables
-- Table: playing_category
DROP TABLE IF EXISTS `playing_category`;
CREATE TABLE playing_category (
   id integer  NOT NULL,
   category_name varchar(50)  NOT NULL,
   CONSTRAINT playing_category_pk PRIMARY KEY (id)
) ;
-- End of file.