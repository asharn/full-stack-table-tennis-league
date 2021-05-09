-- Created by Ashish Karn
-- Last modification date: 2021-05-08 18:55:03.182
-- tables
-- Table: registration
DROP TABLE IF EXISTS `registration`;
CREATE TABLE registration (
   id number  NOT NULL,
   registration_date date  NOT NULL,
   CONSTRAINT registration_pk PRIMARY KEY (id)
) ;
-- End of file.