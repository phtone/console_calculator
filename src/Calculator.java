import java.util.LinkedList;

public class Calculator {

//    static class Node {
//
//    }

//    static class Operations extends Node {
//        char operation;
//        Node rvalue;
//        Node lvalue;
//
////    }
//
//    static class Numberoff extends Node {
//        double value;
//
//    }

//    double calculate(Node root) {
//        //если root типа Operations тогда instanseof вернет true
//        if (root instanceof Operations) {
//
//            Operations o = (Operations) root;
//
//            switch (o.operation) {
//                case '+':
//                    return calculate(o.lvalue) + calculate(o.rvalue);
//                case '-':
//                    return calculate(o.lvalue) - calculate(o.rvalue);
//                case '*':
//                    return calculate(o.lvalue) * calculate(o.rvalue);
//                case '/':
//                    return calculate(o.lvalue) / calculate(o.rvalue);
//            }
//        }
//        return ((Numberoff) root).value;
//    }

    int priority(char operation) {

        switch (operation) {
            case '*':
            case '/':
            case '%':
                return 2;

            case '(':
                return 1;

            case '+':
            case '-':
                return 3;

        }
    }

    public void lastElement(LinkedList stack, LinkedList output) {
        stack.removeLast();
        output.add(output.removeLast());

    }

    public Node string_to_tree(String input) {
         //стек
        LinkedList<Character> stack = new LinkedList<Character>();
        //выходная строка
        LinkedList<Character> output = new LinkedList<Character>();
        for (int i = 0; i < input.length(); i++) {

            char current = input.charAt(i);

            if (current == '*' || current == '/' || current == '+' || current == '-') {

                if (stack.isEmpty()) {
                    stack.add(current);
                }

            } if (current == '(') {
                stack.add(current);

             //пока стек не (
            } else if (current == ')') {
                output = stack;
                while (stack.getLast() != '(');
                lastElement(stack, output);

            }

        }


    }
}



