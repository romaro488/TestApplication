package ua.polosmak;

import ua.polosmak.message.Messages;

import java.util.ArrayList;

public class Number {

    private ArrayList<Integer> numbers = new ArrayList<>();

    public void add(int number) {
        numbers.add(number);
    }

    public double getAverage() {
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.size();
    }

    public int getMinValue() {
        int min = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public int getMaxValue() {
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }

        }
        return max;
    }

    public void showNumbers() {
        if (numbers.size() > 0) {
            System.out.println(Messages.SHOW_ARRAY);
            System.out.println(numbers);
        } else {
            System.out.println(Messages.EMPTY_LIST);
        }
    }
}
