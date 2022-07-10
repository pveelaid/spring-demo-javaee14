### MVC pattern
- Model(data + operations on data)
- View(views presented to user)
- Controller(handling incoming requests and provides views for clients/users)

### Application architecture with MVC
- View
- Controller
- Model(Service + Repository)

### Application architecture with MVC - second view
- View, presented to user
- Controller(should have reference to Service), handling incoming requests and provides views for clients/users
- Service(should have reference to Repository), processed data
- Repository, stores and provides access to data(eg. database)

### REST API
- for exchanging data in universal format - JSON/XML
- for sharing resources
- CRUD - Create Read Update Delete
- Reservation - it's a resource
- resources should be plural nouns and organized in hierarchical way
- first and second proposal
  - /reservations - for reading all reservations - with GET http method
  - /reservations/add - for creating a reservation - with POST http method
  - /deletereservations vs /reservations/delete- for deleting reservations - with DELETE http method
  - /updatereservations vs /reservations/update - for updating reservations - with PUT http method
- third proposal
  - /reservations - GET - for Reading all resources (R from CRUD)
  - /reservations/{id} - GET - for Reading for one resource (R from CRUD)
  - /reservations - POST - for Creation (C from CRUD)
  - /reservations/{id} - DELETE - for Deletion (D from CRUD)
  - /reservations/{id} - PUT - for Update(full) (U from CRUD)
  - /reservations/{id} - PATCH - for Update(partial) (U from CRUD)