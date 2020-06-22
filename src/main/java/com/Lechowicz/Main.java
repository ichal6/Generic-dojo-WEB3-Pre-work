package com.Lechowicz;

public class Main {
    public static void main(String[] args) {
        displayResult(forInteger());
        displayResult(forString());
    }

    private static RecentlyIterator forInteger(){
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


        return new RecentlyIterator<Integer>(recentlyUsedList.returnLists());
    }

    private static RecentlyIterator forString(){
        RecentlyUsedList<String> recentlyUsedList = new RecentlyUsedList<>(10);

        recentlyUsedList.addElement("nowy");
        recentlyUsedList.addElement("stary");
        recentlyUsedList.addElement("dawny");
        recentlyUsedList.addElement("nowy");
        recentlyUsedList.addElement("aktualny");
        recentlyUsedList.addElement("głowa");
        recentlyUsedList.addElement("rogi");
        recentlyUsedList.addElement("amultet");
        recentlyUsedList.addElement("piasek");
        recentlyUsedList.addElement("żwir");
        recentlyUsedList.addElement("kociołek");
        recentlyUsedList.addElement("rogalik");

        return new RecentlyIterator<String>(recentlyUsedList.returnLists());
    }

    private static void displayResult(RecentlyIterator iterator){
        System.out.println("Display recently used list:");
        for(int index = 0;iterator.hasNext();index++){
            System.out.println((index + 1) + ". " + iterator.next());
        }
        System.out.println();
    }
}
