package junit.basic.listoperations;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ListTest {
        static class ListManager {

            public void addElement(List<Integer> list, int element) {
                list.add(element);
            }
            public void removeElement(List<Integer> list, int element) {
                list.remove(Integer.valueOf(element));
            }

            public int getSize(List<Integer> list) {
                return list.size();
            }
        }

        ListManager manager = new ListManager();

        @Test
        public void testAddElement() {
            List<Integer> list = new ArrayList<>();
            manager.addElement(list, 5);
            assertTrue(list.contains(5));
            assertEquals(1, list.size());
        }

        @Test
        public void testRemoveElement() {
            List<Integer> list = new ArrayList<>();
            list.add(10);
            manager.removeElement(list, 10);
            assertFalse(list.contains(10));
            assertEquals(0, list.size());
        }

        @Test
        public void testGetSize() {
            List<Integer> list = new ArrayList<>();
            manager.addElement(list, 1);
            manager.addElement(list, 2);
            manager.addElement(list, 3);
            assertEquals(3, manager.getSize(list));
        }
    }


