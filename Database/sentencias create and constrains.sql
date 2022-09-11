
create schema pelireview;

use pelireview;

-- RENAME TABLE pelicula_genero TO pelicula_genero;
-- Generado por Oracle SQL Developer Data Modeler 22.2.0.165.1149
--   en:        2022-08-27 21:51:42 COT
--   sitio:      Oracle Database 11g
--   tipo:      Oracle Database 11g



-- predefined type, no DDL - MDSYS.SDO_GEOMETRY

-- predefined type, no DDL - XMLTYPE

CREATE TABLE clasificacion (
    id          INTEGER NOT NULL auto_increment,
    nombre      VARCHAR(45) NOT NULL,
    edad_minima INTEGER NOT NULL,
    primary key(id)
);

CREATE TABLE genero (
    id     INTEGER NOT NULL auto_increment,
    nombre VARCHAR(45) NOT NULL,
    primary key(id)
);

CREATE TABLE opinion (
    id          INTEGER NOT NULL auto_increment,
    opinion     TEXT NOT NULL,
    usuario_id  INTEGER NOT NULL,
    pelicula_id INTEGER NOT NULL,
    primary key(id)
);

CREATE TABLE pelicula (
    id               INTEGER NOT NULL auto_increment,
    titulo           VARCHAR(45) NOT NULL,
    argumento        TEXT NOT NULL,
    duracion         INTEGER NOT NULL,
    ano              INTEGER NOT NULL,
    puntuacion       DOUBLE NOT NULL,
    imagen           BLOB,
    clasificacion_id INTEGER,
    primary key(id)
);

CREATE TABLE pelicula_genero (
    pelicula_id INTEGER NOT NULL,
    genero_id   INTEGER NOT NULL
);


CREATE TABLE rol (
    id   INTEGER NOT NULL auto_increment,
    role VARCHAR(10) NOT NULL,
    primary key(id)
);

CREATE TABLE usuario (
    id               INTEGER NOT NULL auto_increment,
    primer_nombre    VARCHAR(45) NOT NULL,
    segundo_nombre   VARCHAR(45),
    primer_apellido  VARCHAR(45) NOT NULL,
    segundo_apellido VARCHAR(45),
    fecha_nacimiento DATE,
    edad             INTEGER,
    email            VARCHAR(70) NOT NULL,
    contrasena       VARCHAR(45) NOT NULL,
    rol_id           INTEGER,
    primary key(id)
);

ALTER TABLE pelicula_genero ADD CONSTRAINT pelicula_genero_pk PRIMARY KEY ( pelicula_id,
                                                                  genero_id );
ALTER TABLE opinion
    ADD CONSTRAINT opinion_pelicula_fk FOREIGN KEY ( pelicula_id )
        REFERENCES pelicula ( id );

ALTER TABLE opinion
    ADD CONSTRAINT opinion_usuario_fk FOREIGN KEY ( usuario_id )
        REFERENCES usuario ( id );

ALTER TABLE pelicula
    ADD CONSTRAINT pelicula_clasificacion_fk FOREIGN KEY ( clasificacion_id )
        REFERENCES clasificacion ( id );

ALTER TABLE pelicula_genero
    ADD CONSTRAINT pelicula_genero_genero_fk FOREIGN KEY ( genero_id )
        REFERENCES genero ( id );

ALTER TABLE pelicula_genero
    ADD CONSTRAINT pelicula_genero_pelicula_fk FOREIGN KEY ( pelicula_id )
        REFERENCES pelicula ( id );

ALTER TABLE usuario
    ADD CONSTRAINT usuario_rol_fk FOREIGN KEY ( rol_id )
        REFERENCES rol ( id );



-- Informe de Resumen de Oracle SQL Developer Data Modeler: 
-- 
-- CREATE TABLE                             7
-- CREATE INDEX                             0
-- ALTER TABLE                             13
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           0
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          0
-- CREATE MATERIALIZED VIEW                 0
-- CREATE MATERIALIZED VIEW LOG             0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   0
-- WARNINGS                                 0
