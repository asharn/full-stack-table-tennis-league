-- Created by Ashish Karn
-- Last modification date: 2021-05-08 18:55:03.182
-- tables
-- Table: tournament_playing_category
DROP TABLE IF EXISTS `tournament_playing_category`;
CREATE TABLE tournament_playing_category (
   id number  NOT NULL,
   tournament_id number  NOT NULL,
   playing_category_id number  NOT NULL,
   CONSTRAINT tournament_playing_category_pk PRIMARY KEY (id)
) ;
-- End of file.