package org.example.bahavioral.iterator.customiterator;

import org.example.bahavioral.iterator.MenuItem;
import org.example.bahavioral.iterator.customiterator.Iterator;

public class DinerMenuIterator implements Iterator {

    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position++;
        return menuItem;
    }
}
