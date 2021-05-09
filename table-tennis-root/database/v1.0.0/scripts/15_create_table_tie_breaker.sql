-- Created by Ashish Karn
-- Last modification date: 2021-05-08 18:55:03.182
-- tables
-- Table: tie_breaker
DROP TABLE IF EXISTS `tie_breaker`;
CREATE TABLE tie_breaker (
   match_id number  NOT NULL,
   set_number number  NOT NULL,
   first_registration_tie_breaker number  NOT NULL,
   sec_registration_tie_breaker number  NOT NULL,
   CONSTRAINT tie_breaker_pk PRIMARY KEY (match_id,set_number)
) ;
-- End of file.