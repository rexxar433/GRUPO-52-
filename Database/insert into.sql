insert into rol (role) values("ADMIN");
insert into rol (role) values("USER");

insert into usuario (primer_nombre,primer_apellido,fecha_nacimiento,edad,email,contrasena,rol_id) 
values("Daniel","Murillo",NOW(),21,"daniel@daniel.com","123456789",2);

insert into usuario (primer_nombre,primer_apellido,fecha_nacimiento,edad,email,contrasena,rol_id) 
values("Yesid","Murillo",NOW(),13,"daniel1@daniel1.com","123456789",2);

insert into usuario (primer_nombre,primer_apellido,email,contrasena,rol_id) 
values("Admin","Admin","daniel2@daniel2.com","123456789",1);


insert into clasificacion (nombre,edad_minima)values("Niños",0);
insert into clasificacion (nombre,edad_minima)values("Jovenes",13);
insert into clasificacion (nombre,edad_minima)values("Adultos",18);

insert into genero (nombre)values ("Terror");
insert into genero (nombre)values ("Romance");
insert into genero (nombre)values ("Drama");
insert into genero (nombre)values ("Accion");

insert into pelicula (titulo,argumento,duracion,ano,puntuacion,clasificacion_id)
values ("Spider Man","Pelicula",130,2005,4.5,2);
insert into pelicula (titulo,argumento,duracion,ano,puntuacion,clasificacion_id)
values ("Spider Man-2","Pelicula",160,2009,3,2);
insert into pelicula (titulo,argumento,duracion,ano,puntuacion,clasificacion_id)
values ("RBD","Pelicula",170,2021,2,3);
insert into pelicula (titulo,argumento,duracion,ano,puntuacion,clasificacion_id)
values ("Buscando a nemo","Pelicula",116,2017,4.5,1);

insert into opinion (opinion,usuario_id,pelicula_id)values ("Cool la pelicula",1,1);
insert into opinion (opinion,usuario_id,pelicula_id)values ("Muy aburrida la pelicula",2,1);
insert into opinion (opinion,usuario_id,pelicula_id)values ("Hay mejores pero cumplio",1,4);
insert into opinion (opinion,usuario_id,pelicula_id)values ("Suave me dormi",1,3);

insert into pelicula_genero values(1,4);
insert into pelicula_genero values(2,2);
insert into pelicula_genero values(3,2);
insert into pelicula_genero values(4,1);

UPDATE rol SET role = 'ROLE_ADMIN' WHERE id = 1;
UPDATE rol SET role = 'ROLE_USER' WHERE id = 2;

ALTER TABLE usuario CHANGE contrasena contrasena VARCHAR(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL;

UPDATE usuario SET contrasena = '$2a$10$Q/egZCl6y6sqFjOU58YKAun59xq.X8pf0TpWrbGzvaLSZHvQp19WK' WHERE id = 1;
UPDATE usuario SET contrasena = '$2a$10$l9jC/wf4Lcbwz.pKanqxM.VjOZYDTau/G2E/JbPRcfHvV55H92X7a' WHERE id = 2;
UPDATE usuario SET contrasena = '$2a$10$vfspclEmLQDZ3flP32ONAeIZED/IT8kZzQvJU4uZpYrEH067AUCK6' WHERE id = 3;
