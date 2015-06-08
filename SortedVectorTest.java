import junit.framework.TestCase;

import org.junit.Test;

public class SortedVectorTest extends TestCase  {
    @Test
    public void testAdd()  {
        SortedVector instance = new SortedVector();
        instance.add(5);
        instance.add(2);
        instance.add(1);
        instance.add(3);
        instance.add(10);
        instance.add(8);
        instance.add(6);

        instance.show();
    }

    @Test
    public void testRemove()  {
        SortedVector instance = new SortedVector();
        instance.add(5);
        instance.add(2);
        instance.add(1);
        instance.add(3);
        instance.add(4);


        instance.remove(2);
        instance.remove(0);
        instance.remove(-1);

        assertEquals(instance.get(0), 2);
        assertEquals(instance.get(2), 5);


    }

    @Test
    public void testGet() {
        SortedVector instance = new SortedVector();
        instance.add(5);
        instance.add(2);
        instance.add(1);
        instance.add(3);
        instance.add(4);
//
        assertEquals(instance.get(0), 1);
        assertEquals(instance.get(2), 3);
        assertNull(instance.get(-1));
        assertNull(instance.get(5));
        assertNull(instance.get(100));
    }

    @Test
    public void testIndexOf() {
        SortedVector instance = new SortedVector();
        instance.add(5);
        instance.add(2);
        instance.add(1);
        instance.add(3);
        instance.add(4);

        assertEquals(instance.indexOf(1), 0);
        assertEquals(instance.indexOf(5), 4);
        assertEquals(instance.indexOf(10), -1);

    }
}
