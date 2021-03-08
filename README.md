# Organisational Api
#### Java Application for creating a function api for departments, users and news
#### By **Ian Makale**
## Description
Organisational api is an application that uses restful routing to create an api that provides access to our apps' users, departments, and news posts. you are able to get and post new information but there is no front end provided and everything is in JSON format.
## Setup/Installation Requirements
* Internet connection
* access to a browser
* fork from https://github.com/BarakaIan/Organisation-API
## In PSQL:
* CREATE DATABASE organisational;
* \c organisational;
* CREATE TABLE users(id serial PRIMARY KEY, name varchar, bio varchar, position varchar, role varchar, departmentid int);
* CREATE TABLE news(id serial PRIMARY KEY, title varchar, content varchar, departmentid int);
* CREATE TABLE departments(id serial PRIMARY KEY, name varchar, bio varchar);
* CREATE DATABASE organisational_test WITH TEMPLATE organisational;
## Known Bugs
Deployment.
## Technologies Used
* IntelliJ IDEA
* Java
* Spark
* PostgreSql
#
### License
Licensed by MIT
Copyright (c) 2020 **Ian Makale**
