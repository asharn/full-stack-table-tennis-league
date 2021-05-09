-- Created by Ashish Karn
-- Last modification date: 2021-05-08 18:55:03.182
-- tables
-- Table: match_result
DROP TABLE IF EXISTS `match_result`;
CREATE TABLE match_result (
   match_id integer  NOT NULL,
   winner_registration_id integer  NOT NULL,
   number_of_sets_played integer  NOT NULL,
   is_opponent_retired char(1)  NULL,
   CONSTRAINT match_result_pk PRIMARY KEY (match_id)
) ;
-- End of file.