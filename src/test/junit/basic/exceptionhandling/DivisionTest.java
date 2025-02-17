package junit.basic.exceptionhandling;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class DivisionTest {
        static class Calculator {
            public int divide(int a, int b) {
                if (b == 0) {
                    throw new ArithmeticException("Cannot divide by zero!");
                }
                return a / b;
            }
        }
        Calculator calculator = new Calculator();

        @Test
        public void testDivideValid() {
            assertEquals(5, calculator.divide(10, 2));
        }

        @Test
        public void testDivideByZero() {
            assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
        }
    }


