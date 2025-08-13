package sprint;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class CustomIterator implements Iterator<Integer> {
    private List<Integer> list;
    private int index;

    public CustomIterator(List<Integer> list) {
        this.list = list;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return list.get(index++);
    }
}