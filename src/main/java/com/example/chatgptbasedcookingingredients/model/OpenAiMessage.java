package com.example.chatgptbasedcookingingredients.model;
/**
{
 *                 "role": "assistant",
 *                 "content": "This is a test!"
 *             }
 */
public record OpenAiMessage(String role, String content) {
}
