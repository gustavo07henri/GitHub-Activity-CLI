package org.example;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {
        JsonNode events;

        try {
            if(args.length < 1){
                System.out.println("No arguments provided. Exiting the program.");
                System.exit(1);
            }

            String userName = args[0];

            events = serviceRequest(userName);
            
            // check if there was recent activity
            if (!events.isArray() || events.isEmpty()) {
                System.out.println("No recent activity found.");
            }

            for(JsonNode event : events){
                String type = event.get("type").asText();
                String repoName = event.get("repo").get("name").asText();

                switch (type) {
                    case "PushEvent":
                        System.out.println("Pushed to :" + repoName);
                        break;
                    case "IssuesEvent":
                        System.out.println("Opened an issue in " + repoName);
                        break;
                    case "WatchEvent":
                        System.out.println("Starred " + repoName);
                        break;
                    default:
                        System.out.println("Performed " + type + " on " + repoName);
                        break;
                }
            }
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
                
            
        public static JsonNode serviceRequest(String userName){

            ObjectMapper mapper = new ObjectMapper();
            JsonNode events = mapper.createObjectNode();
            final String GITHUB_API_URL = "https://api.github.com/users/";

            try{

                URI url = new URI(GITHUB_API_URL + userName + "/events");

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(url)
                        .build();
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                // Test that performs the connection test with the API
                int status = response.statusCode();

                if(status != 200){
                    System.out.println("Error: Unable to fetch activity. Status code: " + status);
                    return events; // return an empty JsonNode
                }
                events = mapper.readTree(response.body());


            }catch(Exception e){
                System.out.println("Failed to fetch activity: " + e.getMessage());
            }

            return events;
        }

}