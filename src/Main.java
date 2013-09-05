import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numberOne, numberTwo;
        String sign;

        Scanner read = new Scanner(System.in);

        System.out.println("Введите первое число ");

        numberOne = read.nextInt();

        System.out.println("Вы ввели число: " + numberOne);

        System.out.println("Введите знак операции ");

        sign = read.next();

        char v = sign.charAt(0); //переводим String в char

        System.out.println("Вы ввели знак: " + sign);

        System.out.println("Введите второе число");

        numberTwo = read.nextInt();

        System.out.println("Вы ввели число: " + numberTwo);

        ReadNumber number = new ReadNumber(numberOne, numberTwo);

        switch (v) {
            case '+':
                System.out.println("Ответ: " + number.addition());
                break;
            case '-':
                System.out.println("Ответ: " + number.subtract());
                break;
            case '*':
                System.out.println("Ответ: " + number.multiply());
        }
    }

}

