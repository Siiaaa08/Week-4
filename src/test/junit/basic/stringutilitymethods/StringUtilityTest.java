package junit.basic.stringutilitymethods;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilityTest {
        static class StringUtils {
            public String reverse(String str) {
                return new StringBuilder(str).reverse().toString();
            }

            public boolean isPalindrome(String str) {
                String reversed = reverse(str);
                return str.equalsIgnoreCase(reversed);
            }

            public String toUpperCase(String str) {
                return str.toUpperCase();
            }
        }

        StringUtils utils = new StringUtils();

        @Test
        public void testReverse() {
            assertEquals("olleH", utils.reverse("Hello"));
            assertEquals("321", utils.reverse("123"));
        }

        @Test
        public void testIsPalindrome() {
            assertTrue(utils.isPalindrome("madam"));
            assertTrue(utils.isPalindrome("racecar"));
            assertFalse(utils.isPalindrome("hello"));
        }

        @Test
        public void testToUpperCase() {
            assertEquals("HELLO", utils.toUpperCase("hello"));
            assertEquals("JAVA", utils.toUpperCase("java"));
        }
    }


