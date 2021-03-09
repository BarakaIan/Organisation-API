# Organisational Api
#### Java Application for creating a function api for departments, users and news
#### By **Ian Makale**
## Description
Organisational api is an application that uses restful routing to create an api that provides access to our apps' users, departments, and news posts. you are able to get and post new information but there is no front end provided and everything is in JSON format.


## Key Features
* Since uts an application that uses restful routing to create an api that provides access to our apps' users, departments, and news posts. you are able to get and post new information  and everything  in JSON format.


* This is a program that enables us to view the news of an organisation<br>
* The program will also the user to view the various departments<br>
* The program also ensures that we see various users <br>

## Technologies Used

The program is designed and developed using latest Technology, Hence making it Scalable and flexible.The following are Technologies USed:<br>
* Java<br>
* Spark<br>
* Html 5<br>
* 


## Program Specs.
* Go to postman and  enter the url of the various specs; for example,
* http://localhost:4567/users/new
* http://localhost:4567/departments/new
* http://localhost:4567/news/post


## How to Use
Database installation
* CREATE DATABASE organisational;
\c organisational;

* CREATE TABLE users(id serial PRIMARY KEY, name varchar, bio varchar, position varchar, role varchar, departmentid int);
* CREATE TABLE news(id serial PRIMARY KEY, title varchar, content varchar, departmentid int);
* CREATE TABLE departments(id serial PRIMARY KEY, name varchar, bio varchar);
* CREATE DATABASE organisational_test WITH TEMPLATE organisational;

This software uses following open source packages.

- [Java Runtime Environment :V9](#)
- [Latest Browsers](#)
- [Latest SDK](#)<br>
* Clone or Deploy this program from my Github Repository, or Fork It<br>
*Initialise It in your Local Machine<br>
*Open it With Lastest IDE

## Deployment

You can have this Program Deployed into you choice Deployement Service since this program is under MIT lincence. But heroku is preferable.

## Support

<a href="#" target="_blank"><img src="https://www.buymeacoffee.com/assets/img/custom_images/purple_img.png" alt="Buy Me A Coffee" style="height: 41px !important;width: 174px !important;box-shadow: 0px 3px 2px 0px rgba(190, 190, 190, 0.5) !important;-webkit-box-shadow: 0px 3px 2px 0px rgba(190, 190, 190, 0.5) !important;" ></a>

<p>Or</p>

<a href="#">
	<img src="https://c5.patreon.com/external/logo/become_a_patron_button@2x.png" width="160">
</a>

## Bugs
Currently there are no bugs available but I will keep updating my codes each time with the latest trends in the game.
## Live link
https://ian-organisational-api.herokuapp.com/

## License

MIT

---


## You like my work? Leave a comment in the comments section or communicate with me via email at ianb.makale@gmail.com. or contact me via the 24 hour hotline Number; +254719244916.

## Also if you are receiving some errors please brief me for immediate changes.

