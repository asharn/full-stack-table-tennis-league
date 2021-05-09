-- Created by Ashish Karn
-- Last modification date: 2021-05-08 18:55:03.182
-- tables
-- Table: set_score
DROP TABLE IF EXISTS `set_score`;
CREATE TABLE set_score (
   match_id number  NOT NULL,
   set_number number  NOT NULL,
   first_registration_games number  NOT NULL,
   second_registration_games number  NOT NULL,
   CONSTRAINT set_score_pk PRIMARY KEY (match_id,set_number)
) ;
-- End of file.