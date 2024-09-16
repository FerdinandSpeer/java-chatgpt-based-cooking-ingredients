package com.example.chatgptbasedcookingingredients.model;

import java.util.List;

/**
 * {
 *
 *     "choices": [
 *         {
 *             "index": 0,
 *             "message": {
 *                 "role": "assistant",
 *                 "content": "This is a test!",
 *                 "refusal": null
 *             },
 *             "logprobs": null,
 *             "finish_reason": "stop"
 *         }
 *     ]
 * }
 */
public record OpenAiResponse(List<OpenAiChoices> choices) {
    public String getAnswer(){
        return choices().get(0).message().content();
    }
}
