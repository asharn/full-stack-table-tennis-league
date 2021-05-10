-- Created by Ashish Karn
-- Last modification date: 2021-05-08 18:55:03.182
-- tables
-- Table: tournament
insert into tournament (id, tournament_name, location, start_date, end_date, number_of_rounds, tournament_type_id, surface_type_id) values (1, 'Inter Team Tournament', 'Noida', now(), now() + INTERVAL 3 DAY, 6, 1, 1);
insert into tournament (id, tournament_name, location, start_date, end_date, number_of_rounds, tournament_type_id, surface_type_id) values (2, 'A vs B Team Tournament', 'Delhi', now(), now() + INTERVAL 5 DAY, 4, 1, 1);
insert into tournament (id, tournament_name, location, start_date, end_date, number_of_rounds, tournament_type_id, surface_type_id) values (3, 'Intra Team Tournament', 'Pune', now(), now()+ INTERVAL 3 DAY, 6, 1, 1);
insert into tournament (id, tournament_name, location, start_date, end_date, number_of_rounds, tournament_type_id, surface_type_id) values (4, 'Company X vs Company Y Tournament', 'Noida', now(), now()+ INTERVAL 4 DAY, 8, 1, 1);
insert into tournament (id, tournament_name, location, start_date, end_date, number_of_rounds, tournament_type_id, surface_type_id) values (5, 'Inter Team Tournament', 'Mumbai', now(), now()+ INTERVAL 2 DAY, 2, 1, 1);

-- End of file.