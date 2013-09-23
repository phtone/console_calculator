import java.util.LinkedList;

public class Calculator {

    public static void main(String[] args) {

//        String a="1+2(4-2)";
        LinkedList<Character> test1 = new LinkedList<Character>();
        test1.add('a');
        test1.add('б');
        LinkedList<Character> test2 = new LinkedList<Character>();
        test2.add('в');
        lastElement(test1, test2);
//        basic(a);
    }


    static int priority(char operation) {

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

    public static void lastElement(LinkedList<Character> s, LinkedList<Character> o) {
        Character e = s.removeLast();
        o.add(e);
    }

    public static boolean valueOff(char sym) {

        return sym == '+' || sym == '-' || sym == '*' || sym == '/' || sym == '%' || sym == '(';

    }

    //    передаем строку
    public static void basic(String input) {

//        стек
        LinkedList<Character> stack = new LinkedList<Character>();

//        выходная строка
        LinkedList<Character> output = new LinkedList<Character>();


        for (int i = 0; i < input.length(); i++) {
//            charAt возвращает значение по указаному индексу
            char current = input.charAt(i);
//            Если текущий символ - открывающая скобка, то помещаем ее в стек
            if (current == '(') {
                stack.add(current);
//                Если символ - знак операции (+, -, *, / ), то проверяем приоритет данной операции
                if(valueOff(current)) {
                    priority(current);
                }
//                доделать
//                если current - одно из значений, пока стек пустой и приоритет последнего элемента меньше приоритет
//                текущего символа
//                то текущий символ помещаем в стек
                if (valueOff(current)) {
                    while (stack.isEmpty() && priority(output.getLast()) < priority(current)) ;
                    stack.add(current);


                }

//                if (stack.isEmpty()) {
//                    stack.add(current);

                if (current == ')') {
                    output = stack;
                    while (stack.getLast() != '(') ;
                    lastElement(stack, output);
                }
            }
        }
    }
}


// убрать из одного списка и засунуть во второй
// removeLast - Удаляет и возвращает последний элемент из этого списка.
// getLast - Возвращает последний элемент в этом списке.


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
