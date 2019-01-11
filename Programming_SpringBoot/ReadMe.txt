=================================================
Reference URL
=================================================
https://start.spring.io/
https://github.com/in28minutes/spring-microservices
https://github.com/in28minutes/spring-microservices/tree/master/02.restful-web-services


=================================================
Project Configurations/TroubleShooting/Tips
=================================================
(1) Project -> Right Mouse click on pom.xml -> Run As -> Maven Install/Clean
		Check option -> Force Update of Snapshots/Releases and then click Ok 
			
(2) Project -> Right Mouse click -> Maven -> Update Project -> 
		Check option -> Force Update of Snapshots/Releases and then click Ok 


=================================================
Resources and URI Mappings
=================================================
Retrieve all Users - GET /users
Create a User - POST /users
Retrieve one User - GET /users/{id} -> /users/1
Delete a User - DELETE /users/{id} -> /users/1
Retrieve all posts for a User - GET /users/{id}/posts
Create a posts for a User - POST /users/{id}/posts
Retrieve details of a post - GET /users/{id}/posts/{post_id}