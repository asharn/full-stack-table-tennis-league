-- Created by Ashish Karn
-- Creation date: 2021-05-08 18:55:03.182
-- Baseline tables
DROP TABLE IF EXISTS `country`;
CREATE TABLE country (
   code varchar(3)  NOT NULL,
   country_name varchar(50)  NOT NULL,
   CONSTRAINT country_pk PRIMARY KEY (code)
) ;

insert into country (code, country_name) values ('IND', 'India');
insert into country (code, country_name) values ('NEP', 'Nepal');
insert into country (code, country_name) values ('BHU', 'Bhutan');
insert into country (code, country_name) values ('PAK', 'Pakistan');
insert into country (code, country_name) values ('USA', 'United State of America');


DROP TABLE IF EXISTS `playing_category`;
CREATE TABLE playing_category (
   id integer  NOT NULL,
   category_name varchar(50)  NOT NULL,
   CONSTRAINT playing_category_pk PRIMARY KEY (id)
) ;
insert into playing_category (id, category_name) values (1, 'Men’s singles');
insert into playing_category (id, category_name) values (2, 'Mixed doubles');
insert into playing_category (id, category_name) values (3, 'Men’s doubles');
insert into playing_category (id, category_name) values (4, 'Women’s singles');
insert into playing_category (id, category_name) values (5, 'Women’s doubles');

DROP TABLE IF EXISTS `surface_type`;
CREATE TABLE surface_type (
   id integer  NOT NULL,
   surface_type varchar(50)  NOT NULL,
   CONSTRAINT surface_type_pk PRIMARY KEY (id)
) ;
insert into surface_type (id, surface_type) values (1, 'Clay');
insert into surface_type (id, surface_type) values (2, 'Grass');
insert into surface_type (id, surface_type) values (3, 'Carpet');

DROP TABLE IF EXISTS `tournament_type`;
CREATE TABLE tournament_type (
   id integer  NOT NULL,
   tournament_type varchar(30)  NOT NULL,
   CONSTRAINT tournament_type_pk PRIMARY KEY (id)
) ;
insert into tournament_type (id, tournament_type) values (1, 'Team Up');
insert into tournament_type (id, tournament_type) values (2, 'Grand Slam');
insert into tournament_type (id, tournament_type) values (3, 'Senior or Junior Grade A');

DROP TABLE IF EXISTS `tournament`;
CREATE TABLE tournament (
   id integer  NOT NULL,
   tournament_name varchar(100)  NOT NULL,
   location varchar(50)  NOT NULL,
   start_date date  NOT NULL,
   end_date date  NOT NULL,
   number_of_rounds integer  NOT NULL,
   tournament_type_id integer  NOT NULL,
   surface_type_id integer  NOT NULL,
   CONSTRAINT tournament_pk PRIMARY KEY (id)
) ;
insert into tournament (id, tournament_name, location, start_date, end_date, number_of_rounds, tournament_type_id, surface_type_id) values (1, 'Inter Team Tournament', 'Noida', now(), now() + INTERVAL 3 DAY, 6, 1, 1);
insert into tournament (id, tournament_name, location, start_date, end_date, number_of_rounds, tournament_type_id, surface_type_id) values (2, 'A vs B Team Tournament', 'Delhi', now(), now() + INTERVAL 5 DAY, 4, 1, 1);
insert into tournament (id, tournament_name, location, start_date, end_date, number_of_rounds, tournament_type_id, surface_type_id) values (3, 'Intra Team Tournament', 'Pune', now(), now() + INTERVAL 3 DAY, 6, 1, 1);
insert into tournament (id, tournament_name, location, start_date, end_date, number_of_rounds, tournament_type_id, surface_type_id) values (4, 'Company X vs Company Y Tournament', 'Noida', now(), now() + INTERVAL 4 DAY, 8, 1, 1);
insert into tournament (id, tournament_name, location, start_date, end_date, number_of_rounds, tournament_type_id, surface_type_id) values (5, 'Inter Team Tournament', 'Mumbai', now(), now() + INTERVAL 2 DAY, 2, 1, 1);

DROP TABLE IF EXISTS `tournament_playing_category`;
CREATE TABLE tournament_playing_category (
   id integer  NOT NULL,
   tournament_id integer  NOT NULL,
   playing_category_id integer  NOT NULL,
   CONSTRAINT tournament_playing_category_pk PRIMARY KEY (id)
) ;
insert into tournament_playing_category (id, tournament_id, playing_category_id) values (1, 1, 1);
insert into tournament_playing_category (id, tournament_id, playing_category_id) values (2, 1, 1);
insert into tournament_playing_category (id, tournament_id, playing_category_id) values (3, 1, 1);

DROP TABLE IF EXISTS `player`;
CREATE TABLE player (
   id integer  NOT NULL,
   first_name varchar(50)  NOT NULL,
   last_name varchar(50)  NOT NULL,
   email varchar(255)  NOT NULL,
   gender char(1)  NOT NULL,
   date_of_birth date  NOT NULL,
   country_code varchar(3)  NOT NULL,
   CONSTRAINT player_pk PRIMARY KEY (id)
) ;
insert into player (id, first_name, last_name, email, gender, date_of_birth, country_code) values (1, 'Ashish', 'Karn', 'er.ashishkarn@gmail.com','M','1993-03-15 10:22:12', 'IND');
insert into player (id, first_name, last_name, email, gender, date_of_birth, country_code) values (2, 'Manish', 'Karn', 'manish@gmail.com','M','1995-11-19 12:22:12 ', 'IND');
insert into player (id, first_name, last_name, email, gender, date_of_birth, country_code) values (3, 'Sachin', 'Karn', 'sachin@gmail.com','M','1992-08-11 20:22:12', 'IND');
insert into player (id, first_name, last_name, email, gender, date_of_birth, country_code) values (4, 'Ramesh', 'Karn', 'ramesh@gmail.com','M','1991-09-01 19:22:12', 'IND');
insert into player (id, first_name, last_name, email, gender, date_of_birth, country_code) values (5, 'Vinod', 'Karn', 'vinod@gmail.com','M','1995-01-17 17:22:12', 'IND');
insert into player (id, first_name, last_name, email, gender, date_of_birth, country_code) values (6, 'Anil', 'Karn', 'anil@gmail.com','M','1999-06-12 11:22:12', 'IND');

DROP TABLE IF EXISTS `registration`;
CREATE TABLE registration (
   id integer  NOT NULL,
   registration_date date  NOT NULL,
   CONSTRAINT registration_pk PRIMARY KEY (id)
) ;
insert into registration (id, registration_date) values (1, now()-1);
insert into registration (id, registration_date) values (2, now()-2);
insert into registration (id, registration_date) values (3, now()-4);
insert into registration (id, registration_date) values (4, now());
insert into registration (id, registration_date) values (5, now()-3);
insert into registration (id, registration_date) values (6, now()-5);

DROP TABLE IF EXISTS `registration_player`;
CREATE TABLE registration_player (
   registration_id integer  NOT NULL,
   player_id integer  NOT NULL,
   CONSTRAINT registration_player_pk PRIMARY KEY (registration_id,player_id)
) ;
insert into registration_player (registration_id, player_id) values (1, 1);
insert into registration_player (registration_id, player_id) values (2, 2);
insert into registration_player (registration_id, player_id) values (3, 3);
insert into registration_player (registration_id, player_id) values (4, 4);
insert into registration_player (registration_id, player_id) values (5, 5);
insert into registration_player (registration_id, player_id) values (6, 6);

DROP TABLE IF EXISTS `playing_in`;
CREATE TABLE playing_in (
   id integer  NOT NULL,
   registration_id integer  NOT NULL,
   seed integer  NOT NULL,
   tournament_playing_category_id integer  NOT NULL,
   CONSTRAINT playing_in_pk PRIMARY KEY (id)
) ;
insert into playing_in (id, registration_id, seed, tournament_playing_category_id) values (1, 1, 2, 1);
insert into playing_in (id, registration_id, seed, tournament_playing_category_id) values (2, 2, 2, 1);
insert into playing_in (id, registration_id, seed, tournament_playing_category_id) values (3, 1, 2, 1);
insert into playing_in (id, registration_id, seed, tournament_playing_category_id) values (4, 4, 2, 1);
insert into playing_in (id, registration_id, seed, tournament_playing_category_id) values (5, 1, 2, 1);

DROP TABLE IF EXISTS `set_score`;
CREATE TABLE set_score (
   match_id integer  NOT NULL,
   set_number integer  NOT NULL,
   first_registration_games integer  NOT NULL,
   second_registration_games integer  NOT NULL,
   CONSTRAINT set_score_pk PRIMARY KEY (match_id,set_number)
) ;
insert into set_score (match_id, set_number, first_registration_games, second_registration_games) values (1, 1, 1, 2);
insert into set_score (match_id, set_number, first_registration_games, second_registration_games) values (1, 2, 3, 4);
insert into set_score (match_id, set_number, first_registration_games, second_registration_games) values (1, 3, 2, 4);
insert into set_score (match_id, set_number, first_registration_games, second_registration_games) values (1, 4, 1, 4);

DROP TABLE IF EXISTS `game_score`;
CREATE TABLE game_score (
   match_id integer  NOT NULL,
   set_number integer  NOT NULL,
   game_number integer  NOT NULL,
   first_registration_point integer  NOT NULL,
   second_registration_point integer  NOT NULL,
   CONSTRAINT game_score_pk PRIMARY KEY (match_id,set_number,game_number)
) ;
insert into game_score (match_id, set_number, game_number, first_registration_point, second_registration_point) values (1, 1, 1, 20, 10);
insert into game_score (match_id, set_number, game_number, first_registration_point, second_registration_point) values (1, 1, 2, 30, 40);
insert into game_score (match_id, set_number, game_number, first_registration_point, second_registration_point) values (2, 1, 3, 40, 20);
insert into game_score (match_id, set_number, game_number, first_registration_point, second_registration_point) values (2, 1, 4, 10, 10);

DROP TABLE IF EXISTS `matches`;
CREATE TABLE `matches` (
   id integer  NOT NULL,
   tournament_playing_category_id integer  NOT NULL,
   first_registration_id integer  NOT NULL,
   second_registration_id integer  NOT NULL,
   round integer  NOT NULL,
   CONSTRAINT match_pk PRIMARY KEY (id)
) ;
insert into `matches` (id, tournament_playing_category_id, first_registration_id, second_registration_id, round) values (1, 1, 1, 2, 1);
insert into `matches` (id, tournament_playing_category_id, first_registration_id, second_registration_id, round) values (2, 1, 1, 2, 2);
insert into `matches` (id, tournament_playing_category_id, first_registration_id, second_registration_id, round) values (3, 1, 3, 4, 1);
insert into `matches` (id, tournament_playing_category_id, first_registration_id, second_registration_id, round) values (4, 1, 3, 4, 2);
insert into `matches` (id, tournament_playing_category_id, first_registration_id, second_registration_id, round) values (5, 1, 2, 4, 1);
insert into `matches` (id, tournament_playing_category_id, first_registration_id, second_registration_id, round) values (6, 1, 2, 4, 2);

DROP TABLE IF EXISTS `match_result`;
CREATE TABLE match_result (
   match_id integer  NOT NULL,
   winner_registration_id integer  NOT NULL,
   number_of_sets_played integer  NOT NULL,
   is_opponent_retired tinyint(1)  NULL,
   CONSTRAINT match_result_pk PRIMARY KEY (match_id)
) ;
insert into match_result (match_id, winner_registration_id, number_of_sets_played, is_opponent_retired) values (1, 1, 6, 0);
insert into match_result (match_id, winner_registration_id, number_of_sets_played, is_opponent_retired) values (2, 2, 8, 0);
insert into match_result (match_id, winner_registration_id, number_of_sets_played, is_opponent_retired) values (3, 3, 2, 0);
insert into match_result (match_id, winner_registration_id, number_of_sets_played, is_opponent_retired) values (4, 2, 4, 0);
insert into match_result (match_id, winner_registration_id, number_of_sets_played, is_opponent_retired) values (5, 3, 6, 0);
insert into match_result (match_id, winner_registration_id, number_of_sets_played, is_opponent_retired) values (6, 4, 6, 0);

DROP TABLE IF EXISTS `tie_breaker`;
CREATE TABLE tie_breaker (
   match_id integer  NOT NULL,
   set_number integer  NOT NULL,
   first_registration_tie_breaker integer  NOT NULL,
   sec_registration_tie_breaker integer  NOT NULL,
   CONSTRAINT tie_breaker_pk PRIMARY KEY (match_id,set_number)
) ;
insert into tie_breaker (match_id, set_number, first_registration_tie_breaker, sec_registration_tie_breaker) values (5, 1, 2, 1);

-- End of file.