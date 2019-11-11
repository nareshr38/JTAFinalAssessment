package com.jtafinalassessment.code.question2;

public class BalancedParanthesis {
    private BalancedParanthesis() {
    }

    public static StandardExpression isBalancedExpression(String expression) {
        int lengthExpression = expression.length();
        int counter = 0;
        String isBalanced = "Yes";

        if (expression.isEmpty()) {
            isBalanced = "Yes";
        }

        ExpressionStack stack = new ExpressionStack();
        for (int expressionIndex = 0; expressionIndex < lengthExpression; expressionIndex++) {
            char currentExpressionValue = expression.charAt(expressionIndex);
            if (currentExpressionValue == '{' ||
                    currentExpressionValue == '(' ||
                    currentExpressionValue == '[' ||
                    currentExpressionValue == '<') {
                stack.push(currentExpressionValue);
            }

            if (currentExpressionValue == '}' ||
                    currentExpressionValue == ')' ||
                    currentExpressionValue == ']' ||
                    currentExpressionValue == '>') {
                if (stack.isEmpty()) {
                    isBalanced = "No";
                    break;
                }
                char lastExpressionValue = stack.peek();
                if (currentExpressionValue == '}' && lastExpressionValue == '{' ||
                        currentExpressionValue == ')' && lastExpressionValue == '(' ||
                        currentExpressionValue == ']' && lastExpressionValue == '[' ||
                        currentExpressionValue == '>' && lastExpressionValue == '<') {
                    stack.pop();
                    counter = counter + 1;
                } else
                    break;
            }
            if (stack.isEmpty()) {
                isBalanced = "Yes";
            } else {
                isBalanced = "No";
            }
        }
        return new StandardExpression(counter, isBalanced);
    }


}
