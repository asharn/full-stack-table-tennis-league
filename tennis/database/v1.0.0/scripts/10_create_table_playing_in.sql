-- Created by Ashish Karn
-- Last modification date: 2021-05-08 18:55:03.182
-- tables
-- Table: playing_in
DROP TABLE IF EXISTS `playing_in`;
CREATE TABLE playing_in (
   id integer  NOT NULL,
   registration_id integer  NOT NULL,
   seed integer  NOT NULL,
   tournament_playing_category_id integer  NOT NULL,
   CONSTRAINT playing_in_pk PRIMARY KEY (id)
) ;
-- End of file.