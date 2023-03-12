package prof_HW;

import java.util.ArrayList;
import java.util.List;

public class HW1_ListDuplicate {

    /**
     * Могут ли реализации интерфейса java.util.List хранить одинаковые
     * элементы (дубликаты)? Напишите код программы, который демонстрирует ответ на этот вопрос.
     */
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        System.out.println(list);
    }
}