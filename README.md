# GitHub Activity CLI

Escolha o idioma:

- [English](#github-activity-cli-english)
- [Português](#github-activity-cli-português)

---

## GitHub Activity CLI (English)

This is a command-line interface (CLI) application that fetches and displays recent GitHub activity for a specified user.

## Useful Links

- [GitHub User Activity Roadmap](https://roadmap.sh/projects/github-user-activity)
- [Roadmap.sh](https://roadmap.sh/)
  
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

## GitHub Activity CLI (Português)

Este é um aplicativo de interface de linha de comando (CLI) que busca e exibe a atividade recente do GitHub para um usuário especificado.

## Links Úteis

- [GitHub User Activity Roadmap](https://roadmap.sh/projects/github-user-activity)
- [Roadmap.sh](https://roadmap.sh/)

## Pré-requisitos

- Java 22 ou superior
- Maven

## Configuração

1. Clone o repositório:
    ```sh
    git clone https://github.com/seu-usuario/GitHub-Activity-CLI.git
    cd GitHub-Activity-CLI
    ```

2. Compile o projeto usando Maven:
    ```sh
    mvn clean install
    ```

## Uso

Para rodar o aplicativo, use o seguinte comando:
```sh
mvn exec:java -Dexec.args="github-username"
```
Substitua github-username pelo nome de usuário do GitHub para o qual deseja buscar a atividade.

Exemplo:
```sh
    .gitignore
    .idea/
    .vscode/
    pom.xml
    src/
        main/
            java/
                org/
                    exemplo/
                        Main.java
            resources/
        test/
            java/
    target/
```
Visão Geral do Código
A lógica principal da aplicação está no arquivo Main.java. Ele usa o HttpClient do Java para enviar uma solicitação para a API do GitHub e o ObjectMapper do Jackson para analisar a resposta JSON.

Classe Principal
A classe Main contém o método main que:

Verifica se um argumento de nome de usuário foi fornecido.
Chama o método serviceRequest para buscar a atividade do GitHub do usuário.
Analisa e exibe a atividade.
Método de Solicitação de Serviço
O método serviceRequest:

Constrói a URL da API do GitHub para o usuário especificado.
Envia uma solicitação HTTP GET para a API.
Analisa a resposta JSON e a retorna como um JsonNode.
Licença
Este projeto é licenciado sob a Licença MIT.

