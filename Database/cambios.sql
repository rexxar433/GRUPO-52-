ALTER TABLE pelicula
CHANGE COLUMN imagen imagen  VARCHAR(255) NULL DEFAULT NULL ;

ALTER TABLE usuario
CHANGE COLUMN contrasena contrasena VARCHAR(255) NOT NULL ;

ALTER TABLE opinion CHANGE opinion comentario TEXT NOT NULL;

UPDATE rol SET role = 'ROLE_ADMIN' WHERE id=1;
UPDATE rol SET role = 'ROLE_USER' WHERE id=2;

UPDATE usuario SET contrasena = '$2a$10$/8NHPLc5NTCqcaMd6rIeyOyxgplWk.BGMhWjyz3t42BAuFSeRisPO' WHERE id = 1;
UPDATE usuario SET contrasena = '$2a$10$/8NHPLc5NTCqcaMd6rIeyOyxgplWk.BGMhWjyz3t42BAuFSeRisPO' WHERE id = 2;
UPDATE usuario SET contrasena = '$2a$10$/8NHPLc5NTCqcaMd6rIeyOyxgplWk.BGMhWjyz3t42BAuFSeRisPO' WHERE id = 3;

UPDATE pelicula set imagen = 'Spider-Man.jpg' where id=1;
UPDATE pelicula set imagen = 'spider-man-2.jpg' where id=2;
UPDATE pelicula set imagen = 'RBD.jpg' where id=3;
UPDATE pelicula set imagen = 'BuscandoNemo.jpg' where id=4;
