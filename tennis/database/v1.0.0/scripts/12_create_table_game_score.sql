-- Created by Ashish Karn
-- Last modification date: 2021-05-08 18:55:03.182
-- tables
-- Table: game_score
DROP TABLE IF EXISTS `game_score`;
CREATE TABLE game_score (
   match_id integer  NOT NULL,
   set_number integer  NOT NULL,
   game_number integer  NOT NULL,
   first_registration_point integer  NOT NULL,
   second_registration_point integer  NOT NULL,
   CONSTRAINT game_score_pk PRIMARY KEY (match_id,set_number,game_number)
) ;
-- End of file.