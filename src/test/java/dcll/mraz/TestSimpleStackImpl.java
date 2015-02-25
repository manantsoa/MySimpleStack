package dcll.mraz;

import junit.framework.TestCase;
import dcll.mraz.Item;

/**
 * Created by manantsoa on 09/02/15.
 */
public class TestSimpleStackImpl extends TestCase {

    SimpleStack s = new SimpleStackImpl();

    public void testIsEmpty() {
        //SimpleStack s = new SimpleStackImpl();
        assertTrue(s.isEmpty());
    }

    public void testGetSizeEmpty() {
        //SimpleStack s = new SimpleStackImpl();
        assertTrue(s.getSize() == 0);
    }

    public void testGetSize() {
        s.push(new Item(5));
        assertFalse(s.isEmpty());
    }

    public void testPush() {
        Item item = new Item(0);
        s.push(new Item(5));
        try {
            item = s.peek();
        } catch (EmptyStackException e) {
            e.printStackTrace();
        }

        assertEquals(item.getElement(),5);

    }

    public void testPeek() {
        s.push(new Item(10));

        try {
            assertEquals(10, s.peek().getElement());
        } catch (EmptyStackException e) {
            e.printStackTrace();
        }

    }

    public void testPop() {
        Item item = new Item(0);
        s.push(new Item(65));

        try {
            item = s.pop();
        } catch (EmptyStackException e) {
            e.printStackTrace();
        }

        assertTrue(item.getElement() == 65 && s.isEmpty());

    }
}
