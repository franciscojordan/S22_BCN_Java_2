/* Creación base de datos */
create database discography_DB;
use discography_DB;

/* Creación de tablas */
create table if not exists Album (
	idAlbum int primary key AUTO_INCREMENT,
	albumName varchar(255),
	dataReleased datetime
);

create table if not exists Genre (
	idGenre int primary key AUTO_INCREMENT,
	genre varchar(255)
);

create table if not exists Artist (
	idArtist int primary key AUTO_INCREMENT,
	artistName varchar(255)
);

select * from Artist;
