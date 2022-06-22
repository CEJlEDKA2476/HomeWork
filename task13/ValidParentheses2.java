package com.company.task13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses2 {
    public static void main(String[] args) {
        Map<Character, Character> hashMap = new HashMap<>();
        hashMap.put('{', '}');
        hashMap.put('[', ']');
        hashMap.put('(', ')');

        System.out.println("Введите строку.");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        Stack<Character> inputStack = new Stack<>();
        char symbol;

        for (int i = 0; i <= input.length() - 1; i++) {
            symbol = input.charAt(i);
            if (symbol == '{' || symbol == '(' || symbol == '[') {
                inputStack.push(symbol);
            } else {
                char checkSymbol = inputStack.pop();
                char mapSymbol = hashMap.get(checkSymbol);

                if (mapSymbol != symbol) {
                    System.out.println("false");
                    return;
                }
            }
            if (inputStack.isEmpty()) {
                System.out.println("true");
            }
        }
    }
}
