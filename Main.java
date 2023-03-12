package prof_HW;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(10000000);

        HW3_List hw3_list = new HW3_List();
       System.out.println(hw3_list.listAddElement(list));
        hw3_list.iterateForEachLoop(list);
        hw3_list.getListSize(list);
        hw3_list.getListSizeWithVariable(list);
        hw3_list.getListSizeWithIterator(list);
        hw3_list.getListSizeWithListIterator(list);
        System.out.println(hw3_list.listAddElement);
        System.out.println(hw3_list.iterateForEachLoop);
        System.out.println(hw3_list.getListSize);
        System.out.println(hw3_list.getListSizeWithVariable);
        System.out.println(hw3_list.getListSizeWithIterator);
        System.out.println(hw3_list.getListSizeWithListIterator);

    }
}
