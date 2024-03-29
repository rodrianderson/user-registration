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

4. Create database: dbcadastro

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

## Authentication
The API uses Spring Security for authentication control. The following roles are available:
To access protected endpoints as an ADMIN user, provide the appropriate authentication credentials in the request header.

```
USER -> Standard user role for logged-in users.

ADMIN -> Admin role for managing partners (registering new partners).

YAML ENDPOINTS -> (https://github.com/rodrianderson/user-registration/blob/main/user-registration.yaml.postman_collection.json)

## Example:

## User:
```json
{
	"id": 1,
	"cpf": "12345678901",
	"name": "Frodo Baggins",
	"dateBirth": "1990-05-19",
	"address": {
		"street": "Bag End",
		"number": 123,
		"complement": "hobbit hole",
		"neighborhood": "the Shire",
		"city": "Hobbiton",
		"state": "Westron",
		"zipCode": "12345"
	},
	"status": "ATIVO",
	"userInfo": {
		"userRecord": "CREATE",
		"registerDate": "2024-01-21T17:59:58.370+00:00"
	}
}
```
## Berear Token add in Auth Types:
```json
{
	"token": "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhbmRlcnNvbiIsImlzcyI6ImF1dGgtYXBpIiwiZXhwIjoxNzA1ODgzNDI4fQ.pJkfEWX6tN3pRmPTMk_NPDZBWyNW8zC24bpJJ_vIPiQ"
}




