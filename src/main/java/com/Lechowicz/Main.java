package com.Lechowicz;

public class Main {
    public static void main(String[] args) {
        RecentlyUsedList<Integer> recentlyUsedList = new RecentlyUsedList<>(10);
        recentlyUsedList.addElement(6);
        recentlyUsedList.addElement(9);
        recentlyUsedList.addElement(5);
        recentlyUsedList.addElement(1);
        recentlyUsedList.addElement(29);
        recentlyUsedList.addElement(9);
        recentlyUsedList.addElement(64);
        recentlyUsedList.addElement(90);
        recentlyUsedList.addElement(52);
        recentlyUsedList.addElement(34);
        recentlyUsedList.addElement(45);
        recentlyUsedList.addElement(56);


        for (Integer number: recentlyUsedList.returnLists()
             ) {
            System.out.println(number);
        }
    }
}
