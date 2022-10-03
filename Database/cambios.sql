ALTER TABLE `pelireview2`.`pelicula` 
CHANGE COLUMN `imagen` `imagen` VARCHAR(255) NULL DEFAULT NULL ;

ALTER TABLE `pelireview2`.`usuario` 
CHANGE COLUMN `contrasena` `contrasena` VARCHAR(255) NOT NULL ;
truncate table usuario;
truncate table rol;
truncate table pelicula;

insert into rol (role) values("ROLE_ADMIN");
insert into rol (role) values("ROLE_USER");

insert into usuario (primer_nombre,primer_apellido,fecha_nacimiento,edad,email,contrasena,rol_id) 
values("Daniel","Murillo",NOW(),21,"daniel@daniel.com","$2a$10$/8NHPLc5NTCqcaMd6rIeyOyxgplWk.BGMhWjyz3t42BAuFSeRisPO",2);

insert into usuario (primer_nombre,primer_apellido,fecha_nacimiento,edad,email,contrasena,rol_id) 
values("Yesid","Murillo",NOW(),13,"daniel1@daniel1.com","$2a$10$/8NHPLc5NTCqcaMd6rIeyOyxgplWk.BGMhWjyz3t42BAuFSeRisPO",2);

insert into usuario (primer_nombre,primer_apellido,email,contrasena,rol_id) 
values("Admin","Admin","daniel2@daniel2.com","$2a$10$/8NHPLc5NTCqcaMd6rIeyOyxgplWk.BGMhWjyz3t42BAuFSeRisPO",1);

insert into pelicula (titulo,argumento,duracion,ano,puntuacion,imagen,clasificacion_id)
values ("Spider Man","Pelicula",130,2005,4.5,"Spider-Man.jpg",2);
insert into pelicula (titulo,argumento,duracion,ano,puntuacion,imagen,clasificacion_id)
values ("Spider Man-2","Pelicula",160,2009,3,"spider-man-2.jpg",2);
insert into pelicula (titulo,argumento,duracion,ano,puntuacion,imagen,clasificacion_id)
values ("RBD","Pelicula",170,2021,2,"RBD.jp",3);
insert into pelicula (titulo,argumento,duracion,ano,puntuacion,imagen,clasificacion_id)
values ("Buscando a nemo","Pelicula",116,2017,4.5,"BuscandoNemo.jpg",1);


