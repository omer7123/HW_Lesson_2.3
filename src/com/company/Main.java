package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Здравсвуйте, введите свое имя в уменьшительно - ласкательной форме: ");
        String name = in.nextLine();

        switch (name) {
            case "Тема":
                System.out.println("Ваше полное имя: " + "Артем");
                break;
            case "Даня":
                System.out.println("Ваше полное имя: " + "Данил");
                break;
            case "Вика":
                System.out.println("Ваше полное имя: " + "Виктория");
                break;
            case "Ваня":
                System.out.println("Ваше полное имя: " + "Иван");
            case "Стас":
                System.out.println("Ваше полное имя: " + "Станислав");
                break;
        }
    }
}
