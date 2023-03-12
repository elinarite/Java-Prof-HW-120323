package prof_HW;

import java.util.*;

public class HW3_List {


    /**
     * для всех случаев сделать замер времени
     */
    String listAddElement;
    String iterateForEachLoop;
    String getListSize;
    String getListSizeWithVariable;
    String getListSizeWithIterator;
    String getListSizeWithListIterator;

    /**
     * создать List наполнить его 10М> элементами
     * При наполнении списка  сохраняем i- тый элемент в переменную temp
     */
    public List<Integer> listAddElement(List<Integer> list) {
        long startTime = System.nanoTime();
        int temp = 0;
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
            temp = list.get(i);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        listAddElement = "Method iterateForEachLoop iterate for-each loop," +
                " run time " + duration;
        return list;
    }

    /**
     * перебрать for-each loop
     */
    public void iterateForEachLoop(List<Integer> list) {
        long startTime = System.nanoTime();
        for (long value : list) ;
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        iterateForEachLoop = "Method iterateForEachLoop iterate for-each loop," +
                " run time " + duration;
    }

    /**
     * classic for и вызываем list.size() для каждой итерации
     */
    public void getListSize(List<Integer> list) {
        long startTime = System.nanoTime();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.size());
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        getListSize = "Method getListSize classic for and call list.size() " +
                "for each iteration, run time " + duration;
    }

    /**
     * classic for, но list.size() определяем в переменную
     */
    public void getListSizeWithVariable(List<Integer> list) {
        long startTime = System.nanoTime();
        int listSize = list.size();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(listSize);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        getListSizeWithVariable = "Method getListSizeWithVariable classic for, list.size() define in " +
                "a variable, run time " + duration;
    }

    /**
     * classic for, list.size() определяем в переменную, перебираем с конца (i--) используя Itertor
     */

    public void getListSizeWithIterator(List<Integer> list) {
        long startTime = System.nanoTime();
        int listSize = list.size();
        int count = 0;
        boolean flag = true;
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            count = iterator.next();
            if (iterator.hasNext() != flag) {
                while (count >= 0) {
                    count--;
                    System.out.println(count + " " + listSize);
                }
            }
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        getListSizeWithIterator = "Method getListSizeWithIterator classic for, list.size() define in " +
                "a variable, iterate from the end (i--)\n" +
                "using Iterator run time " + duration;
    }

    /**
     * classic for, list.size() определяем в переменную, перебираем с конца (i--) используя ListIterator
     */
    public void getListSizeWithListIterator(List<Integer> list) {
        long startTime = System.nanoTime();
        int listSize = list.size();
        ListIterator<Integer> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous() + " " + listSize);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        getListSizeWithListIterator = "Method getListSizeWithListIterator classic for, list.size() define in " +
                "a variable, iterate from the end (i--)\n" +
                "using ListIterator run time " + duration;
    }
}