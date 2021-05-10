-- Created by Ashish Karn
-- Last modification date: 2021-05-08 18:55:03.182
-- tables
-- Table: registration_player
DROP TABLE IF EXISTS `registration_player`;
CREATE TABLE registration_player (
   registration_id integer  NOT NULL,
   player_id integer  NOT NULL,
   CONSTRAINT registration_player_pk PRIMARY KEY (registration_id,player_id)
) ;
-- End of file.