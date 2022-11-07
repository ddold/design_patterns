package org.example.bahavioral.iterator.customiterator;

import java.util.List;
import org.example.bahavioral.iterator.MenuItem;
import org.example.bahavioral.iterator.customiterator.Iterator;

public class PancakeHouseIterator implements Iterator {

    List<MenuItem> items;
    int position = 0;

    public PancakeHouseIterator(List<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size() && items.get(position) != null;
    }

    @Override
    public Object next() {
        MenuItem item = items.get(position);
        position++;
        return item;
    }
}
