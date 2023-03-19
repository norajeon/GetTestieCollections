package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    @Test
    public void testHashSet() {
        HashSet<String> set = new HashSet<>();
        set.add("whitster");
        assertTrue(set.contains("whitster"));
    }

    @Test
    public void testArrayList() {
        ArrayList<String> array = new ArrayList<>();
        array.add("whitwhit");
        array.set(0, "whitney");
        assertTrue(array.contains("whitney"));
    }

    @Test
    public void testHashMap() {
        HashMap<Integer, String> hash = new HashMap<>();
        hash.put(5, "moo");
        assertFalse(hash.isEmpty());
    }

    @Test
    public void testLinkedList() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        assertTrue(list.contains(5));
    }

    @Test
    public void testArrayDeque() {
        ArrayDeque<String> de = new ArrayDeque<>();
        de.add("whitster");
        de.add("doggos");
        assertEquals(de.peekFirst(), "whitster");
    }

    @Test
    public void testVector() {
        Vector<String> vec = new Vector<>();
        vec.add("red pandas");
        vec.add("bears");
        assertEquals(vec.firstElement(), "red pandas");
    }

    @Test
    public void testTreeMap() {
        TreeMap<String, Integer> tree = new TreeMap<>();
        tree.put("Hello", 5);
        tree.put("Bye", 3);
        tree.replace("Bye", 6);

        Assert.assertEquals(tree.lastEntry(), tree.pollLastEntry());
    }

    @Test
    public void testStack() {
        Stack<String> st = new Stack<>();
        st.push("red pandas");
        st.push("bears");
        st.pop();
        Assert.assertEquals(st.peek(), "red pandas");
    }

    @Test
    public void testTreeSet() {
        TreeSet<Integer> tr = new TreeSet<>();
        tr.add(5);
        tr.add(7);
        Assert.assertTrue(tr.contains(7));
    }

    @Test
    public void testIterator() {
        List<Integer> listy = new ArrayList<>();

        Iterator<Integer> it = listy.iterator();

        while (it.hasNext()) {
            it.next();
        }
Assert.assertFalse(it.hasNext());
    }


    @Test
    public void testPriorityQueue() {
        PriorityQueue<Integer> pr = new PriorityQueue<>();
        pr.add(5);
        pr.add(1);
        pr.add(10);
        Integer ans = 1;
        Assert.assertEquals(pr.peek(), ans);
    }

@Test
    public void testCompareTo() {
        Person hi = new Person("hello", 1990);
        Person two = new Person ("menlo", 1992);

        Assert.assertEquals(-1, two.compareTo(hi));
}




} // end
