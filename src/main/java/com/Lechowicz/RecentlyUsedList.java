package com.Lechowicz;

import java.util.*;

public class RecentlyUsedList<T> {
    private Integer size;
    private List<T> recentlyElements;

    public RecentlyUsedList(Integer size){
        this.size = size;
        recentlyElements = new LinkedList<>();

    }

    public void addElement(T newItem){
        if(recentlyElements.contains(newItem)){
            recentlyElements.remove(newItem);
        }
        recentlyElements.add(0, newItem);
        if(recentlyElements.size() > size){
            recentlyElements.remove(size - 1);
        }
    }

    public List<T> returnLists(){
        return recentlyElements;
    }
}
