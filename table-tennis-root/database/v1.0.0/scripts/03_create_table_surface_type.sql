-- Created by Ashish Karn
-- Last modification date: 2021-05-08 18:55:03.182
-- tables
-- Table: surface_type
DROP TABLE IF EXISTS `surface_type`;
CREATE TABLE surface_type (
   id number  NOT NULL,
   surface_type varchar2(50)  NOT NULL,
   CONSTRAINT surface_type_pk PRIMARY KEY (id)
) ;
-- End of file.