package com.code.exercises;

import com.amazonaws.services.lambda.runtime.Context;

public class ExercisePlanGenerator {
    public String handleRequest(String input, Context context) {
        context.getLogger().log("Input xxx: " + input);
        return "Hello World xxx - " + input;
    }
}
