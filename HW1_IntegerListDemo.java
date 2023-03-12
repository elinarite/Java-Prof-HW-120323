package prof_HW;

import java.util.ArrayList;
import java.util.List;

public class HW1_IntegerListDemo {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();

        //добавить в список элемент (в конец)
        list.add(1);
        list.add(2);
        list.add(3);

        // добавить в список элемент (в начало)
        list.add(0, 1);
        System.out.println(list);

        // узнать длину списка
        System.out.println(list.size());

        // удалить элемент из списка (по индексу)
        list.remove(2);
        System.out.println(list);

        // удалить элемент из списка (по элементу)
        Integer elementToRemoved = 3;
        list.remove(elementToRemoved);
        System.out.println(list);

        // узнать пустой список или нет
        System.out.println(list.isEmpty());
        if (list.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("list is not empty");
        }

        //   обойти список и вывести на консоль каждый элемент.
        for (int value : list) {
            System.out.println(value);
        }
    }
}