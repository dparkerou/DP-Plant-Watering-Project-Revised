drop table if exists plant cascade;
drop table if exists maintenence_log cascade;

DROP SEQUENCE IF EXISTS plant_plant_id_seq;
DROP SEQUENCE IF EXISTS maintenence_log_maintenence_id_seq;

CREATE SEQUENCE plant_plant_id_seq
  INCREMENT BY 1
  NO MAXVALUE
  NO MINVALUE
  CACHE 1;

create table plant
(plant_id       integer DEFAULT nextval('plant_plant_id_seq'::regclass) not null
,plant_type     character varying (100) not null
,plant_nickname character varying (100)
,plant_location character varying (50)  not null
,constraint pk_plant_plant_id PRIMARY KEY(plant_id)
);


CREATE SEQUENCE maintenence_log_maintenence_id_seq
  INCREMENT BY 1
  NO MAXVALUE
  NO MINVALUE
  CACHE 1;

create table maintenence_log
(maintenence_id integer DEFAULT nextval('maintenence_log_maintenence_id_seq'::regclass) not null
,plant_id       int    not null
,maintenence_type character varying (50) not null
,date_completed date   not null   
,constraint pk_maintenence_log_maintenence_id PRIMARY KEY(maintenence_id)
,constraint fk_plant_plant_id foreign key(plant_id) references plant(plant_id)       
);


insert into plant
(plant_type, plant_nickname, plant_location)
values('Fiddle Leaf Fig', 'Baby Girl', 'Bedroom');

insert into maintenence_log
(maintenence_id, plant_id, maintenence_type, date_completed)
values (1, 1, 'Watering', '2021-02-27');

--alter table maintenence_log
   --add foreign key (plant_id)
   --references plant(plant_id);