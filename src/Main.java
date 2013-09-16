import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

        double numberOne, numberTwo, result = 0;
        char sign;


        Scanner read = new Scanner(System.in);

        System.out.println("Введите выражение");

        StringTokenizer tokenizer = new StringTokenizer(read.nextLine());

        numberOne = Double.parseDouble(tokenizer.nextToken());
        sign = tokenizer.nextToken().charAt(0);
        numberTwo = Double.parseDouble(tokenizer.nextToken());

        switch (sign) {
            case '+':
                result = numberOne + numberTwo;
//               System.out.println("Ответ: " + number.addition());
                break;
            case '-':
                result = numberOne - numberTwo;
//                System.out.println("Ответ: " + number.subtract());
                break;
            case '*':
//                System.out.println("Ответ: " + number.multiply());
                result = numberOne + numberTwo;
                break;
        }
        System.out.println(result);
    }

}

