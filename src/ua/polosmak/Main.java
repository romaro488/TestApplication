package ua.polosmak;

import ua.polosmak.message.Messages;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while (true) {
            System.out.println(Messages.INPUT);
            Scanner scanner = new Scanner(System.in);
            Number number = new Number();
            while (true) {

                System.out.print(Messages.INPUT_NUMBER);
                String input = scanner.nextLine();


                if ("exit".equalsIgnoreCase(input)) {
                    System.out.println("Exit!");
                    System.exit(0);
                } else if ("show".equalsIgnoreCase(input)) {
                    number.showNumbers();
                    System.out.println("\nSmallest number = " + number.getMinValue());
                    System.out.println("Largest number = " + number.getMaxValue());
                    System.out.println("Average number = " + number.getAverage() + "\n");
                } else {
                    try {
                        number.add(Integer.parseInt(input));
                    } catch (Exception e) {
                        System.out.println(Messages.WRONG_INPUT);
                    }
                }
            }
        }
    }
}
