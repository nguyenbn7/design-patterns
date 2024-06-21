package examples;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {

    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] list) {
        this.items = list;
    }

    @Override
    public boolean hasNext() {
        return items.length > position;
    }

    @Override
    public MenuItem next() {
        return items[position++];
    }

}
