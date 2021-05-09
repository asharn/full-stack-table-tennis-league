-- Created by Ashish Karn
-- Last modification date: 2021-05-08 18:55:03.182
-- tables
-- Table: playing_in
DROP TABLE IF EXISTS `playing_in`;
CREATE TABLE playing_in (
   id number  NOT NULL,
   registration_id number  NOT NULL,
   seed number  NOT NULL,
   tournament_playing_category_id number  NOT NULL,
   CONSTRAINT playing_in_pk PRIMARY KEY (id)
) ;
-- End of file.