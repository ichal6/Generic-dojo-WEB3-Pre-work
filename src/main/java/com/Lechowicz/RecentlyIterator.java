package com.Lechowicz;

import java.util.Iterator;
import java.util.List;

public class RecentlyIterator<T> implements Iterator<T> {
    private int index = 0;
    private List<T> recentlyList;

    public RecentlyIterator(List<T> recentlyList){
        this.recentlyList = recentlyList;
    }

    @Override
    public boolean hasNext() {
        return index < recentlyList.size();
    }

    @Override
    public T next() {
        return recentlyList.get(index++);
    }
}
