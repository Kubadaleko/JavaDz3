//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка


package d3;

import java.util.ArrayList;
import java.util.Collections;

public class Program {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(16);
        numbers.add(7);
        numbers.add(8);
        System.out.println(numbers);
        System.out.println(Collections.max(numbers));
        System.out.println(Collections.min(numbers));
        System.out.println((Collections.min(numbers) + Collections.max(numbers)) / 2);
    }
}
