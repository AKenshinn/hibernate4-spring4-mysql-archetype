Maven Archetype For Sample Database Project
===========================================
This project using  Spring4, Hibernate4, MySQL, JUnit.

### Configuration ###
Change to use username and password of your database in
 1. src/main/resources/archetype-resources/src/main/resources/**hibernate.cfg.xml**
 2. src/main/resources/archetype-resources/src/main/resources/**hibernate.properties**
 3. src/main/resources/archetype-resources/**pom.xml**
 4. Create database name **test_db** or other name. (if use other name, you must change database url in 3 files above.)

### Install ###
Using maven install to install maven archetype.
~~~
mvn install
~~~

### Using ###
After install success, you can see this archetype when create **Maven project** in **Eclipse** or using command below :
~~~
mvn archetype:generate 											/
	-DarchetypeGroupId=com.anat.structure 						/
	-DarchetypeArtifactId=hibernate4-spring4-mysql-archetype 	/
	-DarchetypeVersion=1.0 										/
	-DgroupId=<your_groupId> 									/
	-DartifactId=<your_artifactId> 								/ 
	-DinteractiveMode=false 									/
~~~

### Generate database schema and initialize data ###
After create your project, you can genarate database schema and initialize data using command below :
~~~
mvn hibernate4:export sql:execute
~~~



 
 