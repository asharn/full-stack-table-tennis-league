-- Created by Ashish Karn
-- Last modification date: 2021-05-08 18:55:03.182
-- tables
-- Table: tournament_type
DROP TABLE IF EXISTS `tournament_type`;
CREATE TABLE tournament_type (
   id integer  NOT NULL,
   tournament_type varchar(30)  NOT NULL,
   CONSTRAINT tournament_type_pk PRIMARY KEY (id)
) ;
-- End of file.