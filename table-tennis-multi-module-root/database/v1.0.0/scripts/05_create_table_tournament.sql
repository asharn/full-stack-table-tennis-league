-- Created by Ashish Karn
-- Last modification date: 2021-05-08 18:55:03.182
-- tables
-- Table: tournament
DROP TABLE IF EXISTS `tournament`;
CREATE TABLE tournament (
   id number  NOT NULL,
   tournament_name varchar2(100)  NOT NULL,
   location varchar2(50)  NOT NULL,
   start_date date  NOT NULL,
   end_date date  NOT NULL,
   number_of_rounds number  NOT NULL,
   tournament_type_id number  NOT NULL,
   surface_type_id number  NOT NULL,
   CONSTRAINT tournament_pk PRIMARY KEY (id)
) ;
-- End of file.