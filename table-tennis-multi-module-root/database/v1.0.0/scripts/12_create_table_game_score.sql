-- Created by Ashish Karn
-- Last modification date: 2021-05-08 18:55:03.182
-- tables
-- Table: game_score
DROP TABLE IF EXISTS `game_score`;
CREATE TABLE game_score (
   match_id number  NOT NULL,
   set_number number  NOT NULL,
   game_number number  NOT NULL,
   first_registration_point number  NOT NULL,
   second_registration_point number  NOT NULL,
   CONSTRAINT game_score_pk PRIMARY KEY (match_id,set_number,game_number)
) ;
-- End of file.