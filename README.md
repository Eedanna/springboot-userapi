# springboot-user crud apis

Steps to execute the rest apis

1. Extract the attached zip file and import it as Maven project in Eclipse / STS IDE
2. execute the below maven commands from command prompt or eclipse

	mvn clean install
	mvn eclipse:eclipse
	
3. Right click on the project and select properties and then go to  build path tab and click select all button and then apply and close
4. Right click on the UserApplication.java file and run as Spring boot (this will start tomcat server)

5. Open http://localhost:8080/h2 in the browser and click Connect.

6. Execute the below sql schema to create user table

CREATE TABLE user (
   firstname VARCHAR(50) NOT NULL, 
   lastname VARCHAR(50) NOT NULL,
   address VARCHAR(200) NOT NULL,
   phone VARCHAR(25) NOT NULL,
);

Make sure user table created successfully running select * from user;

7. Open Postman tool and execute the below urls

1.save the user data
-----------------------------
method : POST
URL :  http://localhost:8080/save 
Payload : 
{
  "firstname": "Test",
  "lastname": "User",
  "address": "USA",
  "phone": "111223456"
}

8. check the database using select * from user

2.get list of users
-----------------------------
method : GET
URL :  http://localhost:8080/listusers

9. To Execute the JUNIT test cases

Right click on UserApplicationTests.java and execute as JUNIT
  
you will see all the junit test case are passed.
