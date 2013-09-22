import java.util.LinkedList;

public class Calculator {

    public static void main(String[]args){

        String a="1+2(4-2)";

        basic(a);
    }


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
        return 0;
    }

    public static void lastElement(LinkedList s, LinkedList o) {
        s.removeLast();
        o.add(s);

    }

    //передаем строку
    public static void basic(String input) {

        //стек
        LinkedList<Character> stack = new LinkedList<Character>();

        //выходная строка
        LinkedList<Character> output = new LinkedList<Character>();

        for (int i = 0; i < input.length(); i++) {
            //charAt возвращает значение по указаному индексу
            char current = input.charAt(i);
            //Если текущий символ - открывающая скобка, то помещаем ее в стек
            if (current == '(') {
                stack.add(current);

                if (stack.isEmpty()) {
                    stack.add(current);

                    if (current == ')') {
                        output = stack;
                        while (stack.getLast() != '(') ;
                        lastElement(stack, output);
                    }
                }
            }
        }
    }
}

// убрать из одного списка и засунуть во второй
// removeLast - Удаляет и возвращает последний элемент из этого списка.









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
