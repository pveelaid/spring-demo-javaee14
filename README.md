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

### HTTP
Request
- consist of 
  - url
  - headers
  - params
  - body 
Response
- consist of
  - status codes
  - body
  - cookies
  - headers

Status codes:
- 1xx - confirmed - processing in progress
- 2xx - success
- 3xx - redirects
- 4xx - client issue
- 5xx - server fault


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
- third proposal - REST principles for good naming of resources
  - /reservations - GET - for Reading all resources (R from CRUD) 
    - status code 200
  - /reservations/{id} - GET - for Reading for one resource (R from CRUD) - status 
    - status code 200 with response body is ok
    - status code 404 with no response body(or error object)
  - /reservations - POST - for Creation (C from CRUD)
  - /reservations/{id} (/reservations/134666) - DELETE - for Deletion (D from CRUD)
  - /reservations/{id} (/reservations/134666) - PUT - for Update(full) (U from CRUD)
  - /reservations/{id} (/reservations/134666) - PATCH - for Update(partial) (U from CRUD)