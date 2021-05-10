-- Created by Ashish Karn
-- Last modification date: 2021-05-08 18:55:03.182
-- tables
-- Table: tournament
DROP TABLE IF EXISTS `tournament`;
CREATE TABLE tournament (
   id integer  NOT NULL,
   tournament_name varchar(100)  NOT NULL,
   location varchar(50)  NOT NULL,
   start_date date  NOT NULL,
   end_date date  NOT NULL,
   number_of_rounds integer  NOT NULL,
   tournament_type_id integer  NOT NULL,
   surface_type_id integer  NOT NULL,
   CONSTRAINT tournament_pk PRIMARY KEY (id)
) ;
-- End of file.