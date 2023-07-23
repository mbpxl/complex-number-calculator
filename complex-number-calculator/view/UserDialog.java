package view;

import mathLogic.MathLogic;

import java.util.HashMap;
import java.util.Scanner;

public class UserDialog {

    boolean getOut = false;
    String userChoice = "exit";
    int num1;
    int num2;
    HashMap<String, String> actionsMap;

    public UserDialog(HashMap<String,String> actionsMap) {
        this.actionsMap = actionsMap;

        MathLogic mLogic = new MathLogic(actionsMap);

        while (!getOut) {
            redNeckScroll();
            basicPrompt();

            userChoice = prompt();
            switch (userChoice) {
                case "*": {
                    num1 = promptNum(1);
                    num2 = promptNum(2);
                    int result = mLogic.multiplication(num1, num2);
                    System.out.println("Результат операции: " + num1 + " * " + num2 + " = " + result);
                    System.out.println("----------------------------------------------");
                    pause();
                    break;
                }
                case "+": {
                    num1 = promptNum(1);
                    num2 = promptNum(2);
                    int result = mLogic.additionNumbers(num1, num2);
                    System.out.println("Результат операции: " + num1 + " + " + num2 + " = " + result);
                    System.out.println("----------------------------------------------");
                    System.out.println();
                    pause();
                    break;
                }
                case "/": {
                    num1 = promptNum(1);
                    num2 = promptNum(2);
                    double result = mLogic.division(num1, num2);
                    System.out.println("Результат операции: " + num1 + " / " + num2 + " = " + result);
                    System.out.println("----------------------------------------------");
                    System.out.println();
                    pause();
                    break;

                }
                case "exit": {
                    getOut = true;
                    break;
                }
                default: {
                    System.out.println("Введен неверный символ операции, попробуйте еще раз");
                    System.out.println();
                }
            }
        }
    }
    public void basicPrompt() {
        System.out.println("В данный момент программа инициализирована для " + actionsMap.size() + "-х " +
                "арифметических действий:");

        for (String key: actionsMap.keySet()) {
            System.out.println("         " + key + " - " + actionsMap.get(key));
        }
    }
        public String prompt() {
            Scanner scanner = new Scanner(System.in);
            System.out.println(" ------------------------------------------ ");
            System.out.print("Введите символ действия (\"*\", \"+\" или \"/\") или \"exit\" для завершения: ");
            String choice = scanner.next();
            System.out.println();
            return choice;
        }
    public int promptNum(int in) {
        int num;
        Scanner scanner = new Scanner(System.in);
        if (in == 1) {
            System.out.print("Введите первое целое число : ");
        } else if (in == 2) {
            System.out.print("Введите второе целое число : ");
        }
        num = Integer.parseInt(scanner.next());
        return num;
    }

    public void redNeckScroll() {
        for (int i = 1; i <= 25; i++) {
            System.out.println();
        }
    }
    public void pause() {
        boolean getOut = false;
        while (!getOut) {
            Scanner scanner = new Scanner(System.in);
            System.out.println();
            System.out.println("Для продолжения введите букву \"n\"");
            userChoice = scanner.next();
            if (userChoice.equals("n")) {
                getOut = true;
            } else {
                getOut = false;
            }
        }
    }

}


