package com.example.chatgptbasedcookingingredients.service;

import com.example.chatgptbasedcookingingredients.model.OpenAiMessage;
import com.example.chatgptbasedcookingingredients.model.OpenAiRequest;
import com.example.chatgptbasedcookingingredients.model.OpenAiResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class IngredientService {

    private final RestClient client;

    public IngredientService(@Value("${BASE_URL}") String baseUrl, @Value("${AUTH_KEY}") String key) {

        client = RestClient.builder()
                .defaultHeader("Authorization", "Bearer " + key)
                .baseUrl(baseUrl)
                .build();
    }

    public String getTypeOfIngredientFromOpenAi(String ingredient) {
        String prompt = "Tell me if this is a vegan, vegetarian or regular ingredient: " + ingredient;
        OpenAiRequest request = new OpenAiRequest("gpt-4o-mini",
                List.of(new OpenAiMessage("user", prompt)),
                0.2);
        OpenAiResponse response = client.post()
                .contentType(MediaType.APPLICATION_JSON)
                .body(request)
                .retrieve()
                .body(OpenAiResponse.class);

        return response.getAnswer();
    }



}
