package com.example.chatgptbasedcookingingredients.model;



/**
 * {
 *      "model": "gpt-4o-mini",
 *      "messages": [{"role": "user", "content": "Say this is a test!"}],
 *      "temperature": 0.2
 *    }
 */

public record OpenAiRequest(String model, List<Message> messages, double temperature) {
}
