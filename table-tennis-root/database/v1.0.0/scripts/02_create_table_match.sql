-- Created by Ashish Karn
-- Last modification date: 2021-05-08 18:55:03.182
-- tables
-- Table: match
DROP TABLE IF EXISTS `match`;
CREATE TABLE match (
   id number  NOT NULL,
   tournament_playing_category_id number  NOT NULL,
   first_registration_id number  NOT NULL,
   second_registration_id number  NOT NULL,
   round number  NOT NULL,
   CONSTRAINT match_pk PRIMARY KEY (id)
) ;
-- End of file.