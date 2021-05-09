-- Created by Ashish Karn
-- Last modification date: 2021-05-08 18:55:03.182
-- tables
-- Table: match
DROP TABLE IF EXISTS `match`;
CREATE TABLE `match` (
   id integer  NOT NULL,
   tournament_playing_category_id integer  NOT NULL,
   first_registration_id integer  NOT NULL,
   second_registration_id integer  NOT NULL,
   round integer  NOT NULL,
   CONSTRAINT match_pk PRIMARY KEY (id)
) ;
-- End of file.