# Sodavendingmachine
This project is demo application for  vending machine .
we are using in memory database and table name is Item 
we are using spring boot, 
To build the project :
Git clone <repo url >
navigate to SodaVendingMachine folder 
run : Mvn clean install
run as springboot application
use postman or any rest client to hit the URL with base as :
/soda-item
base path :http://localhost:8080/soda-item 
to get all items : http://localhost:8080/soda-item/get-all-item
to create item : http://localhost:8080/soda-item/create-item
to update items: http://localhost:8080/soda-item/edit-template
to delete items : http://localhost:8080/soda-item/delete-item/{id}
to get item by id :http://localhost:8080/soda-item/itemid/{id} 

