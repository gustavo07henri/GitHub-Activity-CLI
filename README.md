# GitHub Activity CLI

This is a command-line interface (CLI) application that fetches and displays recent GitHub activity for a specified user.

## Prerequisites

- Java 22 or higher
- Maven

## Setup

1. Clone the repository:
    ```sh
    git clone https://github.com/yourusername/GitHub-Activity-CLI.git
    cd GitHub-Activity-CLI
    ```

2. Build the project using Maven:
    ```sh
    mvn clean install
    ```

## Usage

To run the application, use the following command:
```sh
mvn exec:java -Dexec.args="github-username"
```
Replace github-username with the GitHub username you want to fetch activity for.

Example
```sh
mvn exec:java -Dexec.args="octocat"
```
Project Structure
```sh
    .gitignore
    .idea/
    .vscode/
    pom.xml
    src/
        main/
            java/
                org/
                    example/
                        Main.java
            resources/
        test/
            java/
    target/
```
Code Overview
The main logic of the application is in the Main.java file. It uses Java's HttpClient to send a request to the GitHub API and Jackson's ObjectMapper to parse the JSON response.

Main Class
The Main class contains the main method which:

Checks if a username argument is provided.
Calls the serviceRequest method to fetch the user's GitHub activity.
Parses and displays the activity.
Service Request Method
The serviceRequest method:

Constructs the GitHub API URL for the specified user.
Sends an HTTP GET request to the API.
Parses the JSON response and returns it as a JsonNode.
License
This project is licensed under the MIT License.

