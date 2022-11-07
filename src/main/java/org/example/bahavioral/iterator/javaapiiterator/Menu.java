package org.example.bahavioral.iterator.javaapiiterator;

import java.util.Iterator;
import org.example.bahavioral.iterator.MenuItem;

public interface Menu {
    Iterator<MenuItem> createIterator();
}
