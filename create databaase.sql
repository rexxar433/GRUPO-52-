-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Oct 05, 2022 at 12:16 AM
-- Server version: 8.0.30
-- PHP Version: 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: dbpeliculas
--

-- --------------------------------------------------------

--
-- Table structure for table clasificacion
--

CREATE TABLE clasificacion (
  id int NOT NULL,
  nombre varchar(45) NOT NULL,
  edad_minima int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table clasificacion
--

INSERT INTO clasificacion (id, nombre, edad_minima) VALUES
(1, 'NIÑOS', 12),
(2, 'JOVENES', 17),
(3, 'ADULTOS', 18);

-- --------------------------------------------------------

--
-- Table structure for table genero
--

CREATE TABLE genero (
  id int NOT NULL,
  nombre varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table genero
--

INSERT INTO genero (id, nombre) VALUES
(1, 'ACCION '),
(2, 'ANIMACION '),
(3, 'CIENCIA FICCION '),
(4, 'COMEDIA'),
(5, 'DOCUMENTALES'),
(6, 'TERROR');

-- --------------------------------------------------------

--
-- Table structure for table opinion
--

CREATE TABLE opinion (
  id int NOT NULL,
  comentario text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  usuario_id int NOT NULL,
  pelicula_id int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table opinion
--

INSERT INTO opinion (id, comentario, usuario_id, pelicula_id) VALUES
(1, 'Ni siquiera es la promocional de la pelicula jsjsjsjs', 4, 2),
(2, 'Demasiada censura', 4, 9);

-- --------------------------------------------------------

--
-- Table structure for table pelicula
--

CREATE TABLE pelicula (
  id int NOT NULL,
  GENERO int NOT NULL,
  titulo varchar(45) NOT NULL,
  argumento text NOT NULL,
  duracion int NOT NULL,
  ano int NOT NULL,
  imagen varchar(255) DEFAULT NULL,
  puntuacion double NOT NULL,
  clasificacion_id int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table pelicula
--

INSERT INTO pelicula (id, GENERO, titulo, argumento, duracion, ano, imagen, puntuacion, clasificacion_id) VALUES
(1, 1, 'SPIDER MAN', 'Peter Parker es un joven y tímido estudiante que vive con su tía May y su tío Ben desde la muerte de sus padres, siendo él muy pequeño. Peter está enamorado de su guapa vecina, pero su escaso carisma no le hace ser precisamente muy popular en el instituto. Un día es mordido por una araña que ha sido modificada genéticamente, descubriendo al día siguiente que posee unos poderes poco habituales: tiene la fuerza y agilidad de una araña. Las aventuras del hombre araña, basadas en el famoso cómic de Stan Lee y Steve Ditko, arrasó en las taquillas americanas y pulverizó los récords de recaudación en su primer fin de semana: 114 millones de dólares, la primera vez en la historia que se consiguió pasar de la barrera de los 100 millones en un fin de semana normal.', 121, 2002, 'spider-man-2.jpg', 4.5, 2),
(2, 2, 'DRAGAON BALL SUPER: SUPER HERO', 'El Ejército de la Cinta Roja del pasado de Goku ha regresado con dos nuevos androides para desafiarlo a él y a sus amigos.', 99, 2022, 'dragon-ball.jpg', 4, 2),
(3, 6, 'JIKIRAG', 'Un pueblo pagano, fundado sobre los huesos tanto de inocentes como de inmundos, está profundamente arraigado en el corazón de un antiguo Edén. Cuando el equilibrio de la carne y el suelo se deteriora, el último anciano superviviente de la aldea lucha contra la locura y lo macabro para salvar a su gente no solo de sí mismos, sino también del juicio monstruoso que se esconde desde abajo.', 120, 2022, 'jikirak.jpg', 3.9, 3),
(4, 3, 'PINOCHO', 'Versión en acción real del aclamado cuento sobre una marioneta que se embarca en una trepidante aventura para convertirse en un niño de verdad. La historia también presenta a otros personajes, como Gepetto, el carpintero que fabrica a Pinocho y lo trata como a su propio hijo; Pepito Grillo, que hace las veces de guía y “conciencia” de Pinocho; el Hada Azul; el Honrado Juan; la gaviota Sofía, y el cochero.', 111, 2022, 'pinocho.jpg', 3.9, 1),
(5, 5, 'THE REAL CHARLIE CHAPLIN', 'La historia definitiva de la figura más icónica del mundo del cine, desde una infancia empobrecida en Londres, pasando por un increíble ascenso a la fama y hasta su protagonismo en Hollywood y su exilio autoimpuesto. A través de una investigación meticulosa, que incluye fotografías raras, escenas eliminadas de películas y grabaciones de audio hasta ahora desconocidas, Spinney y Middleton arrojan luz sobre la vida familiar de Chaplin, su polémica relación con los escándalos políticos del siglo XX y su genio artístico.', 114, 2021, 'chaplin.jpg', 4.1, 3),
(6, 4, 'YO ME ENCARGO DE LA CERVEZA ', 'Nueva York, 1967. Para demostrar su apoyo a sus colegas del barrio que están combatiendo en Vietnam, Chickie Donohue (Zac Efron) decide viajar a la primera línea del frente para llevar a los soldados unas latas de su cerveza norteamericana favorita. Lo que empieza como un viaje repleto de buenas intenciones se convierte rápidamente en una aventura iniciática cuando Chickie se enfrenta a la realidad de esa controvertida guerra, y cuando el reencuentro con sus amigos de la infancia le muestra las complejidades y responsabilidades de la vida adulta.', 126, 2022, 'cerveza.jpg', 4.4, 2),
(7, 2, 'RBD', 'En una escuela de élite, un grupo de amigos enfrenta los desafíos de la mayoría de edad, las rivalidades y las pasiones mientras persiguen su sueño de triunfar en la música.', 170, 2021, 'RBD.jpg', 3, 2),
(9, 2, 'Buscando a Nemo', 'Marlin, un pez payaso, siempre ha intentado proteger de todos los peligros a su hijo. Sin embargo, un buzo atrapa al pequeño, y ahora el padre deberá embarcarse en una increíble aventura por las aguas australianas para encontrarlo.', 116, 2017, 'BuscandoNemo.jpg', 4.5, 1);

-- --------------------------------------------------------

--
-- Table structure for table pelicula_genero
--

CREATE TABLE pelicula_genero (
  pelicula_id int NOT NULL,
  genero_id int NOT NULL,
  GENERO int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table pelicula_genero
--

INSERT INTO pelicula_genero (pelicula_id, genero_id, GENERO) VALUES
(1, 1, 1),
(2, 2, 2),
(3, 6, 6),
(4, 3, 3),
(5, 5, 5),
(6, 4, 4);

-- --------------------------------------------------------

--
-- Table structure for table rol
--

CREATE TABLE rol (
  id int NOT NULL,
  role varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table rol
--

INSERT INTO rol (id, role) VALUES
(1, 'ROLE_ADMIN'),
(2, 'ROLE_USER');

-- --------------------------------------------------------

--
-- Table structure for table usuario
--

CREATE TABLE usuario (
  id int NOT NULL,
  primer_nombre varchar(45) NOT NULL,
  segundo_nombre varchar(45) DEFAULT NULL,
  primer_apellido varchar(45) NOT NULL,
  segundo_apellido varchar(45) DEFAULT NULL,
  fecha_nacimiento date DEFAULT NULL,
  edad int DEFAULT NULL,
  email varchar(70) NOT NULL,
  contrasena varchar(255) NOT NULL,
  rol_id int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table usuario
--

INSERT INTO usuario (id, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, fecha_nacimiento, edad, email, contrasena, rol_id) VALUES
(1, 'Daniel', NULL, 'Murillo', NULL, '2022-10-04', 21, 'daniel@daniel.com', '$2a$10$/8NHPLc5NTCqcaMd6rIeyOyxgplWk.BGMhWjyz3t42BAuFSeRisPO', 2),
(2, 'Yesid', NULL, 'Murillo', NULL, '2022-10-04', 13, 'daniel1@daniel1.com', '$2a$10$/8NHPLc5NTCqcaMd6rIeyOyxgplWk.BGMhWjyz3t42BAuFSeRisPO', 2),
(3, 'Admin', NULL, 'Admin', NULL, NULL, NULL, 'daniel2@daniel2.com', '$2a$10$/8NHPLc5NTCqcaMd6rIeyOyxgplWk.BGMhWjyz3t42BAuFSeRisPO', 1),
(4, 'Sebastian', 'N/a', 'Perez', 'Bello', '2000-04-27', NULL, 'thegastrea123@gmail.com', '$2a$10$Tdr.Od8TkfcejhagslPUpu3hAtpeRSjFKwhzBEpUm7psuQ6X2i6LC', 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table clasificacion
--
ALTER TABLE clasificacion
  ADD PRIMARY KEY (id);

--
-- Indexes for table genero
--
ALTER TABLE genero
  ADD PRIMARY KEY (id);

--
-- Indexes for table opinion
--
ALTER TABLE opinion
  ADD PRIMARY KEY (id),
  ADD KEY opinion_pelicula_fk (pelicula_id),
  ADD KEY opinion_usuario_fk (usuario_id);

--
-- Indexes for table pelicula
--
ALTER TABLE pelicula
  ADD PRIMARY KEY (id),
  ADD KEY pelicula_clasificacion_fk (clasificacion_id);

--
-- Indexes for table pelicula_genero
--
ALTER TABLE pelicula_genero
  ADD PRIMARY KEY (pelicula_id,genero_id),
  ADD KEY pelicula_genero_genero_fk (genero_id);

--
-- Indexes for table rol
--
ALTER TABLE rol
  ADD PRIMARY KEY (id);

--
-- Indexes for table usuario
--
ALTER TABLE usuario
  ADD PRIMARY KEY (id),
  ADD KEY usuario_rol_fk (rol_id);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table clasificacion
--
ALTER TABLE clasificacion
  MODIFY id int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table genero
--
ALTER TABLE genero
  MODIFY id int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table opinion
--
ALTER TABLE opinion
  MODIFY id int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table pelicula
--
ALTER TABLE pelicula
  MODIFY id int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table rol
--
ALTER TABLE rol
  MODIFY id int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table usuario
--
ALTER TABLE usuario
  MODIFY id int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Constraints for dumped tables
--

--
-- Constraints for table opinion
--
ALTER TABLE opinion
  ADD CONSTRAINT opinion_pelicula_fk FOREIGN KEY (pelicula_id) REFERENCES pelicula (id),
  ADD CONSTRAINT opinion_usuario_fk FOREIGN KEY (usuario_id) REFERENCES usuario (id);

--
-- Constraints for table pelicula
--
ALTER TABLE pelicula
  ADD CONSTRAINT pelicula_clasificacion_fk FOREIGN KEY (clasificacion_id) REFERENCES clasificacion (id);

--
-- Constraints for table pelicula_genero
--
ALTER TABLE pelicula_genero
  ADD CONSTRAINT pelicula_genero_genero_fk FOREIGN KEY (genero_id) REFERENCES genero (id),
  ADD CONSTRAINT pelicula_genero_pelicula_fk FOREIGN KEY (pelicula_id) REFERENCES pelicula (id);

--
-- Constraints for table usuario
--
ALTER TABLE usuario
  ADD CONSTRAINT usuario_rol_fk FOREIGN KEY (rol_id) REFERENCES rol (id);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
