# Movie Explorer Client-Server Application

## Index
1. Project specifications
2. Description of program
3. Instructions on which operating system to use
4. Type and version of program used
5. Installation guide
6. How to run program
7. How to handle error messages
8. Screenshots of all operations
9. Current issues

### 1. Project Specifications
- Client Application:
The client interface must consist of two GUIs. Firstly, a GUI is where a user can enter a movie's name or genre to search.

The user must be able to enter partial matches, e.g.
‘men’ would return ‘X Men’ and ‘Men of Honor’, and 'drama' for genre would return 'drama' and 'comedy drama'.

Secondly, an administrator GUI is where an administrator can insert and delete information from the database.

Use regular expressions to check that valid information is entered (e.g. no numbers in genres). To access the administrator GUI, a user name and password must be entered and checked against the database to see if they are correct.

If the user searches for a movie or genre that is not in the database, a message indicating this must be displayed to the user.
All functionality of the client application should be contained in a menu. Also provide a help menu.

When the user closes the application, they must be given the option to minimise, exit or cancel the operation.

- Server Application:
The server must contain a start-up button and a shut down button, which will start up and shut down the server respectively.

The user must enter the administrator user name and password to be able to start up or shut down the server. The server must be able to handle multiple client connections.

Only the server application will query the database directly, by receiving requests from the client. The results will be returned to the client for display to the user.

- Database:
The database will consist of three tables. The first table must have an movieId (Primary Key field), movieName, description and a genreId (Foreign Key field). The second table must have a genreId (Primary Key field) and a genreName.

The third table must have a userId (Primary Key field), username and password. You must use a Microsoft SQL

- Server Database:
Make sure that the genreId already exists before entering a value. You need to be able to insert data into both tables, but be able to delete from the movie table only and not the genre table.

The data in the user table can be inserted into your database manually. You do not need to insert, update or delete the data in this table as it will only be used to check if an administrator has entered the correct user name and password.

### 2. Description of Program
This application is designed to handle requests from a user when wanting to query a movie title or genre. Administrators of the application can also add and remove movies from the database and can also stop or start the server that handles all the client requests.

The server application is designed to handle multiple clients and requests simultaneously and requires administrators to login before being able to stop or start the server.

Regarding the client application, administrators also need to login in order to add or remove movies or even add additional movie genres.

### 3. Instructions on which OS to use
Due to the multi-platform nature of Java applications, this program can run on any operating system. Should you decide to use a CLI to run the program, ensure that you have both the Java SDK and JRE installed.

### 4. Type and version of program used
This is the very first version of this program and is created by using Java Swing - Java Swing is used to develop GUI applications.

### 5. Installation guide
- Step 1:
From inside the 'Database Files' folder, you can simply run the script file 'MoviesProjectCreateDB', provided.
- Step 2:
From inside the 'Project Files' folder, navigate to the ProjectServer.java class. Ensure to insert your own MS SQL Server username and password. Currently it is set to 'user' and 'password' respectively. Also change these credentials from inside the AdminFrame.java class.
- Step 3:
Press F11 on your keyboard to build the project. Do this for both ProjectServer and ProjectClient applications. 

### 6. How to run program
- Step 1:
Starting with the server application, press F6 on your keyboard to run the application. When prompted, enter credentials as found in the Client table fron the provided database.
- Step 2:
After login in successfully, simple click on the 'Start Server' button to start the server.
- Step 3:
Moving on to the client application. Press F6 on your keyboard to run the application. You can now start searching for either movies or genres with dedicated menu items in the top menu bar.
- Step 4:
As an administrator, on the client application you will find an 'Admin' menu item in the top menu bar. Once you click on this menu item, you can simply login using the same credentials as with the server application.
- Step 5:
Once logged in, you can now add more movies or delete a few. You can also add additional genres as well.

### 7. How to handle error messages
Handling errors are very simple and straightforward. Try-catch blocks have been inserted as needed and dedicated popup dialogs will open with an error message relating to the specific error.

## Authors
- [Christiaan Venter](https://www.github.com/codecventer)
