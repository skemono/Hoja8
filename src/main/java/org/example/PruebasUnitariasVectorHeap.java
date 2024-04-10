package org.example;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Vector;

public class PruebasUnitariasVectorHeap {

    @Test
    public void testAddAndRemove() {
        VectorHeap<Integer> heap = new VectorHeap<>();
        assertTrue(heap.isEmpty());

        heap.add(10);
        heap.add(5);
        heap.add(20);
        heap.add(15);
        heap.add(25);

        assertFalse(heap.isEmpty());
        assertEquals(5, heap.size());

        assertEquals(Integer.valueOf(5), heap.remove());
        assertEquals(Integer.valueOf(10), heap.remove());
        assertEquals(Integer.valueOf(15), heap.remove());
        assertEquals(Integer.valueOf(20), heap.remove());
        assertEquals(Integer.valueOf(25), heap.remove());

        assertTrue(heap.isEmpty());
    }

    @Test
    public void testWithObjects() {
        VectorHeap<String> heap = new VectorHeap<>();
        assertTrue(heap.isEmpty());

        heap.add("Apple");
        heap.add("Banana");
        heap.add("Orange");
        heap.add("Grapes");
        heap.add("Peach");

        assertFalse(heap.isEmpty());
        assertEquals(5, heap.size());

        assertEquals("Apple", heap.remove());
        assertEquals("Banana", heap.remove());
        assertEquals("Grapes", heap.remove());
        assertEquals("Orange", heap.remove());
        assertEquals("Peach", heap.remove());

        assertTrue(heap.isEmpty());
    }
}
