package demo;

import java.util.Calendar;
import java.util.Iterator;

public class AlternatingDinerMenuIterator implements Iterator<MenuItem> {

    MenuItem[] list;
    int position;

    public AlternatingDinerMenuIterator(MenuItem[] list) {
        this.list = list;
        position = Calendar.DAY_OF_WEEK % 2;
    }

    @Override
    public boolean hasNext() {
        return !(position >= list.length || list[position] == null);
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = list[position];
        position = position + 2;
        return menuItem;
    }

    @Override
    public String toString() {
        return "Alternating Diner Menu Iterator";
    }
}
