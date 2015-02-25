package dcll.mraz;

import junit.framework.TestCase;

/**
 * Created by manantsoa on 25/02/15.
 */
public class TestEmptyStackException extends TestCase {

    public void testEmptyStackException() {
        try {
            new SimpleStackImpl().pop();
        }
        catch (EmptyStackException e) {
            assertTrue(true);
        }
    }
}
