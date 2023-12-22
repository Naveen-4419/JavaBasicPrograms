package com.javacodebase.Collections;

import java.util.Stack;

public class ParenthesesCheck {

    public static void main(String[] args) {

        String name="({[]})";
        boolean validParentheses= checkIfStringHasValidParentheses(name);
        System.out.println(validParentheses? name + "has valid Parentheses": " doesn't have valid Parentheses");
    }

    public static boolean checkIfStringHasValidParentheses(String name){
        Stack<Character> stack= new Stack<>();
        char c[]= name.toCharArray();
        for(char i:c){
            switch (i) {
                case '(' -> stack.push(')');
                case '{' -> stack.push('}');
                case '[' -> stack.push(']');
                default -> {
                    if(!stack.empty() && stack.peek().equals(i)){
                        stack.pop();
                    }else{
                        return false;
                    }
                }
            }
        }

        if(stack.empty()){
            return true;
        }
        return false;
    }
}
