package dcll.mraz;

import java.time.Clock;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by manantsoa on 09/02/15.
 */
public class SimpleStackImpl implements SimpleStack {
    Deque<Item> pile;

    public SimpleStackImpl() {
        pile = new ArrayDeque<Item>();
    }

    public boolean isEmpty() {
        return pile.size() == 0;
    }

    public int getSize() {
        return pile.size();
    }

    public void push(Item item) {
        pile.push(item);
    }

    public Item peek() throws EmptyStackException {
        return pile.peek();
    }

    public Item pop() throws EmptyStackException {
        if (pile.isEmpty()) throw new EmptyStackException();
        return pile.pop();
    }

    @Override
    public boolean printStack() {
        for (Item i: pile) {
            System.out.println(i.getElement());
        }
        return true;
    }
}
