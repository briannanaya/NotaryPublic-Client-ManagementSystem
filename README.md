## Notary Public Management System

<!-- About the Project -->
## :star2: About the Project

The Notary Public Management System is a web-based application designed for notary publics to effectively manage their clientele and maintain detailed records of client contact information. This project aims to streamline the process of client management, enabling notaries to efficiently handle client data, including names, email addresses, phone numbers, and services offered.

<!-- Screenshots -->
### :camera: Screenshots

<div align="center"> 
   <img width="310" alt="Screenshot 2024-10-02 at 10 52 15 AM" src="https://github.com/user-attachments/assets/2a006610-1b59-4dc1-ab4a-c61836280fba">
</div>


<!-- TechStack -->
### :space_invader: Tech Stack

<details>
  <summary>Client</summary>
  <ul>
    <li><a href="https://www.openjfx.io/">JavaFX</a></li>
    <li><a href="https://developer.mozilla.org/en-US/docs/Web/HTML">HTML</a></li>
    <li><a href="https://developer.mozilla.org/en-US/docs/Web/CSS">CSS</a></li>
    <li><a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript">JavaScript</a></li>
  </ul>
</details>

<details>
  <summary>Server</summary>
  <ul>
    <li><a href="https://spring.io/projects/spring-boot">Spring Boot</a></li>
  </ul>
</details>

<details>
<summary>Database</summary>
  <ul>
    <li><a href="https://www.mysql.com/">MySQL</a></li>
    <li><a href="https://www.mysql.com/products/workbench/">MySQL Workbench</a></li>
  </ul>
</details>

<!-- Features -->
### :dart: Features

- Creating Client
- Getting Clients with Same Last Name
- RESTful API: Provides endpoints for client operations, ensuring a clear separation between the frontend and backend
- User-Friendly Interface: A simple and intuitive web interface for managing client information
- Database Integration: Utilizes MySQL for persistent storage of client data



<!-- Env Variables -->
### :key: Environment Variables

To run this project, you will need to add the following environment variables to your .env file

`DB_HOST`

`DB_USER`

`DB_PASSWORD`

`API_BASE_URL`

<!-- Getting Started -->
## 	:toolbox: Getting Started

<!-- Prerequisites -->
### :bangbang: Prerequisites

This project uses Maven as the package manager. Ensure you have it installed by running:

```bash
 mvn -v
```
You'll also need Java JDK 17 or higher and MySQL Workbench installed.

<!-- Installation -->
### :gear: Installation

Clone and install the project dependencies:

```bash
  git clone https://github.com/briannanaya/NotaryPublic-Client-ManagementSystem.git
  cd notary_public_client_management
  mvn clean install
```
   
<!-- Running Tests -->
### :test_tube: Running Tests

To run tests, run the following command

```bash
  mvn test
```

<!-- Run Locally -->
### :running: Run Locally

Clone the project and move to the project directory:

```bash
  git clone https://github.com/briannanaya/NotaryPublic-Client-ManagementSystem.git
  cd NotaryPublic-Client-ManagementSystem
```

Install the dependencies:

```bash
  mvn clean install
```

Run the Spring Boot server:

```bash
  mvn spring-boot:run
```
The server will run on http://localhost:8080.


<!-- Deployment -->
### :triangular_flag_on_post: Deployment

To deploy this project to a production environment:

```bash
  mvn clean package
```
You can then deploy the generated .jar file to your desired server.

<!-- Usage -->
## :eyes: Usage

Once the application is running, you can:

Use the "Get Client by Last Name" form to retrieve a client’s details.
Use the "Create New Client" form to add new client information to the database.

<!-- Roadmap -->
## :compass: Roadmap

* [x] Implement client CRUD operations
* [x] Integrate MySQL database
* [ ] Add authentication and login for notaries
* [ ] Seperate front-end server and back-end server to make secure for file uploading
* [ ] Add further features: file uploading, client scheduling..
