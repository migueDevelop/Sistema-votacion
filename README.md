# Sistema-votacion (Voting-System)
+ Un sistema de votacion de candidatos presidenciales.
+ A voting system for presidential candidates.

## Requirements
+ JDK 8 or superior
+ MySql 8.0.29 or superior

## Steps to run the system locally
1. Load the porject using maven and build it using the specified version of jdk.
2. Create a database call `votacion` in your database management.
3. Configure the database connection in `applications.properties` file, write your username and password to access to your local instance.
4. Go to main class and uncomment the functions from `saveUsuarios()` to `saveUsuarioPapeleta()` and run the project, there should be a log in terminal, `"5 Usuarios se añadieron!"`.
5. Comment the methods again and rerun the project.
6. Now run on `localhost:8080`, if the port is already in use change it in `application.properties` file using `server.port = new port`.

## Credentials
List of users:
+ ER100420
+ RA102011
+ BC100520
+ MM102120
+ FG100220

Password:
+ 1234

### Notes
+ Every user has the same password.
+ You can only make one vote per user.
+ If you want to restart the data go to main class and uncomment the delete methods.

### Recomended
+ IDE: IntelliJ IDEA, NeatBeans, Eclipse as you'll be using spring framework.
+ Java LTS version.
