package com.example.chatgptbasedcookingingredients.model;
/**
 * {
 *
 *             "message": {
 *                 "role": "assistant",
 *                 "content": "This is a test!",
 *                 "refusal": null
 *             },
 *             "logprobs": null,
 *             "finish_reason": "stop"
 *         }
 *
 *
 */
public record OpenAiChoices(OpenAiMessage message) {
}
