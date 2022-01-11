DROP SCHEMA IF EXISTS tienda_leo_libros;
CREATE SCHEMA tienda_leo_libros;
USE tienda_leo_libros;
DROP TABLE IF EXISTS usuario;
CREATE TABLE usuario(
id_usuario int AUTO_INCREMENT,
nombre varchar(30) NOT NULL,
fecha date NOT NULL,
PRIMARY KEY(id_usuario));
INSERT INTO usuario(nombre, fecha) VALUES('Susana Perez', '2021-08-15');
INSERT INTO usuario(nombre, fecha) VALUES('Pedro Palacio', '2021-09-9');
INSERT INTO usuario(nombre, fecha) VALUES('Liliana Loaiza', '2021-10-1');
INSERT INTO usuario(nombre, fecha) VALUES('Camilo Rincon', '2021-02-3');
INSERT INTO usuario(nombre, fecha) VALUES('Brian Rodriguez', '2021-03-10');
USE tienda_leo_libros;
DROP TABLE IF EXISTS edicion;
CREATE TABLE edicion(
id_edicion int AUTO_INCREMENT,
anio int NOT NULL,
idioma varchar(20) NOT NULL,
copias int NOT NULL,
PRIMARY KEY(id_edicion));
INSERT INTO edicion(anio, idioma, copias) VALUES(2012, 'español', 10);
INSERT INTO edicion(anio, idioma, copias) VALUES(2017, 'ingles', 67);
INSERT INTO edicion(anio, idioma, copias) VALUES(2010, 'britanico', 23);
INSERT INTO edicion(anio, idioma, copias) VALUES(2020, 'ingles', 2);
INSERT INTO edicion(anio, idioma, copias) VALUES(2015, 'español', 1);
INSERT INTO edicion(anio, idioma, copias) VALUES(2019, 'español', 15);
INSERT INTO edicion(anio, idioma, copias) VALUES(2016, 'ingles', 8);
INSERT INTO edicion(anio, idioma, copias) VALUES(2013, 'italiano', 21);
USE tienda_leo_libros;
DROP TABLE IF EXISTS libro;
CREATE TABLE libro(
id_libro int AUTO_INCREMENT,
titulo varchar(30) NOT NULL,
autor varchar(30) NOT NULL,
id_edicion_fk int NOT NULL,
PRIMARY KEY(id_libro),
FOREIGN KEY(id_edicion_fk) REFERENCES edicion(id_edicion));
INSERT INTO libro(titulo, autor, id_edicion_fk) VALUES('Citas del presidente', 'Mao Tse-Tung', 1);
INSERT INTO libro(titulo, autor, id_edicion_fk) VALUES('Harry Potter', 'J.K. Rowling', 2);
INSERT INTO libro(titulo, autor, id_edicion_fk) VALUES('El señor de los anillos', 'J.R.R. Tolkien', 3);
INSERT INTO libro(titulo, autor, id_edicion_fk) VALUES('el alquimista', 'Paulo Coelho', 4);
INSERT INTO libro(titulo, autor, id_edicion_fk) VALUES('Codigo DaVinci', 'Dan Brown', 5);
INSERT INTO libro(titulo, autor, id_edicion_fk) VALUES('Crepusculo', 'Stephanie Meyer', 6);
INSERT INTO libro(titulo, autor, id_edicion_fk) VALUES('Todo se desmorona', 'Chinua Achebe', 7);
INSERT INTO libro(titulo, autor, id_edicion_fk) VALUES('Divina comedia', 'Dante Alighieri', 8);
USE tienda_leo_libros;
DROP TABLE IF EXISTS copias;
CREATE TABLE prestamo(
id_prestamo int AUTO_INCREMENT,
id_edicion_fk int NOT NULL,
id_usuario_fk int NOT NULL,
PRIMARY KEY(id_prestamo),
FOREIGN KEY(id_edicion_fk) REFERENCES edicion(id_edicion),
FOREIGN KEY(id_usuario_fk) REFERENCES usuario(id_usuario));
INSERT INTO prestamo(id_edicion_fk, id_usuario_fk) VALUES(1, 2);
INSERT INTO prestamo(id_edicion_fk, id_usuario_fk) VALUES(2, 1);
INSERT INTO prestamo(id_edicion_fk, id_usuario_fk) VALUES(3, 3);
INSERT INTO prestamo(id_edicion_fk, id_usuario_fk) VALUES(4, 4);
INSERT INTO prestamo(id_edicion_fk, id_usuario_fk) VALUES(5, 5);

