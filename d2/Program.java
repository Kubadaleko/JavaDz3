//Пусть дан произвольный список целых чисел, удалить из него чётные числа

package d2;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        System.out.println("Список: " + numbers);
        numbers.removeIf(n -> n % 2 == 0);
        System.out.println("Без четных чисел: " + numbers);
    }
}