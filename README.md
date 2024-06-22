# rest-crud-spring-jpa-project

This repository is all about employee management where we implement REST API and perform the CRUD operations in accordance with http requests. It also uses rest security to restrict the access baased on roles stored in databse.

## Implementation details:
### Java classes
    Employee - Its a POJO which is used as an Entity.
    EmployeeController - Its a controller which handles the http requests
    EmployeeRepository - Its a DAO which extends JPA repository to perform the database operations
    exceptionhandling - This package contains classes for exception handling i.e to handle bad requests
    EmployeeService - Interface holding the abstract methods of CRUD operations
    EmployeeServiceImpl - Implementation of above mentioned interface to perform CRUD operations

### Security Configuration
    SecurityConfig - This class contains two methods.
    1. userDetailsManager - It uses JdbcUserDetailsManager to understand from which table user data needs to be retrieved and from which table roles need to be retrieved.
    2. filterChain - It uses the HttpSecurity instance to set appropriate roles for appropriate Http actions
    
## Database
We used mysql database for storage purpose. Below are the details related to database:
* DBName : employee_database
* We have overridden the default user and password using application.properties
* To setup MySQL workbench refer https://www.javatpoint.com/how-to-install-mysql
* The SQL scripts required to create and insert the tables is attached in this repo under src/main/java/SQLscripts
