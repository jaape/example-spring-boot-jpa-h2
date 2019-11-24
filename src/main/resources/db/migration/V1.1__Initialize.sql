create table car
(
	id serial,
	make varchar(50),
	model varchar(50)
);

create unique index car_id_uindex on car (id);