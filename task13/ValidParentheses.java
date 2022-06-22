package com.company.task13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        Map<Character, Character> wordMap = new HashMap<>();
        wordMap.put('{', '}');
        wordMap.put('(', ')');
        wordMap.put('[', ']');

        System.out.println("Введите строку.");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        Stack<Character> stackSymbols = new Stack<>();

        char symbol;

        for (int i = 0; i <= input.length() - 1; i++) {
            symbol = input.charAt(i);
            if (symbol == '{' || symbol == '[' || symbol == '(') {
                stackSymbols.push(symbol);
            } else {
                char checkSymbol = stackSymbols.pop();
                char mapSymbol = wordMap.get(checkSymbol);

                if (mapSymbol != symbol) {
                    System.out.println("false");
                    return;
                }
            }
        }
        System.out.println(stackSymbols.isEmpty());
    }
}

