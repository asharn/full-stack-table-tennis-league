-- Created by Ashish Karn
-- Last modification date: 2021-05-08 18:55:03.182
-- tables
-- Table: player
DROP TABLE IF EXISTS `player`;
CREATE TABLE player (
   id number  NOT NULL,
   first_name varchar2(50)  NOT NULL,
   last_name varchar2(50)  NOT NULL,
   email varchar2(255)  NOT NULL,
   gender char(1)  NOT NULL,
   date_of_birth date  NOT NULL,
   country_code char(3)  NOT NULL,
   CONSTRAINT player_pk PRIMARY KEY (id)
) ;
-- End of file.