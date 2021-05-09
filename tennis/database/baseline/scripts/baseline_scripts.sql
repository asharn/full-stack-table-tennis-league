-- Created by Ashish Karn
-- Creation date: 2021-05-08 18:55:03.182
-- Baseline tables
DROP TABLE IF EXISTS `country`;
CREATE TABLE country (
   code char(3)  NOT NULL,
   country_name varchar2(50)  NOT NULL,
   CONSTRAINT country_pk PRIMARY KEY (code)
) ;

DROP TABLE IF EXISTS `playing_category`;
CREATE TABLE playing_category (
   id number  NOT NULL,
   category_name varchar2(50)  NOT NULL,
   CONSTRAINT playing_category_pk PRIMARY KEY (id)
) ;

DROP TABLE IF EXISTS `surface_type`;
CREATE TABLE surface_type (
   id number  NOT NULL,
   surface_type varchar2(50)  NOT NULL,
   CONSTRAINT surface_type_pk PRIMARY KEY (id)
) ;

DROP TABLE IF EXISTS `tournament_type`;
CREATE TABLE tournament_type (
   id number  NOT NULL,
   tournament_type varchar2(30)  NOT NULL,
   CONSTRAINT tournament_type_pk PRIMARY KEY (id)
) ;

DROP TABLE IF EXISTS `tournament`;
CREATE TABLE tournament (
   id number  NOT NULL,
   tournament_name varchar2(100)  NOT NULL,
   location varchar2(50)  NOT NULL,
   start_date date  NOT NULL,
   end_date date  NOT NULL,
   number_of_rounds number  NOT NULL,
   tournament_type_id number  NOT NULL,
   surface_type_id number  NOT NULL,
   CONSTRAINT tournament_pk PRIMARY KEY (id)
) ;

DROP TABLE IF EXISTS `tournament_playing_category`;
CREATE TABLE tournament_playing_category (
   id number  NOT NULL,
   tournament_id number  NOT NULL,
   playing_category_id number  NOT NULL,
   CONSTRAINT tournament_playing_category_pk PRIMARY KEY (id)
) ;

DROP TABLE IF EXISTS `player`;
CREATE TABLE player (
   id number  NOT NULL,
   first_name varchar2(50)  NOT NULL,
   last_name varchar2(50)  NOT NULL,
   email varchar2(255)  NOT NULL,
   gender char(1)  NOT NULL,
   date_of_birth date  NOT NULL,
   country_code char(3)  NOT NULL,
   CONSTRAINT player_pk PRIMARY KEY (id)
) ;

DROP TABLE IF EXISTS `registration`;
CREATE TABLE registration (
   id number  NOT NULL,
   registration_date date  NOT NULL,
   CONSTRAINT registration_pk PRIMARY KEY (id)
) ;

DROP TABLE IF EXISTS `registration_player`;
CREATE TABLE registration_player (
   registration_id number  NOT NULL,
   player_id number  NOT NULL,
   CONSTRAINT registration_player_pk PRIMARY KEY (registration_id,player_id)
) ;

DROP TABLE IF EXISTS `playing_in`;
CREATE TABLE playing_in (
   id number  NOT NULL,
   registration_id number  NOT NULL,
   seed number  NOT NULL,
   tournament_playing_category_id number  NOT NULL,
   CONSTRAINT playing_in_pk PRIMARY KEY (id)
) ;

DROP TABLE IF EXISTS `set_score`;
CREATE TABLE set_score (
   match_id number  NOT NULL,
   set_number number  NOT NULL,
   first_registration_games number  NOT NULL,
   second_registration_games number  NOT NULL,
   CONSTRAINT set_score_pk PRIMARY KEY (match_id,set_number)
) ;


DROP TABLE IF EXISTS `game_score`;
CREATE TABLE game_score (
   match_id number  NOT NULL,
   set_number number  NOT NULL,
   game_number number  NOT NULL,
   first_registration_point number  NOT NULL,
   second_registration_point number  NOT NULL,
   CONSTRAINT game_score_pk PRIMARY KEY (match_id,set_number,game_number)
) ;

DROP TABLE IF EXISTS `match`;
CREATE TABLE match (
   id number  NOT NULL,
   tournament_playing_category_id number  NOT NULL,
   first_registration_id number  NOT NULL,
   second_registration_id number  NOT NULL,
   round number  NOT NULL,
   CONSTRAINT match_pk PRIMARY KEY (id)
) ;

DROP TABLE IF EXISTS `match_result`;
CREATE TABLE match_result (
   match_id number  NOT NULL,
   winner_registration_id number  NOT NULL,
   number_of_sets_played number  NOT NULL,
   is_opponent_retired char(1)  NULL,
   CONSTRAINT match_result_pk PRIMARY KEY (match_id)
) ;

DROP TABLE IF EXISTS `tie_breaker`;
CREATE TABLE tie_breaker (
   match_id number  NOT NULL,
   set_number number  NOT NULL,
   first_registration_tie_breaker number  NOT NULL,
   sec_registration_tie_breaker number  NOT NULL,
   CONSTRAINT tie_breaker_pk PRIMARY KEY (match_id,set_number)
) ;

-- End of file.