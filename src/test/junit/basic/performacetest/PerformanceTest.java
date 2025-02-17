package junit.basic.performacetest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;
public class PerformanceTest {
        public static String longRunningTask() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.getMessage();
            }
            return "Completed";
        }

        @Test
        @Timeout(value = 3, unit = TimeUnit.SECONDS)
        public void testLongRunningTask() {
            assertEquals("Completed", longRunningTask());
        }
    }


