package part1.task3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static int answer;
    static int userAnswer;
    static String userAnswer2;
    final static int MAX_TRY_COUNT = 3;
    final static int MAX_VALUE = 10;

    public static void main(String[] args) {
        System.out.println("Приветсвуем!");
        do {
            System.out.println("Введите \"0\", если хотите сыграть в Угадай Число\nВведите \"1\", если хотите сыграть в Угадай Слово\nВведите \"2\", если хотите выйти:");
            userAnswer = scanner.nextInt();
            if (userAnswer == 0) {
                guessTheNumber();
            } else if (userAnswer == 1) {
                guessTheWord();
            } else if (userAnswer == 2) {
                System.out.println("До встречи!");
                break;
            } else {
                System.out.println("Вы ввели некорректные данные!");
            }
        } while (true);
    }

    public static void guessTheNumber() {
        answer = random.nextInt(MAX_VALUE);
        System.out.println("Введите число от 0 до " + (MAX_VALUE - 1) + ":");
        for (int tryCount = 1; tryCount <= MAX_TRY_COUNT; tryCount++) {
            userAnswer = scanner.nextInt();
            if (userAnswer == answer) {
                System.out.println("Поздравляю, вы угадали!");
                break;
            } else if (userAnswer > answer && userAnswer < MAX_VALUE) {
                System.out.println("Вы ввели слишком большое число!");
            } else if (userAnswer < answer && userAnswer >= 0) {
                System.out.println("Вы ввели слишком маленькое число!");
            } else {
                System.out.println("Вы ввели некорректные данные!");
            }
            if (tryCount < MAX_TRY_COUNT) {
                System.out.println("Попробуйте ещё раз. У вас осталось " + (MAX_TRY_COUNT - tryCount) + " попытка(-и)!\nВведите число от 0 до " + (MAX_VALUE - 1) + ":");
            } else {
                System.out.println("Вы проиграли! Правильный ответ " + answer + "!");
            }
        }
    }

    public static void guessTheWord() {
        scanner.nextLine();
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        answer = random.nextInt(words.length);
        do {
            System.out.println("Введите слово латинскими буквами (не больше 15 символов):");
            userAnswer2 = scanner.nextLine();
            if (userAnswer2.equals(words[answer])) {
                System.out.println("Поздравляю, вы угадали!");
                break;
            } else {
                System.out.print("Ваши совпадения: ");
                for (int i = 0; i < 15; i++) {
                    if (i < userAnswer2.length() && i < words[answer].length() && userAnswer2.charAt(i) == words[answer].charAt(i)) {
                        System.out.print(userAnswer2.charAt(i));
                    } else {
                        System.out.print("#");
                    }
                }
                System.out.println("\nПопробуйте ещё раз!");
            }
        } while (true);
    }
}