package Strakhov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main tasks = new Main();
        tasks.Task1();
        tasks.Task2();
        tasks.Task3();
        tasks.Task4();
    }

    public void Task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание №1:");
        System.out.println("Введите число");
        if(!scanner.hasNextInt()){
            System.out.println("Введенные данные не являются числом");

        } else {
            int number = scanner.nextInt();
            if (number > 7) {
                System.out.println("Привет");
            }
        }
        System.out.println();
    }

    public void Task2(){
        System.out.println("Задание №2:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = "Вячеслав";
        String inputedname = scanner.nextLine();
        if(name.equals(inputedname)){
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
        System.out.println();
    }

    public void Task3 () throws NumberFormatException{
        System.out.println("Задание №3:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа через ; например:3;8;9;4;33");
        String inputedNumbers = scanner.nextLine();
        if (!inputedNumbers.contains(";")) {
            System.out.println("Разделитель ; не используется в веденной строке");

        }
        String stringsArray[] = inputedNumbers.split(";");
        for (int i = 0; i < stringsArray.length; i++) {
            try {
                int result = Integer.parseInt(stringsArray[i]);

                if (result % 3 == 0) {
                    System.out.println(result);
                }
            } catch (NumberFormatException ex) {
                System.out.println("Вы ввели некорректные данные");
            }
        }
        System.out.println();
    }

    public void Task4(){
        System.out.println("Задание №4:");
        System.out.println("Вопрос: [((())()(())]] Можно ли считать эту последовательность правильной?");
        System.out.println("Ответ: нет");
        System.out.println("Чтобы данная последовательность стала правильной, нужно, например, убрать первую круглую скобку и последнюю квадратную.");



    }

}
