# user-registration
 A user registration system enables individuals to create accounts, providing necessary information.

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Mysql](https://img.shields.io/badge/mysql-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)
![JWT](https://img.shields.io/badge/JWT-black?style=for-the-badge&logo=JSON%20web%20tokens)

This project is an API built using **Java, Java Spring, Mysql as the database, and Spring Security and JWT for authentication control.*

## Table of Contents

- [Installation](#installation)
- [Configuration](#configuration)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Authentication](#authentication)
- [Database](#database)
- [Contributing](#contributing)

## Installation

1. Clone the repository:

```bash
git clone [https://github.com/rodrianderson/user-registration]
```

2. Install dependencies with Maven

3. Install [Mysql](https://www.mysql.com/)

## Usage

1. Start the application with Maven
2. The API will be accessible at http://localhost:8080


## API Endpoints
The API provides the following endpoints:

```markdown

*** Login ***

POST /auth/login - Login into the App

POST /auth/register - Register a new user into the App

*** User ***

GET /user/all - Get all users

POST /user/create - Create user

GET /user/cpf/{userCPF} - Get user by cpf

DELETE /user/delete/{userId} - Delete user

PUT /user/update/{userId} - Update user

GET /user/status/{UserStatusEnum} - Get user by UserStatusEnum

PATCH /user/deactivate/{userId} - Deactivate user

GET /user/id/{userId} - Get user by userId

```yaml
# Seu conteúdo YAML aqui
_type: export
__export_format: 4
__export_date: 2024-01-21T22:54:54.550Z
__export_source: insomnia.desktop.app:v8.6.0
resources:
  - _id: req_e8903d9143b0441ba148e0c46d648d38
    parentId: wrk_abb1b9ca7ca544ad8e11660f51f3f9c3
    modified: 1705860849387
    created: 1705860452829
    url: http://localhost:8080/user/id/1
    name: getById
    description: ""
    method: GET
    body: {}
    parameters:
      - id: pair_9b1978d9c59d4da08a67899a0dadb37d
        name: ""
        value: ""
        description: ""
    headers:
      - name: User-Agent
        value: insomnia/8.6.0
    authentication:
      type: bearer
      token: eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhbmRlcnNvbiIsImlzcyI6ImF1dGgtYXBpIiwiZXhwIjoxNzA1ODYyOTkzfQ.HRmFjrZ7zer1wNiDBpvrb0Q5GtjU23F5AjsbPxbxMas
      prefix: Bearer
    metaSortKey: -1705860452829
    isPrivate: false
    pathParameters: []
    settingStoreCookies: true
    settingSendCookies: true
    settingDisableRenderRequestBody: false
    settingEncodeUrl: true
    settingRebuildPath: true
    settingFollowRedirects: global
    _type: request
  - _id: wrk_abb1b9ca7ca544ad8e11660f51f3f9c3
    parentId: null
    modified: 1705854502268
    created: 1705854502268
    name: my-spec.yaml
    description: ""
    scope: design
    _type: workspace
  - _id: req_42a641c7e3c246ef9c91705c96a48738
    parentId: wrk_abb1b9ca7ca544ad8e11660f51f3f9c3
    modified: 1705863263422
    created: 1705862937987
    url: http://localhost:8080/user/deactivate/4
    name: Desactive
    description: ""
    method: PATCH
    body: {}
    parameters:
      - id: pair_9b1978d9c59d4da08a67899a0dadb37d
        name: ""
        value: ""
        description: ""
    headers:
      - name: User-Agent
        value: insomnia/8.6.0
    authentication:
      type: bearer
      token: eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhbmRlcnNvbiIsImlzcyI6ImF1dGgtYXBpIiwiZXhwIjoxNzA1ODcwNDIxfQ.TldC9C5PYE7PAWlJWaTBIgzNzox3Cu3yO5A0jCBTesE
      prefix: Bearer
    metaSortKey: -1705860330487.8125
    isPrivate: false
    pathParameters: []
    settingStoreCookies: true
    settingSendCookies: true
    settingDisableRenderRequestBody: false
    settingEncodeUrl: true
    settingRebuildPath: true
    settingFollowRedirects: global
    _type: request
  - _id: req_7f3bf87c1c274369b0df054b8028d86b
    parentId: wrk_abb1b9ca7ca544ad8e11660f51f3f9c3
    modified: 1705862821380
    created: 1705862644138
    url: http://localhost:8080/user/status/ATIVO
    name: getByStatus
    description: ""
    method: GET
    body: {}
    parameters:
      - id: pair_9b1978d9c59d4da08a67899a0dadb37d
        name: ""
        value: ""
        description: ""
    headers:
      - name: User-Agent
        value: insomnia/8.6.0
    authentication:
      type: bearer
      token: eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhbmRlcnNvbiIsImlzcyI6ImF1dGgtYXBpIiwiZXhwIjoxNzA1ODYyOTkzfQ.HRmFjrZ7zer1wNiDBpvrb0Q5GtjU23F5AjsbPxbxMas
      prefix: Bearer
    metaSortKey: -1705860208146.625
    isPrivate: false
    pathParameters: []
    settingStoreCookies: true
    settingSendCookies: true
    settingDisableRenderRequestBody: false
    settingEncodeUrl: true
    settingRebuildPath: true
    settingFollowRedirects: global
    _type: request
  - _id: req_431f4ec80c3344dd855b56a12ae40ac7
    parentId: wrk_abb1b9ca7ca544ad8e11660f51f3f9c3
    modified: 1705861921947
    created: 1705861841729
    url: http://localhost:8080/user/update/2
    name: update
    description: ""
    method: PUT
    body:
      mimeType: application/json
      text: |-
        {
        	"id": 2,
        	"cpf": "000000000000",
        	"name": "Anderson",
        	"dateBirth": "1990-05-20T00:00:00.000+00:00",
        	"address": {
        		"street": "Bag End",
        		"number": 123,
        		"complement": "hobbit hole",
        		"neighborhood": "the Shire",
        		"city": "Hobbiton",
        		"state": "Westron",
        		"zipCode": "12345"
        	}
        }
    parameters:
      - id: pair_9b1978d9c59d4da08a67899a0dadb37d
        name: ""
        value: ""
        description: ""
    headers:
      - name: Content-Type
        value: application/json
      - name: User-Agent
        value: insomnia/8.6.0
    authentication:
      type: bearer
      token: eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhbmRlcnNvbiIsImlzcyI6ImF1dGgtYXBpIiwiZXhwIjoxNzA1ODYyOTkzfQ.HRmFjrZ7zer1wNiDBpvrb0Q5GtjU23F5AjsbPxbxMas
      prefix: Bearer
    metaSortKey: -1705859963464.25
    isPrivate: false
    pathParameters: []
    settingStoreCookies: true
    settingSendCookies: true
    settingDisableRenderRequestBody: false
    settingEncodeUrl: true
    settingRebuildPath: true
    settingFollowRedirects: global
    _type: request
  - _id: req_caacd3bd7014424dacb50f764ed699e7
    parentId: wrk_abb1b9ca7ca544ad8e11660f51f3f9c3
    modified: 1705861209148
    created: 1705861123582
    url: http://localhost:8080/user/delete/1
    name: Delete
    description: ""
    method: DELETE
    body: {}
    parameters:
      - id: pair_9b1978d9c59d4da08a67899a0dadb37d
        name: ""
        value: ""
        description: ""
    headers:
      - name: User-Agent
        value: insomnia/8.6.0
    authentication:
      type: bearer
      token: eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhbmRlcnNvbiIsImlzcyI6ImF1dGgtYXBpIiwiZXhwIjoxNzA1ODYyOTkzfQ.HRmFjrZ7zer1wNiDBpvrb0Q5GtjU23F5AjsbPxbxMas
      prefix: Bearer
      disabled: false
    metaSortKey: -1705859474099.5
    isPrivate: false
    pathParameters: []
    settingStoreCookies: true
    settingSendCookies: true
    settingDisableRenderRequestBody: false
    settingEncodeUrl: true
    settingRebuildPath: true
    settingFollowRedirects: global
    _type: request
  - _id: req_c304a08b907b4441a1f40ae716579271
    parentId: wrk_abb1b9ca7ca544ad8e11660f51f3f9c3
    modified: 1705860888622
    created: 1705860861634
    url: http://localhost:8080/user/cpf/12345678901
    name: getByCpf
    description: ""
    method: GET
    body: {}
    parameters:
      - id: pair_9b1978d9c59d4da08a67899a0dadb37d
        name: ""
        value: ""
        description: ""
    headers:
      - name: User-Agent
        value: insomnia/8.6.0
    authentication:
      type: bearer
      token: eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhbmRlcnNvbiIsImlzcyI6ImF1dGgtYXBpIiwiZXhwIjoxNzA1ODYyOTkzfQ.HRmFjrZ7zer1wNiDBpvrb0Q5GtjU23F5AjsbPxbxMas
      prefix: Bearer
    metaSortKey: -1705858495370
    isPrivate: false
    pathParameters: []
    settingStoreCookies: true
    settingSendCookies: true
    settingDisableRenderRequestBody: false
    settingEncodeUrl: true
    settingRebuildPath: true
    settingFollowRedirects: global
    _type: request
  - _id: req_3e74a9c8a5c049a2bd51ffa6858a0173
    parentId: wrk_abb1b9ca7ca544ad8e11660f51f3f9c3
    modified: 1705876243412
    created: 1705856537911
    url: localhost:8080/user/create
    name: Create
    description: ""
    method: POST
    body:
      mimeType: application/json
      text: |-
        {
          "cpf": "112345678901",
          "name": "Frodo Baggins",
          "dateBirth": "1990-05-20",
          "address": {
            "street": "Bag End",
        		"number": 123,
        		"complement": "hobbit hole",
        		"neighborhood": "the Shire",
            "city": "Hobbiton",
            "state": "Westron",
            "zipCode": "12345"
          }  
        }
    parameters: []
    headers:
      - name: Content-Type
        value: application/json
      - name: User-Agent
        value: insomnia/8.6.0
    authentication:
      type: bearer
      token: eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhbmRlcnNvbiIsImlzcyI6ImF1dGgtYXBpIiwiZXhwIjoxNzA1ODgzNDI4fQ.pJkfEWX6tN3pRmPTMk_NPDZBWyNW8zC24bpJJ_vIPiQ
      prefix: Bearer
    metaSortKey: -1705856537911
    isPrivate: false
    pathParameters: []
    settingStoreCookies: true
    settingSendCookies: true
    settingDisableRenderRequestBody: false
    settingEncodeUrl: true
    settingRebuildPath: true
    settingFollowRedirects: global
    _type: request
  - _id: req_2e27bd1fa41b42b8b7fd36b940a67f85
    parentId: wrk_abb1b9ca7ca544ad8e11660f51f3f9c3
    modified: 1705863760264
    created: 1705856445020
    url: localhost:8080/user/all
    name: All
    description: ""
    method: GET
    body: {}
    parameters: []
    headers:
      - name: User-Agent
        value: insomnia/8.6.0
    authentication:
      type: bearer
      token: eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlbGlzYW5kcmEiLCJpc3MiOiJhdXRoLWFwaSIsImV4cCI6MTcwNTg3MDk0M30.9CcI8He273gKqCE3cLXMYnaYLGlX1L-r0Fg0Z2_WmWk
      prefix: Bearer
      disabled: false
    metaSortKey: -1705856445020
    isPrivate: false
    pathParameters: []
    settingStoreCookies: true
    settingSendCookies: true
    settingDisableRenderRequestBody: false
    settingEncodeUrl: true
    settingRebuildPath: true
    settingFollowRedirects: global
    _type: request
  - _id: req_09cb025f094741ee8d66e38ec6fbfd1c
    parentId: wrk_abb1b9ca7ca544ad8e11660f51f3f9c3
    modified: 1705876226694
    created: 1705855657480
    url: localhost:8080/auth/login
    name: Login
    description: ""
    method: POST
    body:
      mimeType: application/json
      text: |-
        {
        	"login": "anderson",
        	"password": "123456"
        }
    parameters: []
    headers:
      - name: Content-Type
        value: application/json
      - name: User-Agent
        value: insomnia/8.6.0
    authentication: {}
    metaSortKey: -1705855657480
    isPrivate: false
    pathParameters: []
    settingStoreCookies: true
    settingSendCookies: true
    settingDisableRenderRequestBody: false
    settingEncodeUrl: true
    settingRebuildPath: true
    settingFollowRedirects: global
    _type: request
  - _id: req_825a25fd5c65436080812dd82379ca3b
    parentId: wrk_abb1b9ca7ca544ad8e11660f51f3f9c3
    modified: 1705876218197
    created: 1705854553721
    url: localhost:8080/auth/register
    name: Register
    description: ""
    method: POST
    body:
      mimeType: application/json
      text: |-
        {
        	"login": "anderson",
        	"password": "123456",
        	"role": "ADMIN"	
        }
    parameters: []
    headers:
      - name: Content-Type
        value: application/json
      - name: User-Agent
        value: insomnia/8.6.0
    authentication: {}
    metaSortKey: -1705854553721
    isPrivate: false
    pathParameters: []
    settingStoreCookies: true
    settingSendCookies: true
    settingDisableRenderRequestBody: false
    settingEncodeUrl: true
    settingRebuildPath: true
    settingFollowRedirects: global
    _type: request
  - _id: env_75145fa4aafe12c82538ba773bd7cee3f66819d7
    parentId: wrk_abb1b9ca7ca544ad8e11660f51f3f9c3
    modified: 1705854502288
    created: 1705854502288
    name: Base Environment
    data: {}
    dataPropertyOrder: null
    color: null
    isPrivate: false
    metaSortKey: 1705854502288
    _type: environment
  - _id: jar_75145fa4aafe12c82538ba773bd7cee3f66819d7
    parentId: wrk_abb1b9ca7ca544ad8e11660f51f3f9c3
    modified: 1705854502292
    created: 1705854502292
    name: Default Jar
    cookies: []
    _type: cookie_jar
  - _id: spc_2bdc47c6c3904d6b84da559e383e4eaf
    parentId: wrk_abb1b9ca7ca544ad8e11660f51f3f9c3
    modified: 1705854515598
    created: 1705854515598
    fileName: New Document
    contents: >-
      openapi: 3.0.0

      info:
        description: "This is a sample server Petstore server.  You can find out more about
          Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net,
          #swagger](http://swagger.io/irc/).  For this sample, you can use the api key
          `special-key` to test the authorization filters."
        version: 1.0.2
        title: Swagger Petstore
        termsOfService: http://swagger.io/terms/
        contact:
          email: apiteam@swagger.io
        license:
          name: Apache 2.0
          url: http://www.apache.org/licenses/LICENSE-2.0.html
      tags:
        - name: pet
          description: Everything about your Pets
          externalDocs:
            description: Find out more
            url: http://swagger.io
        - name: store
          description: Access to Petstore orders
        - name: user
          description: Operations about user
          externalDocs:
            description: Find out more about our store
            url: http://swagger.io
      paths:
        /pet:
          post:
            tags:
              - pet
            summary: Add a new pet to the store
            description: ""
            operationId: addPet
            requestBody:
              $ref: "#/components/requestBodies/Pet"
            responses:
              "405":
                description: Invalid input
          put:
            tags:
              - pet
            summary: Update an existing pet
            description: ""
            operationId: updatePet
            requestBody:
              $ref: "#/components/requestBodies/Pet"
            responses:
              "400":
                description: Invalid ID supplied
              "404":
                description: Pet not found
              "405":
                description: Validation exception
        /pet/findByStatus:
          get:
            tags:
              - pet
            summary: Finds Pets by status
            description: Multiple status values can be provided with comma separated strings
            operationId: findPetsByStatus
            parameters:
              - name: status
                in: query
                description: Status values that need to be considered for filter
                required: true
                explode: true
                schema:
                  type: array
                  items:
                    type: string
                    enum:
                      - available
                      - pending
                      - sold
                    default: available
            responses:
              "200":
                description: successful operation
                content:
                  application/xml:
                    schema:
                      type: array
                      items:
                        $ref: "#/components/schemas/Pet"
                  application/json:
                    schema:
                      type: array
                      items:
                        $ref: "#/components/schemas/Pet"
              "400":
                description: Invalid status value
        /pet/findByTags:
          get:
            tags:
              - pet
            summary: Finds Pets by tags
            description: Multiple tags can be provided with comma separated strings. Use tag1,
              tag2, tag3 for testing.
            operationId: findPetsByTags
            parameters:
              - name: tags
                in: query
                description: Tags to filter by
                required: true
                explode: true
                schema:
                  type: array
                  items:
                    type: string
            responses:
              "200":
                description: successful operation
                content:
                  application/xml:
                    schema:
                      type: array
                      items:
                        $ref: "#/components/schemas/Pet"
                  application/json:
                    schema:
                      type: array
                      items:
                        $ref: "#/components/schemas/Pet"
              "400":
                description: Invalid tag value
            deprecated: true
        "/pet/{petId}":
          get:
            tags:
              - pet
            summary: Find pet by ID
            description: Returns a single pet
            operationId: getPetById
            parameters:
              - name: petId
                in: path
                description: ID of pet to return
                required: true
                schema:
                  type: integer
                  format: int64
            responses:
              "200":
                description: successful operation
                content:
                  application/xml:
                    schema:
                      $ref: "#/components/schemas/Pet"
                  application/json:
                    schema:
                      $ref: "#/components/schemas/Pet"
              "400":
                description: Invalid ID supplied
              "404":
                description: Pet not found
          post:
            tags:
              - pet
            summary: Updates a pet in the store with form data
            description: ""
            operationId: updatePetWithForm
            parameters:
              - name: petId
                in: path
                description: ID of pet that needs to be updated
                required: true
                schema:
                  type: integer
                  format: int64
            requestBody:
              content:
                application/x-www-form-urlencoded:
                  schema:
                    type: object
                    properties:
                      name:
                        description: Updated name of the pet
                        type: string
                      status:
                        description: Updated status of the pet
                        type: string
            responses:
              "405":
                description: Invalid input
          delete:
            tags:
              - pet
            summary: Deletes a pet
            description: ""
            operationId: deletePet
            parameters:
              - name: api_key
                in: header
                required: false
                schema:
                  type: string
              - name: petId
                in: path
                description: Pet id to delete
                required: true
                schema:
                  type: integer
                  format: int64
            responses:
              "400":
                description: Invalid ID supplied
              "404":
                description: Pet not found
        /store/inventory:
          get:
            tags:
              - store
            summary: Returns pet inventories by status
            description: Returns a map of status codes to quantities
            operationId: getInventory
            responses:
              "200":
                description: successful operation
                content:
                  application/json:
                    schema:
                      type: object
                      additionalProperties:
                        type: integer
                        format: int32
        /store/order:
          post:
            tags:
              - store
            summary: Place an order for a pet
            description: ""
            operationId: placeOrder
            requestBody:
              content:
                application/json:
                  schema:
                    $ref: "#/components/schemas/Order"
              description: order placed for purchasing the pet
              required: true
            responses:
              "200":
                description: successful operation
                content:
                  application/xml:
                    schema:
                      $ref: "#/components/schemas/Order"
                  application/json:
                    schema:
                      $ref: "#/components/schemas/Order"
              "400":
                description: Invalid Order
        "/store/order/{orderId}":
          get:
            tags:
              - store
            summary: Find purchase order by ID
            description: For valid response try integer IDs with value >= 1 and <= 10. Other
              values will generated exceptions
            operationId: getOrderById
            parameters:
              - name: orderId
                in: path
                description: ID of pet that needs to be fetched
                required: true
                schema:
                  type: integer
                  format: int64
                  minimum: 1
                  maximum: 10
            responses:
              "200":
                description: successful operation
                content:
                  application/xml:
                    schema:
                      $ref: "#/components/schemas/Order"
                  application/json:
                    schema:
                      $ref: "#/components/schemas/Order"
              "400":
                description: Invalid ID supplied
              "404":
                description: Order not found
          delete:
            tags:
              - store
            summary: Delete purchase order by ID
            description: For valid response try integer IDs with positive integer value. Negative
              or non-integer values will generate API errors
            operationId: deleteOrder
            parameters:
              - name: orderId
                in: path
                description: ID of the order that needs to be deleted
                required: true
                schema:
                  type: integer
                  format: int64
                  minimum: 1
            responses:
              "400":
                description: Invalid ID supplied
              "404":
                description: Order not found
        /user:
          post:
            tags:
              - user
            summary: Create user
            description: This can only be done by the logged in user.
            operationId: createUser
            requestBody:
              content:
                application/json:
                  schema:
                    $ref: "#/components/schemas/User"
              description: Created user object
              required: true
            responses:
              default:
                description: successful operation
        /user/createWithArray:
          post:
            tags:
              - user
            summary: Creates list of users with given input array
            description: ""
            operationId: createUsersWithArrayInput
            requestBody:
              $ref: "#/components/requestBodies/UserArray"
            responses:
              default:
                description: successful operation
        /user/createWithList:
          post:
            tags:
              - user
            summary: Creates list of users with given input array
            description: ""
            operationId: createUsersWithListInput
            requestBody:
              $ref: "#/components/requestBodies/UserArray"
            responses:
              default:
                description: successful operation
        /user/login:
          get:
            tags:
              - user
            summary: Logs user into the system
            description: ""
            operationId: loginUser
            parameters:
              - name: username
                in: query
                description: The user name for login
                required: true
                schema:
                  type: string
              - name: password
                in: query
                description: The password for login in clear text
                required: true
                schema:
                  type: string
            responses:
              "200":
                description: successful operation
                headers:
                  X-Rate-Limit:
                    description: calls per hour allowed by the user
                    schema:
                      type: integer
                      format: int32
                  X-Expires-After:
                    description: date in UTC when token expires
                    schema:
                      type: string
                      format: date-time
                content:
                  application/xml:
                    schema:
                      type: string
                  application/json:
                    schema:
                      type: string
              "400":
                description: Invalid username/password supplied
        /user/logout:
          get:
            tags:
              - user
            summary: Logs out current logged in user session
            description: ""
            operationId: logoutUser
            responses:
              default:
                description: successful operation
        "/user/{username}":
          get:
            tags:
              - user
            summary: Get user by user name
            description: ""
            operationId: getUserByName
            parameters:
              - name: username
                in: path
                description: "The name that needs to be fetched. Use user1 for testing. "
                required: true
                schema:
                  type: string
            responses:
              "200":
                description: successful operation
                content:
                  application/xml:
                    schema:
                      $ref: "#/components/schemas/User"
                  application/json:
                    schema:
                      $ref: "#/components/schemas/User"
              "400":
                description: Invalid username supplied
              "404":
                description: User not found
          put:
            tags:
              - user
            summary: Updated user
            description: This can only be done by the logged in user.
            operationId: updateUser
            parameters:
              - name: username
                in: path
                description: name that need to be updated
                required: true
                schema:
                  type: string
            requestBody:
              content:
                application/json:
                  schema:
                    $ref: "#/components/schemas/User"
              description: Updated user object
              required: true
            responses:
              "400":
                description: Invalid user supplied
              "404":
                description: User not found
          delete:
            tags:
              - user
            summary: Delete user
            description: This can only be done by the logged in user.
            operationId: deleteUser
            parameters:
              - name: username
                in: path
                description: The name that needs to be deleted
                required: true
                schema:
                  type: string
            responses:
              "400":
                description: Invalid username supplied
              "404":
                description: User not found
      externalDocs:
        description: Find out more about Swagger
        url: http://swagger.io
      servers:
        - url: https://petstore.swagger.io/v2
      components:
        requestBodies:
          UserArray:
            content:
              application/json:
                schema:
                  type: array
                  items:
                    $ref: "#/components/schemas/User"
            description: List of user object
            required: true
          Pet:
            content:
              application/json:
                schema:
                  $ref: "#/components/schemas/Pet"
              application/xml:
                schema:
                  $ref: "#/components/schemas/Pet"
            description: Pet object that needs to be added to the store
            required: true
        schemas:
          Order:
            type: object
            properties:
              id:
                type: integer
                format: int64
              petId:
                type: integer
                format: int64
              quantity:
                type: integer
                format: int32
              shipDate:
                type: string
                format: date-time
              status:
                type: string
                description: Order Status
                enum:
                  - placed
                  - approved
                  - delivered
              complete:
                type: boolean
                default: false
            xml:
              name: Order
          User:
            type: object
            properties:
              id:
                type: integer
                format: int64
              username:
                type: string
              firstName:
                type: string
              lastName:
                type: string
              email:
                type: string
              password:
                type: string
              phone:
                type: string
              userStatus:
                type: integer
                format: int32
                description: User Status
            xml:
              name: User
          Category:
            type: object
            properties:
              id:
                type: integer
                format: int64
              name:
                type: string
            xml:
              name: Category
          Tag:
            type: object
            properties:
              id:
                type: integer
                format: int64
              name:
                type: string
            xml:
              name: Tag
          Pet:
            type: object
            required:
              - name
              - photoUrls
            properties:
              id:
                type: integer
                format: int64
              category:
                $ref: "#/components/schemas/Category"
              name:
                type: string
                example: doggie
              photoUrls:
                type: array
                xml:
                  name: photoUrl
                  wrapped: true
                items:
                  type: string
              tags:
                type: array
                xml:
                  name: tag
                  wrapped: true
                items:
                  $ref: "#/components/schemas/Tag"
              status:
                type: string
                description: pet status in the store
                enum:
                  - available
                  - pending
                  - sold
            xml:
              name: Pet
          ApiResponse:
            type: object
            properties:
              code:
                type: integer
                format: int32
              type:
                type: string
              message:
                type: string
    contentType: yaml
    _type: api_spec


```

## Authentication
The API uses Spring Security for authentication control. The following roles are available:

```
USER -> Standard user role for logged-in users.
ADMIN -> Admin role for managing partners (registering new partners).
```
To access protected endpoints as an ADMIN user, provide the appropriate authentication credentials in the request header.







