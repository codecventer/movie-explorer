/*
Filename: MoviesProjectCreateDB.sql
Author: Christiaan Venter
Created: 2 December 2021
Operating System: Windows 10
Version: 1.0.0
Description: This file contains the SQL command for creating the DB used in the client-server application.
*/

---------- CREATE DATABASE: ----------
USE master
GO
 
CREATE DATABASE Movies_DB
ON PRIMARY
(
   -- this and below is the primary database creation
   NAME ='Movies_DB.mdf',
   FILENAME = 'C:\sql2016\Movies_DB.mdf', -- update filepath
   SIZE = 5MB,
   FILEGROWTH = 10%
)
LOG ON
(
   -- this and below is the log file creation
   NAME ='Movies_DB_Log.ldf',
   FILENAME = 'C:\sql2016\Movies_DB_Log.ldf', -- update filepath
   SIZE = 5MB,
   FILEGROWTH = 10%
)
GO

---------- CREATE TABLES: ----------
USE Movies_DB
GO
 
CREATE TABLE Movie
(
   movieId INT NOT NULL IDENTITY (1,1),
   movieName VARCHAR(max) NOT NULL,
   description VARCHAR(max) NOT NULL,
   genreId INT FOREIGN KEY REFERENCES Genre(genreId)
   PRIMARY KEY (movieId)
)
GO
 
CREATE TABLE Genre
(
   genreId INT NOT NULL IDENTITY (1,1),
   genreName VARCHAR(max) NOT NULL,
   PRIMARY KEY (genreId)
)
GO

CREATE TABLE Client
(
	userId INT NOT NULL IDENTITY (1,1),
	username VARCHAR(max) NOT NULL,
	password VARCHAR(max) NOT NULL,
	PRIMARY KEY (userId)
)
GO

---------- INSERT VALUES: ----------
USE Movies_DB
GO

-- INSERT MOVIES:
INSERT INTO Movie (movieName, description, genreId) VALUES
(
	'The Godfather', 'The Godfather follows Vito Corleone Don of the Corleone family as he passes the mantel to his son Michael', 2
),
(
	'The Godfather Part 2', 'The early life and career of Vito Corleone in 1920s New York City is portrayed, while his son, Michael, expands and tightens his grip on the family crime syndicate.', 2
),
(
	'The Batman', 'In his second year of fighting crime, Batman uncovers corruption in Gotham City that connects to his own family while facing a serial killer known as the Riddler.', 1
),
(
	'Batman', 'The Dark Knight of Gotham City begins his war on crime with his first major enemy being Jack Napier, a criminal who becomes the clownishly homicidal Joker.', 1
);

-- INSERT GENRES:
INSERT INTO Genre (genreName) VALUES
(
	'Action'
),
(
	'Crime'
),
(
	'Comedy'
),
(
	'Romantic Comedy'
);

 INSERT CLIENTS:
INSERT INTO Client (username, password) VALUES
(
	'admin', 'admin'
),
(
	'picklebathilda', 'MyPinkPony'
);